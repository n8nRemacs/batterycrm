package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MeasuredPage.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/n;", "Landroidx/compose/foundation/pager/p;", "", "index", "size", "", "Landroidx/compose/ui/layout/K0;", "placeables", "Landroidx/compose/ui/unit/q;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/f$b;", "horizontalAlignment", "Landroidx/compose/ui/f$c;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/f$b;Landroidx/compose/ui/f$c;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20820n implements InterfaceC20822p {

    /* renamed from: a, reason: collision with root package name */
    public final int f30001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30002b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<K0> f30003c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30004d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f30005e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22215f.b f30006f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22215f.c f30007g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f30008h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30009i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f30010j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30011k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final int[] f30012l;

    /* renamed from: m, reason: collision with root package name */
    public int f30013m;

    /* renamed from: n, reason: collision with root package name */
    public int f30014n;

    public C20820n() {
        throw null;
    }

    public C20820n(int i12, int i13, List list, long j12, Object obj, Orientation orientation, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, LayoutDirection layoutDirection, boolean z12, C42822w c42822w) {
        this.f30001a = i12;
        this.f30002b = i13;
        this.f30003c = list;
        this.f30004d = j12;
        this.f30005e = obj;
        this.f30006f = bVar;
        this.f30007g = cVar;
        this.f30008h = layoutDirection;
        this.f30009i = z12;
        this.f30010j = orientation == Orientation.f27425b;
        int size = list.size();
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            K0 k02 = (K0) list.get(i14);
            iMax = Math.max(iMax, !this.f30010j ? k02.f40346c : k02.f40345b);
        }
        this.f30011k = iMax;
        this.f30012l = new int[this.f30003c.size() * 2];
        this.f30014n = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public final void a(int i12) {
        this.f30013m += i12;
        int[] iArr = this.f30012l;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            boolean z12 = this.f30010j;
            if ((z12 && i13 % 2 == 1) || (!z12 && i13 % 2 == 0)) {
                iArr[i13] = iArr[i13] + i12;
            }
        }
    }

    public final void b(int i12, int i13, int i14) {
        int i15;
        this.f30013m = i12;
        boolean z12 = this.f30010j;
        this.f30014n = z12 ? i14 : i13;
        List<K0> list = this.f30003c;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            K0 k02 = list.get(i16);
            int i17 = i16 * 2;
            int[] iArr = this.f30012l;
            if (z12) {
                InterfaceC22215f.b bVar = this.f30006f;
                if (bVar == null) {
                    androidx.compose.foundation.internal.e.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i17] = bVar.a(k02.f40345b, i13, this.f30008h);
                iArr[i17 + 1] = i12;
                i15 = k02.f40346c;
            } else {
                iArr[i17] = i12;
                int i18 = i17 + 1;
                InterfaceC22215f.c cVar = this.f30007g;
                if (cVar == null) {
                    androidx.compose.foundation.internal.e.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i18] = cVar.a(k02.f40346c, i14);
                i15 = k02.f40345b;
            }
            i12 += i15;
        }
    }

    @Override // androidx.compose.foundation.pager.InterfaceC20822p
    /* renamed from: getIndex, reason: from getter */
    public final int getF30001a() {
        return this.f30001a;
    }

    @Override // androidx.compose.foundation.pager.InterfaceC20822p
    /* renamed from: getOffset, reason: from getter */
    public final int getF30013m() {
        return this.f30013m;
    }
}
