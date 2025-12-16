package org.koin.core.scope;

import Y61.k;
import Y61.l;
import android.content.ComponentCallbacks;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C49177a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;
import t71.InterfaceC48513b;
import w71.InterfaceC49462a;

/* compiled from: Scope.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/scope/a;", "", "Lorg/koin/mp/Lockable;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48513b
/* loaded from: classes7.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49462a f421471a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f421472b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f421473c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final o71.d f421474d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList<a> f421475e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ComponentCallbacks f421476f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList<g> f421477g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C42754k<C49177a> f421478h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f421479i;

    /* compiled from: Scope.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: org.koin.core.scope.a$a, reason: collision with other inner class name */
    public static final class C12224a extends N implements Y41.a<G0> {
        public C12224a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            AbstractC48011b abstractC48011b = aVar.f421474d.f419399c;
            StringBuilder sb2 = new StringBuilder("|- (-) Scope - id:'");
            String str = aVar.f421472b;
            String strC = C22026a.c(sb2, str, '\'');
            Level level = Level.f421465b;
            if (abstractC48011b.b(level)) {
                abstractC48011b.a(level, strC);
            }
            ArrayList<g> arrayList = aVar.f421477g;
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            arrayList.clear();
            aVar.f421476f = null;
            aVar.f421479i = true;
            x71.f fVar = aVar.f421474d.f419397a;
            Collection collectionValues = fVar.f442255a.f419398b.f442251b.values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof org.koin.core.instance.f) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                org.koin.core.instance.f fVar2 = (org.koin.core.instance.f) it2.next();
                if (aVar != null) {
                    fVar2.f421460a.f421452g.f421454a.getClass();
                    throw null;
                }
                fVar2.getClass();
            }
            fVar.f442257c.remove(str);
            return G0.f406611a;
        }
    }

    /* compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C49177a f421482m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C49177a c49177a) {
            super(0);
            this.f421482m = c49177a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f421478h.addFirst(this.f421482m);
            return G0.f406611a;
        }
    }

    /* compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lv71/a;", "invoke", "()Lv71/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.a<C49177a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C49177a invoke() {
            return a.this.f421478h.v();
        }
    }

    public /* synthetic */ a(InterfaceC49462a interfaceC49462a, String str, boolean z12, o71.d dVar, int i12, C42822w c42822w) {
        this(interfaceC49462a, str, (i12 & 4) != 0 ? false : z12, dVar);
    }

    public final void a() {
        org.koin.mp.d dVar = org.koin.mp.d.f421487a;
        C12224a c12224a = new C12224a();
        dVar.getClass();
        org.koin.mp.d.a(c12224a, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.l Y41.a r10, @Y61.k kotlin.reflect.d r11, @Y61.l w71.InterfaceC49462a r12) throws org.koin.core.error.ClosedScopeException, org.koin.core.error.NoBeanDefFoundException {
        /*
            r9 = this;
            o71.d r0 = r9.f421474d
            s71.b r1 = r0.f419399c
            org.koin.core.logger.Level r2 = org.koin.core.logger.Level.f421465b
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L83
            r1 = 39
            if (r12 == 0) goto L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " with qualifier '"
            r3.<init>(r4)
            r3.append(r12)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L25
        L23:
            java.lang.String r3 = ""
        L25:
            s71.b r4 = r0.f419399c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "|- '"
            r5.<init>(r6)
            java.lang.String r7 = A71.b.a(r11)
            r5.append(r7)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " ..."
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.a(r2, r1)
            org.koin.mp.c r1 = org.koin.mp.c.f421486a
            r1.getClass()
            long r3 = java.lang.System.nanoTime()
            java.lang.Object r10 = r9.d(r10, r11, r12)
            long r7 = java.lang.System.nanoTime()
            long r7 = r7 - r3
            double r3 = (double) r7
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r7
            s71.b r12 = r0.f419399c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r11 = A71.b.a(r11)
            r0.append(r11)
            java.lang.String r11 = "' in "
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = " ms"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.a(r2, r11)
            goto L87
        L83:
            java.lang.Object r10 = r9.d(r10, r11, r12)
        L87:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.a.b(Y41.a, kotlin.reflect.d, w71.a):java.lang.Object");
    }

    @l
    public final Object c(@l Y41.a aVar, @k kotlin.reflect.d dVar, @l InterfaceC49462a interfaceC49462a) {
        Level level = Level.f421465b;
        o71.d dVar2 = this.f421474d;
        try {
            return b(aVar, dVar, interfaceC49462a);
        } catch (ClosedScopeException unused) {
            AbstractC48011b abstractC48011b = dVar2.f419399c;
            String str = "* Scope closed - no instance found for " + A71.b.a(dVar) + " on scope " + this;
            if (!abstractC48011b.b(level)) {
                return null;
            }
            abstractC48011b.a(level, str);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            AbstractC48011b abstractC48011b2 = dVar2.f419399c;
            String str2 = "* No instance found for " + A71.b.a(dVar) + " on scope " + this;
            if (!abstractC48011b2.b(level)) {
                return null;
            }
            abstractC48011b2.a(level, str2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(Y41.a r10, kotlin.reflect.d r11, w71.InterfaceC49462a r12) throws org.koin.core.error.ClosedScopeException, org.koin.core.error.NoBeanDefFoundException {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.a.d(Y41.a, kotlin.reflect.d, w71.a):java.lang.Object");
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f421471a, aVar.f421471a) && L.f(this.f421472b, aVar.f421472b) && this.f421473c == aVar.f421473c && L.f(this.f421474d, aVar.f421474d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD2 = H.d(this.f421471a.hashCode() * 31, 31, this.f421472b);
        boolean z12 = this.f421473c;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return this.f421474d.hashCode() + ((iD2 + i12) * 31);
    }

    @k
    public final String toString() {
        return AK.c.s(new StringBuilder("['"), this.f421472b, "']");
    }

    public a(@k InterfaceC49462a interfaceC49462a, @k String str, boolean z12, @k o71.d dVar) {
        this.f421471a = interfaceC49462a;
        this.f421472b = str;
        this.f421473c = z12;
        this.f421474d = dVar;
        this.f421475e = new ArrayList<>();
        this.f421477g = new ArrayList<>();
        this.f421478h = new C42754k<>();
    }
}
