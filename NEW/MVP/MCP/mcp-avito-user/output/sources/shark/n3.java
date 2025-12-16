package shark;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import okio.InterfaceC44804n;
import shark.AbstractC48345t2;
import shark.AbstractC48368z1;

/* compiled from: StreamingRecordReaderAdapter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lshark/HprofRecordTag;", "tag", "", "length", "Lshark/u2;", "reader", "Lkotlin/G0;", "onHprofRecord", "(Lshark/HprofRecordTag;JLshark/u2;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class n3 implements Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X2 f438659a;

    public n3(X2 x22) {
        this.f438659a = x22;
    }

    @Override // shark.Z2
    public final void a(@Y61.k HprofRecordTag hprofRecordTag, long j12, @Y61.k C48349u2 c48349u2) {
        int iOrdinal = hprofRecordTag.ordinal();
        X2 x22 = this.f438659a;
        InterfaceC44804n interfaceC44804n = c48349u2.f438785d;
        if (iOrdinal == 0) {
            long jC2 = c48349u2.c();
            long j13 = j12 - c48349u2.f438783b;
            c48349u2.f438782a += j13;
            ((C48334q2) x22).a(new AbstractC48345t2.f(jC2, interfaceC44804n.d4(j13)));
            return;
        }
        if (iOrdinal == 1) {
            ((C48334q2) x22).a(new AbstractC48345t2.c(c48349u2.d(), c48349u2.d(), c48349u2.c(), c48349u2.c()));
            return;
        }
        if (iOrdinal == 3) {
            c48349u2.c();
            c48349u2.c();
            c48349u2.c();
            c48349u2.c();
            c48349u2.d();
            c48349u2.d();
            ((C48334q2) x22).a(new AbstractC48345t2.d(null));
            return;
        }
        int i12 = 0;
        if (iOrdinal == 4) {
            int iD2 = c48349u2.d();
            int iD3 = c48349u2.d();
            int iD4 = c48349u2.d();
            long[] jArr = new long[iD4];
            while (i12 < iD4) {
                jArr[i12] = c48349u2.c();
                i12++;
            }
            ((C48334q2) x22).a(new AbstractC48345t2.e(iD2, iD3, jArr));
            return;
        }
        if (iOrdinal == 11) {
            ((C48334q2) x22).a(AbstractC48345t2.a.f438707a);
            return;
        }
        switch (iOrdinal) {
            case 14:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.n(c48349u2.c())));
                return;
            case 15:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.e(c48349u2.c(), c48349u2.c())));
                return;
            case 16:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.f(c48349u2.d(), c48349u2.d(), c48349u2.c())));
                return;
            case 17:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.d(c48349u2.d(), c48349u2.d(), c48349u2.c())));
                return;
            case 18:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.i(c48349u2.c(), c48349u2.d())));
                return;
            case 19:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.k(c48349u2.c())));
                return;
            case 20:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.l(c48349u2.c(), c48349u2.d())));
                return;
            case 21:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.h(c48349u2.c())));
                return;
            case 22:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.m(c48349u2.d(), c48349u2.d(), c48349u2.c())));
                return;
            case 23:
                ((C48334q2) x22).a(new AbstractC48345t2.b.C12635b(c48349u2.d(), c48349u2.c()));
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.c(c48349u2.c())));
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.b(c48349u2.c())));
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.a(c48349u2.c())));
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.j(c48349u2.c())));
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.p(c48349u2.c())));
                return;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.g(c48349u2.d(), c48349u2.d(), c48349u2.c())));
                return;
            case 30:
                ((C48334q2) x22).a(new AbstractC48345t2.b.a(new AbstractC48368z1.o(c48349u2.c())));
                return;
            default:
                switch (iOrdinal) {
                    case 32:
                        ((C48334q2) x22).a(c48349u2.b());
                        return;
                    case 33:
                        long jC3 = c48349u2.c();
                        int iD5 = c48349u2.d();
                        long jC4 = c48349u2.c();
                        long jD2 = c48349u2.d();
                        c48349u2.f438782a += jD2;
                        ((C48334q2) x22).a(new AbstractC48345t2.b.c.C12638b(jC3, iD5, jC4, interfaceC44804n.p5(jD2)));
                        return;
                    case 34:
                        long jC5 = c48349u2.c();
                        int iD6 = c48349u2.d();
                        int iD7 = c48349u2.d();
                        long jC6 = c48349u2.c();
                        long[] jArr2 = new long[iD7];
                        while (i12 < iD7) {
                            jArr2[i12] = c48349u2.c();
                            i12++;
                        }
                        ((C48334q2) x22).a(new AbstractC48345t2.b.c.C12639c(jC5, iD6, jC6, jArr2));
                        return;
                    case 35:
                        ((C48334q2) x22).a(c48349u2.f());
                        return;
                    default:
                        throw new IllegalStateException(("Unexpected heap dump tag " + hprofRecordTag + " at position " + c48349u2.f438782a).toString());
                }
        }
    }
}
