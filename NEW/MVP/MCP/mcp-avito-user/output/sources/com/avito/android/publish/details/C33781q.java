package com.avito.android.publish.details;

import Hf0.InterfaceC13984a;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kr.C43490a;

/* compiled from: ItemDetailsOverlayPanel.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/q;", "Lcom/avito/android/publish/details/p;", "Lcom/avito/android/publish/details/d;", "Lcom/avito/android/publish/details/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33781q implements InterfaceC33778p, InterfaceC33684d, InterfaceC33763k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f234893a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33684d f234894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33763k f234895c;

    /* compiled from: ItemDetailsOverlayPanel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.q$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f234896l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<kotlin.G0> aVar) {
            super(0);
            this.f234896l = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ?? r02 = this.f234896l;
            if (r02 != 0) {
                r02.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    public C33781q(@Y61.k View view, @Y61.k InterfaceC33684d interfaceC33684d, @Y61.k InterfaceC33763k interfaceC33763k) {
        this.f234893a = view;
        this.f234894b = interfaceC33684d;
        this.f234895c = interfaceC33763k;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<EditorNavigationEvent> a() {
        return this.f234895c.a();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        this.f234894b.b();
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void c() {
        this.f234895c.c();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        this.f234894b.d(list, navigationButtonsOrientation);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void e(boolean z12, boolean z13) {
        this.f234895c.e(z12, z13);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        this.f234894b.f();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        this.f234894b.g();
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final int getHeight() {
        int height = this.f234894b.j().getHeight();
        return this.f234895c.isVisible() ? height + this.f234893a.getResources().getDimensionPixelSize(R.dimen.html_editor_toolbar_bottom_height) : height;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void h(int i12) {
        this.f234895c.h(i12);
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void i(@Y61.k ToastBarState toastBarState) {
        C43490a.a(this.f234893a.getContext(), toastBarState, null, 28);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final boolean isVisible() {
        return this.f234895c.isVisible();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f234894b.j();
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void j3(@Y61.k String str) {
        InterfaceC33684d interfaceC33684d = this.f234894b;
        Button f7602b = interfaceC33684d.j().getF7602b();
        if (f7602b != null && D6.y(f7602b)) {
            Button f7602b2 = interfaceC33684d.j().getF7602b();
            if (f7602b2 != null) {
                f7602b2.postDelayed(new Me.m(f7602b2, str, this, 23), 300L);
                return;
            }
            return;
        }
        if (D6.y(interfaceC33684d.p())) {
            View viewP = interfaceC33684d.p();
            if (viewP != null) {
                viewP.postDelayed(new Me.m(viewP, str, this, 23), 300L);
                return;
            }
            return;
        }
        View view = this.f234893a;
        if (view != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.f(str), null, null, null, null, 0, null, null, false, false, null, view.getContext(), 2046);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        this.f234894b.k();
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void l(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.l Y41.a<kotlin.G0> aVar) {
        List listSingletonList;
        View view = this.f234893a;
        if (printableText2 != null) {
            listSingletonList = Collections.singletonList(new c.a.C3719a(printableText2.k0(view.getContext()), true, null, new a(aVar), 4, null));
        } else {
            listSingletonList = null;
        }
        List list = listSingletonList;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, this.f234893a, printableText, null, list, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, view.getContext(), 1962);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        this.f234894b.m();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) {
        this.f234894b.n(list, navigationButtonsOrientation, attributedText, deepLink, navigationButtonAction, bool);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        this.f234894b.o();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f234894b.p();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        this.f234894b.q();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f234894b.r(str);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        this.f234894b.s(z12);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void t() {
        this.f234895c.t();
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<FormatChange> u() {
        return this.f234895c.u();
    }
}
