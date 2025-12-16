package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.ArrayList;

/* compiled from: BaseDataSource.java */
/* renamed from: com.google.android.exoplayer2.upstream.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36575e implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f347911a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<M> f347912b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f347913c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public p f347914d;

    public AbstractC36575e(boolean z12) {
        this.f347911a = z12;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        ArrayList<M> arrayList = this.f347912b;
        if (arrayList.contains(m12)) {
            return;
        }
        arrayList.add(m12);
        this.f347913c++;
    }

    public final void l(int i12) {
        p pVar = this.f347914d;
        int i13 = U.f348106a;
        for (int i14 = 0; i14 < this.f347913c; i14++) {
            this.f347912b.get(i14).e(pVar, this.f347911a, i12);
        }
    }

    public final void m() {
        p pVar = this.f347914d;
        int i12 = U.f348106a;
        for (int i13 = 0; i13 < this.f347913c; i13++) {
            this.f347912b.get(i13).f(pVar, this.f347911a);
        }
        this.f347914d = null;
    }

    public final void n(p pVar) {
        for (int i12 = 0; i12 < this.f347913c; i12++) {
            this.f347912b.get(i12).getClass();
        }
    }

    public final void o(p pVar) {
        this.f347914d = pVar;
        for (int i12 = 0; i12 < this.f347913c; i12++) {
            this.f347912b.get(i12).d(pVar, this.f347911a);
        }
    }
}
