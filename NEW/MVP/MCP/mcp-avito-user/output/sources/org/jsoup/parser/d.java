package org.jsoup.parser;

/* compiled from: ParseError.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f421219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f421220b;

    public d(int i12, String str) {
        this.f421219a = i12;
        this.f421220b = str;
    }

    public final String toString() {
        return this.f421219a + ": " + this.f421220b;
    }

    public d(int i12, String str, Object... objArr) {
        this.f421220b = String.format(str, objArr);
        this.f421219a = i12;
    }
}
