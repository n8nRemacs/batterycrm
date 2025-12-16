package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.networktasks.api.IParamsAppender;

/* loaded from: classes7.dex */
public class Ng implements IParamsAppender {
    @Override // com.yandex.metrica.networktasks.api.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void appendParams(@j.N Uri.Builder builder, @j.N C39289zb c39289zb) {
        a(builder, "adv_id", "limit_ad_tracking", c39289zb.a().f381928a);
        a(builder, "oaid", "limit_oaid_tracking", c39289zb.b().f381928a);
        a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", c39289zb.c().f381928a);
    }

    private void a(@j.N Uri.Builder builder, @j.N String str, @j.N String str2, @j.P C39145tb c39145tb) {
        String str3 = "";
        if (c39145tb == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
            return;
        }
        String str4 = c39145tb.f381872b;
        if (str4 == null) {
            str4 = "";
        }
        builder.appendQueryParameter(str, str4);
        Boolean bool = c39145tb.f381873c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : "0";
        }
        builder.appendQueryParameter(str2, str3);
    }
}
