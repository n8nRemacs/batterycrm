package com.avito.android.user_adverts.events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: UserAdvertsTabEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/events/UserAdvertsTabEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Type", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsTabEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f312114b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertsTabEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/events/UserAdvertsTabEvent$Type;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: c, reason: collision with root package name */
        public static final Type f312115c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f312116d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f312117e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f312118f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312119b;

        static {
            Type type = new Type("Swipe", 0, "swipe");
            f312115c = type;
            Type type2 = new Type("Click", 1, "click");
            f312116d = type2;
            Type[] typeArr = {type, type2};
            f312117e = typeArr;
            f312118f = c.a(typeArr);
        }

        public Type(String str, int i12, String str2) {
            this.f312119b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f312117e.clone();
        }
    }

    public UserAdvertsTabEvent(@k String str, @k Type type) {
        this.f312114b = new ParametrizedClickStreamEvent(16667, 0, P0.g(new Q("profile_tab", str), new Q("type", type.f312119b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f312114b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f312114b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f312114b.f90248c;
    }
}
