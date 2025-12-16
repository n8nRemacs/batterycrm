package e11;

import android.content.Context;

/* loaded from: classes7.dex */
public class Y0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394511a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394512b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394513c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final R1 f394514d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public String f394515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f394516f = true;

    public Y0(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394511a = c39882k1;
        this.f394512b = c39901r0;
        this.f394513c = context;
        this.f394514d = new R1(c39882k1, c39901r0, context);
    }

    public final void a(String str) {
        if (this.f394516f) {
            C39882k1 c39882k1 = this.f394511a;
            String str2 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0("Required field");
            c39866f0.f394595b = str;
            c39866f0.f394596c = this.f394512b.f394772i;
            c39866f0.f394598e = this.f394515e;
            if (str2 == null) {
                str2 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str2;
            c39866f0.a(this.f394513c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@j.N org.json.JSONObject r9, @j.N e11.Q0 r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.Y0.b(org.json.JSONObject, e11.Q0):void");
    }
}
