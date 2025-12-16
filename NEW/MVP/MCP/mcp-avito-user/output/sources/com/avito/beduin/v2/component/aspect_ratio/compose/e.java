package com.avito.beduin.v2.component.aspect_ratio.compose;

import Y41.p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AspectRatioComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f335512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AspectRatioState.b f335513m;

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AspectRatioState.Axis.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AspectRatioState.Axis axis = AspectRatioState.Axis.f335527c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C22096n c22096n, AspectRatioState.b bVar) {
        super(2);
        this.f335512l = c22096n;
        this.f335513m = bVar;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(Z0 z02, C22712b c22712b) {
        int i12;
        int i13;
        Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        C22096n c22096n = this.f335512l;
        List<InterfaceC22363h0> listH0 = z03.h0("AspectRatioContainerDraft", c22096n);
        ArrayList arrayList = new ArrayList(C42745f0.q(listH0, 10));
        Iterator<T> it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC22363h0) it.next()).I(j12));
        }
        AspectRatioState.b bVar = this.f335513m;
        int iOrdinal = bVar.f335535c.ordinal();
        int i14 = bVar.f335534b;
        int i15 = bVar.f335533a;
        if (iOrdinal == 0) {
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int i16 = ((K0) it2.next()).f40345b;
            while (it2.hasNext()) {
                int i17 = ((K0) it2.next()).f40345b;
                if (i16 < i17) {
                    i16 = i17;
                }
            }
            int i18 = i16;
            i12 = (i14 * i16) / i15;
            i13 = i18;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            i12 = ((K0) it3.next()).f40346c;
            while (it3.hasNext()) {
                int i19 = ((K0) it3.next()).f40346c;
                if (i12 < i19) {
                    i12 = i19;
                }
            }
            i13 = (i15 * i12) / i14;
        }
        List<InterfaceC22363h0> listH02 = z03.h0("AspectRatioContainerFinal", c22096n);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listH02, 10));
        for (InterfaceC22363h0 interfaceC22363h0 : listH02) {
            C22712b.f42842b.getClass();
            arrayList2.add(interfaceC22363h0.I(C22712b.a.c(i13, i12)));
        }
        return z03.L0(i13, i12, P0.c(), new d(arrayList2));
    }
}
