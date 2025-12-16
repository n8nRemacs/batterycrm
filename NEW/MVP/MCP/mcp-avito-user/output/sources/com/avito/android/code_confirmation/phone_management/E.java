package com.avito.android.code_confirmation.phone_management;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneManagementView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/E;", "Lcom/avito/android/code_confirmation/phone_management/z;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class E implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f119651a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f119652b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavBar f119653c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f119654d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f119655e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f119656f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Input f119657g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f119658h;

    public E(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.phone_management_progress_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f119651a = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.phone_management_content_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f119652b = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_management_navbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        this.f119653c = (NavBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.phone_management_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f119654d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.phone_management_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f119655e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.phone_management_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f119656f = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.phone_management_input);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f119657g = (Input) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.phone_management_input_cc);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f119658h = (ComponentContainer) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.phone_management_user_agreement);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public final void a() {
        K2.d(this.f119652b, true);
    }

    public final void b() {
        D6.w(this.f119651a);
    }

    public final void c(@Y61.k String str) {
        ComponentContainer.n(this.f119658h, str, 2);
    }
}
