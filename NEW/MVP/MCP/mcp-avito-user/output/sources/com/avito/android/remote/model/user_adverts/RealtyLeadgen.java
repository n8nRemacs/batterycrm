package com.avito.android.remote.model.user_adverts;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyLeadgen.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyLeadgen implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyLeadgen> CREATOR = new Creator();

    @c("text")
    @k
    private final String text;

    @c("textColor")
    @k
    private final UniversalColor textColor;

    /* compiled from: RealtyLeadgen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyLeadgen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyLeadgen createFromParcel(@k Parcel parcel) {
            return new RealtyLeadgen(parcel.readString(), (UniversalColor) parcel.readParcelable(RealtyLeadgen.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyLeadgen[] newArray(int i12) {
            return new RealtyLeadgen[i12];
        }
    }

    public RealtyLeadgen(@k String str, @k UniversalColor universalColor) {
        this.text = str;
        this.textColor = universalColor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.textColor, flags);
    }
}
