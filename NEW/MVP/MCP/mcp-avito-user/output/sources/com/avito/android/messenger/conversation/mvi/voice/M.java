package com.avito.android.messenger.conversation.mvi.voice;

import kotlin.Metadata;

/* compiled from: VoicePlayerContract.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/M;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class M {

    /* renamed from: a, reason: collision with root package name */
    public final long f195079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195080b;

    public M(long j12, int i12) {
        this.f195079a = j12;
        this.f195080b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m12 = (M) obj;
        return this.f195079a == m12.f195079a && this.f195080b == m12.f195080b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f195080b) + (Long.hashCode(this.f195079a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceMessageTimeLeft(timeLeft=");
        sb2.append(this.f195079a);
        sb2.append(", currentProgress=");
        return androidx.appcompat.app.r.t(sb2, this.f195080b, ')');
    }
}
