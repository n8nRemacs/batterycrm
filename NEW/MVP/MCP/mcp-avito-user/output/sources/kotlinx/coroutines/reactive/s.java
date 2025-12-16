package kotlinx.coroutines.reactive;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/reactive/s;", "", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f412007c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f412008d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f412009e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f412010f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f412011g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f412012h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412013i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412014b;

    static {
        s sVar = new s("FIRST", 0, "awaitFirst");
        f412007c = sVar;
        s sVar2 = new s("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        f412008d = sVar2;
        s sVar3 = new s("LAST", 2, "awaitLast");
        f412009e = sVar3;
        s sVar4 = new s("SINGLE", 3, "awaitSingle");
        f412010f = sVar4;
        s sVar5 = new s("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
        f412011g = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
        f412012h = sVarArr;
        f412013i = kotlin.enums.c.a(sVarArr);
    }

    public s(String str, int i12, String str2) {
        this.f412014b = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f412012h.clone();
    }

    @Override // java.lang.Enum
    @Y61.k
    public final String toString() {
        return this.f412014b;
    }
}
