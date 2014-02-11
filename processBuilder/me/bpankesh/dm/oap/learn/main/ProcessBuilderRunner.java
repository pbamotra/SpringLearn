package me.bpankesh.dm.oap.learn.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import me.bpankesh.dm.oap.learn.util.ProcessBuilderWrapper;

public class ProcessBuilderRunner {
	public static void main(String[] args) {
		List<String> cmd = new ArrayList<String>();
		cmd.add("ls");
		cmd.add("-al");
		ProcessBuilderWrapper pbd = null;
		try {
			pbd = new ProcessBuilderWrapper(new File("/Users/pbamotra/Desktop"), cmd);
		} catch (Exception e) {
			System.err.println("Exception occured " + e.getMessage());
		}
		System.out.println("Command has terminated with status: " + pbd.getStatus());
		System.out.println("Output:\n" + pbd.getInfos());
		System.out.println("Error: " + pbd.getErrors());
	}
}
