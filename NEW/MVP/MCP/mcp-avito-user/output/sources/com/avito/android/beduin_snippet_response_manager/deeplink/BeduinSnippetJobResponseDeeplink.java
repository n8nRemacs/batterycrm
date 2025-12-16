package com.avito.android.beduin_snippet_response_manager.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BeduinSnippetJobResponseDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_snippet_response_manager/deeplink/BeduinSnippetJobResponseDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class BeduinSnippetJobResponseDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<BeduinSnippetJobResponseDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105339b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f105340c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f105341d;

    /* compiled from: BeduinSnippetJobResponseDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSnippetJobResponseDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSnippetJobResponseDeeplink createFromParcel(Parcel parcel) {
            return new BeduinSnippetJobResponseDeeplink(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(BeduinSnippetJobResponseDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSnippetJobResponseDeeplink[] newArray(int i12) {
            return new BeduinSnippetJobResponseDeeplink[i12];
        }
    }

    public BeduinSnippetJobResponseDeeplink(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f105339b = str;
        this.f105340c = str2;
        this.f105341d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f105339b);
        parcel.writeString(this.f105340c);
        parcel.writeParcelable(this.f105341d, i12);
    }
}
