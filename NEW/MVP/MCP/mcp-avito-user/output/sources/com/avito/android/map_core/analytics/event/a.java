package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BackPressMapTreeEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/analytics/event/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "a", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f185605f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f185606g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BackPressMapTreeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/a$a;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.analytics.event.a$a, reason: collision with other inner class name */
    public static final class EnumC5448a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumC5448a[] f185607b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185608c;

        static {
            EnumC5448a[] enumC5448aArr = {new EnumC5448a("SYSTEM", 0), new EnumC5448a("BAR", 1)};
            f185607b = enumC5448aArr;
            f185608c = kotlin.enums.c.a(enumC5448aArr);
        }

        public EnumC5448a() {
            throw null;
        }

        public static EnumC5448a valueOf(String str) {
            return (EnumC5448a) Enum.valueOf(EnumC5448a.class, str);
        }

        public static EnumC5448a[] values() {
            return (EnumC5448a[]) f185607b.clone();
        }
    }

    public a(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l String str, boolean z12) {
        super(j12, treeClickStreamParent, 2782, 3);
        this.f185605f = str;
        this.f185606g = z12;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        int i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "srcp", "serp_on_map");
        if (this.f185606g) {
            EnumC5448a[] enumC5448aArr = EnumC5448a.f185607b;
            i12 = 1;
        } else {
            EnumC5448a[] enumC5448aArr2 = EnumC5448a.f185607b;
            i12 = 0;
        }
        j(linkedHashMap, "from_block", Integer.valueOf(i12));
        j(linkedHashMap, "categoryid", this.f185605f);
        return linkedHashMap;
    }
}
