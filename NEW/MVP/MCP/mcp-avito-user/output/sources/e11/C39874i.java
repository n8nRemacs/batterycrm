package e11;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: e11.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39874i extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f394609b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39922y0 f394610c;

    public C39874i(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f394609b = textView;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f394610c = c39922y0;
        C39924z c39924z = new C39924z(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(c39924z.a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(c39924z.a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(c39924z.a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(c39924z.a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int iA2 = c39924z.a(6);
        int iA3 = c39924z.a(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int iC2 = C39924z.c(32, context);
        setPadding(iA3, iA2, iA3, iA2);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        C39924z.m(c39922y0, "ctc_icon");
        addView(c39922y0, iC2, iC2);
        C39924z.m(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
