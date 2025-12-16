package com.avito.android.autoteka.data.previewSearch;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.autoteka.data.n;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.UtmParams;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import xj0.InterfaceC49957a;

/* compiled from: AutotekaPreviewSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/data/previewSearch/b;", "Lcom/avito/android/autoteka/data/n;", "Lcom/avito/android/autoteka/data/previewSearch/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends n implements com.avito.android.autoteka.data.previewSearch.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49957a f96193b;

    /* compiled from: AutotekaPreviewSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "attempts", "Lcom/avito/android/remote/model/TypedResult;", "LHj0/c;", "<anonymous>", "(J)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.data.previewSearch.AutotekaPreviewSearchInteractorImpl$checkPreviewStatus$2", f = "AutotekaPreviewSearchInteractor.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<Long, Continuation<? super TypedResult<Hj0.c>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f96194q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ long f96195r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f96197t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f96198u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l0.h<Integer> f96199v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l0.h<UtmParams> f96200w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f96201x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l0.h<Integer> hVar, l0.h<UtmParams> hVar2, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f96197t = str;
            this.f96198u = str2;
            this.f96199v = hVar;
            this.f96200w = hVar2;
            this.f96201x = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f96197t, this.f96198u, this.f96199v, this.f96200w, this.f96201x, continuation);
            aVar.f96195r = ((Number) obj).longValue();
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Long l12, Continuation<? super TypedResult<Hj0.c>> continuation) {
            return ((a) create(Long.valueOf(l12.longValue()), continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f96194q;
            l0.h<UtmParams> hVar = this.f96200w;
            l0.h<Integer> hVar2 = this.f96199v;
            if (i12 == 0) {
                C42729a0.b(obj);
                long j12 = this.f96195r;
                InterfaceC49957a interfaceC49957a = b.this.f96193b;
                Integer num = hVar2.f406842b;
                UtmParams utmParams = hVar.f406842b;
                Map<String, String> mapC = utmParams != null ? utmParams.f318752b : P0.c();
                String str = this.f96201x ? "1" : null;
                this.f96194q = 1;
                objC = interfaceC49957a.c(this.f96197t, j12, this.f96198u, num, mapC, str, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            if (typedResult instanceof TypedResult.Success) {
                hVar2.f406842b = null;
                hVar.f406842b = null;
            }
            return typedResult;
        }
    }

    @Inject
    public b(@k InterfaceC49957a interfaceC49957a) {
        this.f96193b = interfaceC49957a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.autoteka.data.previewSearch.a
    @l
    public final Object a(@k String str, @l Integer num, @l UtmParams utmParams, @k String str2, boolean z12, @k Continuation<? super TypedResult<Hj0.c>> continuation) {
        this.f96144a = 0L;
        l0.h hVar = new l0.h();
        hVar.f406842b = num;
        l0.h hVar2 = new l0.h();
        hVar2.f406842b = utmParams;
        return n.b(this, new a(str, str2, hVar, hVar2, z12, null), (ContinuationImpl) continuation);
    }
}
