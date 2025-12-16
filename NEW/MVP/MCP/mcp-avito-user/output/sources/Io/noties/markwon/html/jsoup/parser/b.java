package io.noties.markwon.html.jsoup.parser;

/* compiled from: ParseError.java */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f401795a;

    /* renamed from: b, reason: collision with root package name */
    public String f401796b;

    public b(int i12, String str, Object... objArr) {
        this.f401796b = String.format(str, objArr);
        this.f401795a = i12;
    }

    public final String toString() {
        return this.f401795a + ": " + this.f401796b;
    }
}
