package j01;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import n01.C44164b;
import o01.C44501b;
import y01.j;

/* compiled from: HmsInstanceId.java */
/* renamed from: j01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C42172a {

    /* renamed from: a, reason: collision with root package name */
    public Context f405418a;

    /* renamed from: b, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f405419b;

    public static C42172a a(Context context) {
        Preconditions.checkNotNull(context);
        j.g(context);
        C42172a c42172a = new C42172a();
        c42172a.f405418a = context.getApplicationContext();
        new C44501b(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            c42172a.f405419b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new C44164b());
        } else {
            c42172a.f405419b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new C44164b());
        }
        c42172a.f405419b.setKitSdkVersion(60300301);
        return c42172a;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j01.C42172a.b(java.lang.String):java.lang.String");
    }
}
