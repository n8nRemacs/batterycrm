package zJ;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.DtmfSender;

/* compiled from: DtmfSenderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzJ/e;", "Lcom/avito/avcalls/rtc/media/d;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e implements com.avito.avcalls.rtc.media.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DtmfSender f444015a;

    public e(@Y61.k DtmfSender dtmfSender) {
        this.f444015a = dtmfSender;
    }

    @Override // com.avito.avcalls.rtc.media.d
    public final boolean a(long j12, long j13, @Y61.k String str) {
        int i12 = (int) j13;
        return this.f444015a.insertDtmf(str, (int) j12, i12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f444015a, ((e) obj).f444015a);
    }

    public final int hashCode() {
        return this.f444015a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "DtmfSenderImpl(rtcDtmfSender=" + this.f444015a + ')';
    }
}
