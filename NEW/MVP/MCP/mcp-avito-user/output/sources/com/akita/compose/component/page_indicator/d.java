package com.akita.compose.component.page_indicator;

import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PageIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<InterfaceC22276o0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62315l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f62316m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62317n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f62318o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f62319p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f62320q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, h hVar, float f12, float f13, InterfaceC22196w1 interfaceC22196w1, InterfaceC22192v1 interfaceC22192v1) {
        super(1);
        this.f62315l = i12;
        this.f62316m = hVar;
        this.f62317n = f12;
        this.f62318o = f13;
        this.f62319p = interfaceC22196w1;
        this.f62320q = interfaceC22192v1;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        int i12;
        InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
        if (this.f62315l > 5) {
            h hVar = this.f62316m;
            int iA2 = hVar.a();
            float fE2 = hVar.e();
            int i13 = (int) (iA2 + fE2);
            float f12 = 0.0f;
            InterfaceC22192v1 interfaceC22192v1 = this.f62320q;
            InterfaceC22196w1 interfaceC22196w1 = this.f62319p;
            if (i13 > 1 || interfaceC22196w1.e() <= i13) {
                int iE2 = interfaceC22196w1.e();
                if (i13 > interfaceC22196w1.e() + 1 || iE2 > i13) {
                    int iE3 = interfaceC22196w1.e() - 2;
                    if (i13 > interfaceC22196w1.e() || iE3 > i13) {
                        if (interfaceC22196w1.e() > i13) {
                            i12 = iA2 - 2;
                            if (i12 < 0) {
                                i12 = 0;
                            }
                        } else if (iA2 > 4) {
                            i12 = iA2 - 4;
                        }
                        f12 = i12 + fE2;
                    } else {
                        f12 = interfaceC22192v1.f();
                    }
                } else {
                    f12 = interfaceC22192v1.f();
                }
            }
            interfaceC22192v1.S6(f12);
            interfaceC22276o02.l(-((interfaceC22276o02.M0(this.f62318o) + interfaceC22276o02.M0(this.f62317n)) * interfaceC22192v1.f()));
        }
        return G0.f406611a;
    }
}
