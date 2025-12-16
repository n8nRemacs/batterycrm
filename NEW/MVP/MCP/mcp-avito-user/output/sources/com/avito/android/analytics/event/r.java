package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallToSellerEvent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/event/r;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "<init>", "()V", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f90128e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f90129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90130c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90131d;

    /* compiled from: CallToSellerEvent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/r$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static r a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Integer num, @Y61.l String str4, @Y61.l String str5) {
            r rVar = new r(null);
            LinkedHashMap linkedHashMap = rVar.f90131d;
            linkedHashMap.put("user_key", str);
            if (num != null) {
                org.webrtc.h.i(num, "from_block", linkedHashMap);
            }
            if (str2 != null) {
                linkedHashMap.put("from_page", str2);
            }
            String strB = C35800g5.b(new C35792f5(str3));
            if (strB != null) {
                linkedHashMap.put("x", strB);
            }
            if (str4 != null) {
                linkedHashMap.put("from_space", str4);
            }
            if (str5 != null) {
                linkedHashMap.put("iid", str5);
            }
            return rVar;
        }

        public static /* synthetic */ r b(a aVar, String str, String str2, Integer num, String str3, int i12) {
            if ((i12 & 32) != 0) {
                str3 = null;
            }
            aVar.getClass();
            return a(str, str2, null, num, null, str3);
        }

        public a() {
        }
    }

    public /* synthetic */ r(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF328428b() {
        return this.f90129b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90131d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF328429c() {
        return this.f90130c;
    }

    public r() {
        this.f90129b = 2650;
        this.f90130c = 25;
        this.f90131d = new LinkedHashMap();
    }

    public r(TreeClickStreamParent treeClickStreamParent, String str, String str2, boolean z12, String str3, String str4, String str5, int i12, String str6, boolean z13, Boolean bool, String str7, String str8, String str9, C42822w c42822w) {
        this.f90129b = 2650;
        this.f90130c = 25;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f90131d = linkedHashMap;
        linkedHashMap.putAll(treeClickStreamParent != null ? treeClickStreamParent.c() : kotlin.collections.P0.c());
        linkedHashMap.put("iid", str);
        if (str2 != null) {
            linkedHashMap.put("cid", str2);
        }
        linkedHashMap.put("oc", Boolean.valueOf(z12));
        if (str3 != null) {
            linkedHashMap.put("mid", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("lid", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("sid", str5);
        }
        linkedHashMap.put("from_block", Integer.valueOf(i12));
        linkedHashMap.put("x", str6 == null ? "" : str6);
        linkedHashMap.put("mic_access", Boolean.valueOf(z13));
        if (bool != null) {
            linkedHashMap.put("is_multiitems_variation", bool);
        }
        if (str7 != null) {
            linkedHashMap.put("multiitem_source", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("multiitem_click_param_name", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("from_space", str9);
        }
    }

    public r(String str, String str2, C42822w c42822w) {
        this.f90129b = 2650;
        this.f90130c = 25;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f90131d = linkedHashMap;
        linkedHashMap.put("RealtyDevelopment_id", str);
        linkedHashMap.put("cid", 24);
        linkedHashMap.put("mcid", 4918);
        linkedHashMap.put("from_page", "develop_realty");
        if (str2 != null) {
            linkedHashMap.put("lid", str2);
        }
    }

    public r(com.avito.android.J j12, C42822w c42822w) {
        this.f90129b = 2650;
        this.f90130c = 25;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f90131d = linkedHashMap;
        linkedHashMap.put("iid", j12.f67340a);
        linkedHashMap.put("from_page", j12.f67341b);
    }
}
