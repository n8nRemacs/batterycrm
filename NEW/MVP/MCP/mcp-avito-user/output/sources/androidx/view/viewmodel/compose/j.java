package androidx.view.viewmodel.compose;

import A1.c;
import A1.i;
import Cd.r;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.view.InterfaceC22969B;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import z1.AbstractC50339a;

@Metadata(d1 = {"androidx/lifecycle/viewmodel/compose/k", "androidx/lifecycle/viewmodel/compose/l"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    @InterfaceC22132o
    @k
    public static final M0 a(@k Class cls, @l T0 t02, @l String str, @l r rVar, @l AbstractC50339a abstractC50339a, @l A a12, int i12) {
        P0 p02;
        a12.I(-1566358618);
        if ((i12 & 16) != 0) {
            abstractC50339a = t02 instanceof InterfaceC22969B ? ((InterfaceC22969B) t02).getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
        d dVarB = m0.f406844a.b(cls);
        if (rVar != null) {
            P0.b bVar = P0.f46692b;
            S0 f42820b = t02.getF42820b();
            bVar.getClass();
            p02 = new P0(f42820b, rVar, abstractC50339a);
        } else {
            boolean z12 = t02 instanceof InterfaceC22969B;
            if (z12) {
                P0.b bVar2 = P0.f46692b;
                S0 f42820b2 = t02.getF42820b();
                P0.c defaultViewModelProviderFactory = ((InterfaceC22969B) t02).getDefaultViewModelProviderFactory();
                bVar2.getClass();
                p02 = new P0(f42820b2, defaultViewModelProviderFactory, abstractC50339a);
            } else {
                P0.b bVar3 = P0.f46692b;
                i.f43a.getClass();
                P0.c defaultViewModelProviderFactory2 = z12 ? ((InterfaceC22969B) t02).getDefaultViewModelProviderFactory() : c.f37a;
                AbstractC50339a defaultViewModelCreationExtras = z12 ? ((InterfaceC22969B) t02).getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
                bVar3.getClass();
                p02 = new P0(t02.getF42820b(), defaultViewModelProviderFactory2, defaultViewModelCreationExtras);
            }
        }
        M0 m0A = str != null ? p02.f46693a.a(str, dVarB) : p02.c(dVarB);
        a12.O();
        return m0A;
    }
}
