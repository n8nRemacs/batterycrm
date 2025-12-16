package com.fasterxml.jackson.core;

import com.adjust.sdk.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;
import java.nio.charset.Charset;

/* compiled from: JsonLocation.java */
/* loaded from: classes3.dex */
public class e implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final e f341122h = new e(com.fasterxml.jackson.core.io.d.f341155f, -1, -1, -1, -1);
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final long f341123b;

    /* renamed from: c, reason: collision with root package name */
    public final long f341124c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341125d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341126e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.d f341127f;

    /* renamed from: g, reason: collision with root package name */
    public transient String f341128g;

    public e(com.fasterxml.jackson.core.io.d dVar, long j12, long j13, int i12, int i13) {
        this.f341127f = dVar == null ? com.fasterxml.jackson.core.io.d.f341155f : dVar;
        this.f341123b = j12;
        this.f341124c = j13;
        this.f341125d = i12;
        this.f341126e = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        com.fasterxml.jackson.core.io.d dVar = eVar.f341127f;
        com.fasterxml.jackson.core.io.d dVar2 = this.f341127f;
        if (dVar2 == null) {
            if (dVar != null) {
                return false;
            }
        } else if (!dVar2.equals(dVar)) {
            return false;
        }
        return this.f341125d == eVar.f341125d && this.f341126e == eVar.f341126e && this.f341124c == eVar.f341124c && this.f341123b == eVar.f341123b;
    }

    public final int hashCode() {
        return ((((this.f341127f == null ? 1 : 2) ^ this.f341125d) + this.f341126e) ^ ((int) this.f341124c)) + ((int) this.f341123b);
    }

    public final String toString() {
        String str;
        String str2 = this.f341128g;
        com.fasterxml.jackson.core.io.d dVar = this.f341127f;
        boolean z12 = dVar.f341159e;
        if (str2 == null) {
            StringBuilder sb2 = new StringBuilder(200);
            Object obj = dVar.f341156b;
            if (obj == null) {
                sb2.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            } else {
                Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                String name = cls.getName();
                if (name.startsWith("java.")) {
                    name = cls.getSimpleName();
                } else if (obj instanceof byte[]) {
                    name = "byte[]";
                } else if (obj instanceof char[]) {
                    name = "char[]";
                }
                sb2.append('(');
                sb2.append(name);
                sb2.append(')');
                int length = dVar.f341158d;
                if (z12) {
                    int[] iArr = {dVar.f341157c, length};
                    String str3 = " chars";
                    if (obj instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj;
                        com.fasterxml.jackson.core.io.d.a(charSequence.length(), iArr);
                        int i12 = iArr[0];
                        str = charSequence.subSequence(i12, Math.min(iArr[1], 500) + i12).toString();
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        com.fasterxml.jackson.core.io.d.a(cArr.length, iArr);
                        str = new String(cArr, iArr[0], Math.min(iArr[1], 500));
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        com.fasterxml.jackson.core.io.d.a(bArr.length, iArr);
                        str3 = " bytes";
                        str = new String(bArr, iArr[0], Math.min(iArr[1], 500), Charset.forName(Constants.ENCODING));
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb2.append('\"');
                        int length2 = str.length();
                        for (int i13 = 0; i13 < length2; i13++) {
                            char cCharAt = str.charAt(i13);
                            if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                                sb2.append(cCharAt);
                            } else {
                                sb2.append("\\u");
                                char[] cArr2 = com.fasterxml.jackson.core.io.b.f341144a;
                                sb2.append(cArr2[(cCharAt >> '\f') & 15]);
                                sb2.append(cArr2[(cCharAt >> '\b') & 15]);
                                sb2.append(cArr2[(cCharAt >> 4) & 15]);
                                sb2.append(cArr2[cCharAt & 15]);
                            }
                        }
                        sb2.append('\"');
                        if (iArr[1] > 500) {
                            sb2.append("[truncated ");
                            sb2.append(iArr[1] - 500);
                            sb2.append(str3);
                            sb2.append(']');
                        }
                    }
                } else if (obj instanceof byte[]) {
                    if (length < 0) {
                        length = ((byte[]) obj).length;
                    }
                    sb2.append('[');
                    sb2.append(length);
                    sb2.append(" bytes]");
                }
            }
            this.f341128g = sb2.toString();
        }
        String str4 = this.f341128g;
        StringBuilder sb3 = new StringBuilder(str4.length() + 40);
        sb3.append("[Source: ");
        sb3.append(str4);
        sb3.append("; ");
        int i14 = this.f341126e;
        int i15 = this.f341125d;
        if (z12) {
            sb3.append("line: ");
            if (i15 >= 0) {
                sb3.append(i15);
            } else {
                sb3.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
            sb3.append(", column: ");
            if (i14 >= 0) {
                sb3.append(i14);
            } else {
                sb3.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
        } else if (i15 > 0) {
            sb3.append("line: ");
            sb3.append(i15);
            if (i14 > 0) {
                sb3.append(", column: ");
                sb3.append(i14);
            }
        } else {
            sb3.append("byte offset: #");
            long j12 = this.f341123b;
            if (j12 >= 0) {
                sb3.append(j12);
            } else {
                sb3.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
        }
        sb3.append(']');
        return sb3.toString();
    }
}
