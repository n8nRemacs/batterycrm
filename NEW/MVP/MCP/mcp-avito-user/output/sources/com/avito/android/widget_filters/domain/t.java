package com.avito.android.widget_filters.domain;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: WidgetFiltersOnboardingStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/t;", "Lcom/avito/android/widget_filters/domain/s;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f329899a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f329900b;

    /* compiled from: WidgetFiltersOnboardingStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersOnboardingStorageImpl$isOnboardingShown$2", f = "WidgetFiltersOnboardingStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f329902r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f329903s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f329902r = str;
            this.f329903s = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return t.this.new a(this.f329902r, this.f329903s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(t.this.f329899a.get().getBoolean(this.f329902r + '-' + this.f329903s, false));
        }
    }

    /* compiled from: WidgetFiltersOnboardingStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersOnboardingStorageImpl$rememberOnboardingShowed$2", f = "WidgetFiltersOnboardingStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f329905r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f329906s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f329905r = str;
            this.f329906s = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return t.this.new b(this.f329905r, this.f329906s, continuation);
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
            t.this.f329899a.get().putBoolean(this.f329905r + '-' + this.f329906s, true);
            return G0.f406611a;
        }
    }

    @Inject
    public t(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f329899a = eVar;
        this.f329900b = r02;
    }

    @Override // com.avito.android.widget_filters.domain.s
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f329900b.a(), new b(str, str2, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.widget_filters.domain.s
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super Boolean> continuation) {
        return C43259k.g(this.f329900b.a(), new a(str, str2, null), continuation);
    }
}
