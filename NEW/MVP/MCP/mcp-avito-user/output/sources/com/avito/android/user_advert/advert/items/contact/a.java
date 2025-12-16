package com.avito.android.user_advert.advert.items.contact;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.UserIconType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertContactItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/contact/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309300b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f309301c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309302d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f309303e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UserIconType f309304f;

    public a(@k String str, @l String str2, @l String str3, @l Image image, @l UserIconType userIconType) {
        this.f309300b = str;
        this.f309301c = str2;
        this.f309302d = str3;
        this.f309303e = image;
        this.f309304f = userIconType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309300b, aVar.f309300b) && L.f(this.f309301c, aVar.f309301c) && L.f(this.f309302d, aVar.f309302d) && L.f(this.f309303e, aVar.f309303e) && this.f309304f == aVar.f309304f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF309804b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309804b() {
        return this.f309300b;
    }

    public final int hashCode() {
        int iHashCode = this.f309300b.hashCode() * 31;
        String str = this.f309301c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f309302d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f309303e;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        UserIconType userIconType = this.f309304f;
        return iHashCode4 + (userIconType != null ? userIconType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MyAdvertContactItem(stringId=" + this.f309300b + ", title=" + this.f309301c + ", subtitle=" + this.f309302d + ", avatar=" + this.f309303e + ", icon=" + this.f309304f + ')';
    }
}
