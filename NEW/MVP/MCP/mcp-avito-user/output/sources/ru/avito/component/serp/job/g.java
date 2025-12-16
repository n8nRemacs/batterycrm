package ru.avito.component.serp.job;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SerpAdvertRichJobLocationRenderer2.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/g;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f430500a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f430501b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f430502c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f430503d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f430504e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f430505f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f430506g;

    public g(@Y61.k View view) {
        this.f430500a = view;
        this.f430501b = (ImageView) view.findViewById(R.id.metro_icon);
        this.f430502c = (TextView) view.findViewById(R.id.location_2);
        this.f430503d = (TextView) view.findViewById(R.id.distance);
        this.f430504e = (ImageView) view.findViewById(R.id.distance_icon);
        this.f430505f = (TextView) view.findViewById(R.id.additional_info);
        this.f430506g = (LinearLayout) view.findViewById(R.id.distance_container);
    }
}
