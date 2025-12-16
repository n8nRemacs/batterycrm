package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.t0;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/io/path/a;", "Ljava/nio/file/Path;", "src", "dst", "Lkotlin/io/path/CopyActionResult;", "invoke", "(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/CopyActionResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class t extends N implements Y41.q<InterfaceC42797a, Path, Path, CopyActionResult> {
    @Override // Y41.q
    public final CopyActionResult invoke(InterfaceC42797a interfaceC42797a, Path path, Path path2) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        Path path3 = path;
        Path path4 = path2;
        i.f406808a.getClass();
        LinkOption[] linkOptionArr = i.f406809b;
        boolean z12 = true;
        boolean zIsDirectory = Files.isDirectory(path4, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
        if (!Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length)) || !zIsDirectory) {
            if (zIsDirectory) {
                d dVar = new d(0, 1, null);
                Path parent = path4.getParent();
                if (parent != null) {
                    try {
                        directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
                    } catch (Throwable unused) {
                        directoryStreamNewDirectoryStream = null;
                    }
                    if (directoryStreamNewDirectoryStream != null) {
                        try {
                            if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                                dVar.f406803d = parent;
                                r.f((SecureDirectoryStream) directoryStreamNewDirectoryStream, path4.getFileName(), null, dVar);
                                z12 = false;
                            }
                            G0 g02 = G0.f406611a;
                            kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
                        } finally {
                        }
                    }
                }
                if (z12) {
                    r.g(path4, null, dVar);
                }
                ArrayList arrayList = dVar.f406802c;
                if (!arrayList.isEmpty()) {
                    FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C42833p.a(fileSystemException, (Exception) it.next());
                    }
                    throw fileSystemException;
                }
            }
            t0 t0Var = new t0(2);
            t0Var.b(linkOptionArr);
            t0Var.a(StandardCopyOption.REPLACE_EXISTING);
            ArrayList<Object> arrayList2 = t0Var.f406850a;
            CopyOption[] copyOptionArr = (CopyOption[]) arrayList2.toArray(new CopyOption[arrayList2.size()]);
            Files.copy(path3, path4, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        }
        return CopyActionResult.f406792b;
    }
}
