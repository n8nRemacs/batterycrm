package com.akita.compose.component.date_picker.ui;

import android.content.Context;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.lazy.n0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: VerticalMonthsList.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p {

    /* compiled from: VerticalMonthsList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K f61378l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ P2.b f61379m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Context f61380n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ F f61381o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ P2.a f61382p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f61383q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f61384r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, G0> f61385s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(K k12, P2.b bVar, Context context, F f12, P2.a aVar, Y41.l<? super Long, Boolean> lVar, Y41.l<? super Long, Boolean> lVar2, Y41.l<? super Long, G0> lVar3) {
            super(1);
            this.f61378l = k12;
            this.f61379m = bVar;
            this.f61380n = context;
            this.f61381o = f12;
            this.f61382p = aVar;
            this.f61383q = lVar;
            this.f61384r = lVar2;
            this.f61385s = lVar3;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            K k12 = this.f61378l;
            m0Var.a(k12.f61175f, null, n0.f29560l, new C22096n(2049295583, new o(k12, this.f61379m, this.f61380n, this.f61381o, this.f61382p, this.f61383q, this.f61384r, this.f61385s), true));
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalMonthsList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.date_picker.ui.VerticalMonthsListKt$VerticalMonthsList$2$1", f = "VerticalMonthsList.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f61386q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f61387r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ K f61388s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var, K k12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f61387r = w0Var;
            this.f61388s = k12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f61387r, this.f61388s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f61386q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f61386q = 1;
                Object objCollect = C22126m3.n(new q(this.f61387r)).collect(new r(this.f61388s), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalMonthsList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K f61389l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ w0 f61390m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f61391n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f61392o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, G0> f61393p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ F f61394q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(K k12, w0 w0Var, Y41.l<? super Long, Boolean> lVar, Y41.l<? super Long, Boolean> lVar2, Y41.l<? super Long, G0> lVar3, F f12, int i12) {
            super(2);
            this.f61389l = k12;
            this.f61390m = w0Var;
            this.f61391n = lVar;
            this.f61392o = lVar2;
            this.f61393p = lVar3;
            this.f61394q = f12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(262145);
            Y41.l<Long, Boolean> lVar = this.f61391n;
            Y41.l<Long, Boolean> lVar2 = this.f61392o;
            p.a(this.f61389l, this.f61390m, lVar, lVar2, this.f61393p, this.f61394q, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.akita.compose.component.date_picker.K r26, @Y61.k androidx.compose.foundation.lazy.w0 r27, @Y61.k Y41.l<? super java.lang.Long, java.lang.Boolean> r28, @Y61.k Y41.l<? super java.lang.Long, java.lang.Boolean> r29, @Y61.k Y41.l<? super java.lang.Long, kotlin.G0> r30, @Y61.k com.akita.compose.component.date_picker.F r31, @Y61.l androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.date_picker.ui.p.a(com.akita.compose.component.date_picker.K, androidx.compose.foundation.lazy.w0, Y41.l, Y41.l, Y41.l, com.akita.compose.component.date_picker.F, androidx.compose.runtime.A, int):void");
    }
}
