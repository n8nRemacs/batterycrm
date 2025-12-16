package com.avito.android.rating.user_contacts.mvi;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_contacts.UserContactsResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserContactsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/o;", "Lcom/avito/android/rating/user_contacts/mvi/n;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f247845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f247846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f247847c;

    /* compiled from: UserContactsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsInteractorImpl$getContactList$1", f = "UserContactsInteractor.kt", i = {0}, l = {34, 35, 37}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247848q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247849r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f247851t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f247851t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = o.this.new a(this.f247851t, continuation);
            aVar.f247849r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f247848q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f247849r;
                o oVar = o.this;
                InterfaceC14487a interfaceC14487a = oVar.f247845a;
                this.f247849r = interfaceC43172j;
                this.f247848q = 1;
                obj = interfaceC14487a.o(oVar.f247847c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f247849r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            boolean z13 = this.f247851t;
            if (z12) {
                UserContactsInternalAction.Loaded loaded = new UserContactsInternalAction.Loaded((UserContactsResult) ((TypedResult.Success) typedResult).getResult(), z13);
                this.f247849r = null;
                this.f247848q = 2;
                if (interfaceC43172j.emit(loaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
                com.avito.android.analytics.screens.mvi.t showErrorToast = z13 ? new UserContactsInternalAction.ShowErrorToast(apiExceptionA, com.avito.android.printable_text.b.c(R.string.user_contacts_error_toast_reload, new Serializable[0]), new a.e(b.InterfaceC7440b.C7441b.f247815a), null, 8, null) : new UserContactsInternalAction.ShowError(apiExceptionA);
                this.f247849r = null;
                this.f247848q = 3;
                if (interfaceC43172j.emit(showErrorToast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserContactsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsInteractorImpl$getContactList$2", f = "UserContactsInteractor.kt", i = {0, 2, 2}, l = {53, 54, 56, 57}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "error"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserContactsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ApiException f247852q;

        /* renamed from: r, reason: collision with root package name */
        public int f247853r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f247854s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f247856u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f247856u = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = o.this.new b(this.f247856u, continuation);
            bVar.f247854s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserContactsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f247853r
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L3b
                if (r2 == r7) goto L31
                if (r2 == r6) goto L2c
                if (r2 == r5) goto L21
                if (r2 != r4) goto L19
                goto L2c
            L19:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L21:
                com.avito.android.util.ApiException r2 = r0.f247852q
                java.lang.Object r5 = r0.f247854s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r17)
                r10 = r2
                goto L98
            L2c:
                kotlin.C42729a0.b(r17)
                goto Lb9
            L31:
                java.lang.Object r2 = r0.f247854s
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r17)
                r7 = r17
                goto L57
            L3b:
                kotlin.C42729a0.b(r17)
                java.lang.Object r2 = r0.f247854s
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                com.avito.android.rating.user_contacts.mvi.o r9 = com.avito.android.rating.user_contacts.mvi.o.this
                Mg0.a r9 = r9.f247845a
                android.net.Uri r10 = r0.f247856u
                java.lang.String r10 = r10.toString()
                r0.f247854s = r2
                r0.f247853r = r7
                java.lang.Object r7 = r9.m(r10, r0)
                if (r7 != r1) goto L57
                return r1
            L57:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r9 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r9 == 0) goto L75
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r4 = r7.getResult()
                com.avito.android.remote.model.user_contacts.UserContactsResult r4 = (com.avito.android.remote.model.user_contacts.UserContactsResult) r4
                com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction$Loaded r5 = new com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction$Loaded
                r5.<init>(r4, r3)
                r0.f247854s = r8
                r0.f247853r = r6
                java.lang.Object r2 = r2.emit(r5, r0)
                if (r2 != r1) goto Lb9
                return r1
            L75:
                boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r6 == 0) goto Lbc
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r6 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r6, r7)
                com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction$HideLoadingItem r7 = com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction.HideLoadingItem.f247788b
                r0.f247854s = r2
                r0.f247852q = r6
                r0.f247853r = r5
                java.lang.Object r5 = r2.emit(r7, r0)
                if (r5 != r1) goto L96
                return r1
            L96:
                r5 = r2
                r10 = r6
            L98:
                com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction$ShowErrorToast r2 = new com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction$ShowErrorToast
                r6 = 2131957925(0x7f1318a5, float:1.9552448E38)
                java.io.Serializable[] r3 = new java.io.Serializable[r3]
                com.avito.android.printable_text.PrintableText r11 = com.avito.android.printable_text.b.c(r6, r3)
                com.avito.android.rating.user_contacts.mvi.entity.a$f r13 = com.avito.android.rating.user_contacts.mvi.entity.a.f.f247807a
                r15 = 0
                r12 = 0
                r14 = 4
                r9 = r2
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r0.f247854s = r8
                r0.f247852q = r8
                r0.f247853r = r4
                java.lang.Object r2 = r5.emit(r2, r0)
                if (r2 != r1) goto Lb9
                return r1
            Lb9:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            Lbc:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.user_contacts.mvi.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserContactsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ContactDeleted;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsInteractorImpl$removeContact$1", f = "UserContactsInteractor.kt", i = {0}, l = {69, 70}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserContactsInternalAction.ContactDeleted>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247857q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247858r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f247860t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f247861u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f247860t = str;
            this.f247861u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = o.this.new c(this.f247860t, this.f247861u, continuation);
            cVar.f247858r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserContactsInternalAction.ContactDeleted> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f247857q;
            String str = this.f247861u;
            String str2 = this.f247860t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f247858r;
                InterfaceC14487a interfaceC14487a = o.this.f247845a;
                this.f247858r = interfaceC43172j;
                this.f247857q = 1;
                if (interfaceC14487a.g(str2, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f247858r;
                C42729a0.b(obj);
            }
            UserContactsInternalAction.ContactDeleted contactDeleted = new UserContactsInternalAction.ContactDeleted(str2, str);
            this.f247858r = null;
            this.f247857q = 2;
            if (interfaceC43172j.emit(contactDeleted, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public o(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k R0 r02, @Y61.l @com.avito.android.rating.user_contacts.di.c String str) {
        this.f247845a = interfaceC14487a;
        this.f247846b = r02;
        this.f247847c = str;
    }

    @Override // com.avito.android.rating.user_contacts.mvi.n
    @Y61.k
    public final InterfaceC43160i<UserContactsInternalAction> a(boolean z12) {
        return C43175k.I(this.f247846b.a(), C43175k.G(new a(z12, null)));
    }

    @Override // com.avito.android.rating.user_contacts.mvi.n
    @Y61.k
    public final InterfaceC43160i<UserContactsInternalAction> b(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f247846b.a(), C43175k.G(new c(str, str2, null)));
    }

    @Override // com.avito.android.rating.user_contacts.mvi.n
    @Y61.k
    public final InterfaceC43160i<UserContactsInternalAction> c(@Y61.k Uri uri) {
        return C43175k.I(this.f247846b.a(), C43175k.G(new b(uri, null)));
    }
}
