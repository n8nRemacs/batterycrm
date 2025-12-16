package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaUnifiedButtonLink.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/UnifiedButtonLinkDetails;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "autotekaPurchaseAction", "", "searchContext", "", "fromBlock", "autotekaX", "", "isRepurchase", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "c", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "Ljava/lang/String;", "getSearchContext", "()Ljava/lang/String;", "J", "e", "()J", "d", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnifiedButtonLinkDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<UnifiedButtonLinkDetails> CREATOR = new a();

    @c("autotekaPurchaseAction")
    @k
    private final AutotekaPurchaseAction autotekaPurchaseAction;

    @c("autotekaX")
    @l
    private final String autotekaX;

    @c("fromBlock")
    private final long fromBlock;

    @c("repurchase")
    @l
    private final Boolean isRepurchase;

    @c("searchContext")
    @l
    private final String searchContext;

    /* compiled from: AutotekaUnifiedButtonLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UnifiedButtonLinkDetails> {
        @Override // android.os.Parcelable.Creator
        public final UnifiedButtonLinkDetails createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            AutotekaPurchaseAction autotekaPurchaseAction = (AutotekaPurchaseAction) parcel.readParcelable(UnifiedButtonLinkDetails.class.getClassLoader());
            String string = parcel.readString();
            long j12 = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UnifiedButtonLinkDetails(autotekaPurchaseAction, string, j12, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UnifiedButtonLinkDetails[] newArray(int i12) {
            return new UnifiedButtonLinkDetails[i12];
        }
    }

    public UnifiedButtonLinkDetails(@k AutotekaPurchaseAction autotekaPurchaseAction, @l String str, long j12, @l String str2, @l Boolean bool) {
        this.autotekaPurchaseAction = autotekaPurchaseAction;
        this.searchContext = str;
        this.fromBlock = j12;
        this.autotekaX = str2;
        this.isRepurchase = bool;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AutotekaPurchaseAction getAutotekaPurchaseAction() {
        return this.autotekaPurchaseAction;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getFromBlock() {
        return this.fromBlock;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedButtonLinkDetails)) {
            return false;
        }
        UnifiedButtonLinkDetails unifiedButtonLinkDetails = (UnifiedButtonLinkDetails) obj;
        return L.f(this.autotekaPurchaseAction, unifiedButtonLinkDetails.autotekaPurchaseAction) && L.f(this.searchContext, unifiedButtonLinkDetails.searchContext) && this.fromBlock == unifiedButtonLinkDetails.fromBlock && L.f(this.autotekaX, unifiedButtonLinkDetails.autotekaX) && L.f(this.isRepurchase, unifiedButtonLinkDetails.isRepurchase);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsRepurchase() {
        return this.isRepurchase;
    }

    @l
    public final String getSearchContext() {
        return this.searchContext;
    }

    public final int hashCode() {
        int iHashCode = this.autotekaPurchaseAction.hashCode() * 31;
        String str = this.searchContext;
        int iG2 = r.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.fromBlock);
        String str2 = this.autotekaX;
        int iHashCode2 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isRepurchase;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnifiedButtonLinkDetails(autotekaPurchaseAction=");
        sb2.append(this.autotekaPurchaseAction);
        sb2.append(", searchContext=");
        sb2.append(this.searchContext);
        sb2.append(", fromBlock=");
        sb2.append(this.fromBlock);
        sb2.append(", autotekaX=");
        sb2.append(this.autotekaX);
        sb2.append(", isRepurchase=");
        return C0.g(sb2, this.isRepurchase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.autotekaPurchaseAction, i12);
        parcel.writeString(this.searchContext);
        parcel.writeLong(this.fromBlock);
        parcel.writeString(this.autotekaX);
        Boolean bool = this.isRepurchase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
