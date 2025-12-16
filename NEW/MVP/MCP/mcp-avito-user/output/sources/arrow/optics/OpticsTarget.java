package arrow.optics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: optics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Larrow/optics/OpticsTarget;", "", "arrow-annotations"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class OpticsTarget {

    /* renamed from: b, reason: collision with root package name */
    public static final OpticsTarget f56293b;

    /* renamed from: c, reason: collision with root package name */
    public static final OpticsTarget f56294c;

    /* renamed from: d, reason: collision with root package name */
    public static final OpticsTarget f56295d;

    /* renamed from: e, reason: collision with root package name */
    public static final OpticsTarget f56296e;

    /* renamed from: f, reason: collision with root package name */
    public static final OpticsTarget f56297f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ OpticsTarget[] f56298g;

    static {
        OpticsTarget opticsTarget = new OpticsTarget("ISO", 0);
        f56293b = opticsTarget;
        OpticsTarget opticsTarget2 = new OpticsTarget("LENS", 1);
        f56294c = opticsTarget2;
        OpticsTarget opticsTarget3 = new OpticsTarget("PRISM", 2);
        f56295d = opticsTarget3;
        OpticsTarget opticsTarget4 = new OpticsTarget("OPTIONAL", 3);
        f56296e = opticsTarget4;
        OpticsTarget opticsTarget5 = new OpticsTarget("DSL", 4);
        f56297f = opticsTarget5;
        f56298g = new OpticsTarget[]{opticsTarget, opticsTarget2, opticsTarget3, opticsTarget4, opticsTarget5};
    }

    public OpticsTarget() {
        throw null;
    }

    public static OpticsTarget valueOf(String str) {
        return (OpticsTarget) Enum.valueOf(OpticsTarget.class, str);
    }

    public static OpticsTarget[] values() {
        return (OpticsTarget[]) f56298g.clone();
    }
}
