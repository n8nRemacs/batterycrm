package com.avito.android.soa_stat.profile_settings.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: SoaStatProfileSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/domain/b;", "Lcom/avito/android/soa_stat/profile_settings/domain/a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.soa_stat.profile_settings.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f284077a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f284078b;

    /* compiled from: SoaStatProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.domain.SoaStatProfileSettingsInteractorImpl$soaStatSetting$2", f = "SoaStatProfileSettingsInteractor.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<IncomeProfileSettingsResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f284079q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<IncomeProfileSettingsResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f284079q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC34401z0 interfaceC34401z0 = b.this.f284077a;
                this.f284079q = 1;
                obj = interfaceC34401z0.f(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: SoaStatProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.domain.SoaStatProfileSettingsInteractorImpl$toggleSetting$2", f = "SoaStatProfileSettingsInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.soa_stat.profile_settings.domain.b$b, reason: collision with other inner class name */
    public static final class C8476b extends SuspendLambda implements p<T, Continuation<? super TypedResult<G0>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f284081q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f284083s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8476b(boolean z12, Continuation<? super C8476b> continuation) {
            super(2, continuation);
            this.f284083s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C8476b(this.f284083s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<G0>> continuation) {
            return ((C8476b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f284081q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC34401z0 interfaceC34401z0 = b.this.f284077a;
                this.f284081q = 1;
                obj = interfaceC34401z0.p(this.f284083s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public b(@k InterfaceC34401z0 interfaceC34401z0, @k R0 r02) {
        this.f284077a = interfaceC34401z0;
        this.f284078b = r02;
    }

    @Override // com.avito.android.soa_stat.profile_settings.domain.a
    @l
    public final Object a(boolean z12, @k Continuation<? super TypedResult<G0>> continuation) {
        return C43259k.g(this.f284078b.a(), new C8476b(z12, null), continuation);
    }

    @Override // com.avito.android.soa_stat.profile_settings.domain.a
    @l
    public final Object b(@k Continuation<? super TypedResult<IncomeProfileSettingsResponse>> continuation) {
        return C43259k.g(this.f284078b.a(), new a(null), continuation);
    }
}
