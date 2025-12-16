package cU0;

import Y61.k;
import com.avito.beduin.v2.functions.base.C36286f0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FunctionsRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LcU0/c;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27105c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, InterfaceC27104b> f57901a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27104b f57902b;

    /* compiled from: FunctionsRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU0/c$a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cU0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C36286f0 f57903a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f57904b;

        public a() {
            throw null;
        }

        public a(@k C36286f0 c36286f0) {
            Map mapC = P0.c();
            this.f57903a = c36286f0;
            this.f57904b = new LinkedHashMap(mapC);
        }

        @k
        public final void a(@k InterfaceC27104b interfaceC27104b) {
            this.f57904b.put(interfaceC27104b.getType(), interfaceC27104b);
        }
    }

    public C27105c() {
        throw null;
    }

    public C27105c(Map map, InterfaceC27104b interfaceC27104b, C42822w c42822w) {
        this.f57901a = map;
        this.f57902b = interfaceC27104b;
    }
}
