package com.avito.android.photo_list_view_groups;

import androidx.view.M0;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.photo_list_view_groups.q;
import com.avito.android.remote.model.category_parameters.StringMapParameter;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_groups/l;", "Lcom/avito/android/photo_list_view_groups/h;", "Landroidx/lifecycle/M0;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends M0 implements h {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ImagesGroupsSlot.ParameterProvider f218615E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C43238h f218616J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public String f218617K;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public N0 f218620N;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final e2 f218623Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final e2 f218624R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final e2 f218625S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final e2 f218626T;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, String> f218618L = new HashMap<>();

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final HashSet<String> f218619M = new HashSet<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f218621O = C42727D.c(new c());

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, q> f218622P = new HashMap<>();

    /* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_list_view_groups.PhotoItemGroupsImagesGroupsCacheImpl$notifyImageRemoved$1", f = "PhotoItemGroupsImagesGroupsCacheImpl.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f218627q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return l.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f218627q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = l.this.f218625S;
                G0 g02 = G0.f406611a;
                this.f218627q = 1;
                if (e2Var.emit(g02, this) == coroutine_suspended) {
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

    /* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_list_view_groups.PhotoItemGroupsImagesGroupsCacheImpl$scheduleUpdatingScoredImagesInSlot$1", f = "PhotoItemGroupsImagesGroupsCacheImpl.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f218629q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return l.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f218629q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f218629q = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            l lVar = l.this;
            StringMapParameter imagesGroupsParameter = lVar.f218615E.getImagesGroupsParameter();
            if (imagesGroupsParameter != null) {
                imagesGroupsParameter.setValue(lVar.ke());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Map<String, String>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, String> invoke() {
            Map<String, ? extends String> value;
            StringMapParameter imagesGroupsParameter = l.this.f218615E.getImagesGroupsParameter();
            return (imagesGroupsParameter == null || (value = imagesGroupsParameter.getValue()) == null) ? new HashMap() : new LinkedHashMap(value);
        }
    }

    /* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_list_view_groups.PhotoItemGroupsImagesGroupsCacheImpl$updateUI$1", f = "PhotoItemGroupsImagesGroupsCacheImpl.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f218632q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return l.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f218632q;
            if (i12 == 0) {
                C42729a0.b(obj);
                l lVar = l.this;
                e2 e2Var = lVar.f218623Q;
                HashMap<String, q> map = lVar.f218622P;
                this.f218632q = 1;
                if (e2Var.emit(map, this) == coroutine_suspended) {
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

    @Inject
    public l(@Y61.k ImagesGroupsSlot.ParameterProvider parameterProvider, @Y61.k R0 r02) {
        this.f218615E = parameterProvider;
        this.f218616J = U.a(r02.a().plus(t1.b()));
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f218623Q = e2VarB;
        this.f218624R = e2VarB;
        e2 e2VarB2 = f2.b(0, 0, null, 7);
        this.f218625S = e2VarB2;
        this.f218626T = e2VarB2;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final boolean C3(@Y61.k String str) {
        return this.f218619M.contains(str);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.l
    public final String G7(@Y61.k String str) {
        return this.f218618L.get(str);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void H9(@Y61.k String str, @Y61.k String str2) {
        ke().put(str, str2);
        le();
        this.f218619M.remove(str);
        this.f218622P.put(str, new q.c(str, str2));
        me();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final boolean Mc(@Y61.k String str) {
        return ke().containsKey(str);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void Nd(@Y61.k String str, @Y61.k Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            this.f218618L.put(str2, str);
            this.f218622P.put(str2, new q.c(str2, str));
            me();
        }
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void T6(@Y61.k ArrayList arrayList) {
        Iterator it = P0.q(ke()).entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!arrayList.contains(str)) {
                ke().remove(str);
                td();
            }
        }
        this.f218619M.removeIf(new C28081y0(new k(arrayList), 9));
        le();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void Vb(@Y61.k String str) {
        this.f218619M.add(str);
        this.f218622P.put(str, new q.a(str));
        me();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void Yb() {
        this.f218617K = null;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.k
    /* renamed from: Zd, reason: from getter */
    public final e2 getF218624R() {
        return this.f218624R;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.k
    /* renamed from: b5, reason: from getter */
    public final e2 getF218626T() {
        return this.f218626T;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final int c9(@Y61.k String str) {
        Map<String, String> mapKe = ke();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapKe.entrySet()) {
            if (L.f(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void d7(@Y61.k String str) {
        this.f218618L.remove(str);
        this.f218622P.remove(str);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final boolean ec(@Y61.k String str) {
        return this.f218618L.containsKey(str);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void h7(@Y61.k String str) {
        this.f218617K = str;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.l
    public final String i6(@Y61.k String str) {
        return ke().get(str);
    }

    public final Map<String, String> ke() {
        return (Map) this.f218621O.getValue();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.k
    public final Map<String, String> l4() {
        return P0.q(this.f218618L);
    }

    public final void le() {
        N0 n02 = this.f218620N;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f218620N = C43259k.d(this.f218616J, null, null, new b(null), 3);
    }

    public final void me() {
        C43259k.d(this.f218616J, null, null, new d(null), 3);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        Q0.d(this.f218616J.f411905b);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void p3(@Y61.k String str) {
        ke().remove(str);
        this.f218622P.remove(str);
        le();
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void td() {
        C43259k.d(this.f218616J, null, null, new a(null), 3);
    }

    @Override // com.avito.android.photo_list_view_groups.h
    @Y61.l
    /* renamed from: u5, reason: from getter */
    public final String getF218617K() {
        return this.f218617K;
    }

    @Override // com.avito.android.photo_list_view_groups.h
    public final void x2(@Y61.k String str) {
        this.f218622P.put(str, new q.b(str));
        me();
    }
}
