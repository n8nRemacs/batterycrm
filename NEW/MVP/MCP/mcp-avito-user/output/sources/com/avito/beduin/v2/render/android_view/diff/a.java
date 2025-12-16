package com.avito.beduin.v2.render.android_view.diff;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BatchingDiffOpCallback.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/a;", "Lcom/avito/beduin/v2/render/android_view/diff/g;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f337957a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public AbstractC10472a f337958b;

    /* compiled from: BatchingDiffOpCallback.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/a$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/beduin/v2/render/android_view/diff/a$a$a;", "Lcom/avito/beduin/v2/render/android_view/diff/a$a$b;", "Lcom/avito/beduin/v2/render/android_view/diff/a$a$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.render.android_view.diff.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10472a {

        /* compiled from: BatchingDiffOpCallback.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/a$a$a;", "Lcom/avito/beduin/v2/render/android_view/diff/a$a;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.render.android_view.diff.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10473a extends AbstractC10472a {

            /* renamed from: a, reason: collision with root package name */
            public int f337959a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ArrayList f337960b;

            public C10473a(int i12, @Y61.k ArrayList arrayList) {
                super(null);
                this.f337959a = i12;
                this.f337960b = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10473a)) {
                    return false;
                }
                C10473a c10473a = (C10473a) obj;
                return this.f337959a == c10473a.f337959a && L.f(this.f337960b, c10473a.f337960b);
            }

            public final int hashCode() {
                return this.f337960b.hashCode() + (Integer.hashCode(this.f337959a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Change(pos=");
                sb2.append(this.f337959a);
                sb2.append(", newPositions=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f337960b, ')');
            }
        }

        /* compiled from: BatchingDiffOpCallback.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/a$a$b;", "Lcom/avito/beduin/v2/render/android_view/diff/a$a;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.render.android_view.diff.a$a$b */
        public static final /* data */ class b extends AbstractC10472a {

            /* renamed from: a, reason: collision with root package name */
            public int f337961a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ArrayList f337962b;

            public b(int i12, @Y61.k ArrayList arrayList) {
                super(null);
                this.f337961a = i12;
                this.f337962b = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f337961a == bVar.f337961a && L.f(this.f337962b, bVar.f337962b);
            }

            public final int hashCode() {
                return this.f337962b.hashCode() + (Integer.hashCode(this.f337961a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Insert(pos=");
                sb2.append(this.f337961a);
                sb2.append(", newPositions=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f337962b, ')');
            }
        }

        /* compiled from: BatchingDiffOpCallback.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/a$a$c;", "Lcom/avito/beduin/v2/render/android_view/diff/a$a;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.render.android_view.diff.a$a$c */
        public static final /* data */ class c extends AbstractC10472a {

            /* renamed from: a, reason: collision with root package name */
            public int f337963a;

            /* renamed from: b, reason: collision with root package name */
            public int f337964b;

            public c(int i12, int i13) {
                super(null);
                this.f337963a = i12;
                this.f337964b = i13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f337963a == cVar.f337963a && this.f337964b == cVar.f337964b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f337964b) + (Integer.hashCode(this.f337963a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Remove(pos=");
                sb2.append(this.f337963a);
                sb2.append(", cnt=");
                return r.t(sb2, this.f337964b, ')');
            }

            public /* synthetic */ c(int i12, int i13, int i14, C42822w c42822w) {
                this(i12, (i14 & 2) != 0 ? 1 : i13);
            }
        }

        public /* synthetic */ AbstractC10472a(C42822w c42822w) {
            this();
        }

        public AbstractC10472a() {
        }
    }

    public a(@Y61.k g gVar) {
        this.f337957a = gVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void a(int i12, int i13) {
        AbstractC10472a abstractC10472a = this.f337958b;
        if (abstractC10472a instanceof AbstractC10472a.C10473a) {
            int i14 = i12 + 1;
            AbstractC10472a.C10473a c10473a = (AbstractC10472a.C10473a) abstractC10472a;
            int i15 = c10473a.f337959a;
            if (i14 >= i15) {
                ArrayList arrayList = c10473a.f337960b;
                if (i12 <= arrayList.size() + i15) {
                    int i16 = c10473a.f337959a;
                    int i17 = i12 - i16;
                    c10473a.f337959a = Math.min(i12, i16);
                    Integer numValueOf = Integer.valueOf(i13);
                    if (i17 < -1 || i17 > arrayList.size()) {
                        StringBuilder sbJ = G.j(i17, "Invalid index = ", ", out of bounds [-1..");
                        sbJ.append(arrayList.size());
                        sbJ.append(']');
                        throw new IllegalStateException(sbJ.toString().toString());
                    }
                    if (i17 == -1) {
                        arrayList.add(0, numValueOf);
                        return;
                    }
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        arrayList.set(i17, numValueOf);
                        return;
                    } else {
                        if (i17 == arrayList.size()) {
                            arrayList.add(numValueOf);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        g();
        this.f337958b = new AbstractC10472a.C10473a(i12, C42745f0.e0(Integer.valueOf(i13)));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void b(int i12, int i13) {
        AbstractC10472a.c cVar;
        int i14;
        AbstractC10472a abstractC10472a = this.f337958b;
        if (!(abstractC10472a instanceof AbstractC10472a.c) || (i14 = (cVar = (AbstractC10472a.c) abstractC10472a).f337963a) < i12 || i14 > i12 + i13) {
            g();
            this.f337958b = new AbstractC10472a.c(i12, i13);
        } else {
            cVar.f337963a = i12;
            cVar.f337964b += i13;
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void c(int i12, int i13) {
        AbstractC10472a.b bVar;
        int i14;
        AbstractC10472a abstractC10472a = this.f337958b;
        if ((abstractC10472a instanceof AbstractC10472a.b) && i12 >= (i14 = (bVar = (AbstractC10472a.b) abstractC10472a).f337961a)) {
            ArrayList arrayList = bVar.f337962b;
            if (i12 <= arrayList.size() + i14) {
                int i15 = bVar.f337961a;
                bVar.f337961a = Math.min(i12, i15);
                arrayList.add(i12 - i15, Integer.valueOf(i13));
                return;
            }
        }
        g();
        this.f337958b = new AbstractC10472a.b(i12, C42745f0.e0(Integer.valueOf(i13)));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void d(int i12, int i13) {
        g();
        this.f337957a.d(i12, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void e(int i12, @Y61.k ArrayList arrayList) {
        AbstractC10472a abstractC10472a = this.f337958b;
        if (abstractC10472a instanceof AbstractC10472a.C10473a) {
            int size = arrayList.size() + i12;
            AbstractC10472a.C10473a c10473a = (AbstractC10472a.C10473a) abstractC10472a;
            int i13 = c10473a.f337959a;
            if (size >= i13) {
                ArrayList arrayList2 = c10473a.f337960b;
                if (i12 <= arrayList2.size() + i13) {
                    int i14 = c10473a.f337959a;
                    int i15 = i12 - i14;
                    c10473a.f337959a = Math.min(i12, i14);
                    if (i15 < (-arrayList.size()) || i15 > arrayList2.size()) {
                        StringBuilder sbJ = G.j(i15, "Invalid index = ", ", out of bounds [-");
                        sbJ.append(arrayList.size());
                        sbJ.append("..");
                        sbJ.append(arrayList2.size());
                        sbJ.append(']');
                        throw new IllegalStateException(sbJ.toString().toString());
                    }
                    int size2 = arrayList2.size();
                    int i16 = 0;
                    int i17 = 0;
                    while (i15 < 0) {
                        arrayList2.add(i17, arrayList.get(i17));
                        i15++;
                        i16++;
                        i17++;
                    }
                    int i18 = i15 + i16;
                    int i19 = size2 + i16;
                    while (i17 < arrayList.size() && i18 < i19) {
                        arrayList2.set(i18, arrayList.get(i17));
                        i18++;
                        i17++;
                    }
                    while (i17 < arrayList.size()) {
                        arrayList2.add(arrayList.get(i17));
                        i17++;
                    }
                    return;
                }
            }
        }
        g();
        this.f337958b = new AbstractC10472a.C10473a(i12, new ArrayList(arrayList));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void f(int i12, @Y61.k ArrayList arrayList) {
        AbstractC10472a.b bVar;
        int i13;
        AbstractC10472a abstractC10472a = this.f337958b;
        if ((abstractC10472a instanceof AbstractC10472a.b) && i12 >= (i13 = (bVar = (AbstractC10472a.b) abstractC10472a).f337961a)) {
            ArrayList arrayList2 = bVar.f337962b;
            if (i12 <= arrayList2.size() + i13) {
                int i14 = bVar.f337961a;
                bVar.f337961a = Math.min(i12, i14);
                arrayList2.addAll(i12 - i14, arrayList);
                return;
            }
        }
        g();
        this.f337958b = new AbstractC10472a.b(i12, new ArrayList(arrayList));
    }

    public final void g() {
        AbstractC10472a abstractC10472a = this.f337958b;
        boolean z12 = abstractC10472a instanceof AbstractC10472a.b;
        g gVar = this.f337957a;
        if (z12) {
            AbstractC10472a.b bVar = (AbstractC10472a.b) abstractC10472a;
            ArrayList arrayList = bVar.f337962b;
            if (arrayList.size() == 1) {
                gVar.c(bVar.f337961a, ((Number) arrayList.get(0)).intValue());
            } else {
                gVar.f(bVar.f337961a, arrayList);
            }
        } else if (abstractC10472a instanceof AbstractC10472a.c) {
            AbstractC10472a.c cVar = (AbstractC10472a.c) abstractC10472a;
            gVar.b(cVar.f337963a, cVar.f337964b);
        } else if (abstractC10472a instanceof AbstractC10472a.C10473a) {
            AbstractC10472a.C10473a c10473a = (AbstractC10472a.C10473a) abstractC10472a;
            ArrayList arrayList2 = c10473a.f337960b;
            if (arrayList2.size() == 1) {
                gVar.a(c10473a.f337959a, ((Number) arrayList2.get(0)).intValue());
            } else {
                gVar.e(c10473a.f337959a, arrayList2);
            }
        }
        this.f337958b = null;
    }
}
