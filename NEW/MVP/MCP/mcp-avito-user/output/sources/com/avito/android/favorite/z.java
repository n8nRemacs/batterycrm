package com.avito.android.favorite;

import com.avito.android.util.R0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import qu.C47445a;
import qu.InterfaceC47447c;

/* compiled from: FavoritesStorageWithCache.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/z;", "Lcom/avito/android/favorite/v;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47447c f155244a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<Map<String, Boolean>> f155245b = p2.a(P0.c());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f155246c = new kotlinx.coroutines.sync.d();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f155247d;

    /* compiled from: FavoritesStorageWithCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/favorite/B"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite.FavoritesStorageWithCache$markForRemove$$inlined$updateCache$1", f = "FavoritesStorageWithCache.kt", i = {0}, l = {122}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f155248q;

        /* renamed from: r, reason: collision with root package name */
        public z f155249r;

        /* renamed from: s, reason: collision with root package name */
        public int f155250s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f155252u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, String str) {
            super(2, continuation);
            this.f155252u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return z.this.new a(continuation, this.f155252u);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            kotlinx.coroutines.sync.d dVar;
            z zVar;
            Map<String, Boolean> value;
            LinkedHashMap linkedHashMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155250s;
            if (i12 == 0) {
                C42729a0.b(obj);
                z zVar2 = z.this;
                dVar = zVar2.f155246c;
                this.f155248q = dVar;
                this.f155249r = zVar2;
                this.f155250s = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zVar = zVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = this.f155249r;
                dVar = this.f155248q;
                C42729a0.b(obj);
            }
            try {
                Z1<Map<String, Boolean>> z12 = zVar.f155245b;
                do {
                    value = z12.getValue();
                    Map<String, Boolean> map = value;
                    linkedHashMap = new LinkedHashMap(zVar.f155245b.getValue());
                    linkedHashMap.put(this.f155252u, Boxing.boxBoolean(false));
                } while (!z12.N3(value, linkedHashMap));
                G0 g02 = G0.f406611a;
                dVar.d(null);
                return G0.f406611a;
            } catch (Throwable th2) {
                dVar.d(null);
                throw th2;
            }
        }
    }

    /* compiled from: FavoritesStorageWithCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/favorite/B"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite.FavoritesStorageWithCache$save$$inlined$updateCache$1", f = "FavoritesStorageWithCache.kt", i = {0}, l = {122}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f155253q;

        /* renamed from: r, reason: collision with root package name */
        public z f155254r;

        /* renamed from: s, reason: collision with root package name */
        public int f155255s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f155257u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, String str) {
            super(2, continuation);
            this.f155257u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return z.this.new b(continuation, this.f155257u);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            kotlinx.coroutines.sync.d dVar;
            z zVar;
            Map<String, Boolean> value;
            LinkedHashMap linkedHashMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155255s;
            if (i12 == 0) {
                C42729a0.b(obj);
                z zVar2 = z.this;
                dVar = zVar2.f155246c;
                this.f155253q = dVar;
                this.f155254r = zVar2;
                this.f155255s = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zVar = zVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = this.f155254r;
                dVar = this.f155253q;
                C42729a0.b(obj);
            }
            try {
                Z1<Map<String, Boolean>> z12 = zVar.f155245b;
                do {
                    value = z12.getValue();
                    Map<String, Boolean> map = value;
                    linkedHashMap = new LinkedHashMap(zVar.f155245b.getValue());
                    linkedHashMap.put(this.f155257u, Boxing.boxBoolean(true));
                } while (!z12.N3(value, linkedHashMap));
                G0 g02 = G0.f406611a;
                dVar.d(null);
                return G0.f406611a;
            } catch (Throwable th2) {
                dVar.d(null);
                throw th2;
            }
        }
    }

    /* compiled from: FavoritesStorageWithCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/favorite/B"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite.FavoritesStorageWithCache$wipe$$inlined$updateCache$1", f = "FavoritesStorageWithCache.kt", i = {0}, l = {122}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f155258q;

        /* renamed from: r, reason: collision with root package name */
        public z f155259r;

        /* renamed from: s, reason: collision with root package name */
        public int f155260s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return z.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            kotlinx.coroutines.sync.d dVar;
            z zVar;
            Map<String, Boolean> value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155260s;
            if (i12 == 0) {
                C42729a0.b(obj);
                z zVar2 = z.this;
                dVar = zVar2.f155246c;
                this.f155258q = dVar;
                this.f155259r = zVar2;
                this.f155260s = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zVar = zVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = this.f155259r;
                dVar = this.f155258q;
                C42729a0.b(obj);
            }
            try {
                Z1<Map<String, Boolean>> z12 = zVar.f155245b;
                do {
                    value = z12.getValue();
                    Map<String, Boolean> map = value;
                    new LinkedHashMap(zVar.f155245b.getValue());
                } while (!z12.N3(value, P0.c()));
                G0 g02 = G0.f406611a;
                dVar.d(null);
                return G0.f406611a;
            } catch (Throwable th2) {
                dVar.d(null);
                throw th2;
            }
        }
    }

    @Inject
    public z(@Y61.k InterfaceC47447c interfaceC47447c, @Y61.k R0 r02) {
        this.f155244a = interfaceC47447c;
        C43238h c43238hA = U.a(r02.a());
        this.f155247d = c43238hA;
        C43259k.d(c43238hA, null, null, new A(this, null, this), 3);
    }

    @Override // com.avito.android.favorite.x
    public final boolean b(@Y61.k String str, boolean z12) {
        Boolean bool = this.f155245b.getValue().get(str);
        return bool != null ? bool.booleanValue() : z12;
    }

    @Override // com.avito.android.favorite.x
    public final void c(@Y61.k List<String> list) {
        this.f155244a.c(list);
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<String, Boolean> d(@Y61.k List<String> list) {
        Map<String, Boolean> value = this.f155245b.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : list) {
            Boolean bool = value.get(str);
            if (bool != null) {
                linkedHashMap.put(str, bool);
            }
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.favorite.x
    public final void e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        C43259k.d(this.f155247d, null, null, new a(null, str), 3);
        this.f155244a.e(str, str2, str3);
    }

    @Override // com.avito.android.favorite.x
    public final boolean f(@Y61.k String str) {
        return L.f(this.f155245b.getValue().get(str), Boolean.FALSE);
    }

    @Override // com.avito.android.favorite.x
    public final void g(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        C43259k.d(this.f155247d, null, null, new b(null, str), 3);
        this.f155244a.g(str, str2, str3);
    }

    @Override // com.avito.android.favorite.x
    public final int getCount() {
        return this.f155244a.getCount();
    }

    @Override // com.avito.android.favorite.v
    public final InterfaceC43160i getData() {
        return C43175k.b(this.f155245b);
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final List<String> h() {
        return this.f155244a.h();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<C47445a, List<String>> i() {
        return this.f155244a.i();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<C47445a, List<String>> j() {
        return this.f155244a.j();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final List<String> l() {
        return this.f155244a.l();
    }

    @Override // com.avito.android.favorite.x
    public final void m(@Y61.k String str, @Y61.l String str2) {
        C43259k.d(this.f155247d, null, null, new y(this, null, str), 3);
        this.f155244a.m(str, str2);
    }

    @Override // com.avito.android.favorite.x
    public final void wipe() {
        C43259k.d(this.f155247d, null, null, new c(null), 3);
        this.f155244a.wipe();
    }
}
