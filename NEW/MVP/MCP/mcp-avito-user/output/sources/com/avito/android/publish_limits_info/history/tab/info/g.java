package com.avito.android.publish_limits_info.history.tab.info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: InfoItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/info/g;", "Lcom/avito/android/publish_limits_info/history/tab/info/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f245923b;

    public g(@k View view) {
        super(view);
        this.f245923b = (TextView) view.findViewById(R.id.history_extra_info_item);
    }

    @Override // com.avito.android.publish_limits_info.history.tab.info.f
    public final void h(@l String str) {
        I5.a(this.f245923b, str, false);
    }
}
