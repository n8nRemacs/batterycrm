package com.avito.android.publish.premoderation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDuplicateView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/j;", "Lcom/avito/android/publish/premoderation/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Toolbar f238306a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f238307b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f238308c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f238309d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f238310e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f238311f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f238312g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f238313h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.button.c f238314i;

    public j(@Y61.k ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f238306a = (Toolbar) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238307b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238308c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238309d = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f238310e = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.advert_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238311f = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.advert_price);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238312g = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.action_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        this.f238313h = (Button) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.continue_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f238314i = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById9);
    }
}
