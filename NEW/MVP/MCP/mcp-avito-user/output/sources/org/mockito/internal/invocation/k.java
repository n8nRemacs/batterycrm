package org.mockito.internal.invocation;

import e81.InterfaceC39968b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MatcherApplicationStrategy.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39968b f421662a;

    /* renamed from: b, reason: collision with root package name */
    public final List<org.mockito.d<?>> f421663b;

    /* renamed from: c, reason: collision with root package name */
    public final a f421664c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatcherApplicationStrategy.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f421665b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f421666c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f421667d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f421668e;

        static {
            a aVar = new a("ONE_MATCHER_PER_ARGUMENT", 0);
            f421665b = aVar;
            a aVar2 = new a("MATCH_EACH_VARARGS_WITH_LAST_MATCHER", 1);
            f421666c = aVar2;
            a aVar3 = new a("ERROR_UNSUPPORTED_NUMBER_OF_MATCHERS", 2);
            f421667d = aVar3;
            f421668e = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f421668e.clone();
        }
    }

    public k(InterfaceC39968b interfaceC39968b, List<org.mockito.d<?>> list, a aVar) {
        this.f421662a = interfaceC39968b;
        if (aVar == a.f421666c) {
            int length = interfaceC39968b.D().length - interfaceC39968b.j5().length;
            org.mockito.d dVar = (org.mockito.d) androidx.media3.exoplayer.analytics.m.h(1, list);
            ArrayList arrayList = new ArrayList(list);
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(dVar);
            }
            this.f421663b = arrayList;
        } else {
            this.f421663b = list;
        }
        this.f421664c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.mockito.internal.invocation.k b(e81.InterfaceC39968b r3, java.util.List<org.mockito.d<?>> r4) {
        /*
            java.lang.Object[] r0 = r3.j5()
            int r0 = r0.length
            java.lang.Object[] r1 = r3.D()
            int r1 = r1.length
            int r2 = r4.size()
            if (r1 != r2) goto L13
            org.mockito.internal.invocation.k$a r0 = org.mockito.internal.invocation.k.a.f421665b
            goto L30
        L13:
            if (r0 != r2) goto L2e
            r0 = 1
            java.lang.Object r0 = androidx.media3.exoplayer.analytics.m.h(r0, r4)
            org.mockito.d r0 = (org.mockito.d) r0
            boolean r1 = r0 instanceof S71.a
            if (r1 == 0) goto L27
            S71.a r0 = (S71.a) r0
            r0.getClass()
            r0 = 0
            goto L29
        L27:
            boolean r0 = r0 instanceof V71.B
        L29:
            if (r0 == 0) goto L2e
            org.mockito.internal.invocation.k$a r0 = org.mockito.internal.invocation.k.a.f421666c
            goto L30
        L2e:
            org.mockito.internal.invocation.k$a r0 = org.mockito.internal.invocation.k.a.f421667d
        L30:
            org.mockito.internal.invocation.k r1 = new org.mockito.internal.invocation.k
            r1.<init>(r3, r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.invocation.k.b(e81.b, java.util.List):org.mockito.internal.invocation.k");
    }

    public final boolean a(b bVar) {
        if (this.f421664c == a.f421667d) {
            return false;
        }
        Object[] objArrD = this.f421662a.D();
        for (int i12 = 0; i12 < objArrD.length; i12++) {
            if (!bVar.a(this.f421663b.get(i12), objArrD[i12])) {
                return false;
            }
        }
        return true;
    }
}
