package com.avito.android.publish.slots.salary_range.warning;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WarningItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/warning/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/salary_range/warning/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AlertBanner f244840b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.alert_banner.AlertBanner");
        }
        this.f244840b = (AlertBanner) viewFindViewById;
    }

    @Override // com.avito.android.publish.slots.salary_range.warning.f
    public final void setText(@k String str) {
        this.f244840b.getContent().a(str);
    }
}
