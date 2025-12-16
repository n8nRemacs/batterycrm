package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@e
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/io/path/f;", "", "Lkotlin/io/path/g;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public interface f {
    void a(@Y61.k Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void b(@Y61.k Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@Y61.k Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void d(@Y61.k Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);
}
