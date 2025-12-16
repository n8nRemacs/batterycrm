package com.avito.android.publish.slots.profile_info.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.advert_details.UserIconType;
import kotlin.Metadata;

/* compiled from: UserInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/profile_info/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244695b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f244696c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UserIconType f244697d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f244698e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final SellerRating f244699f;

    public a(@k String str, @l String str2, @k UserIconType userIconType, @l Image image, @l SellerRating sellerRating) {
        this.f244695b = str;
        this.f244696c = str2;
        this.f244697d = userIconType;
        this.f244698e = image;
        this.f244699f = sellerRating;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return getF236933b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236933b() {
        return this.f244695b;
    }
}
