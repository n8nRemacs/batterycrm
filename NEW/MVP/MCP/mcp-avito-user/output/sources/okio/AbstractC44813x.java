package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ForwardingFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/x;", "Lokio/v;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44813x extends AbstractC44811v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f420162b;

    public AbstractC44813x(@Y61.k I i12) {
        this.f420162b = i12;
    }

    @Override // okio.AbstractC44811v
    public final void a(@Y61.k S s5) {
        this.f420162b.a(s5);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final List<S> c(@Y61.k S s5) {
        List<S> listC = this.f420162b.c(s5);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add((S) it.next());
        }
        C42745f0.y0(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public final List<S> d(@Y61.k S s5) {
        List<S> listD = this.f420162b.d(s5);
        if (listD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((S) it.next());
        }
        C42745f0.y0(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public final C44810u f(@Y61.k S s5) {
        C44810u c44810uF = this.f420162b.f(s5);
        if (c44810uF == null) {
            return null;
        }
        S s12 = c44810uF.f420155c;
        if (s12 == null) {
            return c44810uF;
        }
        return new C44810u(c44810uF.f420153a, c44810uF.f420154b, s12, c44810uF.f420156d, c44810uF.f420157e, c44810uF.f420158f, c44810uF.f420159g, c44810uF.f420160h);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final AbstractC44809t g(@Y61.k S s5) {
        return this.f420162b.g(s5);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public c0 h(@Y61.k S s5) {
        return this.f420162b.h(s5);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final e0 i(@Y61.k S s5) {
        return this.f420162b.i(s5);
    }

    public final void j(@Y61.k S s5, @Y61.k S s12) throws IOException {
        this.f420162b.k(s5, s12);
    }

    @Y61.k
    public final String toString() {
        return kotlin.jvm.internal.m0.f406844a.b(getClass()).l0() + '(' + this.f420162b + ')';
    }
}
