package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378197a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38724c9 f378198b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f378199c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38987mn f378200d;

    public H(@j.N Context context, @j.N C38724c9 c38724c9) {
        this(context, c38724c9, context.getPackageName(), new C38987mn());
    }

    @j.N
    public List<String> a() {
        Signature[] apkContentsSigners;
        String strReplaceAll;
        List<String> listH = this.f378198b.h();
        boolean zIsEmpty = listH.isEmpty();
        List<String> list = listH;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (A2.a(28)) {
                    SigningInfo signingInfo = this.f378200d.b(this.f378197a, this.f378199c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f378200d.b(this.f378197a, this.f378199c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            strReplaceAll = C38689b.a(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            strReplaceAll = null;
                        }
                        if (strReplaceAll != null) {
                            arrayList.add(strReplaceAll);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f378198b.a(arrayList).d();
                list = arrayList;
            }
        }
        return list;
    }

    @j.k0
    public H(@j.N Context context, @j.N C38724c9 c38724c9, @j.N String str, @j.N C38987mn c38987mn) {
        this.f378197a = context;
        this.f378198b = c38724c9;
        this.f378199c = str;
        this.f378200d = c38987mn;
    }
}
