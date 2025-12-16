package io.ktor.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatelessHmacNonceManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/y0;", "Lio/ktor/util/q0;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<String> f400554a;

    /* compiled from: StatelessHmacNonceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f400555l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return D.a();
        }
    }

    /* compiled from: StatelessHmacNonceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f400556l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return D.a();
        }
    }

    public y0() {
        throw null;
    }

    public y0(@Y61.k SecretKeySpec secretKeySpec, @Y61.k String str, @Y61.k Y41.a aVar) throws NoSuchAlgorithmException, InvalidKeyException {
        this.f400554a = aVar;
        Mac mac = Mac.getInstance(str);
        mac.init(secretKeySpec);
        mac.getMacLength();
    }

    public /* synthetic */ y0(SecretKeySpec secretKeySpec, String str, long j12, Y41.a aVar, int i12, C42822w c42822w) {
        this(secretKeySpec, (i12 & 2) != 0 ? "HmacSHA256" : str, (i12 & 8) != 0 ? a.f400555l : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(byte[] bArr, String str, long j12, Y41.a aVar, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? "HmacSHA256" : str;
        this(new SecretKeySpec(bArr, str), str, (i12 & 8) != 0 ? b.f400556l : aVar);
    }
}
