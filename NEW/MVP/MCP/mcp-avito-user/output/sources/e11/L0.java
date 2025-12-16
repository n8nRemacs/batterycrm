package e11;

import android.content.Context;

/* loaded from: classes7.dex */
public class L0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394399a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394400b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394401c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final R1 f394402d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394403e = true;

    public L0(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394399a = c39882k1;
        this.f394400b = c39901r0;
        this.f394401c = context;
        this.f394402d = new R1(c39882k1, c39901r0, context);
    }

    public final void a(@j.N String str, @j.N String str2) {
        if (this.f394403e) {
            C39882k1 c39882k1 = this.f394399a;
            String str3 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0("Required field");
            c39866f0.f394595b = str;
            c39866f0.f394596c = this.f394400b.f394772i;
            c39866f0.f394598e = str2;
            if (str3 == null) {
                str3 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str3;
            c39866f0.a(this.f394401c);
        }
    }
}
