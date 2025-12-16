package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogSender.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "callsBySessions", "apply", "(Ljava/util/Map;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167958b;

    public I(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167958b = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (((com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) entry.getKey()).f167936a != this.f167958b.f167936a) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
