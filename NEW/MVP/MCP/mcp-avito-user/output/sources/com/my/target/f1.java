package com.my.target;

import android.content.Context;
import e11.AbstractC39858c1;
import e11.C39866f0;
import e11.C39882k1;
import e11.C39901r0;
import e11.t2;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final AbstractC37789h0 f364833a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39882k1 f364834b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39901r0 f364835c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Context f364836d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final t2 f364837e;

    public interface a {
        @j.P
        AbstractC39858c1 a(@j.N JSONObject jSONObject, @j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f1(@j.N a aVar, @j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f364833a = (AbstractC37789h0) aVar;
        this.f364834b = c39882k1;
        this.f364835c = c39901r0;
        this.f364836d = context;
        this.f364837e = new t2(c39882k1, c39901r0, context);
    }

    public final void a(@j.N String str, @j.N String str2) {
        C39882k1 c39882k1 = this.f364834b;
        String str3 = c39882k1.f394643a;
        C39866f0 c39866f0 = new C39866f0(str);
        c39866f0.f394595b = str2;
        c39866f0.f394596c = this.f364835c.f394772i;
        if (str3 == null) {
            str3 = c39882k1.f394644b;
        }
        c39866f0.f394597d = str3;
        c39866f0.a(this.f364836d);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.my.target.f1$a, com.my.target.h0] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e11.X0 b(@j.N org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.f1.b(org.json.JSONObject):e11.X0");
    }
}
