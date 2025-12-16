package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ExceptionCode;
import com.yandex.mobile.ads.impl.tk1;
import java.util.Map;
import java.util.Random;

/* loaded from: classes8.dex */
public final class nd1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final lw0 f388223a = new lw0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wy0 f388224b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ck f388225c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final e31 f388226d;

    public nd1() {
        wy0 wy0Var = new wy0();
        this.f388224b = wy0Var;
        this.f388225c = new ck(wy0Var);
        this.f388226d = new e31();
    }

    @j.N
    public final bd1 a(@j.N Context context, @j.N n2 n2Var, @j.N md1 md1Var, @j.N Object obj, @j.N fd1 fd1Var) {
        m5 m5Var = new m5(md1Var.a());
        qd1 qd1Var = new qd1(m5Var);
        Uri.Builder builderAppendQueryParameter = Uri.parse(m5Var.a().a()).buildUpon().appendQueryParameter("charset", Constants.ENCODING);
        this.f388223a.getClass();
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("rnd", Integer.toString(new Random().nextInt(89999999) + ExceptionCode.CRASH_EXCEPTION));
        ts tsVarJ = n2Var.j();
        wy0 wy0Var = this.f388224b;
        Map<String, String> mapB = md1Var.b();
        wy0Var.getClass();
        if (mapB != null) {
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    wy0.a(builderAppendQueryParameter2, key, value);
                }
            }
        }
        wy0 wy0Var2 = this.f388224b;
        String strE = m5Var.e();
        wy0Var2.getClass();
        wy0.a(builderAppendQueryParameter2, "video-session-id", strE);
        this.f388226d.getClass();
        if (!e31.a(context)) {
            wy0 wy0Var3 = this.f388224b;
            String strF = tsVarJ.f();
            wy0Var3.getClass();
            wy0.a(builderAppendQueryParameter2, "uuid", strF);
            wy0 wy0Var4 = this.f388224b;
            String strD = tsVarJ.d();
            wy0Var4.getClass();
            wy0.a(builderAppendQueryParameter2, "mauid", strD);
        }
        this.f388225c.a(context, builderAppendQueryParameter2);
        new vs(context, n2Var).a(context, builderAppendQueryParameter2);
        bd1 bd1Var = new bd1(context, builderAppendQueryParameter2.build().toString(), new tk1.b(fd1Var), md1Var, qd1Var);
        bd1Var.b(obj);
        return bd1Var;
    }
}
