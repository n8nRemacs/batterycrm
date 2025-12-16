package com.avito.android.remote.model.advert_poll;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPoll.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/advert_poll/AdvertPoll;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "delay", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;J)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()J", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;J)Lcom/avito/android/remote/model/advert_poll/AdvertPoll;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "J", "getDelay", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertPoll implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertPoll> CREATOR = new Creator();

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("delay")
    private final long delay;

    /* compiled from: AdvertPoll.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertPoll> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPoll createFromParcel(@k Parcel parcel) {
            return new AdvertPoll((DeepLink) parcel.readParcelable(AdvertPoll.class.getClassLoader()), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPoll[] newArray(int i12) {
            return new AdvertPoll[i12];
        }
    }

    public AdvertPoll(@k DeepLink deepLink, long j12) {
        this.deeplink = deepLink;
        this.delay = j12;
    }

    public static /* synthetic */ AdvertPoll copy$default(AdvertPoll advertPoll, DeepLink deepLink, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = advertPoll.deeplink;
        }
        if ((i12 & 2) != 0) {
            j12 = advertPoll.delay;
        }
        return advertPoll.copy(deepLink, j12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDelay() {
        return this.delay;
    }

    @k
    public final AdvertPoll copy(@k DeepLink deeplink, long delay) {
        return new AdvertPoll(deeplink, delay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertPoll)) {
            return false;
        }
        AdvertPoll advertPoll = (AdvertPoll) other;
        return L.f(this.deeplink, advertPoll.deeplink) && this.delay == advertPoll.delay;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    public final long getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return Long.hashCode(this.delay) + (this.deeplink.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertPoll(deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", delay=");
        return r.u(sb2, this.delay, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeLong(this.delay);
    }
}
