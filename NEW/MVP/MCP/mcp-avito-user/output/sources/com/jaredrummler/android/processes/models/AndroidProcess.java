package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes7.dex */
public class AndroidProcess implements Parcelable {
    public static final Parcelable.Creator<AndroidProcess> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f364305b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364306c;

    public static class a implements Parcelable.Creator<AndroidProcess> {
        @Override // android.os.Parcelable.Creator
        public final AndroidProcess createFromParcel(Parcel parcel) {
            return new AndroidProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AndroidProcess[] newArray(int i12) {
            return new AndroidProcess[i12];
        }
    }

    public AndroidProcess(int i12) throws IOException {
        String strReplace;
        this.f364306c = i12;
        try {
            Locale locale = Locale.ENGLISH;
            strReplace = ProcFile.a("/proc/" + i12 + "/cmdline").trim();
        } catch (IOException unused) {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            try {
                strReplace = Stat.b(i12).f364312c[1].replace("(", "").replace(")", "");
            } catch (Exception unused2) {
                Locale locale2 = Locale.ENGLISH;
                throw new IOException(G.e(i12, "Error reading /proc/", "/stat"));
            }
        }
        this.f364305b = strReplace;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f364305b);
        parcel.writeInt(this.f364306c);
    }

    public AndroidProcess(Parcel parcel) {
        this.f364305b = parcel.readString();
        this.f364306c = parcel.readInt();
    }
}
