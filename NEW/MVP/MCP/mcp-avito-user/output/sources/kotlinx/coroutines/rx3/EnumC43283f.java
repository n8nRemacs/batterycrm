package kotlinx.coroutines.rx3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/f;", "", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class EnumC43283f {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC43283f f412090c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC43283f f412091d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC43283f f412092e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC43283f[] f412093f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412094g;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f412095b;

    static {
        EnumC43283f enumC43283f = new EnumC43283f("FIRST", 0, "awaitFirst");
        f412090c = enumC43283f;
        EnumC43283f enumC43283f2 = new EnumC43283f("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        f412091d = enumC43283f2;
        EnumC43283f enumC43283f3 = new EnumC43283f("LAST", 2, "awaitLast");
        EnumC43283f enumC43283f4 = new EnumC43283f("SINGLE", 3, "awaitSingle");
        f412092e = enumC43283f4;
        EnumC43283f[] enumC43283fArr = {enumC43283f, enumC43283f2, enumC43283f3, enumC43283f4};
        f412093f = enumC43283fArr;
        f412094g = kotlin.enums.c.a(enumC43283fArr);
    }

    public EnumC43283f(String str, int i12, String str2) {
        this.f412095b = str2;
    }

    public static EnumC43283f valueOf(String str) {
        return (EnumC43283f) Enum.valueOf(EnumC43283f.class, str);
    }

    public static EnumC43283f[] values() {
        return (EnumC43283f[]) f412093f.clone();
    }

    @Override // java.lang.Enum
    @Y61.k
    public final String toString() {
        return this.f412095b;
    }
}
