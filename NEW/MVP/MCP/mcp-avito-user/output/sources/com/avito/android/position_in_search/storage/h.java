package com.avito.android.position_in_search.storage;

import Y41.p;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.C33275a;
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

/* compiled from: CompetitorsPreference.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/storage/h;", "Lcom/avito/android/position_in_search/storage/k;", "_avito_position-in-search_storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f221775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f221776b;

    /* compiled from: CompetitorsPreference.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.storage.CompetitorsPreference$isNewCompetitorsShown$2", f = "CompetitorsPreference.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new a(continuation);
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
            return Boxing.boxBoolean(h.this.f221775a.get().getBoolean("position_in_search_new_competitors", false));
        }
    }

    @Inject
    public h(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f221775a = eVar;
        this.f221776b = r02;
    }

    @Override // com.avito.android.position_in_search.storage.k
    @Y61.l
    public final Object a(@Y61.k Continuation<? super Boolean> continuation) {
        return C43259k.g(this.f221776b.a(), new a(null), continuation);
    }

    @Override // com.avito.android.position_in_search.storage.k
    @Y61.l
    public final Object b(@Y61.k C33275a.b.C6651a.C6652a.C6653a.C6654a c6654a) {
        Object objG = C43259k.g(this.f221776b.a(), new i(this, null), c6654a);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
