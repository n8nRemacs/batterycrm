package kc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FilterOpenedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkc/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42666a extends c {

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f406507f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f406508g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f406509h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f406510i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f406511j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f406512k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f406513l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f406514m;

    public /* synthetic */ C42666a(long j12, TreeClickStreamParent treeClickStreamParent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, C42822w c42822w) {
        this(j12, treeClickStreamParent, str, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : str8);
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "lid", this.f406507f);
        j(linkedHashMap, "cid", this.f406508g);
        j(linkedHashMap, "s", this.f406511j);
        j(linkedHashMap, "sid", this.f406512k);
        j(linkedHashMap, "user_key", this.f406510i);
        j(linkedHashMap, "prof_profile_type", this.f406509h);
        j(linkedHashMap, "icon_type", this.f406513l);
        j(linkedHashMap, "from_page", this.f406514m);
        return linkedHashMap;
    }

    public C42666a(long j12, @l TreeClickStreamParent treeClickStreamParent, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8) {
        super(j12, treeClickStreamParent, 3232, 5);
        this.f406507f = str;
        this.f406508g = str2;
        this.f406509h = str3;
        this.f406510i = str4;
        this.f406511j = str5;
        this.f406512k = str6;
        this.f406513l = str7;
        this.f406514m = str8;
    }
}
