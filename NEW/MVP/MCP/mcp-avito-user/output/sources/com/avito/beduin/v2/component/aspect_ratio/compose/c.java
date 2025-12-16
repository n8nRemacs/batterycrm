package com.avito.beduin.v2.component.aspect_ratio.compose;

import Y41.l;
import Y61.k;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AspectRatioComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/compose/c;", "Landroidx/compose/ui/layout/i0;", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AspectRatioState.b f335509a;

    /* compiled from: AspectRatioComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f335510l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f335510l = arrayList;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            Iterator it = this.f335510l.iterator();
            while (it.hasNext()) {
                aVar2.h((K0) it.next(), 0, 0, 0.0f);
            }
            return G0.f406611a;
        }
    }

    public c(AspectRatioState.b bVar) {
        this.f335509a = bVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @k
    public final InterfaceC22367j0 b(@k InterfaceC22369k0 interfaceC22369k0, @k List<? extends InterfaceC22363h0> list, long j12) {
        List<? extends InterfaceC22363h0> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC22363h0) it.next()).I(j12));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = ((K0) it2.next()).f40345b;
        while (it2.hasNext()) {
            int i13 = ((K0) it2.next()).f40345b;
            if (i12 < i13) {
                i12 = i13;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i14 = ((K0) it3.next()).f40346c;
        while (it3.hasNext()) {
            int i15 = ((K0) it3.next()).f40346c;
            if (i14 < i15) {
                i14 = i15;
            }
        }
        return interfaceC22369k0.L0(i12, i14, P0.c(), new a(arrayList));
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@k InterfaceC22393x interfaceC22393x, @k List<? extends InterfaceC22391w> list, int i12) {
        if (i12 == Integer.MAX_VALUE) {
            return 0;
        }
        AspectRatioState.b bVar = this.f335509a;
        return (i12 * bVar.f335534b) / bVar.f335533a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@k InterfaceC22393x interfaceC22393x, @k List<? extends InterfaceC22391w> list, int i12) {
        if (i12 == Integer.MAX_VALUE) {
            return 0;
        }
        AspectRatioState.b bVar = this.f335509a;
        return (i12 * bVar.f335533a) / bVar.f335534b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@k InterfaceC22393x interfaceC22393x, @k List<? extends InterfaceC22391w> list, int i12) {
        if (i12 == Integer.MAX_VALUE) {
            return 0;
        }
        AspectRatioState.b bVar = this.f335509a;
        return (i12 * bVar.f335534b) / bVar.f335533a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@k InterfaceC22393x interfaceC22393x, @k List<? extends InterfaceC22391w> list, int i12) {
        if (i12 == Integer.MAX_VALUE) {
            return 0;
        }
        AspectRatioState.b bVar = this.f335509a;
        return (i12 * bVar.f335533a) / bVar.f335534b;
    }
}
