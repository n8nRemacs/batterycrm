package com.yandex.metrica;

import X41.n;
import Y61.k;
import Y61.l;
import com.yandex.metrica.impl.ob.Mf;
import com.yandex.metrica.impl.ob.P;
import j.k0;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJW\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/metrica/ModulesFacade;", "", "<init>", "()V", "", "type", "", "name", "value", "", "environment", "Lkotlin/G0;", "reportEvent", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "extras", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "key", "setSessionExtra", "(Ljava/lang/String;[B)V", "", "isActivatedForApp", "()Z", "sendEventsBuffer", "Lcom/yandex/metrica/impl/ob/Mf;", "proxy", "setProxy", "(Lcom/yandex/metrica/impl/ob/Mf;)V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class ModulesFacade {

    /* renamed from: a, reason: collision with root package name */
    public static Mf f377509a = new Mf(P.g().c());

    @n
    public static final boolean isActivatedForApp() {
        return f377509a.a();
    }

    @n
    public static final void reportEvent(int type, @k String name, @l String value, @l Map<String, String> environment) {
        reportEvent(type, name, value, environment, null);
    }

    @n
    public static final void sendEventsBuffer() {
        f377509a.getClass();
        YandexMetrica.sendEventsBuffer();
    }

    @n
    public static final void setSessionExtra(@k String key, @l byte[] value) {
        f377509a.a(key, value);
    }

    @k0
    public final void setProxy(@k Mf proxy) {
        f377509a = proxy;
    }

    @n
    public static final void reportEvent(int type, @k String name, @l String value, @l Map<String, String> environment, @l Map<String, byte[]> extras) {
        f377509a.a(type, name, value, environment, extras);
    }
}
