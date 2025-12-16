package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p6c extends FrameLayout {
    public final boolean a;
    public Integer b;
    public AppCompatTextView c;
    public ImageView d;

    public p6c(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(kti.d(48 * vw4.d().getDisplayMetrics().density));
        tqi.c(new er(3, (Continuation) null, 11), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yeb getCurrentTheme() {
        v1a v1aVar = a93.s0;
        return this.a ? v1aVar.B(this).c : v1aVar.y(this);
    }

    public final void b(Integer num, Integer num2) {
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(iIntValue);
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().g(num2 != null ? num2.intValue() : w9b.R)));
            tqi.c(new kga(this, (Continuation) null, 9), imageView);
            this.d = imageView;
            float f = 24;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
            layoutParams.gravity = 8388627;
            layoutParams.setMarginStart(kti.d(12 * vw4.d().getDisplayMetrics().density));
            addView(this.d, layoutParams);
        }
    }

    public final void c(p6c p6cVar, s5g s5gVar, Integer num, boolean z, boolean z2) {
        Continuation continuation = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(p6cVar.getContext(), null);
        dpg.h.b(appCompatTextView, t75.b);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(s5gVar.b(appCompatTextView.getContext()));
        int iIntValue = num != null ? num.intValue() : w9b.R;
        this.b = Integer.valueOf(iIntValue);
        appCompatTextView.setTextColor(getCurrentTheme().g(iIntValue));
        tqi.c(new kga(this, continuation, 10), appCompatTextView);
        this.c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? kti.d(48 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(kti.d(12 * vw4.d().getDisplayMetrics().density));
        float f = 4;
        layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        p6cVar.addView(this.c, layoutParams);
    }
}
