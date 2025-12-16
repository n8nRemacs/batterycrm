package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.avito.android.remote.model.SearchParamsConverterKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class G3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354688b;

    public G3(C36967s3 c36967s3) {
        this.f354688b = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q5 q52 = this.f354688b.f355373n;
        I2 i22 = q52.f354865a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        if (q52.b()) {
            boolean zC2 = q52.c();
            C36967s3 c36967s3 = i22.f354724p;
            C36876f2 c36876f2 = i22.f354716h;
            if (zC2) {
                I2.d(c36876f2);
                c36876f2.f355146x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString(SearchParamsConverterKt.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                I2.b(c36967s3);
                c36967s3.c0("auto", "_cmpx", bundle);
            } else {
                I2.d(c36876f2);
                String strA = c36876f2.f355146x.a();
                if (TextUtils.isEmpty(strA)) {
                    S1 s12 = i22.f354717i;
                    I2.c(s12);
                    s12.f354890g.b("Cache still valid but referrer not found");
                } else {
                    I2.d(c36876f2);
                    long jA2 = ((c36876f2.f355147y.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA2);
                    Object obj = pair.first;
                    String str2 = obj == null ? "app" : (String) obj;
                    I2.b(c36967s3);
                    c36967s3.c0(str2, "_cmp", (Bundle) pair.second);
                }
                I2.d(c36876f2);
                c36876f2.f355146x.b(null);
            }
            I2.d(c36876f2);
            c36876f2.f355147y.b(0L);
        }
    }
}
