package com.avito.android.profile.pro.impl.screen.item.reputation;

import LV.c;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.profile.pro.impl.screen.item.reputation.ProfileProReputationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yV.C50177a;

/* compiled from: ProfileProReputationView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/reputation/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f223465l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50177a f223466b;

    /* renamed from: c, reason: collision with root package name */
    public final View f223467c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f223468d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f223469e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f223470f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f223471g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f223472h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f223473i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f223474j;

    /* renamed from: k, reason: collision with root package name */
    public final RatingBar f223475k;

    /* compiled from: ProfileProReputationView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223476a;

        static {
            int[] iArr = new int[ProfileProReputationItem.ProfileProReputationItemColor.values().length];
            try {
                ProfileProReputationItem.ProfileProReputationItemColor profileProReputationItemColor = ProfileProReputationItem.ProfileProReputationItemColor.f223450b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileProReputationItem.ProfileProReputationItemColor profileProReputationItemColor2 = ProfileProReputationItem.ProfileProReputationItemColor.f223450b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f223476a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        Context context = view.getContext();
        C50177a.C12902a c12902a = C50177a.f443122g;
        c12902a.getClass();
        this.f223466b = (C50177a) c.a.a(c12902a, context, R.attr.progressBarDefaultLarge);
        View viewFindViewById = view.findViewById(R.id.reputation_widget);
        this.f223467c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.profile_reputation_score);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f223468d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.profile_reputation_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f223469e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.profile_reputation_progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f223470f = (ProgressBarRe23) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.profile_reputation_badge);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f223471g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.rating_widget);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f223472h = viewFindViewById6;
        View viewFindViewById7 = viewFindViewById6.findViewById(R.id.profile_rating_score);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f223473i = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewFindViewById6.findViewById(R.id.profile_rating_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f223474j = (TextView) viewFindViewById8;
        this.f223475k = (RatingBar) viewFindViewById6.findViewById(R.id.profile_rating_stars);
    }
}
