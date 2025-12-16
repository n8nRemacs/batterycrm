package com.avito.android.categories_global;

import Hn.InterfaceC14010a;
import Kn.InterfaceC14331a;
import Ln.C14417b;
import androidx.compose.runtime.internal.P;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoriesInteractorImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories_global/b;", "LKn/a;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: com.avito.android.categories_global.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29365b implements InterfaceC14331a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14010a> f116311a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C14417b f116312b;

    /* compiled from: CategoriesInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.categories_global.CategoriesInteractorImpl$loadCategories$1", f = "CategoriesInteractorImpl.kt", i = {0, 2}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 34, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.categories_global.b$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CategoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116313q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f116314r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f116315s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29365b f116316t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f116317u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C29365b c29365b, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f116315s = str;
            this.f116316t = c29365b;
            this.f116317u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f116315s, this.f116316t, this.f116317u, continuation);
            aVar.f116314r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CategoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f116313q
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r5) goto L15
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
            L15:
                kotlin.C42729a0.b(r10)
                goto Lbd
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.f116314r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L8a
            L2a:
                java.lang.Object r1 = r9.f116314r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L4a
            L32:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f116314r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.categories_global.mvi.entity.CategoriesInternalAction$LoadContentStarted r1 = new com.avito.android.categories_global.mvi.entity.CategoriesInternalAction$LoadContentStarted
                r1.<init>()
                r9.f116314r = r10
                r9.f116313q = r4
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r10
            L4a:
                com.avito.android.categories_global.b r10 = r9.f116316t
                java.lang.String r4 = r9.f116315s
                if (r4 == 0) goto La4
                Ln.b r7 = r10.f116312b
                if (r7 != 0) goto L55
                goto La4
            L55:
                Ln.c r10 = r7.f10109d
                java.lang.Object r10 = r10.f10113a
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L5f:
                boolean r7 = r10.hasNext()
                if (r7 == 0) goto L75
                java.lang.Object r7 = r10.next()
                r8 = r7
                Ln.b r8 = (Ln.C14417b) r8
                java.lang.String r8 = r8.f10107b
                boolean r8 = kotlin.jvm.internal.L.f(r8, r4)
                if (r8 == 0) goto L5f
                goto L76
            L75:
                r7 = r6
            L76:
                Ln.b r7 = (Ln.C14417b) r7
                if (r7 == 0) goto L8d
                com.avito.android.categories_global.mvi.entity.CategoriesInternalAction$ContentLoaded r10 = new com.avito.android.categories_global.mvi.entity.CategoriesInternalAction$ContentLoaded
                r10.<init>(r7)
                r9.f116314r = r1
                r9.f116313q = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L8a
                return r0
            L8a:
                kotlin.G0 r10 = kotlin.G0.f406611a
                goto L8e
            L8d:
                r10 = r6
            L8e:
                if (r10 != 0) goto Lbd
                com.avito.android.categories_global.c r10 = new com.avito.android.categories_global.c
                r10.<init>(r5, r6)
                kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r10)
                r9.f116314r = r6
                r9.f116313q = r2
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lbd
                return r0
            La4:
                r10.getClass()
                com.avito.android.categories_global.a r2 = new com.avito.android.categories_global.a
                java.lang.String r3 = r9.f116317u
                r2.<init>(r10, r3, r6)
                kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r2)
                r9.f116314r = r6
                r9.f116313q = r5
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lbd
                return r0
            Lbd:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.categories_global.C29365b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public C29365b(@Y61.k h31.e<InterfaceC14010a> eVar) {
        this.f116311a = eVar;
    }

    @Override // Kn.InterfaceC14331a
    @Y61.k
    public final InterfaceC43160i<CategoriesInternalAction> a(@Y61.l String str, @Y61.l String str2) {
        return C43175k.G(new a(str, this, str2, null));
    }

    @Override // Kn.InterfaceC14331a
    public final void b(@Y61.k C14417b c14417b) {
        this.f116312b = c14417b;
    }
}
