package com.avito.android.publish.screen.step.params.view.actions;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.publish.details.InterfaceC33763k;
import com.avito.android.publish.view.html_editor_toolbar.HtmlEditorToolbarImpl;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: PublishDetailsHtmlView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/c;", "Lcom/avito/android/publish/details/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements InterfaceC33763k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f241545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HtmlEditorToolbarImpl f241546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z<FormatChange> f241547c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final z<EditorNavigationEvent> f241548d;

    public c(@Y61.k View view, @Y61.k k kVar) {
        this.f241545a = kVar;
        HtmlEditorToolbarImpl htmlEditorToolbarImpl = new HtmlEditorToolbarImpl(view.findViewById(R.id.editor_panel));
        this.f241546b = htmlEditorToolbarImpl;
        this.f241547c = htmlEditorToolbarImpl.f245653h;
        this.f241548d = htmlEditorToolbarImpl.f245654i;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final z<EditorNavigationEvent> a() {
        return this.f241548d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void c() {
        D6.w(this.f241546b.f245646a);
        k kVar = this.f241545a;
        kVar.c(kVar.getF241566e() + kVar.b());
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void e(boolean z12, boolean z13) {
        HtmlEditorToolbarImpl htmlEditorToolbarImpl = this.f241546b;
        htmlEditorToolbarImpl.f245648c.setEnabled(z12);
        htmlEditorToolbarImpl.f245649d.setEnabled(z13);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void h(int i12) {
        this.f241546b.b(i12);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final boolean isVisible() {
        return D6.y(this.f241546b.f245646a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void t() {
        D6.H(this.f241546b.f245646a);
        k kVar = this.f241545a;
        kVar.c(kVar.getF241566e() + kVar.b());
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final z<FormatChange> u() {
        return this.f241547c;
    }
}
