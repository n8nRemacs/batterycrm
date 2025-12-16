package nU0;

import ST0.g;
import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;

/* compiled from: LocalTimeFormatFunction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnU0/b;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nU0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44335b extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f415151a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f415152b = "LocalTimeFormat";

    public C44335b(@k RT0.e eVar) {
        this.f415151a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        String strL = mVar.l(zVar, "value");
        String strW = mVar.w(zVar, "format");
        if (strW == null) {
            strW = "HH:mm";
        }
        String strW2 = mVar.w(zVar, "localeLanguage");
        if (strW2 == null) {
            strW2 = "ru";
        }
        String strW3 = mVar.w(zVar, "localeCountry");
        if (strW3 == null) {
            strW3 = "RU";
        }
        return C36273j.e(zVar, this.f415151a.f14452d.d(new g(strL), strW, strW2, strW3));
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF415152b() {
        return this.f415152b;
    }
}
