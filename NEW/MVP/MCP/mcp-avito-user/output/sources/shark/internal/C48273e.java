package shark.internal;

import kotlin.Metadata;
import shark.K1;
import shark.M1;
import shark.internal.AndroidReferenceReaders;

/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/collections/H0;", "Lshark/M1$c;", "<name for destructuring parameter 0>", "Lshark/internal/C0;", "invoke", "(Lkotlin/collections/H0;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48273e extends kotlin.jvm.internal.N implements Y41.l<kotlin.collections.H0<? extends M1.c>, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AndroidReferenceReaders.a.C12629a f438514l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48273e(AndroidReferenceReaders.a.C12629a c12629a) {
        super(1);
        this.f438514l = c12629a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final C0 invoke(kotlin.collections.H0<? extends M1.c> h02) {
        kotlin.collections.H0<? extends M1.c> h03 = h02;
        K1 k1J = ((M1.c) h03.f406644b).j("android.app.ActivityThread$ActivityClientRecord", "activity");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1J.a();
        if (cVarA == null) {
            return null;
        }
        K1 k1J2 = cVarA.j("android.app.Activity", "mDestroyed");
        if (kotlin.jvm.internal.L.f(k1J2 != null ? k1J2.f438095c.a() : null, Boolean.TRUE)) {
            return new C0(cVarA.f438151e, false, new C48271d(this, h03.f406643a));
        }
        return null;
    }
}
