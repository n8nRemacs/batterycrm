package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.impl.r2;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class oe<T> extends fa1<n2, AdResponse<T>> {

    /* renamed from: A, reason: collision with root package name */
    @j.N
    final q5 f388496A;

    /* renamed from: u, reason: collision with root package name */
    private final String f388497u;

    /* renamed from: v, reason: collision with root package name */
    private final Context f388498v;

    /* renamed from: w, reason: collision with root package name */
    private final n2 f388499w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    private final l3 f388500x;

    /* renamed from: y, reason: collision with root package name */
    @j.N
    private final ep0<T> f388501y;

    /* renamed from: z, reason: collision with root package name */
    @j.N
    private final j31 f388502z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(@j.N Context context, @j.N j31 j31Var, @j.N n2 n2Var, @j.N String str, @j.N String str2, @j.N ep0 ep0Var, @j.N df.a aVar, @j.N te teVar) {
        super(context, 1, str, aVar, n2Var, teVar);
        n2Var.j().getClass();
        this.f388496A = new q5();
        a(context, n2Var.i());
        this.f388497u = str2;
        this.f388499w = n2Var;
        this.f388498v = context.getApplicationContext();
        this.f388501y = ep0Var;
        this.f388502z = j31Var;
        this.f388500x = new l3();
    }

    @Override // com.yandex.mobile.ads.impl.fa1
    public final kz0<AdResponse<T>> a(@j.N zo0 zo0Var, int i12) {
        if (b(zo0Var, i12)) {
            Map<String, String> map = zo0Var.f392317c;
            y6 y6VarA = y6.a(map.get(i10.b(4)));
            if (y6VarA == this.f388499w.b()) {
                sk1 sk1VarA = this.f388501y.a(this.f388498v, this.f388499w);
                this.f388502z.a(map.get(i10.b(34)));
                AdResponse<T> adResponseA = sk1VarA.a(zo0Var, map, y6VarA);
                if (204 != i12) {
                    return kz0.a(adResponseA, j10.a(zo0Var));
                }
            }
        }
        int i13 = r2.f389360c;
        return kz0.a(r2.a.a(zo0Var));
    }

    @j.k0
    public boolean b(@j.N zo0 zo0Var, int i12) {
        byte[] bArr;
        return 200 == i12 && (bArr = zo0Var.f392316b) != null && bArr.length > 0;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final Map<String, String> f() {
        HashMap map = new HashMap();
        String strA = this.f388502z.a();
        if (strA != null) {
            map.put(i10.b(34), strA);
        }
        map.put(i10.b(35), this.f388500x.b(this.f388498v));
        map.put(i10.b(36), this.f388500x.a(this.f388498v));
        map.putAll(this.f388499w.j().c());
        k10.a(this.f388498v, map);
        return map;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final String m() {
        StringBuilder sb2 = new StringBuilder();
        if (g() == 0) {
            sb2.append(this.f388497u);
        }
        List<kw0> listE = this.f388499w.j().e();
        if (sb2.length() != 0 && listE.size() > 0) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        for (int i12 = 0; i12 < listE.size(); i12++) {
            if (i12 != 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            listE.get(i12).getClass();
            sb2.append("null=null");
        }
        return Uri.parse(super.m()).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }

    @Override // com.yandex.mobile.ads.impl.fa1, com.yandex.mobile.ads.impl.qy0
    public final ok1 b(ok1 ok1Var) {
        zo0 zo0Var = ok1Var.f388568a;
        int i12 = r2.f389360c;
        return super.b((ok1) r2.a.a(zo0Var));
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final byte[] b() {
        if (1 == g()) {
            try {
                String str = this.f388497u;
                if (str != null) {
                    return str.getBytes(Constants.ENCODING);
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    public oe(@j.N Context context, @j.N n2 n2Var, @j.N String str, @j.N String str2, @j.N ep0 ep0Var, @j.N df.a aVar, @j.N te teVar) {
        this(context, j31.a(context), n2Var, str, str2, ep0Var, aVar, teVar);
    }

    private void a(@j.N Context context, @j.N int i12) {
        a(this.f388496A.a(context, i12));
    }
}
