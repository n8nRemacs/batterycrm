package com.avito.android.location_list;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/l;", "Lcom/avito/conveyor_item/a;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_list.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C31518l implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f182069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f182070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f182071d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182072e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182073f;

    public C31518l(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        boolean z13 = false;
        z12 = (i12 & 8) != 0 ? false : z12;
        this.f182069b = str;
        this.f182070c = str2;
        this.f182071d = str3;
        this.f182072e = z12;
        if (str3 != null && str3.length() > 0) {
            z13 = true;
        }
        this.f182073f = z13;
    }

    @Override // TV0.a
    public final long getId() {
        return getF182069b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF182069b() {
        return this.f182069b;
    }
}
