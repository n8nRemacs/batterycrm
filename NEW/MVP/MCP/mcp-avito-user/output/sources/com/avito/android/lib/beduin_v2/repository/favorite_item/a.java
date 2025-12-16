package com.avito.android.lib.beduin_v2.repository.favorite_item;

import Y41.p;
import Y61.k;
import Y61.l;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorite.h;
import com.avito.android.favorite.v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.beduin.v2.logger.LogLevel;
import io.reactivex.rxjava3.kotlin.A1;
import jV0.InterfaceC42311a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import lV0.C43690b;

/* compiled from: FavoriteItemRepositoryClientImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/favorite_item/a;", "LjV0/a;", "a", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements InterfaceC42311a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f176588g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f176589b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final v f176590c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f176591d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_collection_toast.c f176592e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C43238h f176593f;

    /* compiled from: FavoriteItemRepositoryClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/favorite_item/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.repository.favorite_item.a$a, reason: collision with other inner class name */
    public static final class C5232a {
        public /* synthetic */ C5232a(C42822w c42822w) {
            this();
        }

        public C5232a() {
        }
    }

    /* compiled from: FavoriteItemRepositoryClientImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.favorite_item.FavoriteItemRepositoryClientImpl$bind$1", f = "FavoriteItemRepositoryClientImpl.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176594q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FV0.a f176595r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f176596s;

        /* compiled from: FavoriteItemRepositoryClientImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.favorite_item.FavoriteItemRepositoryClientImpl$bind$1$1", f = "FavoriteItemRepositoryClientImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.lib.beduin_v2.repository.favorite_item.a$b$a, reason: collision with other inner class name */
        public static final class C5233a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ a f176597q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ FV0.a f176598r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5233a(FV0.a aVar, a aVar2, Continuation continuation) {
                super(2, continuation);
                this.f176597q = aVar2;
                this.f176598r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5233a(this.f176598r, this.f176597q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5233a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                View view;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                int i12 = a.f176588g;
                a aVar = this.f176597q;
                aVar.getClass();
                FV0.a aVar2 = this.f176598r;
                if (aVar2 instanceof FV0.b) {
                    view = ((ViewGroup) ((FV0.b) aVar2).N3().findViewById(R.id.content)).getChildAt(0);
                } else {
                    if (!(aVar2 instanceof FV0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    view = ((FV0.c) aVar2).j1().getView();
                }
                if (view != null) {
                    aVar.f176592e.d(view, aVar2);
                } else {
                    RU0.b bVar = RU0.b.f14467a;
                    LogLevel[] logLevelArr = LogLevel.f337864b;
                    bVar.getClass();
                    if (3 >= RU0.b.f14469c) {
                        RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":FavoriteItemRepositoryClientImpl"), "Unable to retrieve rootView from " + aVar2);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FV0.a aVar, a aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f176595r = aVar;
            this.f176596s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f176595r, this.f176596s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f176594q;
            if (i12 == 0) {
                C42729a0.b(obj);
                FV0.a aVar = this.f176595r;
                Lifecycle lifecycle = aVar.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f46682e;
                C5233a c5233a = new C5233a(aVar, this.f176596s, null);
                this.f176594q = 1;
                if (C23056p0.a(lifecycle, state, c5233a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new C5232a(null);
    }

    @Inject
    public a(@k h hVar, @k v vVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.advert_collection_toast.c cVar, @k R0 r02) {
        this.f176589b = hVar;
        this.f176590c = vVar;
        this.f176591d = interfaceC35745a5;
        this.f176592e = cVar;
        this.f176593f = U.a(r02.a());
    }

    @Override // FV0.h
    public final void P() {
        this.f176592e.a();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        C43259k.d(C22984Q.a(aVar), null, null, new b(aVar, this, null), 3);
    }

    @Override // jV0.InterfaceC42311a
    @k
    public final com.avito.android.iac_avcalls.impl_module.platform.avcalls.b h(@k String str, boolean z12, @k Y41.l lVar) {
        return new com.avito.android.iac_avcalls.impl_module.platform.avcalls.b(A1.g(this.f176589b.b(str, z12).z(this.f176591d.a()), null, new com.avito.android.lib.beduin_v2.repository.favorite_item.b(lVar), 1), 2);
    }

    @Override // jV0.InterfaceC42311a
    public final void j(@k C43690b c43690b) {
        AbstractC30567a lVar;
        AbstractC30567a.f155164c.getClass();
        String str = c43690b.f413822c;
        boolean zEquals = str.equals("favourites");
        String str2 = c43690b.f413823d;
        if (zEquals) {
            lVar = new AbstractC30567a.e(str2);
        } else if (str.equals("item")) {
            lVar = new AbstractC30567a.f("item", str2, null);
        } else if (str.equals("snippet")) {
            lVar = new AbstractC30567a.m(str2);
        } else if (str.equals("cart")) {
            lVar = new AbstractC30567a.b(str2);
        } else if (str.equals("extendedProfile")) {
            lVar = new AbstractC30567a.d(str2);
        } else if (str.equals("paidCvs")) {
            lVar = new AbstractC30567a.i(str2);
        } else {
            ScreenIdField screenIdField = ScreenIdField.f90251c;
            lVar = str.equals("serp") ? new AbstractC30567a.l(str2) : str.equals("item_i2i_rec") ? new AbstractC30567a.k(str2) : str.equals("vertical_recent_items") ? new AbstractC30567a.n(str2) : str.equals("job_my_applies") ? new AbstractC30567a.h("job_my_applies", str2, null) : str.equals("price_history") ? new AbstractC30567a.g(str2) : str.equals("item_gallery") ? new AbstractC30567a.j(str2) : str.equals("user_viewed") ? new AbstractC30567a.o(str2) : str.equals("aiAssistantSnippet") ? new AbstractC30567a.C4547a(str2) : null;
        }
        if (lVar == null) {
            lVar = new AbstractC30567a.m(str2);
        }
        AbstractC30567a abstractC30567a = lVar;
        String str3 = c43690b.f413820a;
        h hVar = this.f176589b;
        boolean z12 = c43690b.f413821b;
        hVar.g(str3, abstractC30567a, z12, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0).x(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f);
        if (c43690b.f413824e) {
            this.f176592e.b(str3, z12);
        }
    }

    @Override // jV0.InterfaceC42311a
    @k
    public final com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a m(@k String str, @k Y41.l lVar) {
        return new com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a(C43259k.d(this.f176593f, null, null, new c(this, str, lVar, null), 3), 2);
    }
}
