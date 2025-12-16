package com.avito.android.extended_profile_widgets.adapter.search.search_load_error;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchLoadErrorItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_load_error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_load_error/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f154845d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f154846b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f154847c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_load_error_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154846b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_load_error_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f154847c = (Button) viewFindViewById2;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_load_error.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f154847c.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(13, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154847c.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_load_error.g
    public final void v0(@k String str) {
        I5.a(this.f154846b, str, false);
    }
}
