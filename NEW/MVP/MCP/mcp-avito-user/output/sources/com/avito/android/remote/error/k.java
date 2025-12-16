package com.avito.android.remote.error;

import com.avito.android.util.C35866p0;
import com.avito.android.util.C35983y4;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CommonErrorsParser.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/error/k;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<C35866p0> f253432a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f253433b = C42727D.c(new a());

    /* compiled from: CommonErrorsParser.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/lang/reflect/Type;", "Lcom/avito/android/util/p0;", "LX41/o;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Map<Type, C35866p0>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Type, C35866p0> invoke() {
            Set<C35866p0> set = k.this.f253432a;
            int iF2 = P0.f(C42745f0.q(set, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : set) {
                linkedHashMap.put(((C35866p0) obj).f318944a, obj);
            }
            return linkedHashMap;
        }
    }

    @Inject
    public k(@Y61.k Set<C35866p0> set) {
        this.f253432a = set;
    }

    public final boolean a(String str, Type type) {
        Set<String> setKeySet;
        Map<String, Type> map;
        if (str == null) {
            return false;
        }
        Status.f253396c.getClass();
        if (!Status.f253398e.getValue().contains(str)) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            type = C35983y4.a(type);
        }
        C35866p0 c35866p0 = (C35866p0) ((Map) this.f253433b.getValue()).get(type);
        if (c35866p0 == null || (map = c35866p0.f318945b) == null || (setKeySet = map.keySet()) == null) {
            setKeySet = B0.f406639b;
        }
        return !setKeySet.contains(str);
    }
}
