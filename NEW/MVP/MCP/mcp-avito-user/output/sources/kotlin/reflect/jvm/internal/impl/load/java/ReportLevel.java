package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportLevel.kt */
/* loaded from: classes8.dex */
public final class ReportLevel {

    /* renamed from: c, reason: collision with root package name */
    public static final ReportLevel f407957c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReportLevel f407958d;

    /* renamed from: e, reason: collision with root package name */
    public static final ReportLevel f407959e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ReportLevel[] f407960f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407961g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f407962b;

    /* compiled from: ReportLevel.kt */
    @s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ReportLevel reportLevel = new ReportLevel("IGNORE", 0, "ignore");
        f407957c = reportLevel;
        ReportLevel reportLevel2 = new ReportLevel("WARN", 1, "warn");
        f407958d = reportLevel2;
        ReportLevel reportLevel3 = new ReportLevel("STRICT", 2, "strict");
        f407959e = reportLevel3;
        ReportLevel[] reportLevelArr = {reportLevel, reportLevel2, reportLevel3};
        f407960f = reportLevelArr;
        f407961g = kotlin.enums.c.a(reportLevelArr);
        new a(null);
    }

    public ReportLevel(String str, int i12, String str2) {
        this.f407962b = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) f407960f.clone();
    }
}
