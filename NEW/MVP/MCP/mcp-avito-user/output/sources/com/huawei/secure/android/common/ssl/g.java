package com.huawei.secure.android.common.ssl;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f363725a = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f363726b = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    public static void a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        String[] strArr = f363725a;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (listAsList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            return;
        }
        String[] strArr2 = f363726b;
        String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : enabledCipherSuites2) {
            String upperCase = str2.toUpperCase(Locale.ENGLISH);
            int i12 = 0;
            while (true) {
                if (i12 >= 16) {
                    arrayList2.add(str2);
                    break;
                } else if (upperCase.contains(strArr2[i12].toUpperCase(Locale.ENGLISH))) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static void b(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
        }
        if (i12 < 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        }
    }

    public static SSLContext c() {
        return Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
    }
}
