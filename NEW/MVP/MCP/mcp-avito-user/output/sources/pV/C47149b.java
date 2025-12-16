package pv;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import androidx.appcompat.app.m;
import androidx.fragment.app.C;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.deeplink_handler.view.impl.f;
import com.avito.android.deeplink_handler.view.impl.h;
import com.avito.android.deeplink_handler.view.lifecycle.f;
import com.avito.android.deeplink_handler.view.lifecycle.g;
import com.avito.android.deeplink_handler.view.lifecycle.i;
import com.avito.android.deeplink_handler.view.lifecycle.j;
import com.avito.android.deeplink_handler.view.lifecycle.o;
import com.avito.android.deeplink_handler.view.lifecycle.p;
import com.avito.android.deeplink_handler.view.lifecycle.r;
import com.avito.android.deeplink_handler.view.lifecycle.v;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import j.f0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import rv.C47918a;

/* compiled from: DeeplinkViewBridgeImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lpv/b;", "Lpv/a;", "Lcom/avito/android/deeplink_handler/view/a$i;", "Lcom/avito/android/deeplink_handler/view/a$g;", "Lcom/avito/android/deeplink_handler/view/a$c;", "Lcom/avito/android/deeplink_handler/view/a$d;", "Lcom/avito/android/deeplink_handler/view/a$a;", "Lcom/avito/android/deeplink_handler/view/a$b;", "Lcom/avito/android/deeplink_handler/view/a$e;", "Lcom/avito/android/deeplink_handler/view/a$f;", "Lcom/avito/android/deeplink_handler/view/a$h;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47149b implements InterfaceC47148a, a.i, a.g, a.c, a.d, a.InterfaceC4053a, a.b, a.e, a.f, a.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final v f428825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f428826c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f428827d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final r f428828e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.lifecycle.a f428829f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.lifecycle.d f428830g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final i f428831h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.impl.f f428832i;

    @Inject
    public C47149b(@k v vVar, @k o oVar, @k f fVar, @k r rVar, @k com.avito.android.deeplink_handler.view.lifecycle.a aVar, @k com.avito.android.deeplink_handler.view.lifecycle.d dVar, @k i iVar, @k com.avito.android.deeplink_handler.view.impl.f fVar2) {
        this.f428825b = vVar;
        this.f428826c = oVar;
        this.f428827d = fVar;
        this.f428828e = rVar;
        this.f428829f = aVar;
        this.f428830g = dVar;
        this.f428831h = iVar;
        this.f428832i = fVar2;
    }

    @Override // com.avito.android.deeplink_handler.view.a.e
    public final void A1(@k String str, @k C c12) {
        this.f428831h.A1(str, c12);
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void D0(@k String str, @k Y41.a aVar) {
        this.f428828e.D0(str, aVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar) {
        this.f428829f.J(intent, i12, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.b
    @k
    public final C41981q0 Q() {
        return this.f428830g.Q();
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void R(@k Intent intent, @k l<? super Exception, G0> lVar) {
        this.f428829f.R(intent, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        this.f428825b.V0(printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, z12, z13, bVar, str);
    }

    @Override // com.avito.android.deeplink_handler.view.a.h
    @k
    public final C41981q0 W1() {
        return this.f428832i.W1();
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void X(int i12, @k Intent intent) {
        this.f428829f.X(i12, intent);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        this.f428825b.Y1(i12);
    }

    @Override // com.avito.android.deeplink_handler.view.d
    public final void a(int i12, int i13, @Y61.l Intent intent) {
        D<List<C47918a>> d12 = this.f428830g.f134653b;
        List<C47918a> value = d12.getValue();
        if (value == null) {
            value = C42784z0.f406748b;
        }
        d12.setValue(C42745f0.i0(new C47918a(i12, i13, intent), value));
    }

    @Override // com.avito.android.deeplink_handler.view.d
    public final void b(@k Fragment fragment, @k a.g gVar, @k a.i iVar, @k h hVar, @k a.InterfaceC4053a interfaceC4053a) throws f.b {
        InterfaceC22983P interfaceC22983PB = new gv.d(fragment).b();
        d.e eVar = new d.e(gVar);
        o oVar = this.f428826c;
        oVar.getClass();
        oVar.f134667b.observe(interfaceC22983PB, new p(eVar));
        this.f428825b.a(interfaceC22983PB, new d.f(iVar));
        d.b bVar = new d.b();
        com.avito.android.deeplink_handler.view.lifecycle.f fVar = this.f428827d;
        fVar.getClass();
        fVar.f134656b.observe(interfaceC22983PB, new g(bVar));
        this.f428829f.a(interfaceC22983PB, interfaceC4053a);
        this.f428828e.a(interfaceC22983PB, new d.c(fragment));
        com.avito.android.deeplink_handler.view.lifecycle.d dVar = this.f428830g;
        dVar.getClass();
        dVar.f134653b.observe(interfaceC22983PB, new com.avito.android.deeplink_handler.view.lifecycle.c(dVar));
        this.f428831h.f134659b.observe(interfaceC22983PB, new j(new d.C4060d(fragment, interfaceC22983PB)));
        this.f428832i.c(fragment);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void b2(int i12, @k f.c cVar, @k ToastBarPosition toastBarPosition) {
        v vVar = this.f428825b;
        vVar.getClass();
        a.i.C4057a.a(vVar, i12, cVar, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.d
    public final void c(@k m mVar, @k a.g gVar, @k a.i iVar, @k h hVar, @k a.InterfaceC4053a interfaceC4053a) throws f.b {
        a.e eVar = new a.e(gVar);
        o oVar = this.f428826c;
        oVar.getClass();
        oVar.f134667b.observe(mVar, new p(eVar));
        this.f428825b.a(mVar, new a.f(iVar));
        a.b bVar = new a.b();
        com.avito.android.deeplink_handler.view.lifecycle.f fVar = this.f428827d;
        fVar.getClass();
        fVar.f134656b.observe(mVar, new g(bVar));
        this.f428829f.a(mVar, interfaceC4053a);
        this.f428828e.a(mVar, new a.c(mVar));
        com.avito.android.deeplink_handler.view.lifecycle.d dVar = this.f428830g;
        dVar.getClass();
        dVar.f134653b.observe(mVar, new com.avito.android.deeplink_handler.view.lifecycle.c(dVar));
        this.f428831h.f134659b.observe(mVar, new j(new a.d(mVar)));
        this.f428832i.b(mVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        this.f428826c.g(aVar, z12);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void g1(@k l<? super Context, G0> lVar) {
        this.f428829f.g1(lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void k0(@k l<? super Context, ? extends com.avito.android.lib.design.bottom_sheet.d> lVar) {
        this.f428828e.k0(lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    @InterfaceC42830m
    public final void k1(@k l<? super com.avito.android.lib.deprecated_design.dialog.a, G0> lVar) {
        this.f428828e.k1(lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.f
    @k
    public final W l1(@k String str) {
        return this.f428831h.l1(str);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void m0(@k String str, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition) {
        v vVar = this.f428825b;
        vVar.getClass();
        a.i.C4057a.b(vVar, str, fVar, i12, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.h
    public final void o0(@k String... strArr) {
        this.f428832i.o0(strArr);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void s1() {
        this.f428829f.s1();
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void u1(@f0 int i12, @f0 int i13, @k Y41.p pVar) {
        this.f428828e.u1(i12, i13, pVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void w1(@k DialogFragment dialogFragment, @k String str) {
        this.f428828e.w1(dialogFragment, str);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void z1(@k String str) {
        this.f428825b.z1(str);
    }
}
