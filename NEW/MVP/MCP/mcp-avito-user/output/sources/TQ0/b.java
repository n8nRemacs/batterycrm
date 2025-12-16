package tQ0;

import com.avito.android.ab_tests.configs.ZstdTestGroup;
import com.avito.android.zstd.i;
import com.avito.android.zstd.k;
import com.avito.android.zstd.l;
import com.avito.android.zstd.m;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ZstdInternalModule_ZstdInterceptorFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C48596a f439249a;

    /* renamed from: b, reason: collision with root package name */
    public final k f439250b;

    /* renamed from: c, reason: collision with root package name */
    public final m f439251c;

    public b(C48596a c48596a, k kVar, m mVar) {
        this.f439249a = c48596a;
        this.f439250b = kVar;
        this.f439251c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        l lVar = (l) this.f439251c.get();
        this.f439249a.getClass();
        ZstdTestGroup zstdTestGroup = lVar.f331392a;
        zstdTestGroup.getClass();
        if (zstdTestGroup == ZstdTestGroup.f67935c && !lVar.f331393b.x().invoke().booleanValue()) {
            i.f331365c2.getClass();
            obj = i.a.f331367b;
        } else {
            obj = (i) this.f439250b.get();
        }
        t.d(obj);
        return obj;
    }
}
