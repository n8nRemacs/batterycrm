package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public enum ge {
    f385727b("constant"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("ratio"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("screen_based"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("screen_orientation_based"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("mediation");


    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f385729a;

    public static final class a {
        @Y61.l
        public static ge a(@Y61.l String str) {
            for (ge geVar : ge.values()) {
                if (kotlin.jvm.internal.L.f(geVar.a(), str)) {
                    return geVar;
                }
            }
            return null;
        }
    }

    ge(String str) {
        this.f385729a = str;
    }

    @Y61.k
    public final String a() {
        return this.f385729a;
    }
}
