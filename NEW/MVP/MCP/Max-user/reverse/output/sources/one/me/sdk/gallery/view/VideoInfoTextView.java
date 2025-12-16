package one.me.sdk.gallery.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.kti;
import defpackage.nca;
import defpackage.q1g;
import defpackage.t75;
import defpackage.uga;
import defpackage.vz2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/gallery/view/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoInfoTextView extends AppCompatTextView {
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        q1g q1gVarD;
        super(context, attributeSet, 0);
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context2 = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context2);
        }
        setTextColor(q1gVarD.t);
        vz2.d.b(this, t75.b);
        float f = 4;
        float f2 = 2;
        setPadding(kti.d(getContext().getResources().getDisplayMetrics().density * f), kti.d(getContext().getResources().getDisplayMetrics().density * f2), kti.d(getContext().getResources().getDisplayMetrics().density * f), kti.d(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(kti.d(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(uga.e(Integer.valueOf(q1gVarD.r), null, null, kti.d(16 * getContext().getResources().getDisplayMetrics().density)));
    }
}
