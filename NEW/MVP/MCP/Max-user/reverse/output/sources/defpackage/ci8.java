package defpackage;

import java.util.List;
import one.me.sdk.statistics.perf.utils.InvalidEventSchemaException;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final class ci8 implements ui5 {
    public final List a = ve3.j("class", "connection_type", KwsFeaturesConfigProviderImpl.URL_KEY);
    public final int b = 7;

    @Override // defpackage.ui5
    public final lqb a(yqb yqbVar, c9a c9aVar, List list, lqb lqbVar) {
        lg8 lg8Var = lg8.X;
        if (lqbVar == null) {
            for (String str : this.a) {
                if (!c9aVar.b(str)) {
                    String strH = wy1.h("LACK_REQUIRED_PROPS ", str);
                    String name = yqbVar.getClass().getName();
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null && l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, name, wy1.i("Event schema violation for metric=", yqbVar.g(), ": ", strH), null);
                    }
                    yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), strH));
                    return tqb.LACK_REQUIRED_PROPS;
                }
            }
        }
        if (lqbVar != null) {
            return lqbVar;
        }
        List listB = ue3.B(1, list);
        int i = this.b;
        if (c9aVar.b("warm_start")) {
            i--;
        }
        if (c9aVar.b("cached_dns")) {
            i--;
        }
        if (i == listB.size()) {
            return lqbVar;
        }
        String name2 = yqbVar.getClass().getName();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, name2, ho7.i("Event schema violation for metric=", yqbVar.g(), ": LACK_SPAN_COUNT"), null);
        }
        yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "LACK_SPAN_COUNT"));
        return tqb.LACK_SPAN_COUNT;
    }
}
