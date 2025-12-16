package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RemoteValidFile.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage/api/model/RemoteValidFile;", "Landroid/os/Parcelable;", "", "id", "name", "size", "", "isValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getSize", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class RemoteValidFile implements Parcelable {

    @k
    public static final Parcelable.Creator<RemoteValidFile> CREATOR = new a();

    @c("fileId")
    @k
    private final String id;

    @c("isValid")
    @l
    private final Boolean isValid;

    @c("name")
    @k
    private final String name;

    @c("size")
    @k
    private final String size;

    /* compiled from: RemoteValidFile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RemoteValidFile> {
        @Override // android.os.Parcelable.Creator
        public final RemoteValidFile createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RemoteValidFile(string, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteValidFile[] newArray(int i12) {
            return new RemoteValidFile[i12];
        }
    }

    public RemoteValidFile(@k String str, @k String str2, @k String str3, @l Boolean bool) {
        this.id = str;
        this.name = str2;
        this.size = str3;
        this.isValid = bool;
    }

    public final long c() {
        float f12;
        String strU0 = C43066x.u0(2, this.size);
        String strSubstring = this.size;
        int length = strSubstring.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = strSubstring.charAt(i12);
            if (!Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != ',') {
                strSubstring = strSubstring.substring(0, i12);
                break;
            }
            i12++;
        }
        Float fX02 = C43066x.x0(strSubstring.replace(',', '.'));
        if (fX02 == null) {
            return 0L;
        }
        float fFloatValue = fX02.floatValue();
        if (strU0.compareToIgnoreCase(" Б") != 0) {
            if (strU0.compareToIgnoreCase("КБ") == 0) {
                f12 = 1024;
            } else {
                if (strU0.compareToIgnoreCase("МБ") != 0) {
                    return 0L;
                }
                f12 = 1024;
                fFloatValue *= f12;
            }
            fFloatValue *= f12;
        }
        return (long) fFloatValue;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteValidFile)) {
            return false;
        }
        RemoteValidFile remoteValidFile = (RemoteValidFile) obj;
        return L.f(this.id, remoteValidFile.id) && L.f(this.name, remoteValidFile.name) && L.f(this.size, remoteValidFile.size) && L.f(this.isValid, remoteValidFile.isValid);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.size);
        Boolean bool = this.isValid;
        return iD2 + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteValidFile(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", isValid=");
        return C0.g(sb2, this.isValid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.size);
        Boolean bool = this.isValid;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
