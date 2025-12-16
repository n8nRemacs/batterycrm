package z1;

import Y41.l;
import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: InitializerViewModelFactory.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz1/b;", "Landroidx/lifecycle/P0$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50340b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50346h<?>[] f443749a;

    public C50340b(@k C50346h<?>... c50346hArr) {
        this.f443749a = c50346hArr;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <VM extends M0> VM create(@k Class<VM> cls, @k AbstractC50339a abstractC50339a) {
        VM vm2;
        C50346h c50346h;
        l<AbstractC50339a, T> lVar;
        A1.i iVar = A1.i.f43a;
        kotlin.reflect.d dVarB = m0.f406844a.b(cls);
        C50346h<?>[] c50346hArr = this.f443749a;
        C50346h[] c50346hArr2 = (C50346h[]) Arrays.copyOf(c50346hArr, c50346hArr.length);
        iVar.getClass();
        int length = c50346hArr2.length;
        int i12 = 0;
        while (true) {
            vm2 = null;
            if (i12 >= length) {
                c50346h = null;
                break;
            }
            c50346h = c50346hArr2[i12];
            if (L.f(c50346h.f443751a, dVarB)) {
                break;
            }
            i12++;
        }
        if (c50346h != null && (lVar = c50346h.f443752b) != 0) {
            vm2 = (VM) lVar.invoke(abstractC50339a);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + dVarB.p0()).toString());
    }
}
