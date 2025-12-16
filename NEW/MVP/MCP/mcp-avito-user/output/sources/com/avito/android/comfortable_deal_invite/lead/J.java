package com.avito.android.comfortable_deal_invite.lead;

import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zq.InterfaceC50610b;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal_invite.lead.ComfortableDealInviteScreenKt$ComfortableDealInviteScreen$1", f = "ComfortableDealInviteScreen.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class J extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f123566q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC50610b> f123567r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<DeepLink, String, G0> f123568s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f123569t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f123570u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f123571v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f123572w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f123573x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f123574y;

    /* compiled from: ComfortableDealInviteScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzq/b;", "event", "Lkotlin/G0;", "<anonymous>", "(Lzq/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal_invite.lead.ComfortableDealInviteScreenKt$ComfortableDealInviteScreen$1$1", f = "ComfortableDealInviteScreen.kt", i = {}, l = {104, 114}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC50610b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f123575q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f123576r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<DeepLink, String, G0> f123577s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f123578t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f123579u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f123580v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f123581w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f123582x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f123583y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super DeepLink, ? super String, G0> pVar, Y41.a<G0> aVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, com.akita.compose.component.toast_bar.J j13, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f123577s = pVar;
            this.f123578t = aVar;
            this.f123579u = uVar;
            this.f123580v = j12;
            this.f123581w = str;
            this.f123582x = j13;
            this.f123583y = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f123577s, this.f123578t, this.f123579u, this.f123580v, this.f123581w, this.f123582x, this.f123583y, continuation);
            aVar.f123576r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC50610b interfaceC50610b, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC50610b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f123575q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC50610b interfaceC50610b = (InterfaceC50610b) this.f123576r;
                if (interfaceC50610b instanceof InterfaceC50610b.C12978b) {
                    InterfaceC50610b.C12978b c12978b = (InterfaceC50610b.C12978b) interfaceC50610b;
                    this.f123577s.invoke(c12978b.f444274a, c12978b.f444275b);
                } else if (interfaceC50610b instanceof InterfaceC50610b.a) {
                    this.f123578t.invoke();
                } else if (interfaceC50610b instanceof InterfaceC50610b.c) {
                    ToastBarDuration toastBarDuration = ToastBarDuration.f63230b;
                    ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
                    this.f123575q = 1;
                    if (this.f123579u.a(this.f123580v, this.f123581w, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC50610b instanceof InterfaceC50610b.d) {
                    ToastBarDuration toastBarDuration2 = ToastBarDuration.f63230b;
                    ToastBarPosition toastBarPosition2 = ToastBarPosition.f63236c;
                    this.f123575q = 2;
                    if (this.f123579u.a(this.f123582x, this.f123583y, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration2, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition2, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(InterfaceC43160i<? extends InterfaceC50610b> interfaceC43160i, Y41.p<? super DeepLink, ? super String, G0> pVar, Y41.a<G0> aVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, com.akita.compose.component.toast_bar.J j13, String str2, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f123567r = interfaceC43160i;
        this.f123568s = pVar;
        this.f123569t = aVar;
        this.f123570u = uVar;
        this.f123571v = j12;
        this.f123572w = str;
        this.f123573x = j13;
        this.f123574y = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new J(this.f123567r, this.f123568s, this.f123569t, this.f123570u, this.f123571v, this.f123572w, this.f123573x, this.f123574y, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((J) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f123566q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43197r1 c43197r1 = new C43197r1(new a(this.f123568s, this.f123569t, this.f123570u, this.f123571v, this.f123572w, this.f123573x, this.f123574y, null), this.f123567r);
            this.f123566q = 1;
            if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
