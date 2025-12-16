package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.v3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39185v3 implements InterfaceC39110s0<a, a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a f382029a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final List<a> f382030b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public static final class a implements InterfaceC39182v0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final Map<String, String> f382031a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final EnumC39158u0 f382032b;

        public a(@Y61.l Map<String, String> map, @Y61.k EnumC39158u0 enumC39158u0) {
            this.f382031a = map;
            this.f382032b = enumC39158u0;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39182v0
        @Y61.k
        public EnumC39158u0 a() {
            return this.f382032b;
        }

        @Y61.l
        public final Map<String, String> b() {
            return this.f382031a;
        }

        public boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f382031a, aVar.f382031a) && kotlin.jvm.internal.L.f(this.f382032b, aVar.f382032b);
        }

        public int hashCode() {
            Map<String, String> map = this.f382031a;
            int iHashCode = (map != null ? map.hashCode() : 0) * 31;
            EnumC39158u0 enumC39158u0 = this.f382032b;
            return iHashCode + (enumC39158u0 != null ? enumC39158u0.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "Candidate(clids=" + this.f382031a + ", source=" + this.f382032b + ")";
        }
    }

    public C39185v3(@Y61.k a aVar, @Y61.k List<a> list) {
        this.f382029a = aVar;
        this.f382030b = list;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39110s0
    @Y61.k
    public List<a> a() {
        return this.f382030b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39110s0
    public a b() {
        return this.f382029a;
    }

    @Y61.k
    public a c() {
        return this.f382029a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39185v3)) {
            return false;
        }
        C39185v3 c39185v3 = (C39185v3) obj;
        return kotlin.jvm.internal.L.f(this.f382029a, c39185v3.f382029a) && kotlin.jvm.internal.L.f(this.f382030b, c39185v3.f382030b);
    }

    public int hashCode() {
        a aVar = this.f382029a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.f382030b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "ClidsInfo(chosen=" + this.f382029a + ", candidates=" + this.f382030b + ")";
    }
}
