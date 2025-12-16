package com.fasterxml.jackson.core;

import java.io.Serializable;

/* compiled from: Version.java */
/* loaded from: classes3.dex */
public class q implements Comparable<q>, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f341215h = 0;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f341216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341218d;

    /* renamed from: e, reason: collision with root package name */
    public final String f341219e;

    /* renamed from: f, reason: collision with root package name */
    public final String f341220f;

    /* renamed from: g, reason: collision with root package name */
    public final String f341221g;

    public q(int i12, int i13, int i14, String str, String str2, String str3) {
        this.f341216b = i12;
        this.f341217c = i13;
        this.f341218d = i14;
        this.f341221g = str;
        this.f341219e = str2 == null ? "" : str2;
        this.f341220f = str3 == null ? "" : str3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        q qVar2 = qVar;
        if (qVar2 == this) {
            return 0;
        }
        int iCompareTo = this.f341219e.compareTo(qVar2.f341219e);
        if (iCompareTo == 0 && (iCompareTo = this.f341220f.compareTo(qVar2.f341220f)) == 0 && (iCompareTo = this.f341216b - qVar2.f341216b) == 0 && (iCompareTo = this.f341217c - qVar2.f341217c) == 0) {
            iCompareTo = this.f341218d - qVar2.f341218d;
        }
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f341216b == this.f341216b && qVar.f341217c == this.f341217c && qVar.f341218d == this.f341218d && qVar.f341220f.equals(this.f341220f) && qVar.f341219e.equals(this.f341219e);
    }

    public final int hashCode() {
        return this.f341220f.hashCode() ^ (((this.f341219e.hashCode() + this.f341216b) - this.f341217c) + this.f341218d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341216b);
        sb2.append('.');
        sb2.append(this.f341217c);
        sb2.append('.');
        sb2.append(this.f341218d);
        String str = this.f341221g;
        if (str != null && str.length() > 0) {
            sb2.append('-');
            sb2.append(str);
        }
        return sb2.toString();
    }
}
