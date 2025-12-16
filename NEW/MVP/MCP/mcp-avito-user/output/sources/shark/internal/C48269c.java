package shark.internal;

import kotlin.Metadata;
import shark.K1;
import shark.M1;

/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lshark/M1$c;", "node", "invoke", "(Lshark/M1$c;)Lshark/M1$c;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48269c extends kotlin.jvm.internal.N implements Y41.l<M1.c, M1.c> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48269c f438508l = new C48269c();

    public C48269c() {
        super(1);
    }

    @Override // Y41.l
    public final M1.c invoke(M1.c cVar) {
        K1 k1J = cVar.j("android.app.ActivityThread$ActivityClientRecord", "nextIdle");
        if (k1J != null) {
            return k1J.a();
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
