package com.avito.android.publish.details;

import android.view.View;
import com.avito.android.R;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.publish.view.html_editor_toolbar.HtmlEditorToolbarImpl;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ItemDetailsHtmlView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/l;", "Lcom/avito/android/publish/details/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33766l implements InterfaceC33763k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f234820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HtmlEditorToolbarImpl f234821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<FormatChange> f234822c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<EditorNavigationEvent> f234823d;

    public C33766l(@Y61.k View view, @Y61.k r rVar) {
        this.f234820a = rVar;
        HtmlEditorToolbarImpl htmlEditorToolbarImpl = new HtmlEditorToolbarImpl(view.findViewById(R.id.editor_panel));
        this.f234821b = htmlEditorToolbarImpl;
        this.f234822c = htmlEditorToolbarImpl.f245653h;
        this.f234823d = htmlEditorToolbarImpl.f245654i;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<EditorNavigationEvent> a() {
        return this.f234823d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void c() {
        r rVar = this.f234820a;
        rVar.a(rVar.f234905b + rVar.f234906c);
        D6.w(this.f234821b.f245646a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void e(boolean z12, boolean z13) {
        HtmlEditorToolbarImpl htmlEditorToolbarImpl = this.f234821b;
        htmlEditorToolbarImpl.f245648c.setEnabled(z12);
        htmlEditorToolbarImpl.f245649d.setEnabled(z13);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void h(int i12) {
        this.f234821b.b(i12);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final boolean isVisible() {
        return D6.y(this.f234821b.f245646a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    public final void t() {
        r rVar = this.f234820a;
        rVar.a(rVar.f234905b + rVar.f234906c);
        D6.H(this.f234821b.f245646a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33763k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<FormatChange> u() {
        return this.f234822c;
    }
}
