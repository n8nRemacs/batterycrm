package com.vk.api.sdk.okhttp;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: OkHttpMethodCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/okhttp/o;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f366662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f366663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap f366664c;

    /* compiled from: OkHttpMethodCall.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/okhttp/o$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public String f366665a = "";

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f366666b = "";

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final HashMap f366667c = new HashMap();
    }

    public o(@Y61.k a aVar) {
        if (C43066x.K(aVar.f366665a)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (C43066x.K(aVar.f366666b)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.f366662a = aVar.f366665a;
        this.f366663b = aVar.f366666b;
        this.f366664c = aVar.f366667c;
    }
}
