package com.avito.android.publish.details;

import android.os.Handler;
import android.os.Looper;
import com.avito.android.publish.details.C33752g0;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.text_suggests.TextSuggestionsSlot;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsButtonHelper.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/g0;", "Lcom/avito/android/publish/details/e0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.g0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33752g0 implements InterfaceC33746e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f234623a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33675a f234624b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33761j0 f234625c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Handler f234626d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RunnableC33749f0 f234627e = new Runnable() { // from class: com.avito.android.publish.details.f0
        @Override // java.lang.Runnable
        public final void run() {
            this.f234617b.f234625c.C(C33752g0.a.f234631l);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C33789t f234628f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C33745e f234629g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.details.auction.d f234630h;

    /* compiled from: PublishDetailsButtonHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.g0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f234631l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, false, true, false, null, 27);
        }
    }

    /* compiled from: PublishDetailsButtonHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.g0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t c33789t = C33752g0.this.f234628f;
            if (c33789t != null) {
                c33789t.W();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsButtonHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.g0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f234633l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12) {
            super(1);
            this.f234633l = z12;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, false, this.f234633l, false, null, 27);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.publish.details.f0] */
    @Inject
    public C33752g0(@Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC33675a interfaceC33675a, @Y61.k InterfaceC33761j0 interfaceC33761j0) {
        this.f234623a = aVar;
        this.f234624b = interfaceC33675a;
        this.f234625c = interfaceC33761j0;
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void a(@Y61.k C33789t c33789t, @Y61.k C33745e c33745e) {
        this.f234628f = c33789t;
        this.f234629g = c33745e;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    @Override // com.avito.android.publish.details.InterfaceC33746e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.l com.avito.android.publish.slots.card_select.item.k r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.C33752g0.d(com.avito.android.publish.slots.card_select.item.k):void");
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void e() {
        C33745e c33745e = this.f234629g;
        if (c33745e != null) {
            c33745e.k();
        }
        C33745e c33745e2 = this.f234629g;
        if (c33745e2 != null) {
            c33745e2.q();
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void e0() {
        this.f234628f = null;
        this.f234629g = null;
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void f(@Y61.k com.avito.android.publish.details.auction.d dVar) {
        this.f234630h = dVar;
    }

    public final void g(boolean z12) {
        this.f234626d.removeCallbacks(this.f234627e);
        this.f234625c.C(new c(z12));
    }

    @Override // com.avito.android.publish.details.InterfaceC33682c0
    public final void i(boolean z12) {
        int size;
        CategoryPublishStep.Params.Config config;
        ParametersTree parametersTreeWa = this.f234623a.wa();
        if (parametersTreeWa != null) {
            ArrayList arrayList = new ArrayList();
            for (ParameterSlot parameterSlot : parametersTreeWa) {
                if (!(parameterSlot instanceof TextSuggestionsSlot)) {
                    arrayList.add(parameterSlot);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        CategoryPublishStep categoryPublishStepA = this.f234624b.a();
        CategoryPublishStep.Params params = categoryPublishStepA instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepA : null;
        if ((params == null || (config = params.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config.getIsContinueButtonVisibleAboveKeyboard(), Boolean.TRUE)) {
            g(true);
            return;
        }
        if (size <= 1) {
            g(true);
            return;
        }
        if (z12) {
            g(false);
            C33789t c33789t = this.f234628f;
            if (c33789t != null) {
                c33789t.t(new b());
                return;
            }
            return;
        }
        Handler handler = this.f234626d;
        RunnableC33749f0 runnableC33749f0 = this.f234627e;
        handler.removeCallbacks(runnableC33749f0);
        handler.postDelayed(runnableC33749f0, 200L);
        C33789t c33789t2 = this.f234628f;
        if (c33789t2 != null) {
            c33789t2.u();
        }
    }
}
