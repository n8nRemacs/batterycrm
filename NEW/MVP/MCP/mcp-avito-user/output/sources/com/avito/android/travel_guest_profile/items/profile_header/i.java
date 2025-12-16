package com.avito.android.travel_guest_profile.items.profile_header;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ProfileHeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/profile_header/i;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f302097k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f302098b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f302099c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f302100d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f302101e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f302102f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f302103g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f302104h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f302105i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f302106j;

    public i(@k View view) {
        super(view);
        this.f302098b = (TextView) view.findViewById(R.id.user_name_tv);
        this.f302099c = (ImageView) view.findViewById(R.id.rating_icon);
        this.f302100d = (TextView) view.findViewById(R.id.rating_tv);
        this.f302101e = (TextView) view.findViewById(R.id.personal_info_tv);
        this.f302102f = (TextView) view.findViewById(R.id.additional_info_tv);
        this.f302103g = (ImageView) view.findViewById(R.id.avatar_image_view);
        this.f302104h = (LinearLayout) view.findViewById(R.id.badges_container);
        this.f302105i = (TextView) view.findViewById(R.id.blacklist_title_tv);
        this.f302106j = (TextView) view.findViewById(R.id.blacklist_subtitle_tv);
    }
}
