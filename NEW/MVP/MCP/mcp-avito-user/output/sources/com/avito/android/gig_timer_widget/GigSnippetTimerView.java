package com.avito.android.gig_timer_widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigSnippetTimerView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/gig_timer_widget/GigSnippetTimerView;", "Lcom/avito/android/gig_timer_widget/a;", "", "colorAttrRes", "Lkotlin/G0;", "setColor", "(I)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "_avito_gig_timer-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSnippetTimerView extends a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f161090f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f161091g;

    @j
    public GigSnippetTimerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.gig_timer_widget.a
    public final void b(long j12, long j13, long j14, long j15, boolean z12) throws Resources.NotFoundException {
        TextView textView = this.f161091g;
        if (j12 > 0) {
            int i12 = (int) j12;
            I5.a(textView, getResources().getQuantityString(R.plurals.job_gig_timer_widget_public_snippet_timer_days_plurals, i12, Integer.valueOf(i12)), false);
        } else {
            if (j13 <= 0) {
                I5.a(textView, getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_minutes, Long.valueOf(j14)), false);
                return;
            }
            I5.a(textView, getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_hours, Long.valueOf(j13)) + ' ' + getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_minutes, Long.valueOf(j14)), false);
        }
    }

    @Override // com.avito.android.gig_timer_widget.a
    public final void c(long j12, boolean z12) {
        D6.H(this.f161091g);
        D6.H(this.f161090f);
        super.c(j12, z12);
    }

    public final void e() {
        D6.w(this.f161091g);
        setTitle("");
        setColor(R.attr.black);
        d();
    }

    public final void setColor(int colorAttrRes) {
        this.f161090f.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161091g.setTextColor(C35835l0.d(colorAttrRes, getContext()));
    }

    public final void setTitle(@k String title) {
        I5.a(this.f161090f, title, false);
    }

    public GigSnippetTimerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.gig_timer_layout, this);
        this.f161090f = (TextView) findViewById(R.id.gig_timer_title);
        this.f161091g = (TextView) findViewById(R.id.gig_time);
    }
}
