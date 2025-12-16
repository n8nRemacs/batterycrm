package com.avito.android.messenger.conversation.mvi.file_attachment;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileStorageHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f190760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f190761b;

    /* renamed from: c, reason: collision with root package name */
    public final long f190762c;

    public z(@Y61.k String str, long j12, long j13) {
        this.f190760a = str;
        this.f190761b = j12;
        this.f190762c = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f190760a, zVar.f190760a) && this.f190761b == zVar.f190761b && this.f190762c == zVar.f190762c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f190762c) + androidx.appcompat.app.r.g(this.f190760a.hashCode() * 31, 31, this.f190761b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoInfo(displayName=");
        sb2.append(this.f190760a);
        sb2.append(", sizeInBytes=");
        sb2.append(this.f190761b);
        sb2.append(", durationSec=");
        return androidx.appcompat.app.r.u(sb2, this.f190762c, ')');
    }
}
