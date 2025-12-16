package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class Status extends ProcFile {
    public static final Parcelable.Creator<Status> CREATOR = new a();

    public static class a implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        public final Status createFromParcel(Parcel parcel) {
            return new Status(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Status[] newArray(int i12) {
            return new Status[i12];
        }
    }

    public Status(Parcel parcel, a aVar) {
        super(parcel);
    }

    public final int c() {
        String strTrim;
        try {
            String[] strArrSplit = this.f364311b.split("\n");
            int length = strArrSplit.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    strTrim = null;
                    break;
                }
                String str = strArrSplit[i12];
                if (str.startsWith("Uid:")) {
                    strTrim = str.split("Uid:")[1].trim();
                    break;
                }
                i12++;
            }
            return Integer.parseInt(strTrim.split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }
}
