package com.avito.android.vas_performance.ui.items.info_action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: InfoActionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/info_action/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321693b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321694c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f321695d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f321693b = str;
        this.f321694c = str2;
        this.f321695d = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF320397b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF320397b() {
        return this.f321693b;
    }
}
