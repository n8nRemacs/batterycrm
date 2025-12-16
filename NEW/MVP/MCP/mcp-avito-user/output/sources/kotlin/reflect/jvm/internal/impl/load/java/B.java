package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Jsr305Settings.kt */
@s0
/* loaded from: classes8.dex */
final class B extends N implements Y41.a<String[]> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f407905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c12) {
        super(0);
        this.f407905l = c12;
    }

    @Override // Y41.a
    public final String[] invoke() {
        kotlin.collections.builders.b bVarT = C42745f0.t();
        C c12 = this.f407905l;
        bVarT.add(c12.f407906a.f407962b);
        ReportLevel reportLevel = c12.f407907b;
        if (reportLevel != null) {
            bVarT.add("under-migration:".concat(reportLevel.f407962b));
        }
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> entry : c12.f407908c.entrySet()) {
            bVarT.add("@" + entry.getKey() + ':' + entry.getValue().f407962b);
        }
        return (String[]) C42745f0.p(bVarT).toArray(new String[0]);
    }
}
