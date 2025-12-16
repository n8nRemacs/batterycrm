package com.avito.android.gig_snippet.list.next_button;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigShiftNextButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_snippet/list/next_button/c;", "Lcom/avito/android/gig_snippet/list/next_button/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f161016d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f161017b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f161018c;

    public c(@k View view) {
        super(view);
        this.f161017b = view;
        this.f161018c = (TextView) view.findViewById(R.id.next_button_title);
    }

    @Override // com.avito.android.gig_snippet.list.next_button.b
    public final void wY(@k GigShiftNextButtonItem gigShiftNextButtonItem, @k l<? super DeepLink, G0> lVar) {
        this.f161018c.setText(gigShiftNextButtonItem.f161010b);
        this.f161017b.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(20, lVar, gigShiftNextButtonItem));
    }
}
