package com.avito.android.home;

import android.content.Context;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.remote.model.ParametrizedEvent;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PhoneCallLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/w;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PhoneLink$Call;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w extends AbstractC40161a<PhoneLink.Call> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f162529f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f162530g;

    @Inject
    public w(@Y61.k Context context, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f162529f = context;
        this.f162530g = aVar;
    }

    public static o8.q k(Bundle bundle, boolean z12) {
        String string;
        if (bundle == null || !bundle.containsKey("key_advert_id") || !bundle.containsKey("key_source_name") || (string = bundle.getString("key_advert_id")) == null) {
            return null;
        }
        String string2 = bundle.getString("key_category_id");
        String string3 = bundle.getString("key_microcategory_id");
        String string4 = bundle.getString("key_source_name");
        if (string4 == null) {
            return null;
        }
        return new o8.q(string, string4, z12, string2, string3);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ParametrizedEvent parametrizedEvent;
        ParametrizedEvent parametrizedEvent2;
        PhoneLink.Call call = (PhoneLink.Call) deepLink;
        boolean z12 = bundle != null ? bundle.getBoolean("show_dialog_if_error", true) : true;
        PhoneLink.a aVar = PhoneLink.a.f133576b;
        o8.q qVarK = k(bundle, true);
        if (qVarK != null) {
            ParametrizedClickStreamEvent parametrizedClickStreamEvent = qVarK.f419441b;
            parametrizedEvent = new ParametrizedEvent(parametrizedClickStreamEvent.f90247b, parametrizedClickStreamEvent.f90248c, parametrizedClickStreamEvent.f90249d);
        } else {
            parametrizedEvent = null;
        }
        o8.q qVarK2 = k(bundle, false);
        if (qVarK2 != null) {
            ParametrizedClickStreamEvent parametrizedClickStreamEvent2 = qVarK2.f419441b;
            parametrizedEvent2 = new ParametrizedEvent(parametrizedClickStreamEvent2.f90247b, parametrizedClickStreamEvent2.f90248c, parametrizedClickStreamEvent2.f90249d);
        } else {
            parametrizedEvent2 = null;
        }
        i(aVar, this.f162530g, new GsmCallStartLink(call.f133574c, parametrizedEvent, parametrizedEvent2, z12 ? new ToastMessageLink(this.f162529f.getString(R.string.cant_do_call), null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null) : null, null, null, 48, null));
    }
}
