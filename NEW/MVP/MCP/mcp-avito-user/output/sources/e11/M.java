package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i11.C41211a;
import java.util.HashMap;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class M extends FrameLayout implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f394404b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final TextView f394405c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f394406d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final LinearLayout f394407e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final LinearLayout f394408f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final TextView f394409g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final C41211a f394410h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final TextView f394411i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C39924z f394412j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f394413k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final HashMap<View, Boolean> f394414l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public String f394415m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public View.OnClickListener f394416n;

    public M(@j.N Context context, @j.N C39924z c39924z, boolean z12) {
        super(context);
        this.f394414l = new HashMap<>();
        TextView textView = new TextView(context);
        this.f394404b = textView;
        this.f394405c = new TextView(context);
        TextView textView2 = new TextView(context);
        this.f394406d = textView2;
        this.f394407e = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f394409g = textView3;
        C41211a c41211a = new C41211a(context);
        this.f394410h = c41211a;
        TextView textView4 = new TextView(context);
        this.f394411i = textView4;
        this.f394408f = new LinearLayout(context);
        C39924z.m(textView, "title_text");
        C39924z.m(textView2, "description_text");
        C39924z.m(textView3, "disclaimer_text");
        C39924z.m(c41211a, "stars_view");
        C39924z.m(textView4, "votes_text");
        this.f394412j = c39924z;
        this.f394413k = z12;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        HashMap<View, Boolean> map = this.f394414l;
        if (!map.containsKey(view)) {
            return false;
        }
        if (!map.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            View.OnClickListener onClickListener = this.f394416n;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(@j.N C39884l0 c39884l0) {
        int i12;
        float f12;
        this.f394415m = c39884l0.f394714m;
        TextView textView = this.f394404b;
        textView.setText(c39884l0.f394706e);
        TextView textView2 = this.f394406d;
        textView2.setText(c39884l0.f394704c);
        float f13 = c39884l0.f394709h;
        C41211a c41211a = this.f394410h;
        c41211a.setRating(f13);
        TextView textView3 = this.f394411i;
        textView3.setText(String.valueOf(c39884l0.f394710i));
        boolean zEquals = "store".equals(c39884l0.f394714m);
        LinearLayout linearLayout = this.f394407e;
        TextView textView4 = this.f394405c;
        if (zEquals) {
            C39924z.m(textView4, "category_text");
            String str = c39884l0.f394711j;
            String str2 = c39884l0.f394712k;
            String strF = TextUtils.isEmpty(str) ? "" : androidx.camera.camera2.internal.G.f("", str);
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(str2)) {
                strF = androidx.appcompat.app.r.q(strF, ", ");
            }
            if (!TextUtils.isEmpty(str2)) {
                strF = androidx.appcompat.app.r.q(strF, str2);
            }
            if (TextUtils.isEmpty(strF)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(strF);
                textView4.setVisibility(0);
            }
            linearLayout.setVisibility(0);
            linearLayout.setGravity(16);
            if (c39884l0.f394709h > 0.0f) {
                c41211a.setVisibility(0);
                if (c39884l0.f394710i > 0) {
                    textView3.setVisibility(0);
                }
                i12 = -3355444;
            } else {
                c41211a.setVisibility(8);
            }
            textView3.setVisibility(8);
            i12 = -3355444;
        } else {
            C39924z.m(textView4, "domain_text");
            linearLayout.setVisibility(8);
            textView4.setText(c39884l0.f394713l);
            linearLayout.setVisibility(8);
            i12 = -16733198;
        }
        textView4.setTextColor(i12);
        boolean zIsEmpty = TextUtils.isEmpty(c39884l0.f394707f);
        TextView textView5 = this.f394409g;
        if (zIsEmpty) {
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            textView5.setText(c39884l0.f394707f);
        }
        if (this.f394413k) {
            textView.setTextSize(2, 32.0f);
            textView2.setTextSize(2, 24.0f);
            f12 = 18.0f;
            textView5.setTextSize(2, 18.0f);
        } else {
            textView.setTextSize(2, 20.0f);
            f12 = 16.0f;
            textView2.setTextSize(2, 16.0f);
            textView5.setTextSize(2, 14.0f);
        }
        textView4.setTextSize(2, f12);
    }
}
