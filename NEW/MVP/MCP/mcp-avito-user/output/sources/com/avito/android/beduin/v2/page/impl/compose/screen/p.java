package com.avito.android.beduin.v2.page.impl.compose.screen;

import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.theme.re23.style.b4;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$handleBeduinOneTimeEvents$3", f = "BeduinV2PageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f105084q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BeduinOneTimeEvent f105085r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b4 f105086s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f105087t;

    /* compiled from: BeduinV2PageScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$handleBeduinOneTimeEvents$3$1", f = "BeduinV2PageScreen.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f105088q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ BeduinOneTimeEvent f105089r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b4 f105090s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u f105091t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BeduinOneTimeEvent beduinOneTimeEvent, b4 b4Var, u uVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f105089r = beduinOneTimeEvent;
            this.f105090s = b4Var;
            this.f105091t = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f105089r, this.f105090s, this.f105091t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f105088q;
            if (i12 == 0) {
                C42729a0.b(obj);
                String strConcat = "Ошибка рендеринга. Подробности в логе\n".concat(((BeduinOneTimeEvent.d) this.f105089r).f176283a.c());
                J f66806c = this.f105090s.getF66806c();
                ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
                this.f105088q = 1;
                if (this.f105091t.a(f66806c, strConcat, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BeduinOneTimeEvent beduinOneTimeEvent, b4 b4Var, u uVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f105085r = beduinOneTimeEvent;
        this.f105086s = b4Var;
        this.f105087t = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f105085r, this.f105086s, this.f105087t, continuation);
        pVar.f105084q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super N0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.d((T) this.f105084q, null, null, new a(this.f105085r, this.f105086s, this.f105087t, null), 3);
    }
}
