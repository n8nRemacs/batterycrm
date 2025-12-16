package com.avito.android.early_access_advert.info_screen;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAdvertInfoViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/c;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f145720a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f145721b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f145722c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f145723d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f145724e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f145725f;

    public c(@k View view) {
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145720a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.features);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f145721b = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.agree);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f145722c = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.disagree);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f145723d = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.disclaimer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145724e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.gradient);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f145725f = viewFindViewById6;
    }
}
