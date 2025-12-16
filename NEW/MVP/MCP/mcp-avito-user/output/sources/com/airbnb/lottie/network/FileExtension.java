package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes10.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: b, reason: collision with root package name */
    public final String f59905b;

    FileExtension(String str) {
        this.f59905b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f59905b;
    }
}
