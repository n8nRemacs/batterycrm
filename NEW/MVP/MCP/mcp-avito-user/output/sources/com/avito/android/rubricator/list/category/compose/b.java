package com.avito.android.rubricator.list.category.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.rubricator.list.category.i;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import com.avito.android.rubricator.list.category.mvi.entity.CategoryListState;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vn0.InterfaceC49356a;
import vn0.InterfaceC49358c;

/* compiled from: CategoryListScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListState;", VoiceInfo.STATE, "_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: CategoryListScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rubricator.list.category.compose.CategoryListScreenKt$CategoryListScreen$1", f = "CategoryListScreen.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f255868q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ i f255869r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC49358c, G0> f255870s;

        /* compiled from: CategoryListScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rubricator.list.category.compose.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7659a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<InterfaceC49358c, G0> f255871b;

            /* JADX WARN: Multi-variable type inference failed */
            public C7659a(l<? super InterfaceC49358c, G0> lVar) {
                this.f255871b = lVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f255871b.invoke((InterfaceC49358c) obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new H(2, this.f255871b, L.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListOneTimeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i iVar, l<? super InterfaceC49358c, G0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f255869r = iVar;
            this.f255870s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f255869r, this.f255870s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f255868q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<InterfaceC49358c> events = this.f255869r.getEvents();
                C7659a c7659a = new C7659a(this.f255870s);
                this.f255868q = 1;
                if (events.collect(c7659a, this) == coroutine_suspended) {
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

    /* compiled from: CategoryListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rubricator.list.category.compose.b$b, reason: collision with other inner class name */
    public static final class C7660b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f255872l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC49358c, G0> f255873m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7660b(i iVar, l<? super InterfaceC49358c, G0> lVar, int i12) {
            super(2);
            this.f255872l = iVar;
            this.f255873m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            l<InterfaceC49358c, G0> lVar = this.f255873m;
            b.a(this.f255872l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f255874l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f255875m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f255876n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f255877o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ r f255878p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<? extends CategoryListItem> f255879q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l<CategoryListItem, G0> f255880r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f255881s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, Y41.a<G0> aVar, String str2, l<? super String, G0> lVar, r rVar, List<? extends CategoryListItem> list, l<? super CategoryListItem, G0> lVar2, l<? super DeepLink, G0> lVar3) {
            super(2);
            this.f255874l = str;
            this.f255875m = aVar;
            this.f255876n = str2;
            this.f255877o = lVar;
            this.f255878p = rVar;
            this.f255879q = list;
            this.f255880r = lVar2;
            this.f255881s = lVar3;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x02c1  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r38, java.lang.Integer r39) {
            /*
                Method dump skipped, instructions count: 853
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rubricator.list.category.compose.b.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f255882l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f255883m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<? extends CategoryListItem> f255884n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ r f255885o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f255886p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f255887q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l<CategoryListItem, G0> f255888r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f255889s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, List<? extends CategoryListItem> list, r rVar, Y41.a<G0> aVar, l<? super String, G0> lVar, l<? super CategoryListItem, G0> lVar2, l<? super DeepLink, G0> lVar3, int i12) {
            super(2);
            this.f255882l = str;
            this.f255883m = str2;
            this.f255884n = list;
            this.f255885o = rVar;
            this.f255886p = aVar;
            this.f255887q = lVar;
            this.f255888r = lVar2;
            this.f255889s = lVar3;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(14376961);
            Y41.a<G0> aVar = this.f255886p;
            l<String, G0> lVar = this.f255887q;
            b.b(this.f255882l, this.f255883m, this.f255884n, this.f255885o, aVar, lVar, this.f255888r, this.f255889s, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f255890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar) {
            super(0);
            this.f255890l = iVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f255890l.accept(InterfaceC49356a.b.f440946a);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rubricator/list/category/model/CategoryListItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rubricator/list/category/model/CategoryListItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<CategoryListItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f255891l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i iVar) {
            super(1);
            this.f255891l = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(CategoryListItem categoryListItem) {
            this.f255891l.accept(new InterfaceC49356a.e(categoryListItem));
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f255892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(i iVar) {
            super(1);
            this.f255892l = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            this.f255892l.accept(new InterfaceC49356a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryListScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f255893l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i iVar) {
            super(1);
            this.f255893l = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f255893l.accept(new InterfaceC49356a.c(str));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k i iVar, @k l<? super InterfaceC49358c, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1837350699);
        C22187u0.d(new a(iVar, lVar, null), bE2, lVar);
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(iVar.getState(), bE2);
        bE2.C(21140459);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new e(iVar);
            bE2.H(objT);
        }
        Y41.a aVar = (Y41.a) objT;
        Object objI = s.i(21143592, bE2, false);
        if (objI == c1651a) {
            objI = new h(iVar);
            bE2.H(objI);
        }
        l lVar2 = (l) objI;
        Object objI2 = s.i(21147601, bE2, false);
        if (objI2 == c1651a) {
            objI2 = new f(iVar);
            bE2.H(objI2);
        }
        l lVar3 = (l) objI2;
        Object objI3 = s.i(21151944, bE2, false);
        if (objI3 == c1651a) {
            objI3 = new g(iVar);
            bE2.H(objI3);
        }
        l lVar4 = (l) objI3;
        bE2.X(false);
        String str = ((CategoryListState) interfaceC22204y1B.getF42167b()).f255935d;
        String str2 = ((CategoryListState) interfaceC22204y1B.getF42167b()).f255937f;
        List<? extends CategoryListItem> list = ((CategoryListState) interfaceC22204y1B.getF42167b()).f255934c;
        if (list == null) {
            list = ((CategoryListState) interfaceC22204y1B.getF42167b()).f255933b;
        }
        b(str, str2, list, ((CategoryListState) interfaceC22204y1B.getF42167b()).getPerfTrackerParams(), aVar, lVar2, lVar3, lVar4, bE2, 14376960);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C7660b(iVar, lVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(String str, String str2, List<? extends CategoryListItem> list, r rVar, Y41.a<G0> aVar, l<? super String, G0> lVar, l<? super CategoryListItem, G0> lVar2, l<? super DeepLink, G0> lVar3, A a12, int i12) {
        B bE2 = a12.E(-1342933657);
        if (((i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(list) ? 256 : 128) | (bE2.B(rVar) ? 2048 : 1024)) & 23967451) == 4793490 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1475284972, new c(str, aVar, str2, lVar, rVar, list, lVar2, lVar3), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(str, str2, list, rVar, aVar, lVar, lVar2, lVar3, i12);
        }
    }
}
