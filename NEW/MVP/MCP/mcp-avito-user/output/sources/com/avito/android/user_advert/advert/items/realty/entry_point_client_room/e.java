package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EntryPointToAccountOwnerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/e;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/g;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/EntryPointToAccountOwnerItem;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.b<g, EntryPointToAccountOwnerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f309907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.items.realty.entry_point_client_room.a f309908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<h> f309909c = new g.a<>(R.layout.my_advert_entry_point_to_account_owner_item, new a());

    /* compiled from: EntryPointToAccountOwnerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, e.this.f309908b);
        }
    }

    @Inject
    public e(@Y61.k i iVar, @Y61.k com.avito.android.user_advert.advert.items.realty.entry_point_client_room.a aVar) {
        this.f309907a = iVar;
        this.f309908b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f309907a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<h> b() {
        return this.f309909c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof EntryPointToAccountOwnerItem;
    }
}
