package androidx.compose.material3;

import androidx.compose.ui.semantics.C22557e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21764o5 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.I0 f36945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f36946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f36948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f36949p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21764o5(androidx.compose.foundation.lazy.grid.I0 i02, int i12, kotlinx.coroutines.T t12, String str, String str2) {
        super(1);
        this.f36945l = i02;
        this.f36946m = i12;
        this.f36947n = t12;
        this.f36948o = str;
        this.f36949p = str2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        Collection collectionU;
        androidx.compose.foundation.lazy.grid.O o12;
        androidx.compose.ui.semantics.F f13 = f12;
        androidx.compose.foundation.lazy.grid.I0 i02 = this.f36945l;
        int iH2 = i02.h();
        int i12 = this.f36946m;
        if (iH2 == i12 || ((o12 = (androidx.compose.foundation.lazy.grid.O) C42745f0.S(i02.j().h())) != null && o12.getF29645a() == i12)) {
            float f14 = V4.f35601a;
            kotlinx.coroutines.T t12 = this.f36947n;
            collectionU = C42745f0.U(new C22557e(this.f36948o, new B5(i02, t12)), new C22557e(this.f36949p, new C22010z5(i02, t12)));
        } else {
            collectionU = C42784z0.f406748b;
        }
        kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
        androidx.compose.ui.semantics.k.f41760a.getClass();
        androidx.compose.ui.semantics.E<List<C22557e>> e12 = androidx.compose.ui.semantics.k.f41783x;
        kotlin.reflect.n<Object> nVar = androidx.compose.ui.semantics.C.f41719a[26];
        e12.getClass();
        f13.a(e12, collectionU);
        return kotlin.G0.f406611a;
    }
}
