package coil.decode;

import coil.decode.n;
import coil.disk.a;
import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okio.AbstractC44811v;
import okio.InterfaceC44804n;
import okio.S;
import okio.Y;

/* compiled from: ImageSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/m;", "Lcoil/decode/n;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f58301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC44811v f58302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f58303d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final a.c f58304e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58305f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y f58306g;

    public m(@Y61.k S s5, @Y61.k AbstractC44811v abstractC44811v, @Y61.l String str, @Y61.l a.c cVar) {
        super(null);
        this.f58301b = s5;
        this.f58302c = abstractC44811v;
        this.f58303d = str;
        this.f58304e = cVar;
    }

    @Override // coil.decode.n
    @Y61.l
    /* renamed from: a */
    public final n.a getF58310b() {
        return null;
    }

    @Override // coil.decode.n
    @Y61.k
    public final synchronized InterfaceC44804n b() {
        if (this.f58305f) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        Y y12 = this.f58306g;
        if (y12 != null) {
            return y12;
        }
        Y y13 = new Y(this.f58302c.i(this.f58301b));
        this.f58306g = y13;
        return y13;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f58305f = true;
            Y y12 = this.f58306g;
            if (y12 != null) {
                coil.util.l.a(y12);
            }
            a.c cVar = this.f58304e;
            if (cVar != null) {
                coil.util.l.a(cVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
