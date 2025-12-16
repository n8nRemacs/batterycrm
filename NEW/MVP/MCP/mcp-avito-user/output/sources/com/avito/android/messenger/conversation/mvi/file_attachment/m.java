package com.avito.android.messenger.conversation.mvi.file_attachment;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileStorageHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f190719a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f190720b;

    /* renamed from: c, reason: collision with root package name */
    public final long f190721c;

    public m(@Y61.k String str, @Y61.k String str2, long j12) {
        this.f190719a = str;
        this.f190720b = str2;
        this.f190721c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f190719a, mVar.f190719a) && L.f(this.f190720b, mVar.f190720b) && this.f190721c == mVar.f190721c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f190721c) + H.d(this.f190719a.hashCode() * 31, 31, this.f190720b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileInfo(displayName=");
        sb2.append(this.f190719a);
        sb2.append(", mimeType=");
        sb2.append(this.f190720b);
        sb2.append(", sizeInBytes=");
        return androidx.appcompat.app.r.u(sb2, this.f190721c, ')');
    }
}
