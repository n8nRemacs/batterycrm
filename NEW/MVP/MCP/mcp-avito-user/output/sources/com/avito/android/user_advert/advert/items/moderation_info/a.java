package com.avito.android.user_advert.advert.items.moderation_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModerationInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/moderation_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309616c;

    public a(@k String str, @k String str2) {
        this.f309615b = str;
        this.f309616c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309615b, aVar.f309615b) && L.f(this.f309616c, aVar.f309616c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83595b() {
        return getF83597d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83597d() {
        return this.f309615b;
    }

    public final int hashCode() {
        return this.f309616c.hashCode() + (this.f309615b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModerationInfoItem(stringId=");
        sb2.append(this.f309615b);
        sb2.append(", moderationInfo=");
        return C22026a.c(sb2, this.f309616c, ')');
    }
}
