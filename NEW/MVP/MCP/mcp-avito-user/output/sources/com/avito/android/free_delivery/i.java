package com.avito.android.free_delivery;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.free_delivery.FreeDeliveryBottomSheetKt$Alert$1$2", f = "FreeDeliveryBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f158701q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f158702r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f158703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f158704t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158705u;

    /* compiled from: FreeDeliveryBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.free_delivery.FreeDeliveryBottomSheetKt$Alert$1$2$1", f = "FreeDeliveryBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158706q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f158707r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ J f158708s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f158709t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f158710u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f158707r = uVar;
            this.f158708s = j12;
            this.f158709t = str;
            this.f158710u = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f158707r, this.f158708s, this.f158709t, this.f158710u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f158706q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                this.f158706q = 1;
                if (this.f158707r.a(this.f158708s, this.f158709t, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((Y41.a) this.f158710u.getF42167b()).invoke();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f158702r = uVar;
        this.f158703s = j12;
        this.f158704t = str;
        this.f158705u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f158702r, this.f158703s, this.f158704t, this.f158705u, continuation);
        iVar.f158701q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f158701q;
        InterfaceC22204y1 interfaceC22204y1 = this.f158705u;
        C43259k.d(t12, null, null, new a(this.f158702r, this.f158703s, this.f158704t, interfaceC22204y1, null), 3);
        return G0.f406611a;
    }
}
