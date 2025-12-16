package com.avito.android.publish.details.beduin.custom_actions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSetContinuePublishAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "Landroid/os/Parcelable;", "ContinuePublish", "PerformDeeplink", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction$ContinuePublish;", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction$PerformDeeplink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ContinuePublishAction extends Parcelable {

    /* compiled from: BeduinSetContinuePublishAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction$ContinuePublish;", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ContinuePublish implements ContinuePublishAction {

        @k
        public static final Parcelable.Creator<ContinuePublish> CREATOR = new a();

        /* compiled from: BeduinSetContinuePublishAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContinuePublish> {
            @Override // android.os.Parcelable.Creator
            public final ContinuePublish createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new ContinuePublish();
            }

            @Override // android.os.Parcelable.Creator
            public final ContinuePublish[] newArray(int i12) {
                return new ContinuePublish[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this != obj) {
                if (!ContinuePublish.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return ContinuePublish.class.hashCode();
        }

        @k
        public final String toString() {
            return "ContinuePublishAction.ContinuePublish()";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BeduinSetContinuePublishAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction$PerformDeeplink;", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PerformDeeplink implements ContinuePublishAction {

        @k
        public static final Parcelable.Creator<PerformDeeplink> CREATOR = new a();

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        /* compiled from: BeduinSetContinuePublishAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PerformDeeplink> {
            @Override // android.os.Parcelable.Creator
            public final PerformDeeplink createFromParcel(Parcel parcel) {
                return new PerformDeeplink((DeepLink) parcel.readParcelable(PerformDeeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PerformDeeplink[] newArray(int i12) {
                return new PerformDeeplink[i12];
            }
        }

        public PerformDeeplink(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PerformDeeplink) && L.f(this.deeplink, ((PerformDeeplink) obj).deeplink);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PerformDeeplink(deeplink="), this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.deeplink, i12);
        }
    }
}
