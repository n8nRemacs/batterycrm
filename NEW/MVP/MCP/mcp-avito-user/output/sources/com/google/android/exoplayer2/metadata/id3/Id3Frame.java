package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes6.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final String f345693b;

    public Id3Frame(String str) {
        this.f345693b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f345693b;
    }
}
