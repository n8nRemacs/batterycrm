package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.f;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes4.dex */
class g implements f.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f361055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f361056b;

    public g(byte[] bArr, int[] iArr) {
        this.f361055a = bArr;
        this.f361056b = iArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.f.d
    public final void a(int i12, InputStream inputStream) throws IOException {
        int[] iArr = this.f361056b;
        try {
            inputStream.read(this.f361055a, iArr[0], i12);
            iArr[0] = iArr[0] + i12;
        } finally {
            inputStream.close();
        }
    }
}
