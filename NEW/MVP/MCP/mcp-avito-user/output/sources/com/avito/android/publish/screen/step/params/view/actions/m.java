package com.avito.android.publish.screen.step.params.view.actions;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.publish.details.C33745e;
import com.avito.android.publish.details.C33789t;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.publish.details.InterfaceC33761j0;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.text_suggests.TextSuggestionsSlot;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsViewActionsConfigurator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/m;", "Lcom/avito/android/publish/screen/step/params/view/actions/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f241567a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33675a f241568b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33761j0 f241569c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f241570d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Handler f241571e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final d f241572f = new d(this, 2);

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.d f241573g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.actions.b f241574h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.details.auction.d f241575i;

    /* compiled from: PublishDetailsViewActionsConfigurator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f241576l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, false, true, false, null, 27);
        }
    }

    /* compiled from: PublishDetailsViewActionsConfigurator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.publish.screen.step.params.view.d dVar = m.this.f241573g;
            if (dVar != null) {
                dVar.W();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC33675a interfaceC33675a, @Y61.k InterfaceC33761j0 interfaceC33761j0, @Y61.k Q1 q12) {
        this.f241567a = aVar;
        this.f241568b = interfaceC33675a;
        this.f241569c = interfaceC33761j0;
        this.f241570d = q12;
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void a(@Y61.k C33789t c33789t, @Y61.k C33745e c33745e) {
        throw new G(null, 1, null);
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.l
    public final void b(@Y61.k com.avito.android.publish.screen.step.params.view.d dVar, @Y61.k com.avito.android.publish.screen.step.params.view.actions.b bVar) {
        this.f241573g = dVar;
        this.f241574h = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // com.avito.android.publish.details.InterfaceC33746e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.l com.avito.android.publish.slots.card_select.item.k r13) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.params.view.actions.m.d(com.avito.android.publish.slots.card_select.item.k):void");
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void e() {
        if (this.f241570d.B().invoke().booleanValue()) {
            com.avito.android.publish.screen.step.params.view.actions.b bVar = this.f241574h;
            if (bVar != null) {
                if (bVar.f241542b.isVisible()) {
                    bVar.Fc();
                    return;
                } else {
                    bVar.Dc();
                    return;
                }
            }
            return;
        }
        com.avito.android.publish.screen.step.params.view.actions.b bVar2 = this.f241574h;
        if (bVar2 != null) {
            bVar2.k();
        }
        com.avito.android.publish.screen.step.params.view.actions.b bVar3 = this.f241574h;
        if (bVar3 != null) {
            bVar3.q();
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void e0() {
        this.f241573g = null;
        this.f241574h = null;
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0
    public final void f(@Y61.k com.avito.android.publish.details.auction.d dVar) {
        this.f241575i = dVar;
    }

    public final void g(boolean z12) {
        this.f241571e.removeCallbacks(this.f241572f);
        this.f241569c.C(new n(z12));
    }

    @Override // com.avito.android.publish.details.InterfaceC33682c0
    public final void i(boolean z12) {
        int size;
        CategoryPublishStep.Params.Config config;
        CategoryPublishStep categoryPublishStepA = this.f241568b.a();
        CategoryPublishStep.Params params = categoryPublishStepA instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepA : null;
        if ((params == null || (config = params.getConfig()) == null) ? false : L.f(config.getIsContinueButtonVisibleAboveKeyboard(), Boolean.TRUE)) {
            g(true);
            return;
        }
        ParametersTree parametersTreeWa = this.f241567a.wa();
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
        if (!(size > 1)) {
            g(true);
            return;
        }
        if (z12) {
            g(false);
            com.avito.android.publish.screen.step.params.view.d dVar = this.f241573g;
            if (dVar != null) {
                dVar.a(new b());
                return;
            }
            return;
        }
        Handler handler = this.f241571e;
        d dVar2 = this.f241572f;
        handler.removeCallbacks(dVar2);
        handler.postDelayed(dVar2, 200L);
        com.avito.android.publish.screen.step.params.view.d dVar3 = this.f241573g;
        if (dVar3 != null) {
            dVar3.b();
        }
    }
}
