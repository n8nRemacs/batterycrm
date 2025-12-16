package com.avito.android.publish.details;

import Hf0.InterfaceC13984a;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ItemDetailsActionButtons.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/e;", "Lcom/avito/android/publish/details/d;", "Lcom/avito/android/publish/details/f;", "Lcom/avito/android/publish/details/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33745e implements InterfaceC33684d, InterfaceC33748f, InterfaceC33769m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33748f f234613a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33769m f234614b;

    public C33745e(@Y61.k InterfaceC33748f interfaceC33748f, @Y61.k InterfaceC33769m interfaceC33769m) {
        this.f234613a = interfaceC33748f;
        this.f234614b = interfaceC33769m;
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        this.f234613a.b();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        this.f234614b.d(list, navigationButtonsOrientation);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        this.f234613a.f();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        this.f234613a.g();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f234613a.j();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        this.f234613a.k();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        this.f234613a.m();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) {
        this.f234614b.n(list, navigationButtonsOrientation, attributedText, deepLink, navigationButtonAction, bool);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        this.f234613a.o();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f234614b.p();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        this.f234614b.q();
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f234613a.r(str);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        this.f234614b.s(z12);
    }
}
