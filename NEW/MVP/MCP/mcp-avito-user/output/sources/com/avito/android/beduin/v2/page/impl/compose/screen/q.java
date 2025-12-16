package com.avito.android.beduin.v2.page.impl.compose.screen;

import com.akita.compose.component.toast_bar.I;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.theme.re23.style.b4;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$showToastBar$2", f = "BeduinV2PageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f105092q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BeduinOneTimeEvent.ShowToastBar f105093r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b4 f105094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f105095t;

    /* compiled from: BeduinV2PageScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$showToastBar$2$1", f = "BeduinV2PageScreen.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f105096q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ BeduinOneTimeEvent.ShowToastBar f105097r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b4 f105098s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u f105099t;

        /* compiled from: BeduinV2PageScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.v2.page.impl.compose.screen.q$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3137a {
            static {
                int[] iArr = new int[BeduinOneTimeEvent.ShowToastBar.Type.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    BeduinOneTimeEvent.ShowToastBar.Type type = BeduinOneTimeEvent.ShowToastBar.Type.f176273b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    BeduinOneTimeEvent.ShowToastBar.Type type2 = BeduinOneTimeEvent.ShowToastBar.Type.f176273b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BeduinOneTimeEvent.ShowToastBar showToastBar, b4 b4Var, u uVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f105097r = showToastBar;
            this.f105098s = b4Var;
            this.f105099t = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f105097r, this.f105098s, this.f105099t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            J f66804a;
            BeduinOneTimeEvent.ShowToastBar.a aVar;
            Y41.a<G0> aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f105096q;
            BeduinOneTimeEvent.ShowToastBar showToastBar = this.f105097r;
            if (i12 == 0) {
                C42729a0.b(obj);
                BeduinOneTimeEvent.ShowToastBar.Type type = showToastBar.f176271c;
                String str = showToastBar.f176269a;
                int iOrdinal = type.ordinal();
                b4 b4Var = this.f105098s;
                if (iOrdinal == 0) {
                    f66804a = b4Var.getF66804a();
                } else if (iOrdinal == 1) {
                    f66804a = b4Var.getF66805b();
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f66804a = b4Var.getF66806c();
                }
                J j12 = f66804a;
                BeduinOneTimeEvent.ShowToastBar.a aVar3 = showToastBar.f176270b;
                String str2 = aVar3 != null ? aVar3.f176278a : null;
                ToastBarPosition toastBarPosition = type == BeduinOneTimeEvent.ShowToastBar.Type.f176275d ? ToastBarPosition.f63235b : ToastBarPosition.f63236c;
                this.f105096q = 1;
                obj = this.f105099t.a(j12, str, G0.f406611a, (60 & 8) != 0 ? null : str2, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            if (L.f((I) obj, I.d.f63214a) && (aVar = showToastBar.f176270b) != null && (aVar2 = aVar.f176279b) != null) {
                aVar2.invoke();
            }
            Y41.a<G0> aVar4 = showToastBar.f176272d;
            if (aVar4 != null) {
                aVar4.invoke();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BeduinOneTimeEvent.ShowToastBar showToastBar, b4 b4Var, u uVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f105093r = showToastBar;
        this.f105094s = b4Var;
        this.f105095t = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f105093r, this.f105094s, this.f105095t, continuation);
        qVar.f105092q = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super N0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.d((T) this.f105092q, null, null, new a(this.f105093r, this.f105094s, this.f105095t, null), 3);
    }
}
