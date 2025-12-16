package com.yandex.div.core.state;

import com.yandex.div.core.dagger.z;
import j.InterfaceC42148d;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TemporaryDivStateCache.kt */
@z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/state/n;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f367671a = new LinkedHashMap();

    @Inject
    public n() {
    }

    @InterfaceC42148d
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        synchronized (this.f367671a) {
            try {
                LinkedHashMap linkedHashMap = this.f367671a;
                Object linkedHashMap2 = linkedHashMap.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(str, linkedHashMap2);
                }
                ((Map) linkedHashMap2).put(str2, str3);
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
