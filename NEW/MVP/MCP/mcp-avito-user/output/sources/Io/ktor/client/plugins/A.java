package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HttpClientPlugin.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/A;", "", "TConfig", "TPlugin", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface A<TConfig, TPlugin> {

    /* compiled from: HttpClientPlugin.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.k TPlugin tplugin, @Y61.k io.ktor.client.a aVar);

    @Y61.k
    TPlugin b(@Y61.k Y41.l<? super TConfig, G0> lVar);

    @Y61.k
    C41586b<TPlugin> getKey();
}
