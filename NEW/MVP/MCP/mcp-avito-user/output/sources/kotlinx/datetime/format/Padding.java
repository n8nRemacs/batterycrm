package kotlinx.datetime.format;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DateTimeFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/format/Padding;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Padding {

    /* renamed from: b, reason: collision with root package name */
    public static final Padding f412371b;

    /* renamed from: c, reason: collision with root package name */
    public static final Padding f412372c;

    /* renamed from: d, reason: collision with root package name */
    public static final Padding f412373d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Padding[] f412374e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412375f;

    static {
        Padding padding = new Padding("NONE", 0);
        f412371b = padding;
        Padding padding2 = new Padding("ZERO", 1);
        f412372c = padding2;
        Padding padding3 = new Padding("SPACE", 2);
        f412373d = padding3;
        Padding[] paddingArr = {padding, padding2, padding3};
        f412374e = paddingArr;
        f412375f = kotlin.enums.c.a(paddingArr);
    }

    public Padding() {
        throw null;
    }

    public static Padding valueOf(String str) {
        return (Padding) Enum.valueOf(Padding.class, str);
    }

    public static Padding[] values() {
        return (Padding[]) f412374e.clone();
    }
}
