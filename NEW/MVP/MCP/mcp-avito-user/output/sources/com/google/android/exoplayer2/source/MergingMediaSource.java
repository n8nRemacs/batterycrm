package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
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

/* loaded from: classes6.dex */
public final class MergingMediaSource extends AbstractC36542e<Integer> {

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.android.exoplayer2.O f346074t;

    /* renamed from: l, reason: collision with root package name */
    public final y[] f346075l;

    /* renamed from: m, reason: collision with root package name */
    public final s0[] f346076m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<y> f346077n;

    /* renamed from: o, reason: collision with root package name */
    public final C36547j f346078o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC37408s2 f346079p;

    /* renamed from: q, reason: collision with root package name */
    public int f346080q;

    /* renamed from: r, reason: collision with root package name */
    public long[][] f346081r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public IllegalMergeException f346082s;

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public static final class a extends AbstractC36552o {
        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            super.f(i12, bVar, z12);
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            super.m(i12, dVar, j12);
            throw null;
        }
    }

    static {
        O.c cVar = new O.c();
        cVar.f343534a = "MergingMediaSource";
        f346074t = cVar.a();
    }

    public MergingMediaSource(y... yVarArr) {
        C36547j c36547j = new C36547j();
        this.f346075l = yVarArr;
        this.f346078o = c36547j;
        this.f346077n = new ArrayList<>(Arrays.asList(yVarArr));
        this.f346080q = -1;
        this.f346076m = new s0[yVarArr.length];
        this.f346081r = new long[0][];
        new HashMap();
        this.f346079p = W2.a().a().c();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        super.B(m12);
        int i12 = 0;
        while (true) {
            y[] yVarArr = this.f346075l;
            if (i12 >= yVarArr.length) {
                return;
            }
            H(Integer.valueOf(i12), yVarArr[i12]);
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        super.D();
        Arrays.fill(this.f346076m, (Object) null);
        this.f346080q = -1;
        this.f346082s = null;
        ArrayList<y> arrayList = this.f346077n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f346075l);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    @j.P
    public final y.b E(Integer num, y.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final void G(Object obj, AbstractC36538a abstractC36538a, s0 s0Var) {
        Integer num = (Integer) obj;
        if (this.f346082s != null) {
            return;
        }
        if (this.f346080q == -1) {
            this.f346080q = s0Var.h();
        } else if (s0Var.h() != this.f346080q) {
            this.f346082s = new IllegalMergeException();
            return;
        }
        int length = this.f346081r.length;
        s0[] s0VarArr = this.f346076m;
        if (length == 0) {
            this.f346081r = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f346080q, s0VarArr.length);
        }
        ArrayList<y> arrayList = this.f346077n;
        arrayList.remove(abstractC36538a);
        s0VarArr[num.intValue()] = s0Var;
        if (arrayList.isEmpty()) {
            C(s0VarArr[0]);
        }
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        y[] yVarArr = this.f346075l;
        int length = yVarArr.length;
        InterfaceC36559w[] interfaceC36559wArr = new InterfaceC36559w[length];
        s0[] s0VarArr = this.f346076m;
        int iB2 = s0VarArr[0].b(bVar.f346696a);
        for (int i12 = 0; i12 < length; i12++) {
            interfaceC36559wArr[i12] = yVarArr[i12].c(bVar.b(s0VarArr[i12].l(iB2)), interfaceC36572b, j12 - this.f346081r[iB2][i12]);
        }
        return new C(this.f346078o, this.f346081r[iB2], interfaceC36559wArr);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        y[] yVarArr = this.f346075l;
        return yVarArr.length > 0 ? yVarArr[0].getMediaItem() : f346074t;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f346082s;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        C c12 = (C) interfaceC36559w;
        int i12 = 0;
        while (true) {
            y[] yVarArr = this.f346075l;
            if (i12 >= yVarArr.length) {
                return;
            }
            y yVar = yVarArr[i12];
            InterfaceC36559w interfaceC36559w2 = c12.f345907b[i12];
            if (interfaceC36559w2 instanceof C.b) {
                interfaceC36559w2 = ((C.b) interfaceC36559w2).f345918b;
            }
            yVar.t(interfaceC36559w2);
            i12++;
        }
    }
}
