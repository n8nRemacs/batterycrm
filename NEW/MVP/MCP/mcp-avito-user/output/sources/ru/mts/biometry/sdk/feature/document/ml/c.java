package ru.mts.biometry.sdk.feature.document.ml;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f436445b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f436446c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f436447d;

    static {
        c cVar = new c("HORIZONTAL", 0);
        f436445b = cVar;
        c cVar2 = new c("VERTICAL", 1);
        f436446c = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f436447d = cVarArr;
        kotlin.enums.c.a(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f436447d.clone();
    }
}
