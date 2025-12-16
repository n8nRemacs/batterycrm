package com.avito.android.profile_vk_linking.group_management.adapter.group;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/adapter/group/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f231096c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f231097d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f231098e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f231099f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f231100g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f231101h;

    public a(@k String str, long j12, @l Image image, @k String str2, @k String str3, boolean z12, boolean z13) {
        this.f231095b = str;
        this.f231096c = j12;
        this.f231097d = image;
        this.f231098e = str2;
        this.f231099f = str3;
        this.f231100g = z12;
        this.f231101h = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f231095b, aVar.f231095b) && this.f231096c == aVar.f231096c && L.f(this.f231097d, aVar.f231097d) && L.f(this.f231098e, aVar.f231098e) && L.f(this.f231099f, aVar.f231099f) && this.f231100g == aVar.f231100g && this.f231101h == aVar.f231101h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF231095b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231095b() {
        return this.f231095b;
    }

    public final int hashCode() {
        int iG2 = r.g(this.f231095b.hashCode() * 31, 31, this.f231096c);
        Image image = this.f231097d;
        return Boolean.hashCode(this.f231101h) + r.i(H.d(H.d((iG2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f231098e), 31, this.f231099f), 31, this.f231100g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupItem(stringId=");
        sb2.append(this.f231095b);
        sb2.append(", groupId=");
        sb2.append(this.f231096c);
        sb2.append(", image=");
        sb2.append(this.f231097d);
        sb2.append(", title=");
        sb2.append(this.f231098e);
        sb2.append(", subtitle=");
        sb2.append(this.f231099f);
        sb2.append(", isSelected=");
        sb2.append(this.f231100g);
        sb2.append(", isDisabled=");
        return r.x(sb2, this.f231101h, ')');
    }

    public /* synthetic */ a(String str, long j12, Image image, String str2, String str3, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "group_item" : str, j12, image, str2, str3, z12, z13);
    }
}
