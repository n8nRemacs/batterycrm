package com.avito.android.serp.adapter.gallery;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: GalleryHeaderDetailsViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/c;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f270021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Badge f270022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f270023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f270024d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f270025e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f270026f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f270027g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f270028h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f270029i;

    public c(@Y61.k View view) {
        this.f270021a = view.getContext();
        View viewFindViewById = view.findViewById(R.id.badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f270022b = (Badge) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270023c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270024d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.active_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f270025e = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.inactive_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f270026f = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.inactive_icon_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f270027g = (FrameLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.inactive_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f270028h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.inactive_container_text);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270029i = (TextView) viewFindViewById8;
    }

    @InterfaceC42156l
    public final int a(@InterfaceC42150f int i12, UniversalColor universalColor) {
        Context context = this.f270021a;
        return universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(i12, context);
    }
}
