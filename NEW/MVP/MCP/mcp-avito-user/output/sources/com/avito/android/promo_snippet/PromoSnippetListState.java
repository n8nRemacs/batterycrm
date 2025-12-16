package com.avito.android.promo_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.list.next_button.PromoNextButtonItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoSnippetListState.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo_snippet/PromoSnippetListState;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PromoSnippetListState implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PromoSnippetListState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<PromoSnippetState> f231716c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PromoNextButtonItem f231717d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f231718e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f231719f;

    /* compiled from: PromoSnippetListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoSnippetListState> {
        @Override // android.os.Parcelable.Creator
        public final PromoSnippetListState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PromoSnippetState.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PromoSnippetListState(string, arrayList, parcel.readInt() == 0 ? null : PromoNextButtonItem.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(PromoSnippetListState.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoSnippetListState[] newArray(int i12) {
            return new PromoSnippetListState[i12];
        }
    }

    public PromoSnippetListState(@k String str, @k List<PromoSnippetState> list, @l PromoNextButtonItem promoNextButtonItem, @l DeepLink deepLink, @k String str2) {
        this.f231715b = str;
        this.f231716c = list;
        this.f231717d = promoNextButtonItem;
        this.f231718e = deepLink;
        this.f231719f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoSnippetListState)) {
            return false;
        }
        PromoSnippetListState promoSnippetListState = (PromoSnippetListState) obj;
        return L.f(this.f231715b, promoSnippetListState.f231715b) && L.f(this.f231716c, promoSnippetListState.f231716c) && L.f(this.f231717d, promoSnippetListState.f231717d) && L.f(this.f231718e, promoSnippetListState.f231718e) && L.f(this.f231719f, promoSnippetListState.f231719f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return getF228582b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228582b() {
        return this.f231719f;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f231715b.hashCode() * 31, 31, this.f231716c);
        PromoNextButtonItem promoNextButtonItem = this.f231717d;
        int iHashCode = (iE2 + (promoNextButtonItem == null ? 0 : promoNextButtonItem.hashCode())) * 31;
        DeepLink deepLink = this.f231718e;
        return this.f231719f.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoSnippetListState(title=");
        sb2.append(this.f231715b);
        sb2.append(", items=");
        sb2.append(this.f231716c);
        sb2.append(", nextButton=");
        sb2.append(this.f231717d);
        sb2.append(", widgetDeepLink=");
        sb2.append(this.f231718e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f231719f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231715b);
        Iterator itJ = C0.j(this.f231716c, parcel);
        while (itJ.hasNext()) {
            ((PromoSnippetState) itJ.next()).writeToParcel(parcel, i12);
        }
        PromoNextButtonItem promoNextButtonItem = this.f231717d;
        if (promoNextButtonItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoNextButtonItem.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f231718e, i12);
        parcel.writeString(this.f231719f);
    }

    public /* synthetic */ PromoSnippetListState(String str, List list, PromoNextButtonItem promoNextButtonItem, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
        this(str, list, promoNextButtonItem, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? UUID.randomUUID().toString() : str2);
    }
}
