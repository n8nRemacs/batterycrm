package com.huawei.updatesdk.a.a.d;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private int f363757b = 1024;

    /* renamed from: c, reason: collision with root package name */
    private int f363758c = 0;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f363756a = new byte[1024];

    public String a() {
        int i12 = this.f363758c;
        if (i12 <= 0) {
            return null;
        }
        try {
            return new String(this.f363756a, 0, i12, Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i12 = 0;
        for (byte b12 : bArr) {
            int i13 = i12 + 1;
            cArr2[i12] = cArr[(b12 >>> 4) & 15];
            i12 += 2;
            cArr2[i13] = cArr[b12 & 15];
        }
        return String.valueOf(cArr2);
    }

    public void a(byte[] bArr, int i12) {
        if (i12 <= 0) {
            return;
        }
        byte[] bArr2 = this.f363756a;
        int length = bArr2.length;
        int i13 = this.f363758c;
        if (length - i13 >= i12) {
            System.arraycopy(bArr, 0, bArr2, i13, i12);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i12) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i13);
            System.arraycopy(bArr, 0, bArr3, this.f363758c, i12);
            this.f363756a = bArr3;
        }
        this.f363758c += i12;
    }
}
