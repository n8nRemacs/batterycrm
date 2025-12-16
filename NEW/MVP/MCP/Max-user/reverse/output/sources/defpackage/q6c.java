package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q6c extends LinearLayout {
    public final boolean a;

    public q6c(Context context, boolean z) {
        super(context);
        this.a = z;
        setElevation(vw4.d().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
        setOrientation(1);
        float f = 4;
        setPadding(getPaddingLeft(), kti.d(vw4.d().getDisplayMetrics().density * f), getPaddingRight(), kti.d(f * vw4.d().getDisplayMetrics().density));
        tqi.c(new kga(context, (Continuation) null, 11), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yeb getCurrentTheme() {
        v1a v1aVar = a93.s0;
        return this.a ? v1aVar.B(this).c : v1aVar.y(this);
    }
}
