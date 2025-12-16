package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NioSystemFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/L;", "Lokio/I;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class L extends I {
    public static Long n(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.l
    public C44810u f(@Y61.k S s5) throws IOException {
        S sD2;
        Path path = Paths.get(s5.f420035b.t(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                S.f420033c.getClass();
                String string = symbolicLink.toString();
                C44805o c44805o = okio.internal.h.f420085a;
                C44802l c44802l = new C44802l();
                c44802l.O(string);
                sD2 = okio.internal.h.d(c44802l, false);
            } else {
                sD2 = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lN2 = fileTimeCreationTime != null ? n(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lN3 = fileTimeLastModifiedTime != null ? n(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C44810u(zIsRegularFile, zIsDirectory, sD2, lValueOf, lN2, lN3, fileTimeLastAccessTime != null ? n(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.I
    public void k(@Y61.k S s5, @Y61.k S s12) throws IOException {
        try {
            Files.move(Paths.get(s5.f420035b.t(), new String[0]), Paths.get(s12.f420035b.t(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e12) {
            throw new FileNotFoundException(e12.getMessage());
        }
    }

    @Override // okio.I
    @Y61.k
    public String toString() {
        return "NioSystemFileSystem";
    }
}
