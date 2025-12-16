package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Recomposer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/compose/runtime/V0;", "parentFrameClock", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;Landroidx/compose/runtime/V0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {580, 591}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* renamed from: androidx.compose.runtime.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22145q2 extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, V0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Recomposer f38523A;

    /* renamed from: q, reason: collision with root package name */
    public List f38524q;

    /* renamed from: r, reason: collision with root package name */
    public List f38525r;

    /* renamed from: s, reason: collision with root package name */
    public List f38526s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.collection.S0 f38527t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.collection.S0 f38528u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.collection.S0 f38529v;

    /* renamed from: w, reason: collision with root package name */
    public Set f38530w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.collection.S0 f38531x;

    /* renamed from: y, reason: collision with root package name */
    public int f38532y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ V0 f38533z;

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.q2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Recomposer f38534l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.S0<Object> f38535m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.S0<InterfaceC22053d0> f38536n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC22053d0> f38537o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List<C22183t1> f38538p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.S0<InterfaceC22053d0> f38539q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC22053d0> f38540r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.S0<InterfaceC22053d0> f38541s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Set<Object> f38542t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Recomposer recomposer, androidx.collection.S0<Object> s02, androidx.collection.S0<InterfaceC22053d0> s03, List<InterfaceC22053d0> list, List<C22183t1> list2, androidx.collection.S0<InterfaceC22053d0> s04, List<InterfaceC22053d0> list3, androidx.collection.S0<InterfaceC22053d0> s05, Set<? extends Object> set) {
            super(1);
            this.f38534l = recomposer;
            this.f38535m = s02;
            this.f38536n = s03;
            this.f38537o = list;
            this.f38538p = list2;
            this.f38539q = s04;
            this.f38540r = list3;
            this.f38541s = s05;
            this.f38542t = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:235:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:255:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(java.lang.Long r27) {
            /*
                Method dump skipped, instructions count: 890
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22145q2.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22145q2(Recomposer recomposer, Continuation<? super C22145q2> continuation) {
        super(3, continuation);
        this.f38523A = recomposer;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.runtime.Recomposer r23, java.util.List r24, java.util.List r25, java.util.List r26, androidx.collection.S0 r27, androidx.collection.S0 r28, androidx.collection.S0 r29, androidx.collection.S0 r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22145q2.a(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.S0, androidx.collection.S0, androidx.collection.S0, androidx.collection.S0):void");
    }

    public static final void b(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f38109b) {
            try {
                ArrayList arrayList = recomposer.f38117j;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    list.add((C22183t1) arrayList.get(i12));
                }
                recomposer.f38117j.clear();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, V0 v02, Continuation<? super kotlin.G0> continuation) {
        C22145q2 c22145q2 = new C22145q2(this.f38523A, continuation);
        c22145q2.f38533z = v02;
        return c22145q2.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x018a -> B:54:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0245 -> B:11:0x00aa). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22145q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
