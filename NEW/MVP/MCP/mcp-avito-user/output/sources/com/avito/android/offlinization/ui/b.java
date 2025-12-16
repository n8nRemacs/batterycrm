package com.avito.android.offlinization.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OfflineModeView.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/avito/android/offlinization/ui/b;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "visibility", "Lkotlin/G0;", "setVisibility", "(I)V", "Lcom/avito/android/offlinization/ui/i;", "b", "Lcom/avito/android/offlinization/ui/i;", "getToastProvider", "()Lcom/avito/android/offlinization/ui/i;", "setToastProvider", "(Lcom/avito/android/offlinization/ui/i;)V", "toastProvider", "getRightCornerX", "()I", "rightCornerX", "getBottomY", "bottomY", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public i toastProvider;

    /* renamed from: c, reason: collision with root package name */
    public int f208628c;

    /* renamed from: d, reason: collision with root package name */
    public int f208629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f208630e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f208631f;

    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f208630e = y6.b(42);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        try {
            setImageDrawable(context.getDrawable(R.drawable.ic_no_signal_20));
            setImageTintList(C35835l0.e(R.attr.white, context));
            setBackground(context.getDrawable(R.drawable.bg_offline_btn));
        } catch (Resources.NotFoundException unused) {
            this.f208631f = true;
        }
        setVisibility(8);
        setElevation(12.0f);
        setHapticFeedbackEnabled(true);
        setX(getRightCornerX());
        setOnClickListener(new ViewOnClickListenerC31873b(this, 25));
        C22823h0.K(this, new a(this, 0));
    }

    private final int getBottomY() {
        return ((getResources().getDisplayMetrics().heightPixels - y6.b(76)) - this.f208628c) - this.f208629d;
    }

    private final int getRightCornerX() {
        return (getResources().getDisplayMetrics().widthPixels - this.f208630e) - y6.b(10);
    }

    public static void k(b bVar, J0 j02) {
        int i12;
        bVar.f208628c = j02.e(8).f44778d;
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            C22771k c22771kE = j02.e(com.avito.android.lib.util.i.f181375c);
            i12 = c22771kE.f44776b + c22771kE.f44778d;
        } else {
            i12 = 0;
        }
        bVar.f208629d = i12;
        bVar.setY(bVar.getBottomY());
    }

    @Y61.l
    public final i getToastProvider() {
        return this.toastProvider;
    }

    public final void setToastProvider(@Y61.l i iVar) {
        this.toastProvider = iVar;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int visibility) {
        if (this.f208631f) {
            visibility = 8;
        }
        super.setVisibility(visibility);
    }
}
