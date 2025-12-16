package com.yandex.metrica.identifiers;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.yandex.metrica.identifiers.impl.f;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.h;
import com.yandex.metrica.identifiers.impl.i;
import j.N;

@Keep
/* loaded from: classes7.dex */
public class AdsIdentifiersProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f377712a = 0;
    private static final h retriever = new h(null, 1);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static Bundle requestIdentifiers(@N Context context, @N Bundle bundle) {
        i iVar = (i) retriever.f377728a.get(bundle.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
        if (iVar == null) {
            return null;
        }
        g gVarA = iVar.a(context);
        Bundle bundle2 = new Bundle();
        f fVar = gVarA.f377726b;
        if (fVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("com.yandex.metrica.identifiers.extra.PROVIDER", fVar.f377722a);
            bundle3.putString("com.yandex.metrica.identifiers.extra.ID", fVar.f377723b);
            bundle3.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", fVar.f377724c.booleanValue());
            bundle2.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("com.yandex.metrica.identifiers.extra.STATUS", gVarA.f377725a.f377732b);
        bundle2.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", gVarA.f377727c);
        return bundle2;
    }
}
