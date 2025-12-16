package Tf;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.autoteka.presentation.ui.DotWithShadowView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InsightView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTf/a;", "Landroid/widget/LinearLayout;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15358a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f15779b;

    /* renamed from: c, reason: collision with root package name */
    public final DotWithShadowView f15780c;

    /* renamed from: d, reason: collision with root package name */
    public final Badge f15781d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f15782e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f15783f;

    public C15358a(@k Context context) {
        super(context);
        View.inflate(getContext(), R.layout.autoteka_preview_insight_item, this);
        this.f15779b = (ImageView) findViewById(R.id.insightIcon);
        this.f15780c = (DotWithShadowView) findViewById(R.id.insightDot);
        this.f15781d = (Badge) findViewById(R.id.insightBadge);
        this.f15782e = (TextView) findViewById(R.id.insightTitle);
        this.f15783f = (TextView) findViewById(R.id.insightSubtitle);
    }

    public final void a(int i12, boolean z12) {
        D6.w(this.f15779b);
        DotWithShadowView dotWithShadowView = this.f15780c;
        D6.G(dotWithShadowView, true);
        dotWithShadowView.setDotColor(i12);
        if (z12) {
            i12 = androidx.core.content.d.getColor(getContext(), R.color.common_clear);
        }
        dotWithShadowView.setShadowColor(i12);
    }
}
