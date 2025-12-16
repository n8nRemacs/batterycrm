package com.avito.android.gig_shift_start.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import com.avito.android.gig_shift_start.ui.GigShiftStartDialogFragment;
import com.avito.android.gig_shift_start.ui.GigShiftStartOpenParams;
import com.avito.android.gig_shift_start.ui.GigShiftStartResult;
import com.avito.android.gig_shift_start.ui.GigShiftStartType;
import com.avito.android.util.R0;
import dh.InterfaceC39726b;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import l41.r;
import rv.C47918a;
import rv.C47919b;
import sv.C48421d;

/* compiled from: GigShiftStartDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_start/deeplink/f;", "Lev/a;", "Lcom/avito/android/gig_shift_start/GigShiftStartDeeplink;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC40161a<GigShiftStartDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160746f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f160747g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f160748h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.f f160749i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f160750j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final HH.a f160751k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39726b f160752l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C43238h f160753m;

    /* compiled from: GigShiftStartDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_start.deeplink.GigShiftStartDeeplinkHandler$onCreate$1", f = "GigShiftStartDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f160754q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f160754q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f160754q).f437159b;
            GigShiftStartResult gigShiftStartResult = (GigShiftStartResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("GIG_SHIFT_START_BOTTOM_SHEET_RESULT_KEY", GigShiftStartResult.class) : bundle.getParcelable("GIG_SHIFT_START_BOTTOM_SHEET_RESULT_KEY"));
            boolean z12 = gigShiftStartResult instanceof GigShiftStartResult.OpenScan;
            f fVar = f.this;
            if (z12) {
                BarcodeScannerParams.f99049e.getClass();
                fVar.f160748h.J(fVar.f160752l.a(new BarcodeScannerParams(com.avito.android.printable_text.a.a(R.string.scanner_description_default), BarcodeScannerType.f99054c, false)), C48421d.a(fVar), com.avito.android.deeplink_handler.view.c.f134589l);
            } else if (gigShiftStartResult instanceof GigShiftStartResult.OpenAction) {
                b.a.a(fVar.f160746f, new GigShiftActionDeeplink(false, null, false, 4, null), null, null, 6);
            } else {
                fVar.j(AbstractC14250d.c.f9171c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigShiftStartDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(f.this);
        }
    }

    /* compiled from: GigShiftStartDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_start.deeplink.GigShiftStartDeeplinkHandler$onCreate$3", f = "GigShiftStartDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f160757q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.f160757q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f160757q
                rv.a r10 = (rv.C47918a) r10
                int r0 = r10.f437156b
                com.avito.android.gig_shift_start.deeplink.f r1 = com.avito.android.gig_shift_start.deeplink.f.this
                if (r0 != 0) goto L16
                Ju.d$c r10 = Ju.AbstractC14250d.c.f9171c
                r1.j(r10)
                goto L60
            L16:
                r0 = 0
                android.content.Intent r10 = r10.f437157c
                if (r10 == 0) goto L22
                java.lang.String r2 = "BARCODE_VALUE_RESULT_KEY"
                java.lang.String r10 = r10.getStringExtra(r2)
                goto L23
            L22:
                r10 = r0
            L23:
                HH.a r2 = r1.f160751k
                r2.getClass()
                if (r10 != 0) goto L2c
            L2a:
                r10 = r0
                goto L49
            L2c:
                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> L2a
                java.lang.String r3 = "deeplink"
                java.lang.String r10 = r10.getQueryParameter(r3)     // Catch: java.lang.Exception -> L2a
                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> L2a
                com.avito.android.deep_linking.x r2 = r2.f7023a     // Catch: java.lang.Exception -> L2a
                java.lang.Object r10 = r2.f(r10)     // Catch: java.lang.Exception -> L2a
                int r2 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L2a
                boolean r2 = r10 instanceof kotlin.Z.b     // Catch: java.lang.Exception -> L2a
                if (r2 == 0) goto L47
                r10 = r0
            L47:
                com.avito.android.deep_linking.links.DeepLink r10 = (com.avito.android.deep_linking.links.DeepLink) r10     // Catch: java.lang.Exception -> L2a
            L49:
                r2 = 6
                com.avito.android.deeplink_handler.handler.composite.a r1 = r1.f160746f
                if (r10 == 0) goto L52
                com.avito.android.deeplink_handler.handler.b.a.a(r1, r10, r0, r0, r2)
                goto L60
            L52:
                com.avito.android.gig_shift_action.GigShiftActionDeeplink r10 = new com.avito.android.gig_shift_action.GigShiftActionDeeplink
                r5 = 0
                r6 = 0
                r4 = 1
                r7 = 4
                r8 = 0
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                com.avito.android.deeplink_handler.handler.b.a.a(r1, r10, r0, r0, r2)
            L60:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_shift_start.deeplink.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.f fVar, @Y61.k a.b bVar, @Y61.k HH.a aVar2, @Y61.k InterfaceC39726b interfaceC39726b, @Y61.k R0 r02) {
        this.f160746f = aVar;
        this.f160747g = dVar;
        this.f160748h = interfaceC4053a;
        this.f160749i = fVar;
        this.f160750j = bVar;
        this.f160751k = aVar2;
        this.f160752l = interfaceC39726b;
        this.f160753m = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GigShiftStartDeeplink gigShiftStartDeeplink = (GigShiftStartDeeplink) deepLink;
        C43259k.d(this.f160753m, null, null, new d(this, null), 3);
        Boolean bool = Boolean.TRUE;
        if (L.f(gigShiftStartDeeplink.f160738d, bool)) {
            b.a.a(this.f160746f, new GigShiftActionDeeplink(false, null, false, 4, null), null, null, 6);
            return;
        }
        GigShiftStartOpenParams gigShiftStartOpenParams = new GigShiftStartOpenParams(gigShiftStartDeeplink.f160736b, gigShiftStartDeeplink.f160737c, L.f(gigShiftStartDeeplink.f160739e, bool) ? GigShiftStartType.f160845c : GigShiftStartType.f160844b);
        GigShiftStartDialogFragment.f160821o0.getClass();
        GigShiftStartDialogFragment gigShiftStartDialogFragment = new GigShiftStartDialogFragment();
        gigShiftStartDialogFragment.f160825j0.setValue(gigShiftStartDialogFragment, GigShiftStartDialogFragment.f160822p0[0], gigShiftStartOpenParams);
        this.f160747g.w1(gigShiftStartDialogFragment, this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43197r1 c43197r1 = new C43197r1(new a(null), y.a(this.f160749i.l1("GIG_SHIFT_START_BOTTOM_SHEET_REQUEST_KEY")));
        C43238h c43238h = this.f160753m;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new c(null), y.a(this.f160750j.Q().N(new b()))), c43238h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f160753m, null);
    }
}
