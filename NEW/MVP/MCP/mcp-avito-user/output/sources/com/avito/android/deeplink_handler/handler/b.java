package com.avito.android.deeplink_handler.handler;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.W;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "D", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b<D extends DeepLink> {

    /* compiled from: DeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, DeepLink deepLink, String str, Bundle bundle, int i12) {
            if ((i12 & 2) != 0) {
                str = null;
            }
            if ((i12 & 4) != 0) {
                bundle = null;
            }
            bVar.r6(bundle, deepLink, str);
        }

        @k
        public static W b(@k b bVar) {
            return bVar.V9().N(c.f134524b);
        }
    }

    @k
    z<C43501a> V9();

    @k
    W d9();

    void r6(@l Bundle bundle, @k DeepLink deepLink, @l String str);
}
