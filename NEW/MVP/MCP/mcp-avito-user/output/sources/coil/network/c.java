package coil.network;

import Y61.k;
import android.graphics.Bitmap;
import coil.util.l;
import java.io.EOFException;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Headers;
import okhttp3.Response;
import okio.X;
import okio.Y;

/* compiled from: CacheResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/c;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f58557a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f58558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58559c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58560d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58561e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Headers f58562f;

    public c(@k Y y12) throws NumberFormatException, EOFException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f58557a = C42727D.b(lazyThreadSafetyMode, new a(this));
        this.f58558b = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f58559c = Long.parseLong(y12.X1(Long.MAX_VALUE));
        this.f58560d = Long.parseLong(y12.X1(Long.MAX_VALUE));
        this.f58561e = Integer.parseInt(y12.X1(Long.MAX_VALUE)) > 0;
        int i12 = Integer.parseInt(y12.X1(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i13 = 0; i13 < i12; i13++) {
            String strX1 = y12.X1(Long.MAX_VALUE);
            Bitmap.Config[] configArr = l.f58781a;
            int iH2 = C43066x.H(':', 0, 6, strX1);
            if (iH2 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strX1).toString());
            }
            builder.addUnsafeNonAscii(C43066x.A0(strX1.substring(0, iH2)).toString(), strX1.substring(iH2 + 1));
        }
        this.f58562f = builder.build();
    }

    public final void a(@k X x12) {
        x12.U0(this.f58559c);
        x12.writeByte(10);
        x12.U0(this.f58560d);
        x12.writeByte(10);
        x12.U0(this.f58561e ? 1L : 0L);
        x12.writeByte(10);
        Headers headers = this.f58562f;
        x12.U0(headers.size());
        x12.writeByte(10);
        int size = headers.size();
        for (int i12 = 0; i12 < size; i12++) {
            x12.b2(headers.name(i12));
            x12.b2(": ");
            x12.b2(headers.value(i12));
            x12.writeByte(10);
        }
    }

    public c(@k Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f58557a = C42727D.b(lazyThreadSafetyMode, new a(this));
        this.f58558b = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f58559c = response.sentRequestAtMillis();
        this.f58560d = response.receivedResponseAtMillis();
        this.f58561e = response.handshake() != null;
        this.f58562f = response.headers();
    }
}
