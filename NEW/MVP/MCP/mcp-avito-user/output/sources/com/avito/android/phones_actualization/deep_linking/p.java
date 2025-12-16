package com.avito.android.phones_actualization.deep_linking;

import android.content.SharedPreferences;
import com.avito.android.account.E;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActualizePhonesRefreshStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/p;", "Lcom/avito/android/phones_actualization/deep_linking/o;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f216213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f216214b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f216215c;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/P1", "Lcom/google/gson/reflect/a;", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<String, ? extends Long>> {
    }

    @Inject
    public p(@Y61.k SharedPreferences sharedPreferences, @Y61.k E e12, @Y61.k Gson gson) {
        this.f216213a = sharedPreferences;
        this.f216214b = e12;
        this.f216215c = gson;
    }

    @Override // com.avito.android.phones_actualization.deep_linking.o
    public final long a() {
        Map<String, Long> mapC = c();
        String strA = this.f216214b.a();
        if (strA == null) {
            strA = "";
        }
        Long l12 = mapC.get(strA);
        if (l12 != null) {
            return l12.longValue();
        }
        return 0L;
    }

    @Override // com.avito.android.phones_actualization.deep_linking.o
    public final void b(long j12) {
        Map<String, Long> mapC = c();
        Long lValueOf = Long.valueOf(j12);
        String strA = this.f216214b.a();
        if (strA == null) {
            strA = "";
        }
        mapC.put(strA, lValueOf);
        this.f216213a.edit().putString("phones_actualization.next_refresh_by_user", this.f216215c.l(mapC)).apply();
    }

    public final Map<String, Long> c() {
        Map<String, Long> map = (Map) this.f216215c.e(this.f216213a.getString("phones_actualization.next_refresh_by_user", ""), new a().getType());
        return map == null ? new LinkedHashMap() : map;
    }
}
