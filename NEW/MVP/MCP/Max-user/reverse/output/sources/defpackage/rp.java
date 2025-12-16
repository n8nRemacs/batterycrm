package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class rp extends qp {
    @Override // defpackage.qp, defpackage.sp
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.sp
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
