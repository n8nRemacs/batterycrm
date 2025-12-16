package androidx.compose.material;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.j;
import androidx.compose.ui.unit.u;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Menu.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/Z3;", "Landroidx/compose/ui/window/T;", "Landroidx/compose/ui/unit/j;", "contentOffset", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/s;", "Lkotlin/G0;", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/d;LY41/p;Lkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Z3 implements androidx.compose.ui.window.T {

    /* renamed from: a, reason: collision with root package name */
    public final long f33385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f33386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.G0> f33387c;

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/s;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/unit/s;Landroidx/compose/ui/unit/s;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33388l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
            return kotlin.G0.f406611a;
        }
    }

    public Z3() {
        throw null;
    }

    public Z3(long j12, androidx.compose.ui.unit.d dVar, Y41.p pVar, C42822w c42822w) {
        this.f33385a = j12;
        this.f33386b = dVar;
        this.f33387c = pVar;
    }

    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        InterfaceC43030m interfaceC43030mF;
        Object obj;
        Object next;
        float f12 = K5.f32831a;
        androidx.compose.ui.unit.d dVar = this.f33386b;
        int iY02 = dVar.y0(f12);
        long j14 = this.f33385a;
        int iY03 = dVar.y0(androidx.compose.ui.unit.j.b(j14));
        LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
        int i12 = iY03 * (layoutDirection == layoutDirection2 ? 1 : -1);
        int iY04 = dVar.y0(androidx.compose.ui.unit.j.c(j14));
        int i13 = sVar.f42867a + i12;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        int i14 = (int) (j13 >> 32);
        int i15 = sVar.f42869c;
        int iIntValue = (i15 - i14) + i12;
        int i16 = (int) (j12 >> 32);
        int i17 = i16 - i14;
        if (layoutDirection == layoutDirection2) {
            Integer numValueOf = Integer.valueOf(i13);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (sVar.f42867a < 0) {
                i17 = 0;
            }
            interfaceC43030mF = C42756l.f(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i17)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i13);
            if (i15 <= i16) {
                i17 = 0;
            }
            interfaceC43030mF = C42756l.f(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i17)});
        }
        Iterator it = interfaceC43030mF.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i14 <= i16) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(sVar.f42870d + iY04, iY02);
        int i18 = (int) (j13 & 4294967295L);
        int i19 = sVar.f42868b;
        int iIntValue3 = (i19 - i18) + iY04;
        int i22 = (i19 - (i18 / 2)) + iY04;
        int i23 = (int) (j12 & 4294967295L);
        Iterator it2 = C42756l.f(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i22), Integer.valueOf((i23 - i18) - iY02)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue4 = ((Number) next2).intValue();
            if (iIntValue4 >= iY02 && iIntValue4 + i18 <= i23 - iY02) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f33387c.invoke(sVar, new androidx.compose.ui.unit.s(iIntValue, iIntValue3, i14 + iIntValue, i18 + iIntValue3));
        return androidx.compose.ui.unit.r.a(iIntValue, iIntValue3);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z3)) {
            return false;
        }
        Z3 z32 = (Z3) obj;
        long j12 = z32.f33385a;
        j.a aVar = androidx.compose.ui.unit.j.f42853b;
        return this.f33385a == j12 && kotlin.jvm.internal.L.f(this.f33386b, z32.f33386b) && kotlin.jvm.internal.L.f(this.f33387c, z32.f33387c);
    }

    public final int hashCode() {
        j.a aVar = androidx.compose.ui.unit.j.f42853b;
        return this.f33387c.hashCode() + ((this.f33386b.hashCode() + (Long.hashCode(this.f33385a) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) androidx.compose.ui.unit.j.d(this.f33385a)) + ", density=" + this.f33386b + ", onPositionCalculated=" + this.f33387c + ')';
    }

    public /* synthetic */ Z3(long j12, androidx.compose.ui.unit.d dVar, Y41.p pVar, int i12, C42822w c42822w) {
        this(j12, dVar, (i12 & 4) != 0 ? a.f33388l : pVar, null);
    }
}
