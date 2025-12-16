package com.avito.android.cart_sheet_after_adding.ui;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.runtime.C22126m3;
import com.avito.android.printable_text.PrintableText;
import com.yandex.metrica.YandexMetricaDefaultValues;
import gn.InterfaceC40710b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingScreenKt$CartSheetAfterAddingContent$1", f = "CartSheetAfterAddingScreen.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29350p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115639q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f115640r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gn.e f115641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ gn.h f115642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f115643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115644v;

    /* compiled from: CartSheetAfterAddingScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_sheet_after_adding.ui.p$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0 f115645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I0 i02) {
            super(0);
            this.f115645l = i02;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f115645l.h() <= 2);
        }
    }

    /* compiled from: CartSheetAfterAddingScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isRecommendationTitleVisible", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cart_sheet_after_adding.ui.p$b */
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gn.e f115646b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gn.h f115647c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f115648d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f115649e;

        public b(gn.e eVar, gn.h hVar, Context context, Y41.l<Object, G0> lVar) {
            this.f115646b = eVar;
            this.f115647c = hVar;
            this.f115648d = context;
            this.f115649e = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            PrintableText printableText;
            if (((Boolean) obj).booleanValue()) {
                printableText = this.f115646b.f396819b;
            } else {
                gn.h hVar = this.f115647c;
                printableText = hVar != null ? hVar.f396835a : null;
            }
            String strK0 = printableText != null ? printableText.k0(this.f115648d) : null;
            if (strK0 == null) {
                strK0 = "";
            }
            this.f115649e.invoke(new InterfaceC40710b.f(strK0));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29350p(I0 i02, gn.e eVar, gn.h hVar, Context context, Y41.l<Object, G0> lVar, Continuation<? super C29350p> continuation) {
        super(2, continuation);
        this.f115640r = i02;
        this.f115641s = eVar;
        this.f115642t = hVar;
        this.f115643u = context;
        this.f115644v = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29350p(this.f115640r, this.f115641s, this.f115642t, this.f115643u, this.f115644v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29350p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115639q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f115640r));
            b bVar = new b(this.f115641s, this.f115642t, this.f115643u, this.f115644v);
            this.f115639q = 1;
            if (interfaceC43160iN.collect(bVar, this) == coroutine_suspended) {
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
