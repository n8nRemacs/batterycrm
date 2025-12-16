package com.avito.android.bbl.screens.limit_increase.ui.compose;

import Eh.InterfaceC13486b;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.J;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LimitIncreaseScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bbl.screens.limit_increase.ui.compose.LimitIncreaseScreenKt$LimitIncreaseScreen$1", f = "LimitIncreaseScreen.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f99841q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f99842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13486b> f99843s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f99844t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99845u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99846v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f99847w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f99848x;

    /* compiled from: LimitIncreaseScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEh/b;", "event", "Lkotlin/G0;", "emit", "(LEh/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f99849b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f99850c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f99851d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f99852e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f99853f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ J f99854g;

        public a(androidx.appcompat.app.m mVar, T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar, J j12) {
            this.f99849b = mVar;
            this.f99850c = t12;
            this.f99851d = interfaceC22204y1;
            this.f99852e = interfaceC22204y12;
            this.f99853f = uVar;
            this.f99854g = j12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC13486b interfaceC13486b = (InterfaceC13486b) obj;
            if (interfaceC13486b instanceof InterfaceC13486b.c) {
                ((Y41.l) this.f99851d.getF42167b()).invoke(((InterfaceC13486b.c) interfaceC13486b).f4172a);
            } else if (interfaceC13486b instanceof InterfaceC13486b.a) {
                androidx.appcompat.app.m mVar = this.f99849b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (interfaceC13486b instanceof InterfaceC13486b.C0247b) {
                ((Y41.a) this.f99852e.getF42167b()).invoke();
            } else if (interfaceC13486b instanceof InterfaceC13486b.d) {
                C43259k.d(this.f99850c, null, null, new e(this.f99853f, this.f99854g, interfaceC13486b, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(2, continuation);
        this.f99843s = interfaceC43160i;
        this.f99844t = mVar;
        this.f99845u = interfaceC22204y1;
        this.f99846v = interfaceC22204y12;
        this.f99847w = uVar;
        this.f99848x = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f99844t, this.f99845u, this.f99846v, this.f99847w, this.f99848x, continuation, this.f99843s);
        fVar.f99842r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f99841q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f99844t, (T) this.f99842r, this.f99845u, this.f99846v, this.f99847w, this.f99848x);
            this.f99841q = 1;
            if (this.f99843s.collect(aVar, this) == coroutine_suspended) {
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
