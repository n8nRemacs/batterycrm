package com.vk.api.sdk;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: VKMethodCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/z;", "", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f366752a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f366753b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f366754c;

    /* renamed from: d, reason: collision with root package name */
    public final int f366755d;

    /* compiled from: VKMethodCall.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/z$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public String f366756a = "";

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f366757b = "";

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f366758c = new LinkedHashMap();

        /* renamed from: d, reason: collision with root package name */
        public final int f366759d = 4;
    }

    /* compiled from: VKMethodCall.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/z$b;", "", "<init>", "()V", "", "DEFAULT_RETRY_COUNT", "I", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public z(@Y61.k a aVar) {
        if (C43066x.K(aVar.f366756a)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (C43066x.K(aVar.f366757b)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.f366752a = aVar.f366756a;
        this.f366753b = aVar.f366757b;
        this.f366754c = aVar.f366758c;
        this.f366755d = aVar.f366759d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.vk.api.sdk.VKMethodCall");
        }
        z zVar = (z) obj;
        return L.f(this.f366752a, zVar.f366752a) && L.f(this.f366754c, zVar.f366754c);
    }

    public final int hashCode() {
        return this.f366754c.hashCode() + (this.f366752a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VKMethodCall(method='");
        sb2.append(this.f366752a);
        sb2.append("', args=");
        return org.webrtc.h.e(sb2, this.f366754c, ')');
    }
}
