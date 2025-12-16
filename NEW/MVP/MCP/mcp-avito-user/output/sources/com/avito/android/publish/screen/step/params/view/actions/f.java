package com.avito.android.publish.screen.step.params.view.actions;

import Hf0.InterfaceC13984a;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.details.InterfaceC33748f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: PublishDetailsMainButtonView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/f;", "Lcom/avito/android/publish/details/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC33748f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f241552a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f241553b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Hf0.b f241554c;

    public f(@Y61.k View view, @Y61.k k kVar, @Y61.k Y41.a aVar) {
        this.f241552a = view;
        this.f241553b = aVar;
        Hf0.b bVar = new Hf0.b(view);
        this.f241554c = bVar;
        bVar.d(view.getResources().getString(R.string.continue_string));
        bVar.b(new e(this));
        g();
        kVar.c(kVar.getF241566e() + kVar.b());
    }

    public final void a(@InterfaceC42150f int i12) {
        int iJ2 = C35835l0.j(i12, new ContextThemeWrapper(this.f241552a.getContext(), R.style.Theme_DesignSystem_Re23));
        Hf0.b bVar = this.f241554c;
        bVar.c(iJ2, true);
        Button button = bVar.f7602b;
        if (button != null) {
            D6.c(button, 0, null, 0, null, 10);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void b() {
        Button button = this.f241554c.f7601a;
        if (button != null) {
            D6.H(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void f() {
        Button button = this.f241554c.f7601a;
        if (button != null) {
            D6.k(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void g() {
        Button button = this.f241554c.f7602b;
        if (button != null) {
            button.post(new d(this, 0));
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    @Y61.k
    public final InterfaceC13984a j() {
        return this.f241554c;
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void k() {
        Button button = this.f241554c.f7601a;
        if (button != null) {
            D6.w(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void m() {
        Button button = this.f241554c.f7602b;
        if (button != null) {
            button.post(new d(this, 1));
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void o() {
        Button button = this.f241554c.f7601a;
        if (button != null) {
            D6.h(button);
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33748f
    public final void r(@Y61.k String str) {
        this.f241554c.d(str);
    }
}
