package com.avito.android.gig_timer_widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigApplyButtonTimerView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/gig_timer_widget/GigApplyButtonTimerView;", "Lcom/avito/android/gig_timer_widget/a;", "", CrashHianalyticsData.TIME, "Lkotlin/G0;", "setTimer", "(J)V", "", "color", "setColor", "(I)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "listener", "setOnTimerFinishListener", "(LY41/a;)V", "_avito_gig_timer-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigApplyButtonTimerView extends a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f161079f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f161080g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f161081h;

    @j
    public GigApplyButtonTimerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.gig_timer_widget.a
    public final void b(long j12, long j13, long j14, long j15, boolean z12) throws Resources.NotFoundException {
        String strI;
        TextView textView = this.f161080g;
        TextView textView2 = this.f161079f;
        if (j14 > 1 || j15 > 0) {
            if (j12 > 0) {
                int i12 = (int) j12;
                strI = getResources().getQuantityString(R.plurals.job_gig_timer_widget_public_snippet_timer_days_plurals, i12, Integer.valueOf(i12));
            } else {
                strI = j13 > 0 ? H.i(' ', getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_hours, Long.valueOf(j13)), getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_minutes, Long.valueOf(j14))) : getResources().getString(R.string.job_gig_timer_widget_public_snippet_timer_minutes, Long.valueOf(j14));
            }
            I5.a(textView2, getResources().getText(R.string.job_gig_timer_widget_public_snippet_timer_until_start), false);
            I5.a(textView, strI, false);
            return;
        }
        I5.a(textView2, getResources().getString(R.string.job_gig_timer_widget_public_timer_already_start), false);
        D6.w(textView);
        d();
        Y41.a<G0> aVar = this.f161081h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setColor(@InterfaceC42156l int color) {
        this.f161079f.setTextColor(color);
        this.f161080g.setTextColor(color);
    }

    public final void setOnTimerFinishListener(@k Y41.a<G0> listener) {
        this.f161081h = listener;
    }

    public final void setTimer(long time) {
        D6.H(this.f161080g);
        D6.H(this.f161079f);
        c(time, true);
    }

    public final void setTitle(@k String title) {
        I5.a(this.f161079f, title, false);
    }

    public GigApplyButtonTimerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.gig_timer_layout, this);
        this.f161079f = (TextView) findViewById(R.id.gig_timer_title);
        this.f161080g = (TextView) findViewById(R.id.gig_time);
        setColor(C35835l0.d(R.attr.whiteAlpha70, context));
    }
}
