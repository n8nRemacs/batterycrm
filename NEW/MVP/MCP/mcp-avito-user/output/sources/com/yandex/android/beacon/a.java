package com.yandex.android.beacon;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: BeaconItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/android/beacon/a;", "", "a", "b", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f367213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f367214b;

    /* renamed from: c, reason: collision with root package name */
    public final long f367215c;

    /* compiled from: BeaconItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/android/beacon/a$a;", "Lcom/yandex/android/beacon/a;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.android.beacon.a$a, reason: collision with other inner class name */
    public static final class C10851a extends a {
        @Override // com.yandex.android.beacon.a
        @Y61.l
        public final b a() {
            return null;
        }
    }

    public a(@Y61.k Uri uri, @Y61.k Map<String, String> map, @Y61.l JSONObject jSONObject, long j12) {
        this.f367213a = uri;
        this.f367214b = map;
        this.f367215c = j12;
    }

    @Y61.l
    public abstract b a();

    @Y61.k
    public final String toString() {
        return "BeaconItem{url=" + this.f367213a + ", headers=" + this.f367214b + ", addTimestamp=" + this.f367215c;
    }

    /* compiled from: BeaconItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/android/beacon/a$b;", "Lcom/yandex/android/beacon/a;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        public final long f367216d;

        public b(@Y61.k Uri uri, @Y61.k Map<String, String> map, @Y61.l JSONObject jSONObject, long j12, long j13) {
            super(uri, map, jSONObject, j12);
            this.f367216d = j13;
        }

        @Override // com.yandex.android.beacon.a
        @Y61.k
        public final b a() {
            return this;
        }
    }
}
