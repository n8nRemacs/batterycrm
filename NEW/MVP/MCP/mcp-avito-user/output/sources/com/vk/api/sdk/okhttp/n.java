package com.vk.api.sdk.okhttp;

import kotlin.Metadata;

/* compiled from: OkHttpExecutorConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/n;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.g f366661a;

    public n(@Y61.k com.vk.api.sdk.g gVar) {
        this.f366661a = gVar;
        com.vk.api.sdk.internal.h.f366629a.getClass();
        if (gVar.f366591a == null) {
            throw new IllegalArgumentException("context is null");
        }
        if (gVar.f366599i.getValue() == null) {
            throw new IllegalArgumentException("Illegal accessToken value");
        }
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OkHttpExecutorConfig(host='");
        com.vk.api.sdk.g gVar = this.f366661a;
        sb2.append(gVar.f366605o.invoke());
        sb2.append("', accessToken='");
        sb2.append(gVar.f366599i.getValue());
        sb2.append("', secret='");
        sb2.append((Object) gVar.f366600j.getValue());
        sb2.append("', logFilterCredentials=");
        return androidx.appcompat.app.r.x(sb2, gVar.f366602l, ')');
    }
}
