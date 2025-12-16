package e11;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: classes7.dex */
public class B1 extends RelativeLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f394281j;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final r f394282b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final RelativeLayout.LayoutParams f394283c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39922y0 f394284d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final V f394285e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39924z f394286f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C39875i0 f394287g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public com.my.target.common.models.b f394288h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public com.my.target.common.models.b f394289i;

    static {
        int i12 = C39924z.f394913b;
        f394281j = View.generateViewId();
    }

    public B1(Context context) {
        super(context);
        setBackgroundColor(0);
        C39924z c39924z = new C39924z(context);
        this.f394286f = c39924z;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f394284d = c39922y0;
        int i12 = f394281j;
        c39922y0.setId(i12);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        c39922y0.setLayoutParams(layoutParams);
        C39924z.m(c39922y0, "image_view");
        addView(c39922y0);
        r rVar = new r(context);
        this.f394282b = rVar;
        rVar.a(C39898q.a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.f394283c = layoutParams2;
        layoutParams2.addRule(7, i12);
        layoutParams2.addRule(6, i12);
        rVar.setLayoutParams(layoutParams2);
        V v12 = new V(context);
        this.f394285e = v12;
        C39875i0 c39875i0 = new C39875i0(context);
        this.f394287g = c39875i0;
        c39875i0.setVisibility(8);
        int iA2 = c39924z.a(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = iA2;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(iA2, iA2, iA2, iA2);
        layoutParams4.addRule(5, i12);
        layoutParams4.addRule(6, i12);
        linearLayout.setOrientation(0);
        linearLayout.addView(v12);
        linearLayout.addView(c39875i0, layoutParams3);
        C39924z.m(rVar, "close_button");
        addView(rVar);
        C39924z.m(v12, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    public final void a() {
        Point pointK = C39924z.k(getContext());
        int i12 = pointK.x;
        int i13 = pointK.y;
        if (i12 <= 0 || i13 <= 0) {
            return;
        }
        com.my.target.common.models.b bVar = ((float) i12) / ((float) i13) > 1.0f ? this.f394289i : this.f394288h;
        if (bVar == null && (bVar = this.f394289i) == null) {
            bVar = this.f394288h;
        }
        if (bVar == null) {
            return;
        }
        this.f394284d.setImageData(bVar);
    }

    @j.N
    public r getCloseButton() {
        return this.f394282b;
    }

    @j.N
    public ImageView getImageView() {
        return this.f394284d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    public void setAgeRestrictions(@j.N String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v12 = this.f394285e;
        if (zIsEmpty) {
            v12.setVisibility(8);
            return;
        }
        v12.a(-7829368, 0);
        C39924z c39924z = this.f394286f;
        v12.setPadding(c39924z.a(2), 0, 0, 0);
        v12.setTextColor(-1118482);
        v12.a(-1118482, c39924z.a(3));
        v12.setBackgroundColor(1711276032);
        v12.setText(str);
    }
}
