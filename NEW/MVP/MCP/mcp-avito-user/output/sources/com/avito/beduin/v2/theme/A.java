package com.avito.beduin.v2.theme;

import com.avito.beduin.v2.theme.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ThemesHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/theme/A;", "Lcom/avito/beduin/v2/theme/z;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f338346a;

    /* compiled from: ThemesHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/theme/A$a;", "Lcom/avito/beduin/v2/theme/z$a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements z.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f338347a;

        public a() {
            this(null, 1, null);
        }

        public a(Map map, int i12, C42822w c42822w) {
            this.f338347a = new LinkedHashMap((i12 & 1) != 0 ? P0.c() : map);
        }
    }

    public A(@Y61.k LinkedHashMap linkedHashMap) {
        this.f338346a = linkedHashMap;
    }

    @Y61.k
    public final q a(@Y61.k String str) {
        q qVar = (q) this.f338346a.get(str);
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException(AK.c.k("Theme ", str, " not found"));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && L.f(this.f338346a, ((A) obj).f338346a);
    }

    public final int hashCode() {
        return this.f338346a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return org.webrtc.h.e(new StringBuilder("ThemesRegister(stylesHolders="), this.f338346a, ')');
    }
}
