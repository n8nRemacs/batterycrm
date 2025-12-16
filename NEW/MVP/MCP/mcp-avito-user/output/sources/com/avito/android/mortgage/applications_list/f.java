package com.avito.android.mortgage.applications_list;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationsListViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/f;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MaterialToolbar f198395a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f198396b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShimmerLayout f198397c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f198398d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f198399e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f198400f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f198401g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f198402h;

    public f(@k View view) {
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f198395a = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.items);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f198396b = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.shimmer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f198397c = (ShimmerLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.error_layout);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f198398d = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.error_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f198399e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.error_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f198400f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.error_subtitle);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f198401g = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.retry_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f198402h = (Button) viewFindViewById8;
    }
}
