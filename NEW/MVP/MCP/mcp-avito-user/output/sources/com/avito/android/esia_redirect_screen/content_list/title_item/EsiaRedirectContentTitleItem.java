package com.avito.android.esia_redirect_screen.content_list.title_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectContentTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/esia_redirect_screen/content_list/title_item/EsiaRedirectContentTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EsiaRedirectContentTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<EsiaRedirectContentTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f147985b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f147986c;

    /* compiled from: EsiaRedirectContentTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EsiaRedirectContentTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final EsiaRedirectContentTitleItem createFromParcel(Parcel parcel) {
            return new EsiaRedirectContentTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaRedirectContentTitleItem[] newArray(int i12) {
            return new EsiaRedirectContentTitleItem[i12];
        }
    }

    public EsiaRedirectContentTitleItem(@k String str, @k String str2) {
        this.f147985b = str;
        this.f147986c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsiaRedirectContentTitleItem)) {
            return false;
        }
        EsiaRedirectContentTitleItem esiaRedirectContentTitleItem = (EsiaRedirectContentTitleItem) obj;
        return L.f(this.f147985b, esiaRedirectContentTitleItem.f147985b) && L.f(this.f147986c, esiaRedirectContentTitleItem.f147986c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF145767b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145767b() {
        return this.f147986c;
    }

    public final int hashCode() {
        return this.f147986c.hashCode() + (this.f147985b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaRedirectContentTitleItem(title=");
        sb2.append(this.f147985b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f147986c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f147985b);
        parcel.writeString(this.f147986c);
    }

    public /* synthetic */ EsiaRedirectContentTitleItem(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? str : str2);
    }
}
