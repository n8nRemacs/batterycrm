package com.fasterxml.jackson.core;

/* compiled from: JsonStreamContext.java */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f341141a;

    /* renamed from: b, reason: collision with root package name */
    public int f341142b;

    public g() {
    }

    public abstract String a();

    public Object b() {
        return null;
    }

    public abstract g c();

    public final boolean d() {
        return this.f341141a == 1;
    }

    public final boolean e() {
        return this.f341141a == 2;
    }

    public final boolean f() {
        return this.f341141a == 0;
    }

    public final String h() {
        int i12 = this.f341141a;
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i12 = this.f341141a;
        if (i12 != 0) {
            if (i12 != 1) {
                sb2.append('{');
                String strA = a();
                if (strA != null) {
                    sb2.append('\"');
                    int[] iArr = com.fasterxml.jackson.core.io.b.f341151h;
                    int length = iArr.length;
                    int length2 = strA.length();
                    while (i < length2) {
                        char cCharAt = strA.charAt(i);
                        if (cCharAt >= length || iArr[cCharAt] == 0) {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append('\\');
                            int i13 = iArr[cCharAt];
                            if (i13 < 0) {
                                sb2.append("u00");
                                char[] cArr = com.fasterxml.jackson.core.io.b.f341144a;
                                sb2.append(cArr[cCharAt >> 4]);
                                sb2.append(cArr[cCharAt & 15]);
                            } else {
                                sb2.append((char) i13);
                            }
                        }
                        i++;
                    }
                    sb2.append('\"');
                } else {
                    sb2.append('?');
                }
                sb2.append('}');
            } else {
                sb2.append('[');
                int i14 = this.f341142b;
                sb2.append(i14 >= 0 ? i14 : 0);
                sb2.append(']');
            }
        } else {
            sb2.append("/");
        }
        return sb2.toString();
    }

    public g(g gVar) {
        this.f341141a = gVar.f341141a;
        this.f341142b = gVar.f341142b;
    }

    public g(int i12) {
        this.f341141a = i12;
        this.f341142b = -1;
    }

    public void g(Object obj) {
    }
}
