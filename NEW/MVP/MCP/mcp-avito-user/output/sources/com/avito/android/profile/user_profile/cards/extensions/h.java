package com.avito.android.profile.user_profile.cards.extensions;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtensionsCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/extensions/h;", "Lcom/avito/android/profile/user_profile/cards/extensions/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f224954g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f224955b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224956c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f224957d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f224958e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f224959f;

    public h(@k View view) {
        super(view);
        this.f224955b = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224956c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224957d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extensions_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f224958e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.actions_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f224959f = (LinearLayout) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.extensions.g
    public final void ND(@k String str, @k Y41.a<G0> aVar) {
        LayoutInflater layoutInflater = this.f224955b;
        LinearLayout linearLayout = this.f224959f;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_action, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.action_text);
        textView.setText(str);
        textView.setOnClickListener(new com.avito.android.profile.edit.adapter.c(15, aVar));
        linearLayout.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.extensions.g
    public final void h(@l String str) {
        I5.a(this.f224957d, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f224958e.removeAllViews();
        this.f224959f.removeAllViews();
    }

    @Override // com.avito.android.profile.user_profile.cards.extensions.g
    public final void p20(@k String str, @k String str2) {
        LayoutInflater layoutInflater = this.f224955b;
        LinearLayout linearLayout = this.f224958e;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_extension, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
        textView.setText(str);
        textView2.setText(str2);
        linearLayout.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.extensions.g
    public final void setTitle(@k String str) {
        this.f224956c.setText(str);
    }
}
