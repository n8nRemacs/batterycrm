package ru.avito.component.serp.job;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TitleHighlightDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/k;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f430531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f430532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430533c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Drawable f430534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f430535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f430536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f430537g;

    /* renamed from: h, reason: collision with root package name */
    public final int f430538h;

    public k(@Y61.k TextView textView, boolean z12) {
        this.f430531a = textView;
        this.f430532b = z12;
        int iT2 = D6.t(textView, R.dimen.rich_snippet_padding_left);
        this.f430533c = iT2;
        this.f430534d = D6.u(textView, R.drawable.job_snippet_title_bg);
        this.f430535e = C35835l0.d(R.attr.constantBlack, textView.getContext());
        int iJ2 = D6.j(textView, 4);
        this.f430536f = iJ2;
        this.f430537g = C35835l0.d(R.attr.black, textView.getContext());
        this.f430538h = iT2 - iJ2;
    }

    public /* synthetic */ k(TextView textView, boolean z12, int i12, C42822w c42822w) {
        this(textView, (i12 & 2) != 0 ? true : z12);
    }
}
