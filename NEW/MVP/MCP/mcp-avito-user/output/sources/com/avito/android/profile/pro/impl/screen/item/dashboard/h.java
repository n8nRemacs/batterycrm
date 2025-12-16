package com.avito.android.profile.pro.impl.screen.item.dashboard;

import Y61.k;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ProfileProDashboardView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard/h;", "Landroid/text/style/ClickableSpan;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q<String, View.OnClickListener> f223094b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Q<String, ? extends View.OnClickListener> q12) {
        this.f223094b = q12;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        Selection.setSelection((Spannable) ((TextView) view).getText(), 0);
        view.invalidate();
        this.f223094b.f406620c.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
