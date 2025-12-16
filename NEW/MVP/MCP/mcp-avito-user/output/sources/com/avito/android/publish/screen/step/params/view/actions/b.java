package com.avito.android.publish.screen.step.params.view.actions;

import Hf0.InterfaceC13984a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.details.InterfaceC33748f;
import com.avito.android.publish.details.InterfaceC33763k;
import com.avito.android.publish.details.InterfaceC33769m;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishDetailsActionButtons.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/b;", "Lcom/avito/android/publish/screen/step/params/view/actions/a;", "Lcom/avito/android/publish/details/f;", "Lcom/avito/android/publish/details/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a, InterfaceC33748f, InterfaceC33769m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f241541a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33763k f241542b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33748f f241543c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33769m f241544d;

    public b(@Y61.k View view, @Y61.k InterfaceC33763k interfaceC33763k, @Y61.k InterfaceC33748f interfaceC33748f, @Y61.k InterfaceC33769m interfaceC33769m) {
        this.f241541a = view;
        this.f241542b = interfaceC33763k;
        this.f241543c = interfaceC33748f;
        this.f241544d = interfaceC33769m;
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.a
    public final void Dc() {
        D6.w(this.f241541a);
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.a
    public final boolean Ec() {
        return this.f241542b.isVisible();
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.a
    public final void Fc() {
        D6.H(this.f241541a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        this.f241543c.b();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        this.f241544d.d(list, navigationButtonsOrientation);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        this.f241543c.f();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        this.f241543c.g();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f241543c.j();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        this.f241543c.k();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        this.f241543c.m();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) {
        this.f241544d.n(list, navigationButtonsOrientation, attributedText, deepLink, navigationButtonAction, bool);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        this.f241543c.o();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f241544d.p();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        this.f241544d.q();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f241543c.r(str);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        this.f241544d.s(z12);
    }
}
