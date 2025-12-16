package coil.decode;

import coil.decode.n;
import com.avito.android.remote.model.AdvertStatus;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okio.AbstractC44811v;
import okio.InterfaceC44804n;
import okio.Y;

/* compiled from: ImageSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/u;", "Lcoil/decode/n;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u extends n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final n.a f58310b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58311c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public InterfaceC44804n f58312d;

    public u(@Y61.k InterfaceC44804n interfaceC44804n, @Y61.k Y41.a<? extends File> aVar, @Y61.l n.a aVar2) {
        super(null);
        this.f58310b = aVar2;
        this.f58312d = interfaceC44804n;
    }

    @Override // coil.decode.n
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final n.a getF58310b() {
        return this.f58310b;
    }

    @Override // coil.decode.n
    @Y61.k
    public final synchronized InterfaceC44804n b() {
        if (this.f58311c) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        InterfaceC44804n interfaceC44804n = this.f58312d;
        if (interfaceC44804n != null) {
            return interfaceC44804n;
        }
        Y y12 = new Y(AbstractC44811v.f420161a.i(null));
        this.f58312d = y12;
        return y12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f58311c = true;
        InterfaceC44804n interfaceC44804n = this.f58312d;
        if (interfaceC44804n != null) {
            coil.util.l.a(interfaceC44804n);
        }
    }
}
