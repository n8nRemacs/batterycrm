package com.akita.compose.component.bottom_sheet;

import androidx.compose.animation.core.G1;
import androidx.compose.foundation.gestures.C20434b;
import androidx.compose.foundation.gestures.C20438c;
import androidx.compose.foundation.gestures.C20501s;
import androidx.compose.foundation.gestures.T0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/I;", "", "b", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f60520e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60521a;

    /* renamed from: b, reason: collision with root package name */
    public final float f60522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<SheetValue, Boolean> f60523c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20501s<SheetValue> f60524d;

    /* compiled from: BottomSheetState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/akita/compose/component/bottom_sheet/SheetValue;", "invoke", "(Lcom/akita/compose/component/bottom_sheet/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<SheetValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f60525l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: BottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/I$b;", "", "<init>", "()V", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BottomSheetState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f60526l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f60526l = dVar;
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.valueOf(this.f60526l.M0(56));
        }
    }

    /* compiled from: BottomSheetState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f60527l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f60527l = dVar;
        }

        @Override // Y41.a
        public final Float invoke() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.valueOf(this.f60527l.M0(125));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(boolean z12, float f12, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k SheetValue sheetValue, @Y61.k Y41.l<? super SheetValue, Boolean> lVar) {
        this.f60521a = z12;
        this.f60522b = f12;
        this.f60523c = lVar;
        G1 g12 = N.f60538a;
        C20434b.f27562a.getClass();
        androidx.compose.animation.core.H<Float> h12 = C20434b.f27565d;
        c cVar = new c(dVar);
        d dVar2 = new d(dVar);
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar2 = C20438c.f27581a;
        C20501s<SheetValue> c20501s = new C20501s<>(lVar, sheetValue);
        c20501s.f27963b = cVar;
        c20501s.f27964c = dVar2;
        c20501s.f27965d = g12;
        c20501s.f27966e = h12;
        this.f60524d = c20501s;
    }

    @Y61.l
    public final Object a(@Y61.k Continuation<? super G0> continuation) {
        SheetValue sheetValue = SheetValue.f60561b;
        if (!this.f60523c.invoke(sheetValue).booleanValue()) {
            return G0.f406611a;
        }
        Object objF = C20438c.f(this.f60524d, sheetValue, continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }

    public final boolean b() {
        return ((C22082i3) this.f60524d.f27968g).getF42167b() != SheetValue.f60561b;
    }

    @Y61.l
    public final Object c(@Y61.k SuspendLambda suspendLambda) {
        C20501s<SheetValue> c20501s = this.f60524d;
        T0<SheetValue> t0C = c20501s.c();
        SheetValue sheetValue = SheetValue.f60563d;
        if (!t0C.f(sheetValue)) {
            sheetValue = SheetValue.f60562c;
        }
        if (!this.f60523c.invoke(sheetValue).booleanValue()) {
            return G0.f406611a;
        }
        Object objF = C20438c.f(c20501s, sheetValue, suspendLambda);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }

    public /* synthetic */ I(boolean z12, float f12, androidx.compose.ui.unit.d dVar, SheetValue sheetValue, Y41.l lVar, int i12, C42822w c42822w) {
        this(z12, f12, dVar, (i12 & 8) != 0 ? SheetValue.f60561b : sheetValue, (i12 & 16) != 0 ? a.f60525l : lVar);
    }
}
