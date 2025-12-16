package Zd0;

import Y61.k;
import com.avito.android.account.G;
import com.avito.android.remote.H;
import com.avito.android.server_time.h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishSessionIdGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd0/d;", "LZd0/c;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements InterfaceC19545c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f20320a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f20321b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final H f20322c;

    @Inject
    public d(@k h hVar, @k G g12, @k H h12) {
        this.f20320a = hVar;
        this.f20321b = g12;
        this.f20322c = h12;
    }

    @Override // Zd0.InterfaceC19545c
    @k
    public final String a() {
        String strB = this.f20321b.i().b();
        if (strB == null) {
            strB = this.f20322c.getValue();
        }
        return strB + "_Android_" + this.f20320a.now();
    }
}
