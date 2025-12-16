package kotlin.reflect;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KVariance;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class KVariance {

    /* renamed from: b, reason: collision with root package name */
    public static final KVariance f406947b;

    /* renamed from: c, reason: collision with root package name */
    public static final KVariance f406948c;

    /* renamed from: d, reason: collision with root package name */
    public static final KVariance f406949d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KVariance[] f406950e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f406951f;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        f406947b = kVariance;
        KVariance kVariance2 = new KVariance("IN", 1);
        f406948c = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        f406949d = kVariance3;
        KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        f406950e = kVarianceArr;
        f406951f = kotlin.enums.c.a(kVarianceArr);
    }

    public KVariance() {
        throw null;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f406950e.clone();
    }
}
