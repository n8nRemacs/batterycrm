package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class fyg {
    public final k18 a;

    public fyg(k18 k18Var) {
        this.a = k18Var;
    }

    public final CharSequence a(int i, String str) {
        if (str == null) {
            return null;
        }
        int i2 = i == 0 ? -1 : eyg.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 != -1) {
            if (i2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            gu5 gu5Var = (gu5) ((rt5) this.a.getValue());
            if (((Boolean) gu5Var.v.D(gu5Var, gu5.S[9])).booleanValue()) {
                if (i == 0) {
                    throw null;
                }
                Uri uri = Uri.parse(str.toString());
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (String str2 : uri.getQueryParameterNames()) {
                    if (!fni.a(str2, "utm_source")) {
                        builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
                    }
                }
                builderClearQuery.appendQueryParameter("utm_source", "trigger");
                return builderClearQuery.build().toString();
            }
        }
        return str;
    }
}
