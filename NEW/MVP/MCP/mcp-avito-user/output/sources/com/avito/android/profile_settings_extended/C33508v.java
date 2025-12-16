package com.avito.android.profile_settings_extended;

import com.avito.android.authorization.AuthSource;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.util.K5;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/v;", "Lcom/avito/android/profile_settings_extended/u;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33508v implements InterfaceC33507u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f230817a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<A1> f230818b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.converter.a f230819c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.converter.g f230820d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f230821e;

    /* compiled from: ExtendedProfileSettingsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsInteractorImpl$loadProfileSettings$1", f = "ExtendedProfileSettingsInteractor.kt", i = {0, 1, 2, 2, 3, 3, 4}, l = {45, 46, 49, 51, 54, 57}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "data", "$this$flow", "data", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$3", "L$0", "L$2", "L$0"})
    /* renamed from: com.avito.android.profile_settings_extended.v$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f230822q;

        /* renamed from: r, reason: collision with root package name */
        public Object f230823r;

        /* renamed from: s, reason: collision with root package name */
        public com.avito.android.profile_settings_extended.entity.u f230824s;

        /* renamed from: t, reason: collision with root package name */
        public int f230825t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f230826u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f230827v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C33508v f230828w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ List<String> f230829x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f230830y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, C33508v c33508v, List<String> list, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f230827v = z12;
            this.f230828w = c33508v;
            this.f230829x = list;
            this.f230830y = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f230827v, this.f230828w, this.f230829x, this.f230830y, continuation);
            aVar.f230826u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.C33508v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsInteractorImpl$loadProfileSettings$2", f = "ExtendedProfileSettingsInteractor.kt", i = {0, 0}, l = {63, 65}, m = "invokeSuspend", n = {"$this$catch", "error"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.profile_settings_extended.v$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f230831q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f230832r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f230833s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f230832r = interfaceC43172j;
            bVar.f230833s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f230831q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f230832r;
                th2 = this.f230833s;
                ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.LoadingError loadingError = new ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.LoadingError(th2);
                this.f230832r = interfaceC43172j2;
                this.f230833s = th2;
                this.f230831q = 1;
                if (interfaceC43172j2.emit(loadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                th2 = this.f230833s;
                interfaceC43172j = this.f230832r;
                C42729a0.b(obj);
            }
            if (K5.a(th2)) {
                AuthSource authSource = AuthSource.f92694c;
                ExtendedProfileSettingsInternalAction.OpenAuthScreen openAuthScreen = new ExtendedProfileSettingsInternalAction.OpenAuthScreen();
                this.f230832r = null;
                this.f230833s = null;
                this.f230831q = 2;
                if (interfaceC43172j.emit(openAuthScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C33508v(@Y61.k h31.e<D0> eVar, @Y61.k h31.e<A1> eVar2, @Y61.k com.avito.android.profile_settings_extended.converter.a aVar, @Y61.k com.avito.android.profile_settings_extended.converter.g gVar, @Y61.k R0 r02) {
        this.f230817a = eVar;
        this.f230818b = eVar2;
        this.f230819c = aVar;
        this.f230820d = gVar;
        this.f230821e = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_settings_extended.InterfaceC33507u
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.profile_settings_extended.C33509w
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.profile_settings_extended.w r0 = (com.avito.android.profile_settings_extended.C33509w) r0
            int r1 = r0.f230837t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230837t = r1
            goto L18
        L13:
            com.avito.android.profile_settings_extended.w r0 = new com.avito.android.profile_settings_extended.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f230835r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f230837t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.profile_settings_extended.v r0 = r0.f230834q
            kotlin.C42729a0.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            h31.e<com.avito.android.remote.A1> r5 = r4.f230818b
            java.lang.Object r5 = r5.get()
            com.avito.android.remote.A1 r5 = (com.avito.android.remote.A1) r5
            r0.f230834q = r4
            r0.f230837t = r3
            java.lang.String r2 = "profile_extended"
            java.lang.Object r5 = r5.j(r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r1 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L61
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.VerificationOptionsListResult r5 = (com.avito.android.remote.model.VerificationOptionsListResult) r5
            com.avito.android.profile_settings_extended.converter.g r0 = r0.f230820d
            com.avito.android.deep_linking.action_select_link.ActionSelectLink r5 = r0.a(r5)
            return r5
        L61:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L74
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L74:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.C33508v.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.profile_settings_extended.InterfaceC33507u
    @Y61.k
    public final InterfaceC43160i b(@Y61.l String str, @Y61.k List list, boolean z12) {
        return C43175k.I(this.f230821e.a(), new C43152f0(C43175k.G(new a(z12, this, list, str, null)), new b(3, null)));
    }
}
