package z1;

import A1.i;
import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;

/* compiled from: ViewModelProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz1/i;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50347i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final S0 f443753a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P0.c f443754b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC50339a f443755c;

    public C50347i(@k S0 s02, @k P0.c cVar, @k AbstractC50339a abstractC50339a) {
        this.f443753a = s02;
        this.f443754b = cVar;
        this.f443755c = abstractC50339a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final M0 a(@k String str, @k kotlin.reflect.d dVar) {
        M0 m0Create;
        S0 s02 = this.f443753a;
        M0 m02 = (M0) s02.f46714a.get(str);
        boolean zN02 = dVar.n0(m02);
        P0.c cVar = this.f443754b;
        if (zN02) {
            if (cVar instanceof P0.e) {
                ((P0.e) cVar).onRequery(m02);
            }
            return m02;
        }
        C50343e c50343e = new C50343e(this.f443755c);
        c50343e.b(i.a.f44a, str);
        try {
            try {
                m0Create = cVar.a(dVar, c50343e);
            } catch (AbstractMethodError unused) {
                m0Create = cVar.create(((InterfaceC42819t) dVar).f());
            }
        } catch (AbstractMethodError unused2) {
            m0Create = cVar.create(((InterfaceC42819t) dVar).f(), c50343e);
        }
        M0 m03 = (M0) s02.f46714a.put(str, m0Create);
        if (m03 != null) {
            m03.clear$lifecycle_viewmodel_release();
        }
        return m0Create;
    }
}
