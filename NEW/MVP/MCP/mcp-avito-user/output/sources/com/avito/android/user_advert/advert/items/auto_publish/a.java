package com.avito.android.user_advert.advert.items.auto_publish;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoPublishItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auto_publish/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309236b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309237c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309238d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f309239e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f309240f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f309241g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f309242h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f309243i;

    public a(@k String str, @k String str2, @k String str3, @k String str4, @l AttributedText attributedText, boolean z12, boolean z13, @k String str5) {
        this.f309236b = str;
        this.f309237c = str2;
        this.f309238d = str3;
        this.f309239e = str4;
        this.f309240f = attributedText;
        this.f309241g = z12;
        this.f309242h = z13;
        this.f309243i = str5;
    }

    public static a a(a aVar, boolean z12, boolean z13) {
        String str = aVar.f309236b;
        String str2 = aVar.f309237c;
        String str3 = aVar.f309238d;
        String str4 = aVar.f309239e;
        AttributedText attributedText = aVar.f309240f;
        String str5 = aVar.f309243i;
        aVar.getClass();
        return new a(str, str2, str3, str4, attributedText, z12, z13, str5);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309236b, aVar.f309236b) && L.f(this.f309237c, aVar.f309237c) && L.f(this.f309238d, aVar.f309238d) && L.f(this.f309239e, aVar.f309239e) && L.f(this.f309240f, aVar.f309240f) && this.f309241g == aVar.f309241g && this.f309242h == aVar.f309242h && L.f(this.f309243i, aVar.f309243i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF309236b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309236b() {
        return this.f309236b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f309236b.hashCode() * 31, 31, this.f309237c), 31, this.f309238d), 31, this.f309239e);
        AttributedText attributedText = this.f309240f;
        return this.f309243i.hashCode() + r.i(r.i((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f309241g), 31, this.f309242h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoPublishItem(stringId=");
        sb2.append(this.f309236b);
        sb2.append(", advertId=");
        sb2.append(this.f309237c);
        sb2.append(", autoPublishId=");
        sb2.append(this.f309238d);
        sb2.append(", title=");
        sb2.append(this.f309239e);
        sb2.append(", subtitle=");
        sb2.append(this.f309240f);
        sb2.append(", value=");
        sb2.append(this.f309241g);
        sb2.append(", isLoading=");
        sb2.append(this.f309242h);
        sb2.append(", advertStatus=");
        return C22026a.c(sb2, this.f309243i, ')');
    }
}
