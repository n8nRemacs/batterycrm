package com.avito.android.rating_form.item.chips;

import Y61.k;
import Y61.l;
import ah0.InterfaceC19890a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/chips/a;", "Lcom/avito/conveyor_item/a;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248345b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FieldIdentifier f248346c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f248347d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f248348e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248349f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f248350g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f248351h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<RatingFormField.Value> f248352i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Object f248353j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f248354k;

    public a(@k String str, @k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l String str4, @l PrintableText printableText, @l Boolean bool, @k List<RatingFormField.Value> list, @k List<RatingFormField.Value> list2, boolean z12) {
        this.f248345b = str;
        this.f248346c = fieldIdentifier;
        this.f248347d = str2;
        this.f248348e = str3;
        this.f248349f = str4;
        this.f248350g = printableText;
        this.f248351h = bool;
        this.f248352i = list;
        this.f248353j = list2;
        this.f248354k = z12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        return this.f248353j.isEmpty();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248345b, aVar.f248345b) && this.f248346c.equals(aVar.f248346c) && L.f(this.f248347d, aVar.f248347d) && L.f(this.f248348e, aVar.f248348e) && L.f(this.f248349f, aVar.f248349f) && L.f(this.f248350g, aVar.f248350g) && this.f248351h.equals(aVar.f248351h) && L.f(this.f248352i, aVar.f248352i) && L.f(this.f248353j, aVar.f248353j) && this.f248354k == aVar.f248354k;
    }

    @Override // TV0.a
    public final long getId() {
        return getF199729b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199729b() {
        return this.f248345b;
    }

    public final int hashCode() {
        int iHashCode = (this.f248346c.hashCode() + (this.f248345b.hashCode() * 31)) * 31;
        String str = this.f248347d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248348e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248349f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PrintableText printableText = this.f248350g;
        return Boolean.hashCode(this.f248354k) + C23088b.a(H.e((this.f248351h.hashCode() + ((iHashCode4 + (printableText != null ? printableText.hashCode() : 0)) * 31)) * 31, 31, this.f248352i), 31, this.f248353j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsItem(stringId=");
        sb2.append(this.f248345b);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248346c);
        sb2.append(", title=");
        sb2.append(this.f248347d);
        sb2.append(", subtitle=");
        sb2.append(this.f248348e);
        sb2.append(", placeholder=");
        sb2.append(this.f248349f);
        sb2.append(", errorText=");
        sb2.append(this.f248350g);
        sb2.append(", isEnabled=");
        sb2.append(this.f248351h);
        sb2.append(", values=");
        sb2.append(this.f248352i);
        sb2.append(", selectedValues=");
        sb2.append(this.f248353j);
        sb2.append(", multiSelect=");
        return r.x(sb2, this.f248354k, ')');
    }
}
