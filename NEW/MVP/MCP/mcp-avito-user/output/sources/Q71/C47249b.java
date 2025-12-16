package q71;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GlobalContext.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/b;", "Lq71/d;", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q71.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C47249b implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C47249b f429044a = new C47249b();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static o71.d f429045b;

    @k
    public final o71.d a() {
        o71.d dVar = f429045b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
