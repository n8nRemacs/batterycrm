package sW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.File;

/* compiled from: FileTree.java */
@Nullsafe
/* renamed from: sW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48116a {
    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        return file.delete();
    }

    public static void b(File file, InterfaceC48117b interfaceC48117b) {
        interfaceC48117b.a(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    b(file2, interfaceC48117b);
                } else {
                    interfaceC48117b.b(file2);
                }
            }
        }
        interfaceC48117b.c(file);
    }
}
