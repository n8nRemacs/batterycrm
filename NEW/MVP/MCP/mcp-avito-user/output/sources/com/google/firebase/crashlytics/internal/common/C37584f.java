package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37584f implements U {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final byte[] f360969a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f360970b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final String f360971c;

    public C37584f(@j.P byte[] bArr, @j.N String str, @j.N String str2) {
        this.f360970b = str;
        this.f360971c = str2;
        this.f360969a = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.common.U
    @j.P
    public final CrashlyticsReport.e.b a() throws IOException {
        byte[] byteArray;
        byte[] bArr = this.f360969a;
        if (bArr == null || bArr.length == 0) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        if (byteArray == null) {
            return null;
        }
        CrashlyticsReport.e.b.a aVarA = CrashlyticsReport.e.b.a();
        aVarA.b(byteArray);
        aVarA.c(this.f360970b);
        return aVarA.a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.U
    @j.N
    public final String b() {
        return this.f360971c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.U
    @j.P
    public final InputStream l() {
        byte[] bArr = this.f360969a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }
}
