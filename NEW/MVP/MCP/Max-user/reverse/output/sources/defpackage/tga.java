package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class tga extends uk0 {
    @Override // defpackage.fnd
    public final void c(rf7 rf7Var, String str, Throwable th, boolean z) {
        String message;
        if ((th instanceof IOException) && (message = th.getMessage()) != null && vmf.s(message, "code=403", false)) {
            String queryParameter = rf7Var.b.getQueryParameter("apikey");
            Integer numValueOf = queryParameter != null ? Integer.valueOf(queryParameter.hashCode()) : null;
            k18 k18Var = fq9.a;
            ((y3b) ((yi5) gq9.a.getAccessor().d(9).getValue())).a(new te2("ONEME-26284", "failed to load preview; api key hash = " + numValueOf, th.getCause()));
            String str2 = vga.G0;
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.Y;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "failed to load preview; api key hash = " + numValueOf, th);
            }
        }
    }
}
