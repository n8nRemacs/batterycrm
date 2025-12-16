package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import androidx.compose.foundation.gestures.C20495q0;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.C;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.unit.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComparisonSlider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f217619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f217621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<u> f217622e;

    /* compiled from: ImageComparisonSlider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "Ll0/g;", "dragAmount", "Lkotlin/G0;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<C, l0.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f217623l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f217624m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f217625n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<u> f217626o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Y41.a<G0> aVar, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<u> interfaceC22204y1) {
            super(2);
            this.f217623l = i12;
            this.f217624m = aVar;
            this.f217625n = interfaceC22196w1;
            this.f217626o = interfaceC22204y1;
        }

        @Override // Y41.p
        public final G0 invoke(C c12, l0.g gVar) {
            long j12 = gVar.f413387a;
            c12.a();
            InterfaceC22196w1 interfaceC22196w1 = this.f217625n;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) + interfaceC22196w1.e();
            int i12 = (int) (this.f217626o.getF42167b().f42872a >> 32);
            int i13 = this.f217623l;
            int i14 = i12 - i13;
            if (fIntBitsToFloat > i13 && fIntBitsToFloat < i14) {
                interfaceC22196w1.L3((int) fIntBitsToFloat);
            }
            this.f217624m.invoke();
            return G0.f406611a;
        }
    }

    public j(int i12, Y41.a<G0> aVar, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<u> interfaceC22204y1) {
        this.f217619b = i12;
        this.f217620c = aVar;
        this.f217621d = interfaceC22196w1;
        this.f217622e = interfaceC22204y1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k K k12, @Y61.k Continuation<? super G0> continuation) {
        Object objH = C20495q0.h(k12, null, new a(this.f217619b, this.f217620c, this.f217621d, this.f217622e), continuation, 7);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : G0.f406611a;
    }
}
