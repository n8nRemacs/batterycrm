package com.huawei.hms.push;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotifyStyle.java */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f363605b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f363606c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f363607d;

    static {
        n nVar = new n("STYLE_DEFAULT", 0);
        f363605b = nVar;
        n nVar2 = new n("STYLE_BIGTEXT", 1);
        f363606c = nVar2;
        f363607d = new n[]{nVar, nVar2, new n("STYLE_BIGPICTURE", 2), new n("STYLE_INBOX", 3)};
    }

    public n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f363607d.clone();
    }
}
