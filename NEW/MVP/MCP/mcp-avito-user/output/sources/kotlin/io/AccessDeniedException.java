package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/AccessDeniedException;", "Lkotlin/io/FileSystemException;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccessDeniedException extends FileSystemException {
    public AccessDeniedException(File file, File file2, String str, int i12, C42822w c42822w) {
        super(file, (i12 & 2) != 0 ? null : file2, (i12 & 4) != 0 ? null : str);
    }
}
