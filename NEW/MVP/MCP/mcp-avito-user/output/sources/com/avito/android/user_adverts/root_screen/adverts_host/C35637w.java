package com.avito.android.user_adverts.root_screen.adverts_host;

import TI0.a;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.c;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectRefreshAdvertsToastBar$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1177}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35637w extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314165q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f314166r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f314167s;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI0/c;", "it", "Lkotlin/G0;", "emit", "(LTI0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.w$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f314168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f314169c;

        public a(UserAdvertsHostFragment userAdvertsHostFragment, b0 b0Var) {
            this.f314168b = b0Var;
            this.f314169c = userAdvertsHostFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            b0 b0Var = this.f314168b;
            ViewGroup viewGroup = b0Var.f312376b;
            View viewFindViewById = viewGroup.findViewById(R.id.publish_fab_stub_re23);
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewGroup, com.avito.android.printable_text.b.f(viewGroup.getContext().getString(R.string.user_adverts_reload_toast_bar_message)), null, Collections.singletonList(new c.a.C3719a(viewGroup.getContext().getString(R.string.user_adverts_reload_toast_bar_button_title), true, null, new f0(b0Var), 4, null)), null, null, 2750, ToastBarPosition.f181048f, Integer.valueOf(viewFindViewById.getMeasuredHeight()), false, false, null, viewGroup.getContext(), 1818);
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = this.f314169c.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            e0Var.accept(a.m.f15543a);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.w$b */
    public static final class b implements InterfaceC43160i<TI0.c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f314170b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.w$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f314171b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectRefreshAdvertsToastBar$1$invokeSuspend$$inlined$filter$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.w$b$a$a, reason: collision with other inner class name */
            public static final class C9691a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f314172q;

                /* renamed from: r, reason: collision with root package name */
                public int f314173r;

                public C9691a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f314172q = obj;
                    this.f314173r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f314171b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.C35637w.b.a.C9691a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.root_screen.adverts_host.w$b$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.C35637w.b.a.C9691a) r0
                    int r1 = r0.f314173r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f314173r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.w$b$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.w$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f314172q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f314173r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    TI0.c r6 = (TI0.c) r6
                    boolean r6 = r6.f15560i
                    if (r6 == 0) goto L46
                    r0.f314173r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f314171b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.C35637w.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(n2 n2Var) {
            this.f314170b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super TI0.c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f314170b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35637w(UserAdvertsHostFragment userAdvertsHostFragment, b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.f314166r = userAdvertsHostFragment;
        this.f314167s = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35637w(this.f314166r, this.f314167s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35637w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314165q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsHostFragment userAdvertsHostFragment = this.f314166r;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            InterfaceC43160i interfaceC43160iR = C43175k.r(new b(e0Var.getState()));
            a aVar = new a(userAdvertsHostFragment, this.f314167s);
            this.f314165q = 1;
            if (interfaceC43160iR.collect(aVar, this) == coroutine_suspended) {
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
