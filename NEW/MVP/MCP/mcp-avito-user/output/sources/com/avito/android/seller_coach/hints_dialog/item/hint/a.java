package com.avito.android.seller_coach.hints_dialog.item.hint;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HintDataItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/hint/a;", "Lcom/avito/conveyor_item/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267486c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f267487d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f267488e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f267489f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f267490g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f267491h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final i f267492i;

    public a(@k String str, @k String str2, @k String str3, @k String str4, @l DeepLink deepLink, @k String str5, @l Image image, @l i iVar) {
        UserAdvertsHintItem.Type.a aVar = UserAdvertsHintItem.Type.f267225c;
        this.f267485b = str;
        this.f267486c = str2;
        this.f267487d = str3;
        this.f267488e = str4;
        this.f267489f = deepLink;
        this.f267490g = str5;
        this.f267491h = image;
        this.f267492i = iVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!L.f(this.f267485b, aVar.f267485b) || !L.f(this.f267486c, aVar.f267486c) || !L.f(this.f267487d, aVar.f267487d) || !L.f(this.f267488e, aVar.f267488e) || !L.f(this.f267489f, aVar.f267489f) || !this.f267490g.equals(aVar.f267490g) || !L.f(this.f267491h, aVar.f267491h)) {
            return false;
        }
        UserAdvertsHintItem.Type.a aVar2 = UserAdvertsHintItem.Type.f267225c;
        return L.f(this.f267492i, aVar.f267492i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF265384b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265384b() {
        return this.f267485b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f267485b.hashCode() * 31, 31, this.f267486c), 31, this.f267487d), 31, this.f267488e);
        DeepLink deepLink = this.f267489f;
        int iD3 = H.d((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f267490g);
        Image image = this.f267491h;
        int iHashCode = (UserAdvertsHintItem.Type.f267227e.hashCode() + ((iD3 + (image == null ? 0 : image.hashCode())) * 31)) * 31;
        i iVar = this.f267492i;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HintDataItem(stringId=" + this.f267485b + ", title=" + this.f267486c + ", description=" + this.f267487d + ", time=" + this.f267488e + ", action=" + this.f267489f + ", actionText=" + this.f267490g + ", image=" + this.f267491h + ", type=" + UserAdvertsHintItem.Type.f267227e + ", stats=" + this.f267492i + ')';
    }
}
