package com.avito.android.gig_apply.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: GigApplyActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/d;", "Landroid/text/style/ClickableSpan;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.gig_apply.ui.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30728d extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GigApplyActivity f159997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159998c;

    public C30728d(GigApplyActivity gigApplyActivity, String str) {
        this.f159997b = gigApplyActivity;
        this.f159998c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        GigApplyActivity.a2(this.f159997b, this.f159998c);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C35835l0.d(R.attr.gray54, this.f159997b));
        textPaint.setUnderlineText(true);
    }
}
