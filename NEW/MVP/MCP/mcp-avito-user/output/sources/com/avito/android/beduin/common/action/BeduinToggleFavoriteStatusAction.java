package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinToggleFavoriteStatusAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToggleFavoriteStatusAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "advertId", "", "isFavorite", "context", "fromPage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAdvertId", "()Ljava/lang/String;", "Z", "()Z", "getContext", "c", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinToggleFavoriteStatusAction implements BeduinAction {

    @com.google.gson.annotations.c("advertId")
    @Y61.k
    private final String advertId;

    @com.google.gson.annotations.c("xHash")
    @l
    private final String context;

    @com.google.gson.annotations.c("fromPage")
    @Y61.k
    private final String fromPage;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f100021b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinToggleFavoriteStatusAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f100022c = "toggleFavoriteStatus";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinToggleFavoriteStatusAction> f100023d = BeduinToggleFavoriteStatusAction.class;

    /* compiled from: BeduinToggleFavoriteStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToggleFavoriteStatusAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinToggleFavoriteStatusAction> getAction() {
            return BeduinToggleFavoriteStatusAction.f100023d;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinToggleFavoriteStatusAction.f100022c;
        }

        public a() {
        }
    }

    /* compiled from: BeduinToggleFavoriteStatusAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinToggleFavoriteStatusAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinToggleFavoriteStatusAction createFromParcel(Parcel parcel) {
            return new BeduinToggleFavoriteStatusAction(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinToggleFavoriteStatusAction[] newArray(int i12) {
            return new BeduinToggleFavoriteStatusAction[i12];
        }
    }

    public BeduinToggleFavoriteStatusAction(@Y61.k String str, boolean z12, @l String str2, @Y61.k String str3) {
        this.advertId = str;
        this.isFavorite = z12;
        this.context = str2;
        this.fromPage = str3;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getFromPage() {
        return this.fromPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinToggleFavoriteStatusAction)) {
            return false;
        }
        BeduinToggleFavoriteStatusAction beduinToggleFavoriteStatusAction = (BeduinToggleFavoriteStatusAction) obj;
        return L.f(this.advertId, beduinToggleFavoriteStatusAction.advertId) && this.isFavorite == beduinToggleFavoriteStatusAction.isFavorite && L.f(this.context, beduinToggleFavoriteStatusAction.context) && L.f(this.fromPage, beduinToggleFavoriteStatusAction.fromPage);
    }

    @Y61.k
    public final String getAdvertId() {
        return this.advertId;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    public final int hashCode() {
        int i12 = r.i(this.advertId.hashCode() * 31, 31, this.isFavorite);
        String str = this.context;
        return this.fromPage.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinToggleFavoriteStatusAction(advertId=");
        sb2.append(this.advertId);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.fromPage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.advertId);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.context);
        parcel.writeString(this.fromPage);
    }

    public /* synthetic */ BeduinToggleFavoriteStatusAction(String str, boolean z12, String str2, String str3, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? null : str2, str3);
    }
}
