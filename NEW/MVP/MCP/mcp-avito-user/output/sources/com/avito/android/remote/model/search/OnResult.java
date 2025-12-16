package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/search/OnResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "joinOnboardingsLogic", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/search/OnResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getJoinOnboardingsLogic", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnResult implements Parcelable {

    @k
    public static final Parcelable.Creator<OnResult> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("joinOnboardingsLogic")
    @l
    private final Boolean joinOnboardingsLogic;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnResult createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(OnResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OnResult(deepLink, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnResult[] newArray(int i12) {
            return new OnResult[i12];
        }
    }

    public OnResult(@k DeepLink deepLink, @l Boolean bool) {
        this.deepLink = deepLink;
        this.joinOnboardingsLogic = bool;
    }

    public static /* synthetic */ OnResult copy$default(OnResult onResult, DeepLink deepLink, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = onResult.deepLink;
        }
        if ((i12 & 2) != 0) {
            bool = onResult.joinOnboardingsLogic;
        }
        return onResult.copy(deepLink, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getJoinOnboardingsLogic() {
        return this.joinOnboardingsLogic;
    }

    @k
    public final OnResult copy(@k DeepLink deepLink, @l Boolean joinOnboardingsLogic) {
        return new OnResult(deepLink, joinOnboardingsLogic);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnResult)) {
            return false;
        }
        OnResult onResult = (OnResult) other;
        return L.f(this.deepLink, onResult.deepLink) && L.f(this.joinOnboardingsLogic, onResult.joinOnboardingsLogic);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final Boolean getJoinOnboardingsLogic() {
        return this.joinOnboardingsLogic;
    }

    public int hashCode() {
        int iHashCode = this.deepLink.hashCode() * 31;
        Boolean bool = this.joinOnboardingsLogic;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnResult(deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", joinOnboardingsLogic=");
        return C0.g(sb2, this.joinOnboardingsLogic, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.deepLink, flags);
        Boolean bool = this.joinOnboardingsLogic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
