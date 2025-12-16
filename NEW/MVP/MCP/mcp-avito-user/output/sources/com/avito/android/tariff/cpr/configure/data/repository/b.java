package com.avito.android.tariff.cpr.configure.data.repository;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import hB0.InterfaceC40801a;
import iB0.d;
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

/* compiled from: CprConfigureRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/data/repository/b;", "Lcom/avito/android/tariff/cpr/configure/data/repository/a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff.cpr.configure.data.repository.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40801a f295488a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f295489b;

    /* compiled from: CprConfigureRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LiB0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.data.repository.CprConfigureRepositoryImpl$postCprConfigureSave$2", f = "CprConfigureRepository.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f295490q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f295492s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f295493t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f295492s = str;
            this.f295493t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f295492s, this.f295493t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<d>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f295490q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC40801a interfaceC40801a = b.this.f295488a;
                this.f295490q = 1;
                obj = interfaceC40801a.a(this.f295492s, this.f295493t, this);
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
    public b(@k InterfaceC40801a interfaceC40801a, @k R0 r02) {
        this.f295488a = interfaceC40801a;
        this.f295489b = r02;
    }

    @Override // com.avito.android.tariff.cpr.configure.data.repository.a
    @l
    public final Object a(@k String str, @k String str2, @k Continuation<? super TypedResult<d>> continuation) {
        return C43259k.g(this.f295489b.a(), new a(str, str2, null), continuation);
    }
}
