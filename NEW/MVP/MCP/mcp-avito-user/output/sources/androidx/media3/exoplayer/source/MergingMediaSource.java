package androidx.media3.exoplayer.source;

import androidx.media3.common.P;
import androidx.media3.common.z;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.F;
import com.google.common.collect.InterfaceC37408s2;
import com.google.common.collect.W2;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class MergingMediaSource extends AbstractC23154e<Integer> {

    /* renamed from: t, reason: collision with root package name */
    public static final androidx.media3.common.z f49601t;

    /* renamed from: l, reason: collision with root package name */
    public final A[] f49602l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.media3.common.P[] f49603m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<A> f49604n;

    /* renamed from: o, reason: collision with root package name */
    public final C23160k f49605o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC37408s2 f49606p;

    /* renamed from: q, reason: collision with root package name */
    public int f49607q;

    /* renamed from: r, reason: collision with root package name */
    public long[][] f49608r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public IllegalMergeException f49609s;

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public static final class a extends AbstractC23166q {
        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            super.n(i12, bVar, z12);
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            super.u(i12, dVar, j12);
            throw null;
        }
    }

    static {
        z.c cVar = new z.c();
        cVar.f47988a = "MergingMediaSource";
        f49601t = cVar.a();
    }

    public MergingMediaSource(A... aArr) {
        C23160k c23160k = new C23160k();
        this.f49602l = aArr;
        this.f49605o = c23160k;
        this.f49604n = new ArrayList<>(Arrays.asList(aArr));
        this.f49607q = -1;
        this.f49603m = new androidx.media3.common.P[aArr.length];
        this.f49608r = new long[0][];
        new HashMap();
        this.f49606p = W2.a().a().c();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        super.C();
        Arrays.fill(this.f49603m, (Object) null);
        this.f49607q = -1;
        this.f49609s = null;
        ArrayList<A> arrayList = this.f49604n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f49602l);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    @j.P
    public final A.b D(Integer num, A.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final void G(Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        Integer num = (Integer) obj;
        if (this.f49609s != null) {
            return;
        }
        if (this.f49607q == -1) {
            this.f49607q = p12.p();
        } else if (p12.p() != this.f49607q) {
            this.f49609s = new IllegalMergeException();
            return;
        }
        int length = this.f49608r.length;
        androidx.media3.common.P[] pArr = this.f49603m;
        if (length == 0) {
            this.f49608r = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f49607q, pArr.length);
        }
        ArrayList<A> arrayList = this.f49604n;
        arrayList.remove(abstractC23150a);
        pArr[num.intValue()] = p12;
        if (arrayList.isEmpty()) {
            z(pArr[0]);
        }
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        A[] aArr = this.f49602l;
        int length = aArr.length;
        InterfaceC23174z[] interfaceC23174zArr = new InterfaceC23174z[length];
        androidx.media3.common.P[] pArr = this.f49603m;
        int iG2 = pArr[0].g(bVar.f47212a);
        for (int i12 = 0; i12 < length; i12++) {
            interfaceC23174zArr[i12] = aArr[i12].e(bVar.b(pArr[i12].t(iG2)), bVar2, j12 - this.f49608r[iG2][i12]);
        }
        return new F(this.f49605o, this.f49608r[iG2], interfaceC23174zArr);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        A[] aArr = this.f49602l;
        return aArr.length > 0 ? aArr[0].getMediaItem() : f49601t;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        F f12 = (F) interfaceC23174z;
        int i12 = 0;
        while (true) {
            A[] aArr = this.f49602l;
            if (i12 >= aArr.length) {
                return;
            }
            A a12 = aArr[i12];
            InterfaceC23174z interfaceC23174z2 = f12.f49489b[i12];
            if (interfaceC23174z2 instanceof F.b) {
                interfaceC23174z2 = ((F.b) interfaceC23174z2).f49500b;
            }
            a12.k(interfaceC23174z2);
            i12++;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f49609s;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        super.y(b12);
        int i12 = 0;
        while (true) {
            A[] aArr = this.f49602l;
            if (i12 >= aArr.length) {
                return;
            }
            H(Integer.valueOf(i12), aArr[i12]);
            i12++;
        }
    }
}
