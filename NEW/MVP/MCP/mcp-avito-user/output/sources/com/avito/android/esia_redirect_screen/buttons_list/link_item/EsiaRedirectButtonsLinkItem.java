package com.avito.android.esia_redirect_screen.buttons_list.link_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.esia_redirect_screen.buttons_list.EsiaRedirectButtonsBaseItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectButtonsLinkItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/buttons_list/link_item/EsiaRedirectButtonsLinkItem;", "Lcom/avito/android/esia_redirect_screen/buttons_list/EsiaRedirectButtonsBaseItem;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EsiaRedirectButtonsLinkItem implements EsiaRedirectButtonsBaseItem {

    @k
    public static final Parcelable.Creator<EsiaRedirectButtonsLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f147936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f147937c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f147938d;

    /* compiled from: EsiaRedirectButtonsLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EsiaRedirectButtonsLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final EsiaRedirectButtonsLinkItem createFromParcel(Parcel parcel) {
            return new EsiaRedirectButtonsLinkItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(EsiaRedirectButtonsLinkItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaRedirectButtonsLinkItem[] newArray(int i12) {
            return new EsiaRedirectButtonsLinkItem[i12];
        }
    }

    public EsiaRedirectButtonsLinkItem(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f147936b = str;
        this.f147937c = str2;
        this.f147938d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsiaRedirectButtonsLinkItem)) {
            return false;
        }
        EsiaRedirectButtonsLinkItem esiaRedirectButtonsLinkItem = (EsiaRedirectButtonsLinkItem) obj;
        return L.f(this.f147936b, esiaRedirectButtonsLinkItem.f147936b) && L.f(this.f147937c, esiaRedirectButtonsLinkItem.f147937c) && L.f(this.f147938d, esiaRedirectButtonsLinkItem.f147938d);
    }

    @Override // com.avito.android.esia_redirect_screen.buttons_list.EsiaRedirectButtonsBaseItem
    @k
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF147960d() {
        return this.f147938d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281466b() {
        return this.f147937c;
    }

    public final int hashCode() {
        return this.f147938d.hashCode() + H.d(this.f147936b.hashCode() * 31, 31, this.f147937c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaRedirectButtonsLinkItem(title=");
        sb2.append(this.f147936b);
        sb2.append(", stringId=");
        sb2.append(this.f147937c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f147938d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f147936b);
        parcel.writeString(this.f147937c);
        parcel.writeParcelable(this.f147938d, i12);
    }

    public /* synthetic */ EsiaRedirectButtonsLinkItem(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? str : str2, deepLink);
    }
}
