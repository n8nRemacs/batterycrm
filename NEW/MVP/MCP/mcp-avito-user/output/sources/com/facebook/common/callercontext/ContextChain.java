package com.facebook.common.callercontext;

import I41.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f339806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f339807c;

    /* renamed from: d, reason: collision with root package name */
    public final int f339808d;

    /* renamed from: e, reason: collision with root package name */
    @h
    public final ContextChain f339809e;

    /* renamed from: f, reason: collision with root package name */
    @h
    public String f339810f;

    public static class a implements Parcelable.Creator<ContextChain> {
        @Override // android.os.Parcelable.Creator
        public final ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContextChain[] newArray(int i12) {
            return new ContextChain[i12];
        }
    }

    public ContextChain(Parcel parcel) {
        this.f339806b = parcel.readString();
        this.f339807c = parcel.readString();
        this.f339808d = parcel.readInt();
        this.f339809e = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        if (this.f339810f == null) {
            this.f339810f = this.f339806b + ":" + this.f339807c;
            ContextChain contextChain = this.f339809e;
            if (contextChain != null) {
                this.f339810f = contextChain.toString() + '/' + this.f339810f;
            }
        }
        return this.f339810f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f339806b);
        parcel.writeString(this.f339807c);
        parcel.writeInt(this.f339808d);
        parcel.writeParcelable(this.f339809e, i12);
    }
}
