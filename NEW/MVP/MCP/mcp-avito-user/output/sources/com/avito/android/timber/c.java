package com.avito.android.timber;

import Y61.k;
import Y61.l;
import com.avito.android.server_time.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.C43066x;
import pc1.b;

/* compiled from: TimberBufferingTree.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/timber/c;", "Lpc1/b$c;", "Lcom/avito/android/timber/a;", "a", "_common_timber_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends b.c implements com.avito.android.timber.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f301442b;

    /* renamed from: d, reason: collision with root package name */
    public int f301444d;

    /* renamed from: e, reason: collision with root package name */
    public int f301445e;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f301443c = new Object();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a[] f301446f = new a[500];

    /* compiled from: TimberBufferingTree.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/timber/c$a;", "", "_common_timber_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final long f301447a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @l
        public final String f301448b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @l
        public final String f301449c;

        public a(long j12, @l String str, @l String str2) {
            this.f301447a = j12;
            this.f301448b = str;
            this.f301449c = str2;
        }
    }

    @Inject
    public c(@k f fVar) {
        this.f301442b = fVar;
    }

    @Override // com.avito.android.timber.a
    @k
    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.f301443c) {
            try {
                int i12 = this.f301444d;
                a[] aVarArr = this.f301446f;
                if (i12 < aVarArr.length) {
                    ArrayList arrayListB = C42756l.B(C42756l.a0(aVarArr, s.r(0, this.f301445e)));
                    arrayList = new ArrayList(C42745f0.q(arrayListB, 10));
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("| " + d.f301450a.format(new Date(aVar.f301447a)) + ' ');
                        String str = aVar.f301448b;
                        if (str != null && str.length() != 0) {
                            sb2.append("| " + aVar.f301448b + ' ');
                        }
                        String str2 = aVar.f301449c;
                        if (str2 != null && str2.length() != 0) {
                            sb2.append("| " + aVar.f301449c);
                        }
                        arrayList.add(C43066x.A0(sb2.toString()).toString());
                    }
                } else {
                    ArrayList arrayListB2 = C42756l.B(C42756l.X(C42756l.a0(aVarArr, s.r(this.f301445e, aVarArr.length)), C42756l.a0(this.f301446f, s.r(0, this.f301445e))));
                    arrayList = new ArrayList(C42745f0.q(arrayListB2, 10));
                    Iterator it2 = arrayListB2.iterator();
                    while (it2.hasNext()) {
                        a aVar2 = (a) it2.next();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("| " + d.f301450a.format(new Date(aVar2.f301447a)) + ' ');
                        String str3 = aVar2.f301448b;
                        if (str3 != null && str3.length() != 0) {
                            sb3.append("| " + aVar2.f301448b + ' ');
                        }
                        String str4 = aVar2.f301449c;
                        if (str4 != null && str4.length() != 0) {
                            sb3.append("| " + aVar2.f301449c);
                        }
                        arrayList.add(C43066x.A0(sb3.toString()).toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // pc1.b.c
    public final void j(int i12, @l String str, @k String str2, @l Throwable th2) {
        if (L.f(str, "CrashlyticsEventTracker") || i12 <= 3) {
            return;
        }
        synchronized (this.f301443c) {
            this.f301446f[this.f301445e] = new a(this.f301442b.now(), str, str2);
            int i13 = this.f301445e + 1;
            a[] aVarArr = this.f301446f;
            this.f301445e = i13 % aVarArr.length;
            int i14 = this.f301444d + 1;
            int length = aVarArr.length;
            if (i14 > length) {
                i14 = length;
            }
            this.f301444d = i14;
            G0 g02 = G0.f406611a;
        }
    }
}
