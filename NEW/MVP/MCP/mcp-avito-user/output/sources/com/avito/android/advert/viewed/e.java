package com.avito.android.advert.viewed;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ViewedAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/viewed/e;", "Lcom/avito/android/advert/viewed/d;", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.persistance.j f81004a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.a f81005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f81006c;

    /* compiled from: ViewedAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.viewed.ViewedAdvertsInteractorImpl$markAsViewed$1", f = "ViewedAdvertsInteractor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81007q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f81009s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f81009s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new a(this.f81009s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81007q;
            String str = this.f81009s;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.advert.viewed.persistance.j jVar = eVar.f81004a;
                this.f81007q = 1;
                if (jVar.c(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            eVar.f81005b.b(str);
            return G0.f406611a;
        }
    }

    public e(@k com.avito.android.advert.viewed.persistance.j jVar, @k R0 r02, @k com.avito.android.advert.viewed.a aVar) {
        this.f81004a = jVar;
        this.f81005b = aVar;
        this.f81006c = U.a(r02.a().plus(t1.b()));
    }

    @Override // com.avito.android.advert.viewed.d
    public final boolean a(@k String str) {
        return this.f81004a.a(str);
    }

    @Override // com.avito.android.advert.viewed.d
    public final void b(@k String str) {
        C43259k.d(this.f81006c, null, null, new a(str, null), 3);
    }

    @Override // com.avito.android.advert.viewed.d
    @k
    public final Set c(@k ArrayList arrayList) {
        return this.f81004a.b(arrayList);
    }
}
