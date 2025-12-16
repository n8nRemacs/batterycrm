package com.avito.android.horizontal_list.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalListWidgetListItemNetworkModel.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/horizontal_list/widget/HorizontalListWidgetListItemNetworkModel;", "Landroid/os/Parcelable;", "", "itemTitle", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, DateRangeParameter.FormattedDateParameter.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalListWidgetListItemNetworkModel implements Parcelable {

    @k
    public static final Parcelable.Creator<HorizontalListWidgetListItemNetworkModel> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("description")
    @l
    private final String description;

    @c(DateRangeParameter.FormattedDateParameter.TYPE)
    @l
    private final String formattedDate;

    @c("title")
    @l
    private final String itemTitle;

    /* compiled from: HorizontalListWidgetListItemNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalListWidgetListItemNetworkModel> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetListItemNetworkModel createFromParcel(Parcel parcel) {
            return new HorizontalListWidgetListItemNetworkModel(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(HorizontalListWidgetListItemNetworkModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetListItemNetworkModel[] newArray(int i12) {
            return new HorizontalListWidgetListItemNetworkModel[i12];
        }
    }

    public HorizontalListWidgetListItemNetworkModel(@l String str, @l String str2, @l DeepLink deepLink, @l String str3) {
        this.itemTitle = str;
        this.description = str2;
        this.deeplink = deepLink;
        this.formattedDate = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getFormattedDate() {
        return this.formattedDate;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeString(this.formattedDate);
    }

    public /* synthetic */ HorizontalListWidgetListItemNetworkModel(String str, String str2, DeepLink deepLink, String str3, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? null : str3);
    }
}
