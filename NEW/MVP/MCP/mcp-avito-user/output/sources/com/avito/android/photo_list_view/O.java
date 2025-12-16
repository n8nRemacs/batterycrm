package com.avito.android.photo_list_view;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: RatingPublishViewActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/O;", "Lcom/avito/android/photo_list_view/N;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f218102a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f218103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_picker.h f218104c = new com.avito.android.date_time_picker.h(this, 3);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f218105d = new LinkedHashMap();

    public O(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f218102a = aVar;
        this.f218103b = interfaceC28373a;
    }

    @Override // com.avito.android.photo_list_view.N
    public final void a(@Y61.k DeepLink deepLink) {
        this.f218105d.put(ViewAction.f218107b, deepLink);
    }

    @Override // com.avito.android.photo_list_view.N
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.avito.android.date_time_picker.h getF218104c() {
        return this.f218104c;
    }
}
