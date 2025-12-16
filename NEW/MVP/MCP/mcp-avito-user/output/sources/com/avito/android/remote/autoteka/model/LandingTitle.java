package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/autoteka/model/LandingTitle;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LandingTitle implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingTitle> CREATOR = new a();

    @c("text")
    @k
    private final String text;

    /* compiled from: AutotekaLandingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingTitle> {
        @Override // android.os.Parcelable.Creator
        public final LandingTitle createFromParcel(Parcel parcel) {
            return new LandingTitle(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LandingTitle[] newArray(int i12) {
            return new LandingTitle[i12];
        }
    }

    public LandingTitle(@k String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LandingTitle) && L.f(this.text, ((LandingTitle) obj).text);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("LandingTitle(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
    }
}
