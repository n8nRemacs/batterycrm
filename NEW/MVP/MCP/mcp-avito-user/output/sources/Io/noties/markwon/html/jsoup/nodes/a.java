package io.noties.markwon.html.jsoup.nodes;

import java.util.Map;

/* compiled from: Attribute.java */
/* loaded from: classes8.dex */
public class a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public String f401755b;

    /* renamed from: c, reason: collision with root package name */
    public String f401756c;

    /* renamed from: d, reason: collision with root package name */
    public b f401757d;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f401755b;
        String str2 = this.f401755b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = this.f401756c;
        String str4 = aVar.f401756c;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f401755b;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f401756c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f401755b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f401756c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2;
        String str3 = str;
        b bVar = this.f401757d;
        String str4 = this.f401755b;
        int iA2 = bVar.a(str4);
        String str5 = "";
        if (iA2 != -1 && (str2 = bVar.f401761d[iA2]) != null) {
            str5 = str2;
        }
        int iA3 = bVar.a(str4);
        if (iA3 != -1) {
            bVar.f401761d[iA3] = str3;
        }
        this.f401756c = str3;
        return str5;
    }
}
