package com.avito.android.profile.user_profile.cards.autosubscribtion;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSubscriptionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/autosubscribtion/h;", "Lcom/avito/android/profile/user_profile/cards/autosubscribtion/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f224789f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f224790b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f224792d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Badge f224793e;

    public h(@k View view) {
        super(view);
        this.f224790b = view;
        this.f224791c = (TextView) view.findViewById(R.id.title);
        this.f224792d = (TextView) view.findViewById(R.id.description);
        View viewFindViewById = view.findViewById(R.id.badge_new);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f224793e = (Badge) viewFindViewById;
    }

    @Override // com.avito.android.profile.user_profile.cards.autosubscribtion.g
    public final void wJ(@k String str, @k String str2, @k String str3, @k Y41.a aVar) {
        this.f224791c.setText(str);
        this.f224792d.setText(str3);
        this.f224793e.setTitleText(str2);
        this.f224790b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(13, aVar));
    }
}
