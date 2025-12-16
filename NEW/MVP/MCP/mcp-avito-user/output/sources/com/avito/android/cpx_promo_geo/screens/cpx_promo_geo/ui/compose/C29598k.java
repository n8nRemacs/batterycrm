package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import android.view.View;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ts.InterfaceC48708b;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.CpxPromoGeoScreenKt$CpxPromoGeoScreen$1", f = "CpxPromoGeoScreen.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29598k extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f128212q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC48708b> f128213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f128214s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f128215t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.d f128216u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f128217v;

    /* compiled from: CpxPromoGeoScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lts/b;", "event", "Lkotlin/G0;", "emit", "(Lts/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.k$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f128218b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f128219c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.d f128220d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f128221e;

        public a(androidx.appcompat.app.m mVar, View view, androidx.appcompat.view.d dVar, InterfaceC22204y1 interfaceC22204y1) {
            this.f128218b = mVar;
            this.f128219c = view;
            this.f128220d = dVar;
            this.f128221e = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            com.avito.android.component.toast.f fVarB;
            InterfaceC48708b interfaceC48708b = (InterfaceC48708b) obj;
            if (interfaceC48708b instanceof InterfaceC48708b.a) {
                androidx.appcompat.app.m mVar = this.f128218b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (interfaceC48708b instanceof InterfaceC48708b.C12685b) {
                ((Y41.l) this.f128221e.getF42167b()).invoke(((InterfaceC48708b.C12685b) interfaceC48708b).f439488a);
            } else if (interfaceC48708b instanceof InterfaceC48708b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                InterfaceC48708b.c cVar2 = (InterfaceC48708b.c) interfaceC48708b;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(cVar2.f439489a);
                boolean z12 = cVar2.f439490b;
                if (z12) {
                    f.c.f125255c.getClass();
                    fVarB = f.c.a.b();
                } else {
                    fVarB = f.a.f125253a;
                }
                com.avito.android.component.toast.c.b(cVar, this.f128219c, printableTextF, null, null, null, fVarB, 0, z12 ? ToastBarPosition.f181046d : ToastBarPosition.f181047e, null, false, false, null, this.f128220d, 1966);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29598k(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, View view, androidx.appcompat.view.d dVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f128213r = interfaceC43160i;
        this.f128214s = mVar;
        this.f128215t = view;
        this.f128216u = dVar;
        this.f128217v = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        androidx.appcompat.view.d dVar = this.f128216u;
        InterfaceC22204y1 interfaceC22204y1 = this.f128217v;
        return new C29598k(this.f128213r, this.f128214s, this.f128215t, dVar, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C29598k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f128212q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f128214s, this.f128215t, this.f128216u, this.f128217v);
            this.f128212q = 1;
            if (this.f128213r.collect(aVar, this) == coroutine_suspended) {
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
