package com.avito.avcalls.android.rtc;

import androidx.compose.runtime.C22026a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;

/* compiled from: IceCandidate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/android/rtc/IceCandidate;", "", "", "seen1", "sdpMLineIndex", "", "sdp", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w
/* loaded from: classes5.dex */
public final /* data */ class IceCandidate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f331871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f331873c;

    /* compiled from: IceCandidate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/rtc/IceCandidate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/rtc/IceCandidate;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<IceCandidate> serializer() {
            return IceCandidate$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ IceCandidate(int i12, @kotlinx.serialization.v int i13, @kotlinx.serialization.v String str, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, IceCandidate$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f331871a = null;
        this.f331872b = i13;
        this.f331873c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        return L.f(this.f331871a, iceCandidate.f331871a) && this.f331872b == iceCandidate.f331872b && L.f(this.f331873c, iceCandidate.f331873c);
    }

    public final int hashCode() {
        String str = this.f331871a;
        return this.f331873c.hashCode() + androidx.appcompat.app.r.e(this.f331872b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IceCandidate(sdpMid=");
        sb2.append(this.f331871a);
        sb2.append(", sdpMLineIndex=");
        sb2.append(this.f331872b);
        sb2.append(", sdp=");
        return C22026a.c(sb2, this.f331873c, ')');
    }

    public IceCandidate(@Y61.l String str, int i12, @Y61.k String str2) {
        this.f331871a = str;
        this.f331872b = i12;
        this.f331873c = str2;
    }

    public /* synthetic */ IceCandidate(String str, int i12, String str2, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : str, i12, str2);
    }
}
