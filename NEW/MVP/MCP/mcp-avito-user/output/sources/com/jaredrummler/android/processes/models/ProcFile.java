package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes7.dex */
public class ProcFile extends File implements Parcelable {
    public static final Parcelable.Creator<ProcFile> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f364311b;

    public static class a implements Parcelable.Creator<ProcFile> {
        @Override // android.os.Parcelable.Creator
        public final ProcFile createFromParcel(Parcel parcel) {
            return new ProcFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProcFile[] newArray(int i12) {
            return new ProcFile[i12];
        }
    }

    public ProcFile(String str) {
        super(str);
        this.f364311b = a(str);
    }

    public static String a(String str) throws Throwable {
        StringBuilder sb2;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String str2 = "";
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb2.append(str2);
                sb2.append(line);
                str2 = "\n";
            }
            String string = sb2.toString();
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.io.File
    public final long length() {
        return this.f364311b.length();
    }

    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.f364311b);
    }

    public ProcFile(Parcel parcel) {
        super(parcel.readString());
        this.f364311b = parcel.readString();
    }
}
