package com.avito.android.publish.screen.objects.view.actions;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.InterfaceC33684d;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ObjectFillFormViewActionsConfigurator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/i;", "Lcom/avito/android/publish/screen/objects/view/actions/g;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f240269f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f240270a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Handler f240271b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f240272c = new h(this, 0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.objects.view.g f240273d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.actions.a f240274e;

    /* compiled from: ObjectFillFormViewActionsConfigurator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/i$a;", "", "<init>", "()V", "", "BUTTON_SHOWING_DELAY", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ObjectFillFormViewActionsConfigurator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.publish.screen.objects.view.g gVar = i.this.f240273d;
            if (gVar != null) {
                gVar.W();
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k com.avito.android.details.a aVar) {
        this.f240270a = aVar;
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.a
    public final void c(@Y61.k com.avito.android.publish.screen.objects.view.g gVar, @Y61.k InterfaceC33684d interfaceC33684d) {
        if (!(interfaceC33684d instanceof com.avito.android.publish.screen.step.params.view.actions.a)) {
            throw new IllegalArgumentException();
        }
        this.f240273d = gVar;
        this.f240274e = (com.avito.android.publish.screen.step.params.view.actions.a) interfaceC33684d;
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.a
    public final void e0() {
        this.f240271b.removeCallbacks(this.f240272c);
        this.f240273d = null;
        this.f240274e = null;
    }

    @Override // com.avito.android.publish.details.InterfaceC33682c0
    public final void i(boolean z12) {
        ParametersTree parametersTreeWa = this.f240270a.wa();
        int count = parametersTreeWa != null ? parametersTreeWa.getCount() : 0;
        Handler handler = this.f240271b;
        h hVar = this.f240272c;
        if (count <= 1) {
            handler.removeCallbacks(hVar);
            com.avito.android.publish.screen.step.params.view.actions.a aVar = this.f240274e;
            if (aVar != null) {
                aVar.b();
                aVar.Fc();
                return;
            }
            return;
        }
        if (!z12) {
            handler.removeCallbacks(hVar);
            handler.postDelayed(hVar, 200L);
            com.avito.android.publish.screen.objects.view.g gVar = this.f240273d;
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        handler.removeCallbacks(hVar);
        com.avito.android.publish.screen.step.params.view.actions.a aVar2 = this.f240274e;
        if (aVar2 != null) {
            aVar2.k();
            if (aVar2.Ec()) {
                aVar2.Fc();
            } else {
                aVar2.Dc();
            }
        }
        com.avito.android.publish.screen.objects.view.g gVar2 = this.f240273d;
        if (gVar2 != null) {
            gVar2.a(new b());
        }
    }
}
