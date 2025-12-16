package com.avito.android.advert.item;

import android.view.ContextThemeWrapper;
import com.avito.android.R;
import com.avito.android.analytics.event.C28431o;
import com.avito.android.component.toast.c;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.AdvertDetailsBusiness360;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$showBusiness360EfbToast$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {1387}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28219w0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80705q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f80706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsBusiness360.Toast f80707s;

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.w0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C28136i0 f80708l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsBusiness360.Toast f80709m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C28136i0 c28136i0, AdvertDetailsBusiness360.Toast toast) {
            super(0);
            this.f80708l = c28136i0;
            this.f80709m = toast;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.avito.android.advert.business360.b bVar = this.f80708l.f76279D0;
            com.avito.android.onboarding_manager.f fVar = bVar.f68829c;
            AdvertDetailsBusiness360.Toast toast = this.f80709m;
            fVar.e("business360ToastClicked_" + toast.getShowId());
            b.a.a(bVar.f68828b, toast.getButton().getOnClick(), null, null, 6);
            bVar.f68827a.c(new C28431o("item", toast.getButton().getTitle()));
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28219w0(C28136i0 c28136i0, AdvertDetailsBusiness360.Toast toast, Continuation<? super C28219w0> continuation) {
        super(2, continuation);
        this.f80706r = c28136i0;
        this.f80707s = toast;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28219w0(this.f80706r, this.f80707s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C28219w0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        I1 i12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f80705q;
        AdvertDetailsBusiness360.Toast toast = this.f80707s;
        C28136i0 c28136i0 = this.f80706r;
        if (i13 == 0) {
            C42729a0.b(obj);
            com.avito.android.advert.business360.b bVar = c28136i0.f76279D0;
            this.f80705q = 1;
            objA = bVar.a(toast, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        if (((Boolean) objA).booleanValue() && (i12 = c28136i0.f76350h1) != null) {
            String text = toast.getText();
            String title = toast.getButton().getTitle();
            a aVar = new a(c28136i0, toast);
            com.avito.android.lib.design.toast_bar.k kVar = i12.f71682V0;
            if (kVar != null) {
                kVar.f();
            }
            i12.f71682V0 = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, i12.f71744u0, com.avito.android.printable_text.b.f(text), null, Collections.singletonList(new c.a.C3719a(title, true, null, aVar, 4, null)), null, null, -1, ToastBarPosition.f181046d, null, false, false, null, new ContextThemeWrapper(i12.f71740s0, R.style.Theme_DesignSystem_Re23), 1946);
        }
        return kotlin.G0.f406611a;
    }
}
