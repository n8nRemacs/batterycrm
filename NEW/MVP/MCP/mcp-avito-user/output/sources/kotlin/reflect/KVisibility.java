package kotlin.reflect;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class KVisibility {

    /* renamed from: b, reason: collision with root package name */
    public static final KVisibility f406952b;

    /* renamed from: c, reason: collision with root package name */
    public static final KVisibility f406953c;

    /* renamed from: d, reason: collision with root package name */
    public static final KVisibility f406954d;

    /* renamed from: e, reason: collision with root package name */
    public static final KVisibility f406955e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f406956f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f406957g;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        f406952b = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        f406953c = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        f406954d = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        f406955e = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        f406956f = kVisibilityArr;
        f406957g = kotlin.enums.c.a(kVisibilityArr);
    }

    public KVisibility() {
        throw null;
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f406956f.clone();
    }
}
