package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
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
import tp0.InterfaceC48700a;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.ui.compose.BbipPrivateV2ScreenKt$BbipPrivateV2Screen$1", f = "BbipPrivateV2Screen.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34532n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f261325A;

    /* renamed from: q, reason: collision with root package name */
    public int f261326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f261327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC48701b> f261328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f261329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261331v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261332w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261333x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261334y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f261335z;

    /* compiled from: BbipPrivateV2Screen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltp0/b;", "event", "Lkotlin/G0;", "emit", "(Ltp0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.n$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f261336b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f261337c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f261338d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f261339e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f261340f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f261341g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f261342h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f261343i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f261344j;

        public a(androidx.appcompat.app.m mVar, T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.u uVar2, com.akita.compose.component.toast_bar.J j12, String str) {
            this.f261336b = mVar;
            this.f261337c = t12;
            this.f261338d = interfaceC22204y1;
            this.f261339e = interfaceC22204y12;
            this.f261340f = interfaceC22204y13;
            this.f261341g = uVar;
            this.f261342h = uVar2;
            this.f261343i = j12;
            this.f261344j = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC48701b interfaceC48701b = (InterfaceC48701b) obj;
            if (interfaceC48701b instanceof InterfaceC48701b.a) {
                androidx.appcompat.app.m mVar = this.f261336b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (interfaceC48701b instanceof InterfaceC48701b.c) {
                ((Y41.l) this.f261338d.getF42167b()).invoke(((InterfaceC48701b.c) interfaceC48701b).f439459a);
            } else if (interfaceC48701b instanceof InterfaceC48701b.e) {
                ((Y41.l) this.f261339e.getF42167b()).invoke(((InterfaceC48701b.e) interfaceC48701b).f439463a);
            } else {
                boolean z12 = interfaceC48701b instanceof InterfaceC48701b.C12682b;
                InterfaceC22204y1 interfaceC22204y1 = this.f261340f;
                if (z12) {
                    ((Y41.l) interfaceC22204y1.getF42167b()).invoke(InterfaceC48700a.m.f439455a);
                } else if (interfaceC48701b instanceof InterfaceC48701b.d) {
                    C43259k.d(this.f261337c, null, null, new C34531m(interfaceC48701b, this.f261341g, this.f261342h, this.f261343i, this.f261344j, interfaceC22204y1, null), 3);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34532n(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.u uVar2, com.akita.compose.component.toast_bar.J j12, String str, Continuation continuation) {
        super(2, continuation);
        this.f261328s = interfaceC43160i;
        this.f261329t = mVar;
        this.f261330u = interfaceC22204y1;
        this.f261331v = interfaceC22204y12;
        this.f261332w = interfaceC22204y13;
        this.f261333x = uVar;
        this.f261334y = uVar2;
        this.f261335z = j12;
        this.f261325A = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34532n c34532n = new C34532n(this.f261328s, this.f261329t, this.f261330u, this.f261331v, this.f261332w, this.f261333x, this.f261334y, this.f261335z, this.f261325A, continuation);
        c34532n.f261327r = obj;
        return c34532n;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34532n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f261326q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f261329t, (T) this.f261327r, this.f261330u, this.f261331v, this.f261332w, this.f261333x, this.f261334y, this.f261335z, this.f261325A);
            this.f261326q = 1;
            if (this.f261328s.collect(aVar, this) == coroutine_suspended) {
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
