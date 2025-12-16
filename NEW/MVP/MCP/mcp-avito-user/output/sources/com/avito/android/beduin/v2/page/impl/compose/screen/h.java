package com.avito.android.beduin.v2.page.impl.compose.screen;

import Hi.c;
import androidx.compose.ui.focus.r;
import androidx.compose.ui.platform.InterfaceC22489j2;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.theme.re23.style.b4;
import com.avito.android.beduin.v2.page.impl.compose.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.beduin.v2.render.compose.G;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$BeduinV2PageScreen$1$2", f = "BeduinV2PageScreen.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f105038q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.v2.page.impl.compose.d f105039r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f105040s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f105041t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f105042u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f105043v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b4 f105044w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105045x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f105046y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f105047z;

    /* compiled from: BeduinV2PageScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/l;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/beduin/v2/page/impl/compose/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f105048b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f105049c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u f105050d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u f105051e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b4 f105052f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105053g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22489j2 f105054h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ r f105055i;

        public a(G g12, boolean z12, u uVar, u uVar2, b4 b4Var, Y41.a<G0> aVar, InterfaceC22489j2 interfaceC22489j2, r rVar) {
            this.f105048b = g12;
            this.f105049c = z12;
            this.f105050d = uVar;
            this.f105051e = uVar2;
            this.f105052f = b4Var;
            this.f105053g = aVar;
            this.f105054h = interfaceC22489j2;
            this.f105055i = rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objC;
            com.avito.android.beduin.v2.page.impl.compose.l lVar = (com.avito.android.beduin.v2.page.impl.compose.l) obj;
            if (!(lVar instanceof l.a)) {
                if (lVar instanceof l.b) {
                    Hi.c cVar = ((l.b) lVar).f104989a;
                    if (cVar instanceof c.a) {
                        InterfaceC22489j2 interfaceC22489j2 = this.f105054h;
                        if (interfaceC22489j2 != null) {
                            interfaceC22489j2.hide();
                        }
                        if (((c.a) cVar).f7615a.f7633a) {
                            this.f105055i.u(false);
                        }
                    }
                }
                return G0.f406611a;
            }
            l.a aVar = (l.a) lVar;
            u uVar = this.f105049c ? this.f105050d : this.f105051e;
            BeduinOneTimeEvent beduinOneTimeEvent = aVar.f104988a;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                objC = U.c(new o(this.f105048b, beduinOneTimeEvent, null), continuation);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = G0.f406611a;
                }
            } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                objC = G0.f406611a;
            } else {
                if (L.f(beduinOneTimeEvent, BeduinOneTimeEvent.c.f176282a)) {
                    this.f105053g.invoke();
                } else {
                    boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.d;
                    b4 b4Var = this.f105052f;
                    if (z12) {
                        objC = U.c(new p(beduinOneTimeEvent, b4Var, uVar, null), continuation);
                        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objC = G0.f406611a;
                        }
                    } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                        objC = U.c(new q((BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent, b4Var, uVar, null), continuation);
                        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objC = G0.f406611a;
                        }
                        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objC = G0.f406611a;
                        }
                    }
                }
                objC = G0.f406611a;
            }
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.avito.android.beduin.v2.page.impl.compose.d dVar, G g12, boolean z12, u uVar, u uVar2, b4 b4Var, Y41.a<G0> aVar, InterfaceC22489j2 interfaceC22489j2, r rVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f105039r = dVar;
        this.f105040s = g12;
        this.f105041t = z12;
        this.f105042u = uVar;
        this.f105043v = uVar2;
        this.f105044w = b4Var;
        this.f105045x = aVar;
        this.f105046y = interfaceC22489j2;
        this.f105047z = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f105039r, this.f105040s, this.f105041t, this.f105042u, this.f105043v, this.f105044w, this.f105045x, this.f105046y, this.f105047z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f105038q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<com.avito.android.beduin.v2.page.impl.compose.l> events = this.f105039r.getEvents();
            a aVar = new a(this.f105040s, this.f105041t, this.f105042u, this.f105043v, this.f105044w, this.f105045x, this.f105046y, this.f105047z);
            this.f105038q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
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
