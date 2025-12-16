package com.avito.android.publish_limits_info.item;

import Y61.k;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.remote.model.LimitsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LimitsInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LimitsInfo f245925c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f245926d;

    public a(String str, LimitsInfo limitsInfo, ItemId itemId, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? true : z12;
        this.f245924b = str;
        this.f245925c = limitsInfo;
        this.f245926d = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return getF244191b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244191b() {
        return this.f245924b;
    }
}
