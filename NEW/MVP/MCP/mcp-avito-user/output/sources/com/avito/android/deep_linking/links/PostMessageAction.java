package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: InstallmentsFormShowLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deep_linking/links/PostMessageAction;", "Landroid/os/Parcelable;", "", "eventType", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PostMessageAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PostMessageAction> CREATOR = new a();

    @com.google.gson.annotations.c("eventType")
    @Y61.l
    private final String eventType;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final String uri;

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PostMessageAction> {
        @Override // android.os.Parcelable.Creator
        public final PostMessageAction createFromParcel(Parcel parcel) {
            return new PostMessageAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostMessageAction[] newArray(int i12) {
            return new PostMessageAction[i12];
        }
    }

    public PostMessageAction(@Y61.l String str, @Y61.l String str2) {
        this.eventType = str;
        this.uri = str2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMessageAction)) {
            return false;
        }
        PostMessageAction postMessageAction = (PostMessageAction) obj;
        return kotlin.jvm.internal.L.f(this.eventType, postMessageAction.eventType) && kotlin.jvm.internal.L.f(this.uri, postMessageAction.uri);
    }

    public final int hashCode() {
        String str = this.eventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PostMessageAction(eventType=");
        sb2.append(this.eventType);
        sb2.append(", uri=");
        return C22026a.c(sb2, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.eventType);
        parcel.writeString(this.uri);
    }
}
