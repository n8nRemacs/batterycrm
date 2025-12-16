package com.avito.android.advert_core.analytics.sharing;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http.StatusLine;

/* compiled from: ItemSharingTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/sharing/h;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f82869f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f82870g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f82871h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f82872i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f82873j;

    /* renamed from: k, reason: collision with root package name */
    public final int f82874k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f82875l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f82876m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Boolean f82877n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TreeClickStreamParent treeClickStreamParent, String str, String str2, String str3, String str4, String str5, int i12, String str6, String str7, Boolean bool, int i13, C42822w c42822w) {
        super(0L, treeClickStreamParent, StatusLine.HTTP_PERM_REDIRECT, 8);
        String str8 = (i13 & 256) != 0 ? null : str7;
        Boolean bool2 = (i13 & 512) != 0 ? null : bool;
        this.f82869f = str;
        this.f82870g = str2;
        this.f82871h = str3;
        this.f82872i = str4;
        this.f82873j = str5;
        this.f82874k = i12;
        this.f82875l = str6;
        this.f82876m = str8;
        this.f82877n = bool2;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f82869f);
        j(linkedHashMap, "cid", this.f82870g);
        j(linkedHashMap, "mcid", this.f82871h);
        j(linkedHashMap, "lid", this.f82872i);
        j(linkedHashMap, "oid", this.f82873j);
        j(linkedHashMap, "social_id", Integer.valueOf(this.f82874k));
        j(linkedHashMap, "pagetype", this.f82875l);
        j(linkedHashMap, "is_auth", this.f82877n);
        j(linkedHashMap, "x", this.f82876m);
        return linkedHashMap;
    }
}
