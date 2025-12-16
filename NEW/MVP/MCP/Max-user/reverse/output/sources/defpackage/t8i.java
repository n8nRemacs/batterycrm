package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* loaded from: classes2.dex */
public abstract class t8i implements yl {
    private final String a;
    private final String b;
    private final String c;
    private final ox7 d = rx7.a;
    private final Uri e = wm.a("log.externalLog");
    private final nm f = nm.c;
    private final int g = 2;

    public t8i(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public abstract void a(gy7 gy7Var);

    @Override // defpackage.yl
    public ox7 getOkParser() {
        return this.d;
    }

    @Override // defpackage.hm
    public int getPriority() {
        return this.g;
    }

    @Override // defpackage.hm
    public nm getScope() {
        return this.f;
    }

    @Override // defpackage.hm
    public Uri getUri() {
        return this.e;
    }

    @Override // defpackage.hm
    public boolean shouldGzip() {
        return true;
    }

    @Override // defpackage.hm
    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.hm
    public void writeParams(gy7 gy7Var) {
        gy7Var.b0(CallAnalyticsApiRequest.KEY_COLLECTOR);
        gy7Var.h(this.a);
        gy7Var.b0("data");
        gy7Var.p();
        gy7Var.b0(CallAnalyticsApiRequest.KEY_APPLICATION);
        gy7Var.h(this.b);
        gy7Var.b0(CallAnalyticsApiRequest.KEY_PLATFORM);
        gy7Var.h(this.c);
        gy7Var.b0(CallAnalyticsApiRequest.KEY_ITEMS);
        a(gy7Var);
        gy7Var.n();
    }
}
