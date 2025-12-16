package com.avito.android.publish.analytics.events;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import yc.C50213a;

/* compiled from: PhotoPermissionAccessEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/analytics/events/PhotoPermissionAccessEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "AtType", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhotoPermissionAccessEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f232226b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoPermissionAccessEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/events/PhotoPermissionAccessEvent$AtType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AtType {

        /* renamed from: c, reason: collision with root package name */
        public static final AtType f232227c;

        /* renamed from: d, reason: collision with root package name */
        public static final AtType f232228d;

        /* renamed from: e, reason: collision with root package name */
        public static final AtType f232229e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ AtType[] f232230f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f232231g;

        /* renamed from: b, reason: collision with root package name */
        public final int f232232b;

        static {
            AtType atType = new AtType("OPEN_ACCESS", 0, 1);
            f232227c = atType;
            AtType atType2 = new AtType("OPEN_PHOTOS", 1, 2);
            f232228d = atType2;
            AtType atType3 = new AtType("CLOSE", 2, 4);
            f232229e = atType3;
            AtType[] atTypeArr = {atType, atType2, atType3};
            f232230f = atTypeArr;
            f232231g = c.a(atTypeArr);
        }

        public AtType(String str, int i12, int i13) {
            this.f232232b = i13;
        }

        public static AtType valueOf(String str) {
            return (AtType) Enum.valueOf(AtType.class, str);
        }

        public static AtType[] values() {
            return (AtType[]) f232230f.clone();
        }
    }

    public PhotoPermissionAccessEvent(@k C50213a c50213a, @k AtType atType) {
        int i12 = 8187;
        this.f232226b = new ParametrizedClickStreamEvent(i12, 3, P0.l(c50213a.a(), new Q("at", Integer.valueOf(atType.f232232b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f232226b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f232226b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f232226b.f90248c;
    }
}
