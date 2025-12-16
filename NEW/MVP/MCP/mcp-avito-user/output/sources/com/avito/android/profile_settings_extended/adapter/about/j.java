package com.avito.android.profile_settings_extended.adapter.about;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AboutItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/about/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/about/i;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i, InterfaceC15026b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f229117m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229118b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229120d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f229121e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f229122f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f229123g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f229124h;

    /* renamed from: i, reason: collision with root package name */
    public final int f229125i;

    /* renamed from: j, reason: collision with root package name */
    public final int f229126j;

    /* renamed from: k, reason: collision with root package name */
    public final int f229127k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f229128l;

    public j(@k View view) {
        super(view);
        this.f229118b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229119c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229120d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.expand_label);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229121e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.moderation_status);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f229122f = textView;
        View viewFindViewById5 = view.findViewById(R.id.edit_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229123g = (Button) viewFindViewById5;
        this.f229125i = view.getContext().getResources().getInteger(R.integer.about_widget_max_lines);
        this.f229126j = C35835l0.d(R.attr.red, view.getContext());
        this.f229127k = C35835l0.d(R.attr.gray48, view.getContext());
        this.f229128l = view.getContext().getString(R.string.extended_profile_settings_expand_info_label);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.about.i
    public final void Nl(@k AboutItem aboutItem, @k Y41.a<G0> aVar, @l Y41.a<G0> aVar2) {
        boolean z12 = aboutItem.f229098n;
        TextView textView = this.f229120d;
        if (z12) {
            Integer num = aboutItem.f229094j;
            textView.setMaxLines(num != null ? num.intValue() : this.f229125i);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        String str = aboutItem.f229092h;
        if (str == null || C43066x.K(str)) {
            I5.a(textView, aboutItem.f229089e, false);
        } else {
            I5.a(textView, str, false);
        }
        String str2 = aboutItem.f229095k;
        if (str2 == null) {
            str2 = this.f229128l;
        }
        TextView textView2 = this.f229121e;
        textView2.setText(str2);
        textView.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 24));
        ModerationStatus moderationStatus = aboutItem.f229096l;
        AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
        TextView textView3 = this.f229122f;
        com.avito.android.util.text.j.a(textView3, f226771c, null);
        textView3.setTextColor(moderationStatus instanceof ModerationStatus.ModerationFailed ? this.f229126j : this.f229127k);
        I5.a(this.f229119c, aboutItem.f229088d, false);
        int i12 = ((str == null || str.length() == 0) && aboutItem.f229101q != null) ? R.string.extended_profile_geo_add_button : (str == null || str.length() == 0) ? R.string.extended_profile_settings_edit_button_fill : R.string.extended_profile_settings_change;
        Button button = this.f229123g;
        button.setText(i12);
        button.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(4, aVar));
        textView2.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(8, this, aVar2));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.about.i
    public final void d(@l Y41.a<G0> aVar) {
        this.f229124h = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229123g.setOnClickListener(null);
        this.f229121e.setOnClickListener(null);
        Y41.a<G0> aVar = this.f229124h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229118b.xT(z12);
    }
}
