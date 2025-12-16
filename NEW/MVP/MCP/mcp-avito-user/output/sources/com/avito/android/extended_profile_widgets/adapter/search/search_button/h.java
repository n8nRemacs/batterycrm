package com.avito.android.extended_profile_widgets.adapter.search.search_button;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_button/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f154777c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f154778b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.load_more_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f154778b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_button.g
    public final void fe(@l Y41.a aVar, boolean z12) {
        Button button = this.f154778b;
        button.setLoading(z12);
        button.setClickable(!z12);
        button.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(10, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154778b.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_button.g
    public final void setTitle(@k String str) {
        this.f154778b.setText(str);
    }
}
