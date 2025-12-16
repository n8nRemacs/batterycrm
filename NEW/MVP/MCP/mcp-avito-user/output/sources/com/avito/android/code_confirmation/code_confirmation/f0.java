package com.avito.android.code_confirmation.code_confirmation;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CodeConfirmationView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/f0;", "Lcom/avito/android/code_confirmation/code_confirmation/a0;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n0 f119535a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f119536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f119537c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f119538d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f119539e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f119540f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final NavBar f119541g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f119542h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f119543i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f119544j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Input f119545k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<G0> f119546l;

    public f0(@Y61.k View view, @Y61.k n0 n0Var) {
        this.f119535a = n0Var;
        this.f119536b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.code_confirmation_progress);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f119537c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.code_confirmation_content_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f119538d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.code_confirmation_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f119539e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.code_confirmation_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f119540f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.code_confirmation_navbar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        this.f119541g = (NavBar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.code_confirmation_send_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f119542h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.code_confirmation_request_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f119543i = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.code_confirmation_cc);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f119544j = (ComponentContainer) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.code_confirmation_input);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f119545k = (Input) viewFindViewById9;
        this.f119546l = new com.jakewharton.rxrelay3.b<>();
    }

    public final void a() {
        this.f119544j.k();
    }

    public final void b() {
        K2.d(this.f119538d, true);
    }

    public final void c() {
        D6.w(this.f119537c);
    }

    public final void d(@Y61.k String str) {
        Input.t(this.f119545k, str, false, 6);
    }

    public final void e(@Y61.k String str) {
        ComponentContainer.n(this.f119544j, str, 2);
    }

    public final void f(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f119538d, printableText, null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }

    public final void g(@Y61.l ApiError apiError, @Y61.k String str) {
        f.c cVarB;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        if (apiError != null) {
            cVarB = new f.c(apiError);
        } else {
            f.c.f125255c.getClass();
            cVarB = f.c.a.b();
        }
        com.avito.android.component.toast.c.b(cVar, this.f119538d, printableTextF, null, null, null, cVarB, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }

    public final void h() {
        D6.H(this.f119537c);
    }

    public final void i() {
        Button button = this.f119543i;
        button.setText(R.string.code_request_button_text);
        button.setEnabled(true);
    }
}
