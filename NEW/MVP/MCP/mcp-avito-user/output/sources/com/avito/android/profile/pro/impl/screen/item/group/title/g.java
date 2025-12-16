package com.avito.android.profile.pro.impl.screen.item.group.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: ProfileProGroupTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/group/title/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f223327b;

    public g(@k View view) {
        super(view);
        this.f223327b = (TextView) view.findViewById(R.id.title);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.title.f
    public final void Ep(@k ProfileProGroupTitleItem profileProGroupTitleItem) {
        I5.a(this.f223327b, profileProGroupTitleItem.f223321c, false);
    }
}
