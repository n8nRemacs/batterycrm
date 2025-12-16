package mU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;

/* compiled from: LocalDateTimeOfFunction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU0/e;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f414533a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414534b = "LocalDateTimeOf";

    public e(@k RT0.e eVar) {
        this.f414533a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "localDate");
        String strW2 = mVar.w(zVar, "localTime");
        RT0.e eVar = this.f414533a;
        if (strW != null && strW2 != null) {
            return C36273j.e(zVar, eVar.f14449a.b(new ST0.e(strW), new ST0.g(strW2)).f14991a);
        }
        return C36273j.e(zVar, eVar.f14449a.R(mVar.h(zVar, SelectionType.TYPE_DAY), mVar.h(zVar, SelectionType.TYPE_MONTH), mVar.h(zVar, SelectionType.TYPE_YEAR), mVar.h(zVar, "hours"), mVar.h(zVar, "minutes"), mVar.s(zVar, "seconds")).f14991a);
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF414534b() {
        return this.f414534b;
    }
}
