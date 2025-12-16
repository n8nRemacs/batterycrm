package com.facebook.imagepipeline.image;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe
/* loaded from: classes13.dex */
public enum EncodedImageOrigin {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SET("not_set"),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK("network"),
    /* JADX INFO: Fake field, exist only in values array */
    DISK("disk"),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODED_MEM_CACHE("encoded_mem_cache");


    /* renamed from: b, reason: collision with root package name */
    public final String f340409b;

    EncodedImageOrigin(String str) {
        this.f340409b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f340409b;
    }
}
