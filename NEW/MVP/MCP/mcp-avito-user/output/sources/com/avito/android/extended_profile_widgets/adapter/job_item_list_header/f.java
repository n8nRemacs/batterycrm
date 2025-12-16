package com.avito.android.extended_profile_widgets.adapter.job_item_list_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: JobCompanyItemListHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f154539d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f154540b;

    /* renamed from: c, reason: collision with root package name */
    public final View f154541c;

    public f(@k View view) {
        super(view);
        this.f154540b = (TextView) view.findViewById(R.id.title_view);
        this.f154541c = view.findViewById(R.id.click_area);
    }
}
