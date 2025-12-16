package com.avito.android.user_advert.advert.faq.data;

import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.H;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: AdvertFaqSurveyStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/data/o;", "Lcom/avito/android/user_advert/advert/faq/data/n;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final pV0.e f308906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f308907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C36272i f308908c = new C36272i(new H(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));

    /* compiled from: AdvertFaqSurveyStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/data/o$a;", "", "<init>", "()V", "", "PERSISTENT_REPOSITORY_FAQ_KEY", "Ljava/lang/String;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertFaqSurveyStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.faq.data.AdvertFaqSurveyStorageImpl$deleteSurveysData$2", f = "AdvertFaqSurveyStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o.this.f308906a.b("PERSISTENT_REPOSITORY_FAQ_KEY");
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertFaqSurveyStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/beduin/v2/engine/field/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/beduin/v2/engine/field/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.faq.data.AdvertFaqSurveyStorageImpl$getSurveysData$2", f = "AdvertFaqSurveyStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super com.avito.beduin.v2.engine.field.d>, Object> {
        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super com.avito.beduin.v2.engine.field.d> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o oVar = o.this;
            return oVar.f308906a.a(oVar.f308908c, "PERSISTENT_REPOSITORY_FAQ_KEY");
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public o(@Y61.k pV0.e eVar, @Y61.k R0 r02) {
        this.f308906a = eVar;
        this.f308907b = r02;
    }

    @Override // com.avito.android.user_advert.advert.faq.data.n
    @Y61.l
    public final Object a(@Y61.k Continuation<? super com.avito.beduin.v2.engine.field.d> continuation) {
        return C43259k.g(this.f308907b.a(), new c(null), continuation);
    }

    @Override // com.avito.android.user_advert.advert.faq.data.n
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f308907b.a(), new b(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
