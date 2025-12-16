package com.avito.android.profile_settings_basic.adapter.section_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/section_header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_basic/adapter/section_header/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f228684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f228685c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228684b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228685c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_basic.adapter.section_header.g
    public final void a10(@k SectionHeaderItem sectionHeaderItem) {
        I5.a(this.f228684b, sectionHeaderItem.f228672c, false);
        I5.a(this.f228685c, sectionHeaderItem.f228673d, false);
    }
}
