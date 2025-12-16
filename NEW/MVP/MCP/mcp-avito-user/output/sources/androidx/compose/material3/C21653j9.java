package androidx.compose.material3;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21653j9 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22369k0 f36610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.V1 f36611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f36612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36614p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f36615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36617s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f36618t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f36619u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f36620v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21653j9(InterfaceC22369k0 interfaceC22369k0, androidx.compose.foundation.layout.V1 v12, LayoutDirection layoutDirection, androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, boolean z12, androidx.compose.ui.layout.K0 k04, androidx.compose.ui.layout.K0 k05, androidx.compose.ui.layout.K0 k06, int i12, int i13) {
        super(1);
        this.f36610l = interfaceC22369k0;
        this.f36611m = v12;
        this.f36612n = layoutDirection;
        this.f36613o = k02;
        this.f36614p = k03;
        this.f36615q = z12;
        this.f36616r = k04;
        this.f36617s = k05;
        this.f36618t = k06;
        this.f36619u = i12;
        this.f36620v = i13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        int iA2;
        int iA3;
        K0.a aVar2 = aVar;
        androidx.compose.foundation.layout.V1 v12 = this.f36611m;
        LayoutDirection layoutDirection = this.f36612n;
        float fG2 = androidx.compose.foundation.layout.R1.g(v12, layoutDirection);
        InterfaceC22369k0 interfaceC22369k0 = this.f36610l;
        int iY02 = interfaceC22369k0.y0(fG2);
        int iY03 = interfaceC22369k0.y0(androidx.compose.foundation.layout.R1.f(v12, layoutDirection));
        int iY04 = interfaceC22369k0.y0(v12.f28521b);
        int i12 = this.f36619u;
        boolean z12 = this.f36615q;
        androidx.compose.ui.layout.K0 k02 = this.f36613o;
        if (k02 != null) {
            if (z12) {
                iA3 = iY04;
            } else {
                InterfaceC22215f.f39074a.getClass();
                iA3 = InterfaceC22215f.a.f39086l.a(k02.f40346c, i12);
            }
            aVar2.h(k02, iY02, iA3, 0.0f);
        }
        androidx.compose.ui.layout.K0 k03 = this.f36614p;
        if (k03 != null) {
            int i13 = (this.f36620v - iY03) - k03.f40345b;
            if (z12) {
                iA2 = iY04;
            } else {
                InterfaceC22215f.f39074a.getClass();
                iA2 = InterfaceC22215f.a.f39086l.a(k03.f40346c, i12);
            }
            aVar2.h(k03, i13, iA2, 0.0f);
        }
        int iF2 = C21457aj.f(k02) + iY02;
        androidx.compose.ui.layout.K0 k04 = this.f36618t;
        androidx.compose.ui.layout.K0 k05 = this.f36617s;
        androidx.compose.ui.layout.K0 k06 = this.f36616r;
        if (!z12) {
            int iE2 = C21457aj.e(k04) + C21457aj.e(k05) + C21457aj.e(k06);
            InterfaceC22215f.f39074a.getClass();
            iY04 = InterfaceC22215f.a.f39086l.a(iE2, i12);
        }
        if (k05 != null) {
            aVar2.h(k05, iF2, iY04, 0.0f);
        }
        int iE3 = C21457aj.e(k05) + iY04;
        if (k06 != null) {
            aVar2.h(k06, iF2, iE3, 0.0f);
        }
        int iE4 = C21457aj.e(k06) + iE3;
        if (k04 != null) {
            aVar2.h(k04, iF2, iE4, 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
