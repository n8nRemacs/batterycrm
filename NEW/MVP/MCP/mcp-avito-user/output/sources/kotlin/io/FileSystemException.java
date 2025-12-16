package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class FileSystemException extends IOException {
    public FileSystemException(@Y61.k File file, @Y61.l File file2, @Y61.l String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        super(sb2.toString());
    }

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i12, C42822w c42822w) {
        this(file, (i12 & 2) != 0 ? null : file2, (i12 & 4) != 0 ? null : str);
    }
}
