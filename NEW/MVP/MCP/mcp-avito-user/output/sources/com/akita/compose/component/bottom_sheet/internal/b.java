package com.akita.compose.component.bottom_sheet.internal;

import androidx.compose.foundation.gestures.C20438c;
import androidx.compose.foundation.gestures.C20501s;
import androidx.compose.foundation.gestures.T0;
import androidx.compose.foundation.gestures.U0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.K;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.bottom_sheet.SheetValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetAnchors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/internal/b;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends v.d implements K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public I f60609p;

    /* compiled from: BottomSheetAnchors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SheetValue sheetValue = SheetValue.f60561b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SheetValue sheetValue2 = SheetValue.f60561b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: BottomSheetAnchors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.bottom_sheet.internal.b$b, reason: collision with other inner class name */
    public static final class C2083b extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f60610l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f60611m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2083b(K0 k02, b bVar) {
            super(1);
            this.f60610l = k02;
            this.f60611m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f60610l, 0, kotlin.math.b.b(this.f60611m.f60609p.f60524d.f()), 0.0f);
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetAnchors.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/U0;", "Lcom/akita/compose/component/bottom_sheet/SheetValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/U0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<U0<SheetValue>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f60612l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K0 f60613m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b f60614n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f12, K0 k02, b bVar) {
            super(1);
            this.f60612l = f12;
            this.f60613m = k02;
            this.f60614n = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(U0<SheetValue> u02) {
            U0<SheetValue> u03 = u02;
            SheetValue sheetValue = SheetValue.f60561b;
            float f12 = this.f60612l;
            u03.a(sheetValue, f12);
            K0 k02 = this.f60613m;
            float f13 = k02.f40346c;
            I i12 = this.f60614n.f60609p;
            float f14 = i12.f60522b * f12;
            if (f13 > f14 && !i12.f60521a) {
                u03.a(SheetValue.f60563d, f12 - f14);
            }
            int i13 = k02.f40346c;
            if (i13 != 0) {
                u03.a(SheetValue.f60562c, Math.max(0.0f, f12 - i13));
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        SheetValue sheetValue;
        K0 k0I = interfaceC22363h0.I(j12);
        T0 t0A = C20438c.a(new c(C22712b.i(j12), k0I, this));
        int iOrdinal = ((SheetValue) this.f60609p.f60524d.f27970i.getF42167b()).ordinal();
        if (iOrdinal == 0) {
            sheetValue = SheetValue.f60561b;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sheetValue = SheetValue.f60563d;
            if (!t0A.f(sheetValue)) {
                sheetValue = SheetValue.f60562c;
                if (!t0A.f(sheetValue)) {
                    sheetValue = SheetValue.f60561b;
                }
            }
        }
        C20501s<SheetValue> c20501s = this.f60609p.f60524d;
        if (!L.f(c20501s.c(), t0A)) {
            ((C22082i3) c20501s.f27975n).setValue(t0A);
            if (!c20501s.i(sheetValue)) {
                ((C22082i3) c20501s.f27974m).setValue(sheetValue);
            }
        }
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new C2083b(k0I, this));
    }
}
