package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/path/g;", "Lkotlin/io/path/f;", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f406804a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f406805b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> f406806c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> f406807d;

    public static void e(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str.concat(" was already defined"));
        }
    }

    @Override // kotlin.io.path.f
    public final void a(@Y61.k Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        e(this.f406807d, "onPostVisitDirectory");
        this.f406807d = pVar;
    }

    @Override // kotlin.io.path.f
    public final void b(@Y61.k Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        e(this.f406804a, "onPreVisitDirectory");
        this.f406804a = pVar;
    }

    @Override // kotlin.io.path.f
    public final void c(@Y61.k Y41.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        e(this.f406806c, "onVisitFileFailed");
        this.f406806c = pVar;
    }

    @Override // kotlin.io.path.f
    public final void d(@Y61.k Y41.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        e(this.f406805b, "onVisitFile");
        this.f406805b = pVar;
    }
}
