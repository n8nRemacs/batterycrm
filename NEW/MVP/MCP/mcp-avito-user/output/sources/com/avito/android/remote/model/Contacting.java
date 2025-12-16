package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesResult.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b\u0005\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/Contacting;", "Landroid/os/Parcelable;", "", "canCall", "canMessage", "isAnonymousNumber", "needConfirm", "<init>", "(ZZZLjava/lang/Boolean;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(ZZZLjava/lang/Boolean;)Lcom/avito/android/remote/model/Contacting;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getCanCall", "getCanMessage", "Ljava/lang/Boolean;", "getNeedConfirm", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Contacting implements Parcelable {

    @k
    public static final Parcelable.Creator<Contacting> CREATOR = new Creator();

    @c("canCall")
    private final boolean canCall;

    @c("canMessage")
    private final boolean canMessage;

    @c("isAnonymousNumber")
    private final boolean isAnonymousNumber;

    @c("needConfirm")
    @l
    private final Boolean needConfirm;

    /* compiled from: FavoritesResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Contacting> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Contacting createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Contacting(z12, z13, z14, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Contacting[] newArray(int i12) {
            return new Contacting[i12];
        }
    }

    public Contacting(boolean z12, boolean z13, boolean z14, @l Boolean bool) {
        this.canCall = z12;
        this.canMessage = z13;
        this.isAnonymousNumber = z14;
        this.needConfirm = bool;
    }

    public static /* synthetic */ Contacting copy$default(Contacting contacting, boolean z12, boolean z13, boolean z14, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = contacting.canCall;
        }
        if ((i12 & 2) != 0) {
            z13 = contacting.canMessage;
        }
        if ((i12 & 4) != 0) {
            z14 = contacting.isAnonymousNumber;
        }
        if ((i12 & 8) != 0) {
            bool = contacting.needConfirm;
        }
        return contacting.copy(z12, z13, z14, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanCall() {
        return this.canCall;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanMessage() {
        return this.canMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAnonymousNumber() {
        return this.isAnonymousNumber;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @k
    public final Contacting copy(boolean canCall, boolean canMessage, boolean isAnonymousNumber, @l Boolean needConfirm) {
        return new Contacting(canCall, canMessage, isAnonymousNumber, needConfirm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contacting)) {
            return false;
        }
        Contacting contacting = (Contacting) other;
        return this.canCall == contacting.canCall && this.canMessage == contacting.canMessage && this.isAnonymousNumber == contacting.isAnonymousNumber && L.f(this.needConfirm, contacting.needConfirm);
    }

    public final boolean getCanCall() {
        return this.canCall;
    }

    public final boolean getCanMessage() {
        return this.canMessage;
    }

    @l
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public int hashCode() {
        int i12 = r.i(r.i(Boolean.hashCode(this.canCall) * 31, 31, this.canMessage), 31, this.isAnonymousNumber);
        Boolean bool = this.needConfirm;
        return i12 + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean isAnonymousNumber() {
        return this.isAnonymousNumber;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Contacting(canCall=");
        sb2.append(this.canCall);
        sb2.append(", canMessage=");
        sb2.append(this.canMessage);
        sb2.append(", isAnonymousNumber=");
        sb2.append(this.isAnonymousNumber);
        sb2.append(", needConfirm=");
        return C0.g(sb2, this.needConfirm, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.canCall ? 1 : 0);
        parcel.writeInt(this.canMessage ? 1 : 0);
        parcel.writeInt(this.isAnonymousNumber ? 1 : 0);
        Boolean bool = this.needConfirm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
