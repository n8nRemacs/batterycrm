package com.avito.android.user_adverts_views.advert_item;

import TV0.g;
import com.avito.android.R;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import kotlin.Metadata;
import ur.InterfaceC49101b;
import wJ0.InterfaceC49521b;
import wJ0.InterfaceC49522c;

/* compiled from: UserAdvertItemListBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views/advert_item/b;", "LwJ0/b;", "_avito_user-adverts-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC49521b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49522c f316476a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f316477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_views_util.position.a f316478c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f316479d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f316480e = new g.a<>(R.layout.user_advert_list_item_re23, new a(this));

    public b(@Y61.k InterfaceC49522c interfaceC49522c, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.user_adverts_views_util.position.a aVar2, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f316476a = interfaceC49522c;
        this.f316477b = aVar;
        this.f316478c = aVar2;
        this.f316479d = interfaceC49101b;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<com.avito.android.user_adverts_views_pub.c, UserAdvertItem> a() {
        return this.f316476a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f316480e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof UserAdvertItem;
    }
}
