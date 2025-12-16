package oX0;

import java.util.HashSet;

/* compiled from: DupDetector.java */
/* renamed from: oX0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44702b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f419816a;

    /* renamed from: b, reason: collision with root package name */
    public String f419817b;

    /* renamed from: c, reason: collision with root package name */
    public String f419818c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet<String> f419819d;

    public C44702b(Object obj) {
        this.f419816a = obj;
    }

    public final C44702b a() {
        return new C44702b(this.f419816a);
    }

    public final boolean b(String str) {
        String str2 = this.f419817b;
        if (str2 == null) {
            this.f419817b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f419818c;
        if (str3 == null) {
            this.f419818c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f419819d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.f419819d = hashSet;
            hashSet.add(this.f419817b);
            this.f419819d.add(this.f419818c);
        }
        return !this.f419819d.add(str);
    }
}
