package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37220m {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitcompat.g f358783a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f358784b;

    /* renamed from: c, reason: collision with root package name */
    public final C37219l f358785c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public PackageInfo f358786d;

    public C37220m(Context context, com.google.android.play.core.splitcompat.g gVar) {
        C37219l c37219l = new C37219l();
        this.f358783a = gVar;
        this.f358784b = context;
        this.f358785c = c37219l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r7.f358781a.getName().equals("manifest") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r5 = r7.f358781a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r7 = r7.f358781a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r5 = java.lang.Integer.parseInt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r7 = (java.lang.Integer.parseInt(r7) << 32) | (r5 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(androidx.camera.camera2.internal.G.f("Couldn't parse versionCodeMajor to int: ", r14.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(androidx.camera.camera2.internal.G.f("Couldn't parse versionCode to int: ", r14.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.io.File[] r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.C37220m.a(java.io.File[]):boolean");
    }

    public final boolean b(File[] fileArr) {
        X509Certificate x509Certificate;
        PackageInfo packageInfoC = c();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoC != null && packageInfoC.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfoC.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException unused) {
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                X509Certificate[][] x509CertificateArrA = g0.a(fileArr[length].getAbsolutePath());
                if (x509CertificateArrA == null || x509CertificateArrA.length == 0 || x509CertificateArrA[0].length == 0 || arrayList.isEmpty()) {
                    break;
                }
                for (X509Certificate x509Certificate2 : arrayList) {
                    for (X509Certificate[] x509CertificateArr : x509CertificateArrA) {
                        int i12 = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i12 + 1;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @j.P
    public final PackageInfo c() {
        Context context = this.f358784b;
        if (this.f358786d == null) {
            try {
                this.f358786d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f358786d;
    }
}
