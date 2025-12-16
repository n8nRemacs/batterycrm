package Ba1;

import androidx.view.M0;
import androidx.view.P0;
import androidx.view.T0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k implements kotlin.properties.g {

    /* renamed from: b, reason: collision with root package name */
    public final Class f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final N f1504c;

    /* renamed from: d, reason: collision with root package name */
    public P0 f1505d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Class cls, Y41.a aVar) {
        this.f1503b = cls;
        this.f1504c = (N) aVar;
    }

    public final M0 a(T0 t02) {
        if (this.f1505d == null) {
            this.f1505d = new P0(t02, new j(this));
        }
        P0 p02 = this.f1505d;
        if (p02 == null) {
            p02 = null;
        }
        return p02.a(this.f1503b);
    }

    @Override // kotlin.properties.g
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kotlin.reflect.n nVar) {
        throw null;
    }
}
