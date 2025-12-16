package com.avito.android.profile.pro.impl.screen.item.widget_group.title;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.item.recommendations.h;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProWidgetGroupTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/widget_group/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/widget_group/title/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f223581e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f223582b;

    /* renamed from: c, reason: collision with root package name */
    public final View f223583c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f223584d;

    public g(@k View view) {
        super(view);
        this.f223582b = (TextView) view.findViewById(R.id.title);
        this.f223583c = view.findViewById(R.id.widget_group_badge);
        this.f223584d = (ConstraintLayout) view.findViewById(R.id.widget_group_title_root);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.widget_group.title.f
    public final void vo(@k ProfileProWidgetGroupTitleItem profileProWidgetGroupTitleItem, @k l<? super D90.a, G0> lVar) {
        I5.a(this.f223582b, profileProWidgetGroupTitleItem.f223573c, false);
        DeepLink deepLink = profileProWidgetGroupTitleItem.f223574d;
        View view = this.f223583c;
        if (deepLink == null) {
            D6.w(view);
            return;
        }
        D6.H(view);
        this.f223584d.setOnClickListener(new h(1, lVar, profileProWidgetGroupTitleItem));
    }
}
