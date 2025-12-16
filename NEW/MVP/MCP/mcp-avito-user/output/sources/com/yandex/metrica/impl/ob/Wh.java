package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes7.dex */
public final class Wh {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private Xh f379820a = new Xh();

    @Y61.k
    public final synchronized Xh a() {
        return this.f379820a;
    }

    public final synchronized void a(@Y61.k Xh xh2) {
        this.f379820a = xh2;
    }

    @Y61.l
    public final W0 a(@Y61.k String str) {
        Boolean boolB;
        String str2;
        Xh xh2 = this.f379820a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (boolB = xh2.b()) == null) {
            return null;
        }
        boolean zBooleanValue = boolB.booleanValue();
        U0 u0C = xh2.c();
        String strA = xh2.a();
        if (zBooleanValue) {
            str2 = "true";
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "false";
        }
        return new W0(str2, u0C, strA);
    }

    public final synchronized void a(@Y61.k List<String> list, @Y61.k Map<String, W0> map) {
        Boolean boolB;
        String str;
        try {
            for (String str2 : list) {
                if (str2.hashCode() == 949037879 && str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (boolB = this.f379820a.b()) != null) {
                    boolean zBooleanValue = boolB.booleanValue();
                    U0 u0C = this.f379820a.c();
                    String strA = this.f379820a.a();
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "false";
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new W0(str, u0C, strA));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
