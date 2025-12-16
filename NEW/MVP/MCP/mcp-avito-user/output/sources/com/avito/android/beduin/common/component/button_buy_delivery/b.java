package com.avito.android.beduin.common.component.button_buy_delivery;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.lib.design.button.Button;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: BeduinBuyWithDeliveryButtonComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.common.component.button_buy_delivery.BeduinBuyWithDeliveryButtonComponent$updateWithData$1$2", f = "BeduinBuyWithDeliveryButtonComponent.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f100820q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.button_buy_delivery.a f100821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Button f100822s;

    /* compiled from: BeduinBuyWithDeliveryButtonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.common.component.button_buy_delivery.BeduinBuyWithDeliveryButtonComponent$updateWithData$1$2$icon$1", f = "BeduinBuyWithDeliveryButtonComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Drawable>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Button f100823q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin.common.component.button_buy_delivery.a f100824r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.beduin.common.component.button_buy_delivery.a aVar, Button button, Continuation continuation) {
            super(2, continuation);
            this.f100823q = button;
            this.f100824r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f100824r, this.f100823q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Drawable> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Context context = this.f100823q.getContext();
            com.avito.android.beduin.common.component.button_buy_delivery.a aVar = this.f100824r;
            return v.c(context, aVar.f100810e.getLocalIcon(), aVar.f100810e.getBase64Icon());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.beduin.common.component.button_buy_delivery.a aVar, Button button, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f100821r = aVar;
        this.f100822s = button;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f100821r, this.f100822s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f100820q;
        com.avito.android.beduin.common.component.button_buy_delivery.a aVar = this.f100821r;
        Button button = this.f100822s;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.scheduling.b bVarA = aVar.f100811f.a();
            a aVar2 = new a(aVar, button, null);
            this.f100820q = 1;
            obj = C43259k.g(bVarA, aVar2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        aVar.u(button, (Drawable) obj);
        return G0.f406611a;
    }
}
