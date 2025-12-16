package mU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;

/* compiled from: LocalDateTimeIsTodayFunction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU0/c;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mU0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44017c extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f414528a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414529b = "LocalDateTimeIsToday";

    public C44017c(@k RT0.e eVar) {
        this.f414528a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) {
        return C36273j.f(zVar, this.f414528a.f14451c.N(new ST0.f(mVar.l(zVar, "value"))));
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF414529b() {
        return this.f414529b;
    }
}
