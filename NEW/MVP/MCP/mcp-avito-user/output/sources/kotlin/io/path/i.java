package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/path/i;", "", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f406808a = new i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final LinkOption[] f406809b = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<FileVisitOption> f406810c;

    static {
        B0 b02 = B0.f406639b;
        f406810c = Collections.singleton(FileVisitOption.FOLLOW_LINKS);
    }
}
