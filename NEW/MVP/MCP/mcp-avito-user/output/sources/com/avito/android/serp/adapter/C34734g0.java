package com.avito.android.serp.adapter;

import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: InAppCallsAwareItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C34734g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f269996a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f269997b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f269998c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f269999d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f270000e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f270001f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f270002g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Image f270003h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AdvertAction.Messenger f270004i;

    public C34734g0(@Y61.l String str, @Y61.l String str2, @Y61.l Image image, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Image image2, @Y61.l AdvertAction.Messenger messenger) {
        this.f269996a = str;
        this.f269997b = str2;
        this.f269998c = image;
        this.f269999d = str3;
        this.f270000e = str4;
        this.f270001f = str5;
        this.f270002g = str6;
        this.f270003h = image2;
        this.f270004i = messenger;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34734g0)) {
            return false;
        }
        C34734g0 c34734g0 = (C34734g0) obj;
        return kotlin.jvm.internal.L.f(this.f269996a, c34734g0.f269996a) && kotlin.jvm.internal.L.f(this.f269997b, c34734g0.f269997b) && kotlin.jvm.internal.L.f(this.f269998c, c34734g0.f269998c) && kotlin.jvm.internal.L.f(this.f269999d, c34734g0.f269999d) && kotlin.jvm.internal.L.f(this.f270000e, c34734g0.f270000e) && kotlin.jvm.internal.L.f(this.f270001f, c34734g0.f270001f) && kotlin.jvm.internal.L.f(this.f270002g, c34734g0.f270002g) && kotlin.jvm.internal.L.f(this.f270003h, c34734g0.f270003h) && kotlin.jvm.internal.L.f(this.f270004i, c34734g0.f270004i);
    }

    public final int hashCode() {
        String str = this.f269996a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f269997b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f269998c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.f269999d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f270000e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f270001f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f270002g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image2 = this.f270003h;
        int iHashCode8 = (iHashCode7 + (image2 == null ? 0 : image2.hashCode())) * 31;
        AdvertAction.Messenger messenger = this.f270004i;
        return iHashCode8 + (messenger != null ? messenger.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "InAppCallsAwareItemData(peerUserKey=" + this.f269996a + ", peerDisplayName=" + this.f269997b + ", peerAvatar=" + this.f269998c + ", itemId=" + this.f269999d + ", itemCategoryId=" + this.f270000e + ", itemDisplayName=" + this.f270001f + ", itemPrice=" + this.f270002g + ", itemImage=" + this.f270003h + ", messengerAction=" + this.f270004i + ')';
    }
}
