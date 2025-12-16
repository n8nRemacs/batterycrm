package com.avito.android.user_advert.advert.items.verification;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Badge;
import com.avito.android.remote.model.Note;
import com.avito.android.remote.model.SupportButton;
import com.avito.android.remote.model.VerificationButton;
import com.avito.android.remote.model.VerificationStatus;
import com.avito.android.remote.model.VerificationStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/verification/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VerificationStatus f310373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f310374c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f310375d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Note f310376e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final VerificationButton f310377f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SupportButton f310378g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Badge f310379h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f310380i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<VerificationStep> f310381j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f310382k;

    public a() {
        throw null;
    }

    public a(VerificationStatus verificationStatus, String str, String str2, Note note, VerificationButton verificationButton, SupportButton supportButton, Badge badge, String str3, List list, String str4, int i12, C42822w c42822w) {
        note = (i12 & 8) != 0 ? null : note;
        verificationButton = (i12 & 16) != 0 ? null : verificationButton;
        supportButton = (i12 & 32) != 0 ? null : supportButton;
        badge = (i12 & 64) != 0 ? null : badge;
        str3 = (i12 & 128) != 0 ? "" : str3;
        list = (i12 & 256) != 0 ? null : list;
        str4 = (i12 & 512) != 0 ? null : str4;
        this.f310373b = verificationStatus;
        this.f310374c = str;
        this.f310375d = str2;
        this.f310376e = note;
        this.f310377f = verificationButton;
        this.f310378g = supportButton;
        this.f310379h = badge;
        this.f310380i = str3;
        this.f310381j = list;
        this.f310382k = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f310373b == aVar.f310373b && L.f(this.f310374c, aVar.f310374c) && L.f(this.f310375d, aVar.f310375d) && L.f(this.f310376e, aVar.f310376e) && L.f(this.f310377f, aVar.f310377f) && L.f(this.f310378g, aVar.f310378g) && L.f(this.f310379h, aVar.f310379h) && L.f(this.f310380i, aVar.f310380i) && L.f(this.f310381j, aVar.f310381j) && L.f(this.f310382k, aVar.f310382k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF309236b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309236b() {
        return this.f310380i;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f310373b.hashCode() * 31, 31, this.f310374c), 31, this.f310375d);
        Note note = this.f310376e;
        int iHashCode = (iD2 + (note == null ? 0 : note.hashCode())) * 31;
        VerificationButton verificationButton = this.f310377f;
        int iHashCode2 = (iHashCode + (verificationButton == null ? 0 : verificationButton.hashCode())) * 31;
        SupportButton supportButton = this.f310378g;
        int iHashCode3 = (iHashCode2 + (supportButton == null ? 0 : supportButton.hashCode())) * 31;
        Badge badge = this.f310379h;
        int iD3 = H.d((iHashCode3 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.f310380i);
        List<VerificationStep> list = this.f310381j;
        int iHashCode4 = (iD3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f310382k;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBlockItem(status=");
        sb2.append(this.f310373b);
        sb2.append(", title=");
        sb2.append(this.f310374c);
        sb2.append(", description=");
        sb2.append(this.f310375d);
        sb2.append(", note=");
        sb2.append(this.f310376e);
        sb2.append(", verificationButton=");
        sb2.append(this.f310377f);
        sb2.append(", supportButton=");
        sb2.append(this.f310378g);
        sb2.append(", badge=");
        sb2.append(this.f310379h);
        sb2.append(", stringId=");
        sb2.append(this.f310380i);
        sb2.append(", steps=");
        sb2.append(this.f310381j);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f310382k, ')');
    }
}
