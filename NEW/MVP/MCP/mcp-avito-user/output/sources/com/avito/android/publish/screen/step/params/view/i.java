package com.avito.android.publish.screen.step.params.view;

import Ie0.InterfaceC14065a;
import Ie0.f;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.details.C33757i;
import com.avito.android.publish.details.C33766l;
import com.avito.android.publish.details.C33775o;
import com.avito.android.publish.details.C33781q;
import com.avito.android.publish.details.InterfaceC33748f;
import com.avito.android.publish.details.InterfaceC33763k;
import com.avito.android.publish.details.InterfaceC33769m;
import com.avito.android.publish.details.InterfaceC33778p;
import com.avito.android.publish.details.r;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsViewActions.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/i;", "Lcom/avito/android/publish/screen/step/params/view/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f241588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q1 f241589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.params.view.actions.l f241590c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14065a, G0> f241591d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33748f f241592e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33769m f241593f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33778p f241594g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.params.view.actions.b f241595h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33763k f241596i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public f.a f241597j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.publish.screen.objects.view.i f241598k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f241599l;

    /* compiled from: PublishDetailsViewActions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SlotType f241601m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SlotType slotType) {
            super(0);
            this.f241601m = slotType;
        }

        @Override // Y41.a
        public final G0 invoke() {
            i.this.f241591d.invoke(new InterfaceC14065a.b.c(this.f241601m));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewActions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i.this.f241591d.invoke(InterfaceC14065a.d.g.f8307a);
            return G0.f406611a;
        }
    }

    public i(@Y61.k j jVar, @Y61.k View view, @Y61.k View view2, @Y61.k Q1 q12, @Y61.k com.avito.android.publish.screen.step.params.view.actions.l lVar, @Y61.k Y41.l lVar2) {
        this.f241588a = view2;
        this.f241589b = q12;
        this.f241590c = lVar;
        this.f241591d = lVar2;
        view2.getContext();
        Je0.c cVar = new Je0.c(lVar2);
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f241599l = cVar2;
        if (q12.B().invoke().booleanValue()) {
            com.avito.android.publish.screen.step.params.view.actions.k kVar = new com.avito.android.publish.screen.step.params.view.actions.k(view, view2);
            this.f241592e = new com.avito.android.publish.screen.step.params.view.actions.f(view2, kVar, new f(0, cVar, Je0.c.class, "onMainButtonClicked", "onMainButtonClicked()V", 0));
            this.f241593f = new com.avito.android.publish.screen.step.params.view.actions.h(view2, kVar, cVar);
            this.f241596i = new com.avito.android.publish.screen.step.params.view.actions.c(view2, kVar);
            com.avito.android.publish.screen.objects.view.i iVar = new com.avito.android.publish.screen.objects.view.i(kVar, 1);
            view2.addOnLayoutChangeListener(iVar);
            this.f241598k = iVar;
        } else {
            r rVar = new r(view);
            this.f241592e = new C33757i(view2, rVar, cVar);
            this.f241593f = new C33775o(view2, rVar, cVar);
            this.f241596i = new C33766l(view2, rVar);
        }
        com.avito.android.publish.screen.step.params.view.actions.b bVar = new com.avito.android.publish.screen.step.params.view.actions.b(view2, this.f241596i, this.f241592e, this.f241593f);
        this.f241595h = bVar;
        lVar.b(jVar, bVar);
        InterfaceC33763k interfaceC33763k = this.f241596i;
        cVar2.b(interfaceC33763k.u().t0(new g(this)));
        cVar2.b(interfaceC33763k.a().t0(new h(this)));
        this.f241594g = q12.B().invoke().booleanValue() ? new com.avito.android.publish.screen.step.params.view.overlay.a(view, view2) : new C33781q(view, bVar, this.f241596i);
    }

    public final void a(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.l SlotType slotType) {
        this.f241594g.l(printableText, printableText2, slotType != null ? new a(slotType) : printableText2 != null ? new b() : null);
    }
}
