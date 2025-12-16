package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import j.F;
import j.P;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final d f357640b;

    /* renamed from: c, reason: collision with root package name */
    public final d f357641c;

    /* renamed from: d, reason: collision with root package name */
    public final int f357642d;

    /* renamed from: e, reason: collision with root package name */
    public int f357643e;

    /* renamed from: f, reason: collision with root package name */
    public int f357644f;

    /* renamed from: g, reason: collision with root package name */
    public int f357645g;

    /* renamed from: h, reason: collision with root package name */
    public int f357646h;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i12) {
            return new TimeModel[i12];
        }
    }

    public TimeModel() {
        this(0);
    }

    @P
    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int c() {
        if (this.f357642d == 1) {
            return this.f357643e % 24;
        }
        int i12 = this.f357643e;
        if (i12 % 12 == 0) {
            return 12;
        }
        return this.f357646h == 1 ? i12 - 12 : i12;
    }

    public final void d(int i12) {
        if (this.f357642d == 1) {
            this.f357643e = i12;
        } else {
            this.f357643e = (i12 % 12) + (this.f357646h != 1 ? 0 : 12);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(@F int i12) {
        this.f357644f = i12 % 60;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f357643e == timeModel.f357643e && this.f357644f == timeModel.f357644f && this.f357642d == timeModel.f357642d && this.f357645g == timeModel.f357645g;
    }

    public final void f(int i12) {
        if (i12 != this.f357646h) {
            this.f357646h = i12;
            int i13 = this.f357643e;
            if (i13 < 12 && i12 == 1) {
                this.f357643e = i13 + 12;
            } else {
                if (i13 < 12 || i12 != 0) {
                    return;
                }
                this.f357643e = i13 - 12;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f357642d), Integer.valueOf(this.f357643e), Integer.valueOf(this.f357644f), Integer.valueOf(this.f357645g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f357643e);
        parcel.writeInt(this.f357644f);
        parcel.writeInt(this.f357645g);
        parcel.writeInt(this.f357642d);
    }

    public TimeModel(int i12) {
        this(0, 0, 10, i12);
    }

    public TimeModel(int i12, int i13, int i14, int i15) {
        this.f357643e = i12;
        this.f357644f = i13;
        this.f357645g = i14;
        this.f357642d = i15;
        this.f357646h = i12 >= 12 ? 1 : 0;
        this.f357640b = new d(59);
        this.f357641c = new d(i15 == 1 ? 23 : 12);
    }
}
