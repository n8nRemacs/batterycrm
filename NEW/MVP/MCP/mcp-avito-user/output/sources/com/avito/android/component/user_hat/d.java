package com.avito.android.component.user_hat;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.I5;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserHat.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/d;", "Lcom/avito/android/component/user_hat/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f125294a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f125295b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f125296c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f125297d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f125298e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f125299f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingBar f125300g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f125301h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f125302i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f125303j;

    public d(@k View view) {
        this.f125294a = view;
        this.f125295b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125296c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.registered_date);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125297d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125298e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125299f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_score);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f125300g = (RatingBar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.rating_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125301h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.rating_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f125302i = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.rating_number);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125303j = (TextView) viewFindViewById8;
    }

    public final void a(@l String str) {
        I5.a(this.f125299f, str, false);
    }

    public final void b(@l String str) {
        I5.a(this.f125298e, str, false);
    }
}
