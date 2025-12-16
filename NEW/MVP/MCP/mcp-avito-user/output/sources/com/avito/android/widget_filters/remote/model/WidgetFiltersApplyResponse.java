package com.avito.android.widget_filters.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersApplyResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/WidgetFiltersApplyResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectUri", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersApplyResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetFiltersApplyResponse> CREATOR = new a();

    @c("redirectUri")
    @l
    private final DeepLink redirectUri;

    /* compiled from: WidgetFiltersApplyResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersApplyResponse> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersApplyResponse createFromParcel(Parcel parcel) {
            return new WidgetFiltersApplyResponse((DeepLink) parcel.readParcelable(WidgetFiltersApplyResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersApplyResponse[] newArray(int i12) {
            return new WidgetFiltersApplyResponse[i12];
        }
    }

    public WidgetFiltersApplyResponse(@l DeepLink deepLink) {
        this.redirectUri = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getRedirectUri() {
        return this.redirectUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WidgetFiltersApplyResponse) && L.f(this.redirectUri, ((WidgetFiltersApplyResponse) obj).redirectUri);
    }

    public final int hashCode() {
        DeepLink deepLink = this.redirectUri;
        if (deepLink == null) {
            return 0;
        }
        return deepLink.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("WidgetFiltersApplyResponse(redirectUri="), this.redirectUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.redirectUri, i12);
    }
}
