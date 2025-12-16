package com.avito.android.messenger.conversation.mvi.file_upload;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: MessengerFileUploadConfigProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.a0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C32059a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HttpUrl f191112a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f191113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f191114c;

    public C32059a0(@Y61.k HttpUrl httpUrl, @Y61.k String str, @Y61.k String str2) {
        this.f191112a = httpUrl;
        this.f191113b = str;
        this.f191114c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32059a0)) {
            return false;
        }
        C32059a0 c32059a0 = (C32059a0) obj;
        return kotlin.jvm.internal.L.f(this.f191112a, c32059a0.f191112a) && kotlin.jvm.internal.L.f(this.f191113b, c32059a0.f191113b) && kotlin.jvm.internal.L.f(this.f191114c, c32059a0.f191114c);
    }

    public final int hashCode() {
        return this.f191114c.hashCode() + androidx.compose.foundation.H.d(this.f191112a.hashCode() * 31, 31, this.f191113b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerFileUploadConfig(fileUploadEndpoint=");
        sb2.append(this.f191112a);
        sb2.append(", origin=");
        sb2.append(this.f191113b);
        sb2.append(", sessionId=");
        return C22026a.c(sb2, this.f191114c, ')');
    }
}
