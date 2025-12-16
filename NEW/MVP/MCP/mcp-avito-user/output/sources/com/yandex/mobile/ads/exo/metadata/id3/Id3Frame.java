package com.yandex.mobile.ads.exo.metadata.id3;

import com.yandex.mobile.ads.exo.metadata.Metadata;

/* loaded from: classes8.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f383002a;

    public Id3Frame(String str) {
        this.f383002a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f383002a;
    }
}
