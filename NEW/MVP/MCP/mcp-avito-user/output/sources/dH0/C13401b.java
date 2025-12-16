package Dh0;

import Y61.k;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingReviewUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating-ui_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13401b {
    public static final void a(@k FrameLayout frameLayout, @k TextView textView, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        frameLayout.setBackground(d.getDrawable(frameLayout.getContext(), R.drawable.review_item_status_background));
        frameLayout.setBackgroundTintList(ColorStateList.valueOf(i12));
        frameLayout.setPadding(y6.b(8), y6.b(4), y6.b(8), y6.b(5));
        textView.setTextAppearance(C35835l0.j(R.attr.textS20, textView.getContext()));
        textView.setTextColor(i13);
    }

    public static final void b(@k FrameLayout frameLayout, @k TextView textView, @InterfaceC42156l int i12) {
        frameLayout.setBackground(null);
        frameLayout.setBackgroundTintList(null);
        int iB2 = y6.b(0);
        frameLayout.setPadding(iB2, iB2, iB2, iB2);
        textView.setTextAppearance(C35835l0.j(R.attr.textM10, textView.getContext()));
        textView.setTextColor(i12);
    }
}
