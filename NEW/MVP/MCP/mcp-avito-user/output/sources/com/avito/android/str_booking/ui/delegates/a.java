package com.avito.android.str_booking.ui.delegates;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FooterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/delegates/a;", "Lcom/avito/android/str_booking/ui/delegates/c;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f285991a = true;

    public static void e(View view, boolean z12) {
        View viewFindViewById = view.findViewById(R.id.str_booking_footer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        ((FrameLayout) viewFindViewById).animate().translationY(z12 ? 0.0f : r2.getHeight()).setDuration(100L).start();
    }

    @Override // com.avito.android.str_booking.ui.delegates.c
    /* renamed from: b, reason: from getter */
    public final boolean getF285991a() {
        return this.f285991a;
    }

    @Override // com.avito.android.str_booking.ui.delegates.c
    public final void c(@k View view) {
        View viewFindViewById = view.findViewById(R.id.str_booking_footer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        Rect rect = new Rect();
        ((FrameLayout) viewFindViewById).getGlobalVisibleRect(rect);
        if (rect.intersect(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels))) {
            e(view, false);
        }
    }

    @Override // com.avito.android.str_booking.ui.delegates.c
    public final void d(@k View view) {
        e(view, true);
    }
}
