package com.avito.android.messenger.conversation.mvi.file_upload;

import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.r0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C32092r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final File f191206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f191207b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f191208c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f191209d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f191210e;

    /* renamed from: f, reason: collision with root package name */
    public final long f191211f;

    /* renamed from: g, reason: collision with root package name */
    public final long f191212g;

    public C32092r0(@Y61.k File file, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, long j12, long j13) {
        this.f191206a = file;
        this.f191207b = str;
        this.f191208c = str2;
        this.f191209d = str3;
        this.f191210e = str4;
        this.f191211f = j12;
        this.f191212g = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32092r0)) {
            return false;
        }
        C32092r0 c32092r0 = (C32092r0) obj;
        return kotlin.jvm.internal.L.f(this.f191206a, c32092r0.f191206a) && kotlin.jvm.internal.L.f(this.f191207b, c32092r0.f191207b) && kotlin.jvm.internal.L.f(this.f191208c, c32092r0.f191208c) && kotlin.jvm.internal.L.f(this.f191209d, c32092r0.f191209d) && kotlin.jvm.internal.L.f(this.f191210e, c32092r0.f191210e) && this.f191211f == c32092r0.f191211f && this.f191212g == c32092r0.f191212g;
    }

    public final int hashCode() {
        int iHashCode = this.f191206a.hashCode() * 31;
        String str = this.f191207b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191208c;
        int iD2 = androidx.compose.foundation.H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f191209d);
        String str3 = this.f191210e;
        return Long.hashCode(this.f191212g) + androidx.appcompat.app.r.g((iD2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f191211f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultVideoInfo(file=");
        sb2.append(this.f191206a);
        sb2.append(", originalFileName=");
        sb2.append(this.f191207b);
        sb2.append(", resolution=");
        sb2.append(this.f191208c);
        sb2.append(", mimeType=");
        sb2.append(this.f191209d);
        sb2.append(", extension=");
        sb2.append(this.f191210e);
        sb2.append(", sizeInBytes=");
        sb2.append(this.f191211f);
        sb2.append(", chunkCount=");
        return androidx.appcompat.app.r.u(sb2, this.f191212g, ')');
    }
}
