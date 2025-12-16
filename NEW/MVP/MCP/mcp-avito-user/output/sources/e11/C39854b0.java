package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
/* renamed from: e11.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39854b0 extends RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f394528h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f394529i;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final M f394530b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Button f394531c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final V f394532d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final B0 f394533e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39924z f394534f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f394535g;

    static {
        int i12 = C39924z.f394913b;
        f394528h = View.generateViewId();
        f394529i = View.generateViewId();
    }

    public C39854b0(@j.N Context context, @j.N C39924z c39924z, boolean z12) {
        super(context);
        this.f394534f = c39924z;
        this.f394535g = z12;
        B0 b02 = new B0(context, c39924z, z12);
        this.f394533e = b02;
        C39924z.m(b02, "footer_layout");
        M m12 = new M(context, c39924z, z12);
        this.f394530b = m12;
        C39924z.m(m12, "body_layout");
        Button button = new Button(context);
        this.f394531c = button;
        C39924z.m(button, "cta_button");
        V v12 = new V(context);
        this.f394532d = v12;
        C39924z.m(v12, "age_bordering");
    }

    public void setBanner(@j.N C39884l0 c39884l0) {
        this.f394530b.setBanner(c39884l0);
        Button button = this.f394531c;
        button.setText(c39884l0.a());
        this.f394533e.setBackgroundColor(-39322);
        boolean zIsEmpty = TextUtils.isEmpty(c39884l0.f394708g);
        V v12 = this.f394532d;
        if (zIsEmpty) {
            v12.setVisibility(8);
        } else {
            v12.setText(c39884l0.f394708g);
        }
        C39924z.n(button, -16733198, -16746839, this.f394534f.a(2));
        button.setTextColor(-1);
    }
}
