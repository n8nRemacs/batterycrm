package com.akita.compose.component.time_line;

import Y41.l;
import Y61.k;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import com.akita.compose.component.time_line.internal.TimeLineItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLine.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f63106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f63107b;

    /* compiled from: TimeLine.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f63108l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f63108l = arrayList;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            int i12 = 0;
            for (K0 k02 : this.f63108l) {
                aVar2.h(k02, i12, 0, 0.0f);
                i12 += k02.f40345b;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TimeLine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[TimeLineItemType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeLineItemType timeLineItemType = TimeLineItemType.f63141b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TimeLineItemType timeLineItemType2 = TimeLineItemType.f63141b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(float f12, g gVar) {
        this.f63106a = f12;
        this.f63107b = gVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @k
    public final InterfaceC22367j0 b(@k InterfaceC22369k0 interfaceC22369k0, @k List<? extends InterfaceC22363h0> list, long j12) {
        long jC2;
        int iY02 = interfaceC22369k0.y0(this.f63106a);
        int iL2 = C22712b.l(j12) - (iY02 * 2);
        g gVar = this.f63107b;
        int i12 = iL2 / (gVar.f63124c > 2 ? 3 : 2);
        int i13 = iY02 * 3;
        gVar.f63125d = i12;
        gVar.f63126e = i13;
        List<? extends InterfaceC22363h0> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (InterfaceC22363h0 interfaceC22363h0 : list2) {
            int iOrdinal = ((TimeLineItemType) C.a(interfaceC22363h0)).ordinal();
            if (iOrdinal == 0) {
                jC2 = C22712b.c(j12, 0, 0, 0, 0, 14);
            } else if (iOrdinal == 1) {
                jC2 = C22712b.c(j12, i12, i12, 0, 0, 12);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jC2 = C22712b.c(j12, i13, i13, 0, 0, 12);
            }
            arrayList.add(interfaceC22363h0.I(jC2));
        }
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((K0) it.next()).f40345b;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = ((K0) it2.next()).f40346c;
        while (it2.hasNext()) {
            int i16 = ((K0) it2.next()).f40346c;
            if (i15 < i16) {
                i15 = i16;
            }
        }
        return interfaceC22369k0.L0(i14, i15, P0.c(), new a(arrayList));
    }
}
