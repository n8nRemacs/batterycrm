package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: UpdateFolderTagsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UpdateFolderTagsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UpdateFolderTagsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UpdateFolderTagsLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133771b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133772c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<String> f133773d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f133774e;

    /* compiled from: UpdateFolderTagsLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/UpdateFolderTagsLink$a;", "", "<init>", "()V", "", "ADD_TAGS", "Ljava/lang/String;", "CHANNEL_ID", "FOLDER_ID", "REMOVE_TAGS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UpdateFolderTagsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UpdateFolderTagsLink> {
        @Override // android.os.Parcelable.Creator
        public final UpdateFolderTagsLink createFromParcel(Parcel parcel) {
            return new UpdateFolderTagsLink(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateFolderTagsLink[] newArray(int i12) {
            return new UpdateFolderTagsLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public UpdateFolderTagsLink(@Y61.k String str, @Y61.k String str2, @Y61.k List<String> list, @Y61.k List<String> list2) {
        this.f133771b = str;
        this.f133772c = str2;
        this.f133773d = list;
        this.f133774e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateFolderTagsLink)) {
            return false;
        }
        UpdateFolderTagsLink updateFolderTagsLink = (UpdateFolderTagsLink) obj;
        return kotlin.jvm.internal.L.f(this.f133771b, updateFolderTagsLink.f133771b) && kotlin.jvm.internal.L.f(this.f133772c, updateFolderTagsLink.f133772c) && kotlin.jvm.internal.L.f(this.f133773d, updateFolderTagsLink.f133773d) && kotlin.jvm.internal.L.f(this.f133774e, updateFolderTagsLink.f133774e);
    }

    public final int hashCode() {
        return this.f133774e.hashCode() + androidx.compose.foundation.H.e(androidx.compose.foundation.H.d(this.f133771b.hashCode() * 31, 31, this.f133772c), 31, this.f133773d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateFolderTagsLink(channelId=");
        sb2.append(this.f133771b);
        sb2.append(", folderId=");
        sb2.append(this.f133772c);
        sb2.append(", addTags=");
        sb2.append(this.f133773d);
        sb2.append(", removeTags=");
        return androidx.compose.foundation.H.p(sb2, this.f133774e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133771b);
        parcel.writeString(this.f133772c);
        parcel.writeStringList(this.f133773d);
        parcel.writeStringList(this.f133774e);
    }
}
