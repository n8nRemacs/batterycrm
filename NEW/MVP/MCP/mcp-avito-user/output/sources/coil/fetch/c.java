package coil.fetch;

import coil.decode.DataSource;
import coil.decode.s;
import coil.fetch.h;
import coil.request.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import okio.C44802l;

/* compiled from: ByteBufferFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/c;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f58379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58380b;

    /* compiled from: ByteBufferFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/c$a;", "Lcoil/fetch/h$a;", "Ljava/nio/ByteBuffer;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a<ByteBuffer> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            return new c((ByteBuffer) obj, tVar);
        }
    }

    public c(@Y61.k ByteBuffer byteBuffer, @Y61.k t tVar) {
        this.f58379a = byteBuffer;
        this.f58380b = tVar;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) {
        ByteBuffer byteBuffer = this.f58379a;
        try {
            C44802l c44802l = new C44802l();
            c44802l.write(byteBuffer);
            byteBuffer.position(0);
            return new m(s.a(c44802l, this.f58380b.f58717a), null, DataSource.f58269c);
        } catch (Throwable th2) {
            byteBuffer.position(0);
            throw th2;
        }
    }
}
