package kotlin.io.path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PathRecursiveFunctions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes8.dex */
class r extends q {

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CopyActionResult copyActionResult = CopyActionResult.f406792b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CopyActionResult copyActionResult2 = CopyActionResult.f406792b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OnErrorResult[] onErrorResultArr = OnErrorResult.f406795b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final FileVisitResult a(Path path) {
        try {
            throw null;
        } catch (Exception unused) {
            d(path);
            throw null;
        }
    }

    public static final void b(@Y61.k Path path) throws IllegalFileNameException {
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        if (string == null) {
            string = "";
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !string.equals("./")) {
                                return;
                            }
                        } else if (!string.equals("..")) {
                            return;
                        }
                    } else if (!string.equals("..\\")) {
                        return;
                    }
                } else if (!string.equals("../")) {
                    return;
                }
            } else if (!string.equals(".\\")) {
                return;
            }
        } else if (!string.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path.toString(), null, null);
    }

    public static final void c(Path path, Path path2) throws FileSystemLoopException {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(path.toString());
        }
    }

    public static final Path d(Path path) {
        try {
            k.f406811a.getClass();
            throw null;
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException(e12.getMessage() + "\nthis path: " + path + "\nbase path: null", e12);
        }
    }

    public static final void e(SecureDirectoryStream<Path> secureDirectoryStream, Path path, d dVar) throws IOException {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e12) {
                dVar.a(e12);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                f(secureDirectoryStreamNewDirectoryStream, it.next().getFileName(), dVar.f406803d, dVar);
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(secureDirectoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #2 {Exception -> 0x0016, blocks: (B:8:0x000f, B:11:0x0018, B:12:0x001e, B:16:0x003d, B:19:0x0045, B:21:0x004e, B:22:0x0054), top: B:44:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #2 {Exception -> 0x0016, blocks: (B:8:0x000f, B:11:0x0018, B:12:0x001e, B:16:0x003d, B:19:0x0045, B:21:0x004e, B:22:0x0054), top: B:44:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: Exception -> 0x0016, NoSuchFileException -> 0x005d, TRY_LEAVE, TryCatch #0 {NoSuchFileException -> 0x005d, blocks: (B:21:0x004e, B:22:0x0054), top: B:40:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r3, java.nio.file.Path r4, java.nio.file.Path r5, kotlin.io.path.d r6) throws java.io.IOException {
        /*
            java.nio.file.Path r0 = r6.f406803d
            r1 = 0
            if (r0 == 0) goto La
            java.nio.file.Path r0 = r0.resolve(r4)
            goto Lb
        La:
            r0 = r1
        Lb:
            r6.f406803d = r0
            if (r5 == 0) goto L18
            b(r0)     // Catch: java.lang.Exception -> L16
            c(r0, r5)     // Catch: java.lang.Exception -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L5a
        L18:
            java.nio.file.LinkOption r5 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L16
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[]{r5}     // Catch: java.lang.Exception -> L16
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r0 = java.nio.file.attribute.BasicFileAttributeView.class
            r2 = 1
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.FileAttributeView r5 = r3.getFileAttributeView(r4, r0, r5)     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.BasicFileAttributeView r5 = (java.nio.file.attribute.BasicFileAttributeView) r5     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.BasicFileAttributes r5 = r5.readAttributes()     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            boolean r5 = r5.isDirectory()     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L3a
            goto L3b
        L3a:
            r5 = r1
        L3b:
            if (r5 == 0) goto L42
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L16
            goto L43
        L42:
            r5 = 0
        L43:
            if (r5 == 0) goto L54
            int r5 = r6.f406801b     // Catch: java.lang.Exception -> L16
            e(r3, r4, r6)     // Catch: java.lang.Exception -> L16
            int r0 = r6.f406801b     // Catch: java.lang.Exception -> L16
            if (r5 != r0) goto L5d
            r3.deleteDirectory(r4)     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L5d
            kotlin.G0 r3 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L5d
            goto L5d
        L54:
            r3.deleteFile(r4)     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L5d
            kotlin.G0 r3 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L16 java.nio.file.NoSuchFileException -> L5d
            goto L5d
        L5a:
            r6.a(r3)
        L5d:
            java.nio.file.Path r3 = r6.f406803d
            if (r3 == 0) goto L66
            java.nio.file.Path r3 = r3.getFileName()
            goto L67
        L66:
            r3 = r1
        L67:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L78
            java.nio.file.Path r3 = r6.f406803d
            if (r3 == 0) goto L75
            java.nio.file.Path r1 = r3.getParent()
        L75:
            r6.f406803d = r1
            return
        L78:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Failed requirement."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.r.f(java.nio.file.SecureDirectoryStream, java.nio.file.Path, java.nio.file.Path, kotlin.io.path.d):void");
    }

    public static final void g(Path path, Path path2, d dVar) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        if (path2 != null) {
            try {
                b(path);
                c(path, path2);
            } catch (Exception e12) {
                dVar.a(e12);
                return;
            }
        }
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Files.deleteIfExists(path);
            return;
        }
        int i12 = dVar.f406801b;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e13) {
                dVar.a(e13);
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream != null) {
            try {
                Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    g(it.next(), path, dVar);
                }
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            } finally {
            }
        }
        if (i12 == dVar.f406801b) {
            Files.deleteIfExists(path);
        }
    }
}
