package com.avito.android.user_advert.advert.items.job_list_item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/job_list_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309542b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309543c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309544d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f309545e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f309546f;

    public a(@k String str, @k String str2, @k String str3, @k DeepLink deepLink, @l String str4) {
        this.f309542b = str;
        this.f309543c = str2;
        this.f309544d = str3;
        this.f309545e = deepLink;
        this.f309546f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309542b, aVar.f309542b) && L.f(this.f309543c, aVar.f309543c) && L.f(this.f309544d, aVar.f309544d) && L.f(this.f309545e, aVar.f309545e) && L.f(this.f309546f, aVar.f309546f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF57589l().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF57589l() {
        return this.f309542b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f309545e, H.d(H.d(this.f309542b.hashCode() * 31, 31, this.f309543c), 31, this.f309544d), 31);
        String str = this.f309546f;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobListItem(stringId=");
        sb2.append(this.f309542b);
        sb2.append(", title=");
        sb2.append(this.f309543c);
        sb2.append(", leftIconName=");
        sb2.append(this.f309544d);
        sb2.append(", deeplink=");
        sb2.append(this.f309545e);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f309546f, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, DeepLink deepLink, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, deepLink, (i12 & 16) != 0 ? null : str4);
    }
}
