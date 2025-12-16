package com.avito.android.bundles.vas_union.item.tabs;

import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TabsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f108668b;

    /* renamed from: c, reason: collision with root package name */
    public int f108669c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f108670d;

    public c(int i12, @l String str, @Y61.k ArrayList arrayList) {
        this.f108668b = arrayList;
        this.f108669c = i12;
        this.f108670d = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return -1793032396;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF87427b() {
        return "tabs_item";
    }
}
