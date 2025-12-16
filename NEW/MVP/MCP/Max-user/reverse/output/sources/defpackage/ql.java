package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.api.session.ApiSessionChangedException;

/* loaded from: classes2.dex */
public final class ql implements ml {
    public final sl a;
    public final wl b;
    public final pm c;

    public ql(sl slVar, h79 h79Var, pm pmVar) {
        this.a = slVar;
        this.b = h79Var;
        this.c = pmVar;
    }

    @Override // defpackage.ml
    public final Object a(yl ylVar) throws ApiInvocationException {
        om scopeAfter = ylVar.getScopeAfter();
        om omVar = om.a;
        wl wlVar = this.b;
        if (scopeAfter == omVar) {
            return c(ylVar, wlVar);
        }
        uid uidVar = new uid();
        uidVar.a = null;
        uid uidVar2 = new uid();
        wlVar.s(new ol(uidVar, this, ylVar, uidVar2));
        ApiInvocationException apiInvocationException = (ApiInvocationException) uidVar2.a;
        if (apiInvocationException == null) {
            return uidVar.a;
        }
        throw apiInvocationException;
    }

    public final tl b(nm nmVar, wl wlVar, String str, ApiInvocationException apiInvocationException) throws Throwable {
        String str2;
        tl tlVarF = wlVar.f();
        if (nmVar == nm.d) {
            tlVarF.getClass();
            throw new ApiScopeException("No user for session", apiInvocationException);
        }
        if (nmVar != nm.c || ((str2 = tlVarF.c) != null && !str2.equals(str))) {
            return tlVarF;
        }
        uid uidVar = new uid();
        uid uidVar2 = new uid();
        wlVar.s(new pl(str, nmVar, this, apiInvocationException, uidVar2, uidVar));
        Throwable th = (Throwable) uidVar2.a;
        if (th == null) {
            return (tl) uidVar.a;
        }
        throw th;
    }

    public final Object c(yl ylVar, wl wlVar) throws Throwable {
        tl tlVarB = b(ylVar.getScope(), wlVar, null, null);
        try {
            return d(ylVar, wlVar, tlVarB);
        } catch (ApiInvocationException e) {
            if (e instanceof ApiSessionChangedException) {
                ApiSessionChangedException apiSessionChangedException = (ApiSessionChangedException) e;
                return d(ylVar, wlVar, wlVar.s(new nl(tlVarB.c, apiSessionChangedException.Y, apiSessionChangedException.Z, 0)));
            }
            int i = e.a;
            if (i == 103 || i == 102) {
                return d(ylVar, wlVar, b(ylVar.getScope(), wlVar, tlVarB.c, e));
            }
            if (i == 401) {
                tlVarB.getClass();
            }
            throw e;
        }
    }

    public final Object d(yl ylVar, wl wlVar, tl tlVar) throws IOException, ApiException {
        Object objA = ((kob) this.a).a(ylVar, tlVar);
        if (ylVar.getScopeAfter() != om.a) {
            wlVar.i(ylVar.getConfigExtractor().f(tlVar, objA));
        }
        return objA;
    }
}
