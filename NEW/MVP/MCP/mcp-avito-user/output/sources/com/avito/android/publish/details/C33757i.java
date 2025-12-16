package com.avito.android.publish.details;

import Hf0.InterfaceC13984a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ItemDetailsButtonView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/i;", "Lcom/avito/android/publish/details/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33757i implements InterfaceC33748f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f234696a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ItemDetailsView.b f234697b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Hf0.b f234698c;

    public C33757i(@Y61.k View view, @Y61.k r rVar, @Y61.k ItemDetailsView.b bVar) throws Resources.NotFoundException {
        this.f234696a = view;
        this.f234697b = bVar;
        Hf0.b bVar2 = new Hf0.b(view);
        this.f234698c = bVar2;
        bVar2.d(view.getResources().getString(R.string.continue_string));
        bVar2.b(new C33754h(this));
        rVar.a(rVar.f234905b + rVar.f234906c);
        bVar2.c(C35835l0.j(com.avito.android.lib.util.f.d("primaryLarge"), new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23)), true);
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        Button button = this.f234698c.f7601a;
        if (button != null) {
            D6.H(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        Button button = this.f234698c.f7601a;
        if (button != null) {
            D6.k(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f234696a.getContext(), R.style.Theme_DesignSystem_Re23);
        Button button = this.f234698c.f7602b;
        if (button != null) {
            button.post(new RunnableC33751g(this, contextThemeWrapper, 1));
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f234698c;
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        Button button = this.f234698c.f7601a;
        if (button != null) {
            D6.w(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f234696a.getContext(), R.style.Theme_DesignSystem_Re23);
        Button button = this.f234698c.f7602b;
        if (button != null) {
            button.post(new RunnableC33751g(this, contextThemeWrapper, 0));
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        Button button = this.f234698c.f7601a;
        if (button != null) {
            D6.h(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f234698c.d(str);
    }
}
