package com.avito.android.remote;

import Uj0.InterfaceC15529a;
import com.avito.android.remote.C34394w;
import com.avito.android.remote.config.AppConfig;
import com.avito.android.remote.config.generated.api.api_4_config_by_config_get.Api4ConfigByConfigGetResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConfigApiRepository.kt */
@Singleton
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/u;", "", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.u, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34390u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15529a f254372a;

    /* compiled from: ConfigApiRepository.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/config/AppConfig;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.remote.ConfigApiRepository$fetchAppConfig$1", f = "ConfigApiRepository.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.remote.u$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AppConfig>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f254373q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f254374r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C34390u.this.new a(continuation);
            aVar.f254374r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AppConfig> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f254373q;
            C34390u c34390u = C34390u.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f254374r;
                InterfaceC15529a interfaceC15529a = c34390u.f254372a;
                this.f254374r = interfaceC43172j;
                this.f254373q = 1;
                obj = interfaceC15529a.a("android", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f254374r;
                C42729a0.b(obj);
            }
            TypedResult success = (TypedResult) obj;
            if (success instanceof TypedResult.Success) {
                Api4ConfigByConfigGetResponse api4ConfigByConfigGetResponse = (Api4ConfigByConfigGetResponse) ((TypedResult.Success) success).getResult();
                c34390u.getClass();
                success = new TypedResult.Success(C34390u.a(api4ConfigByConfigGetResponse));
            } else if (!(success instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            if (success instanceof TypedResult.Success) {
                Object result = ((TypedResult.Success) success).getResult();
                this.f254374r = null;
                this.f254373q = 2;
                if (interfaceC43172j.emit(result, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (success instanceof TypedResult.Error) {
                throw C35936s.a(((TypedResult.Error) success).getError(), null);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C34390u(@Y61.k InterfaceC15529a interfaceC15529a) {
        this.f254372a = interfaceC15529a;
    }

    public static AppConfig a(Api4ConfigByConfigGetResponse api4ConfigByConfigGetResponse) {
        AppConfig.UpdateSource updateSource;
        AppConfig.UpdateSourceType updateSourceType;
        long versionMin = api4ConfigByConfigGetResponse.getVersionMin();
        long versionMax = api4ConfigByConfigGetResponse.getVersionMax();
        Long versionLatest = api4ConfigByConfigGetResponse.getVersionLatest();
        Integer numY0 = C43066x.y0(api4ConfigByConfigGetResponse.getPlatformVersion());
        int iIntValue = numY0 != null ? numY0.intValue() : 0;
        int i12 = C34394w.a.f254402a[api4ConfigByConfigGetResponse.getUpdateSource().ordinal()];
        if (i12 == 1) {
            updateSource = AppConfig.UpdateSource.f253333c;
        } else if (i12 == 2) {
            updateSource = AppConfig.UpdateSource.f253334d;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            updateSource = AppConfig.UpdateSource.f253335e;
        }
        AppConfig.UpdateSource updateSource2 = updateSource;
        String updateSourceUrl = api4ConfigByConfigGetResponse.getUpdateSourceUrl();
        Api4ConfigByConfigGetResponse.UpdateSourceType updateSourceType2 = api4ConfigByConfigGetResponse.getUpdateSourceType();
        if (updateSourceType2 != null) {
            int i13 = C34394w.a.f254403b[updateSourceType2.ordinal()];
            if (i13 == 1) {
                updateSourceType = AppConfig.UpdateSourceType.f253339c;
            } else if (i13 == 2) {
                updateSourceType = AppConfig.UpdateSourceType.f253340d;
            } else if (i13 == 3) {
                updateSourceType = AppConfig.UpdateSourceType.f253342f;
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                updateSourceType = AppConfig.UpdateSourceType.f253341e;
            }
        } else {
            updateSourceType = null;
        }
        return new AppConfig(versionMin, versionMax, versionLatest, iIntValue, updateSource2, updateSourceUrl, updateSourceType, api4ConfigByConfigGetResponse.getUpdateSourceTypeUrl(), api4ConfigByConfigGetResponse.getUpdateApkSourceLink(), api4ConfigByConfigGetResponse.a(), api4ConfigByConfigGetResponse.b());
    }

    @Y61.k
    public final InterfaceC43160i<AppConfig> b() {
        return C43175k.G(new a(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.remote.C34392v
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.remote.v r0 = (com.avito.android.remote.C34392v) r0
            int r1 = r0.f254396t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254396t = r1
            goto L18
        L13:
            com.avito.android.remote.v r0 = new com.avito.android.remote.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f254394r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f254396t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.remote.u r0 = r0.f254393q
            kotlin.C42729a0.b(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            r0.f254393q = r4
            r0.f254396t = r3
            Uj0.a r5 = r4.f254372a
            java.lang.String r2 = "android"
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r1 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L62
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.config.generated.api.api_4_config_by_config_get.Api4ConfigByConfigGetResponse r5 = (com.avito.android.remote.config.generated.api.api_4_config_by_config_get.Api4ConfigByConfigGetResponse) r5
            r0.getClass()
            com.avito.android.remote.config.AppConfig r5 = a(r5)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r5)
            r5 = r0
            goto L66
        L62:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L87
        L66:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L71
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            return r5
        L71:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r5 = r5.getError()
            r0 = 0
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r0)
            throw r5
        L81:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L87:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.C34390u.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
