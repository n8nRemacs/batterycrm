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

/* compiled from: ObjectBottomButtonHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/b;", "Lcom/avito/android/publish/screen/objects/view/actions/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.screen.objects.view.actions.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f240256f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f240257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Handler f240258b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.group.item.double_input.e f240259c = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 29);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.objects.view.g f240260d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public InterfaceC33684d f240261e;

    /* compiled from: ObjectBottomButtonHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/b$a;", "", "<init>", "()V", "", "BUTTON_SHOWING_DELAY", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ObjectBottomButtonHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.actions.b$b, reason: collision with other inner class name */
    public static final class C7213b extends N implements Y41.a<G0> {
        public C7213b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.publish.screen.objects.view.g gVar = b.this.f240260d;
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
    public b(@Y61.k com.avito.android.details.a aVar) {
        this.f240257a = aVar;
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.a
    public final void c(@Y61.k com.avito.android.publish.screen.objects.view.g gVar, @Y61.k InterfaceC33684d interfaceC33684d) {
        this.f240260d = gVar;
        this.f240261e = interfaceC33684d;
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.a
    public final void e0() {
        this.f240258b.removeCallbacks(this.f240259c);
        this.f240260d = null;
        this.f240261e = null;
    }

    @Override // com.avito.android.publish.details.InterfaceC33682c0
    public final void i(boolean z12) {
        ParametersTree parametersTreeWa = this.f240257a.wa();
        int count = parametersTreeWa != null ? parametersTreeWa.getCount() : 0;
        Handler handler = this.f240258b;
        com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = this.f240259c;
        if (count <= 1) {
            handler.removeCallbacks(eVar);
            InterfaceC33684d interfaceC33684d = this.f240261e;
            if (interfaceC33684d != null) {
                interfaceC33684d.b();
                return;
            }
            return;
        }
        if (!z12) {
            handler.removeCallbacks(eVar);
            handler.postDelayed(eVar, 200L);
            com.avito.android.publish.screen.objects.view.g gVar = this.f240260d;
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        handler.removeCallbacks(eVar);
        InterfaceC33684d interfaceC33684d2 = this.f240261e;
        if (interfaceC33684d2 != null) {
            interfaceC33684d2.k();
        }
        com.avito.android.publish.screen.objects.view.g gVar2 = this.f240260d;
        if (gVar2 != null) {
            gVar2.a(new C7213b());
        }
    }
}
