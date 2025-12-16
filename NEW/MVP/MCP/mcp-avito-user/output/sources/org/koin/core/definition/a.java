package org.koin.core.definition;

import Y41.p;
import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import t71.InterfaceC48513b;
import w71.InterfaceC49462a;

/* compiled from: BeanDefinition.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/definition/a;", "T", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48513b
/* loaded from: classes7.dex */
public final /* data */ class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49462a f421446a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final kotlin.reflect.d<?> f421447b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC49462a f421448c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p<org.koin.core.scope.a, C49177a, T> f421449d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Kind f421450e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends kotlin.reflect.d<?>> f421451f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final c<T> f421452g;

    /* compiled from: BeanDefinition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/reflect/d;", "it", "", "invoke", "(Lkotlin/reflect/d;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: org.koin.core.definition.a$a, reason: collision with other inner class name */
    public static final class C12223a extends N implements Y41.l<kotlin.reflect.d<?>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final C12223a f421453l = new C12223a();

        public C12223a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(kotlin.reflect.d<?> dVar) {
            return A71.b.a(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k InterfaceC49462a interfaceC49462a, @k kotlin.reflect.d<?> dVar, @l InterfaceC49462a interfaceC49462a2, @k p<? super org.koin.core.scope.a, ? super C49177a, ? extends T> pVar, @k Kind kind, @k List<? extends kotlin.reflect.d<?>> list) {
        this.f421446a = interfaceC49462a;
        this.f421447b = dVar;
        this.f421448c = interfaceC49462a2;
        this.f421449d = pVar;
        this.f421450e = kind;
        this.f421451f = list;
        this.f421452g = new c<>(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return L.f(this.f421447b, aVar.f421447b) && L.f(this.f421448c, aVar.f421448c) && L.f(this.f421446a, aVar.f421446a);
    }

    public final int hashCode() {
        InterfaceC49462a interfaceC49462a = this.f421448c;
        return this.f421446a.hashCode() + ((this.f421447b.hashCode() + ((interfaceC49462a != null ? interfaceC49462a.hashCode() : 0) * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r11 = this;
            org.koin.core.definition.Kind r0 = r11.f421450e
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r1.<init>(r2)
            kotlin.reflect.d<?> r2 = r11.f421447b
            java.lang.String r2 = A71.b.a(r2)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            w71.a r2 = r11.f421448c
            java.lang.String r3 = ""
            if (r2 == 0) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ",qualifier:"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 != 0) goto L36
        L35:
            r2 = r3
        L36:
            x71.f$a r4 = x71.f.f442253e
            r4.getClass()
            w71.c r4 = x71.f.f442254f
            w71.a r5 = r11.f421446a
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            if (r4 == 0) goto L47
            r4 = r3
            goto L55
        L47:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = ",scope:"
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L55:
            java.util.List<? extends kotlin.reflect.d<?>> r5 = r11.f421451f
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L76
            java.util.List<? extends kotlin.reflect.d<?>> r3 = r11.f421451f
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            org.koin.core.definition.a$a r9 = org.koin.core.definition.a.C12223a.f421453l
            r7 = 0
            r8 = 0
            java.lang.String r6 = ","
            r10 = 30
            java.lang.String r3 = kotlin.collections.C42745f0.O(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = ",binds:"
            java.lang.String r3 = r5.concat(r3)
        L76:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.a.toString():java.lang.String");
    }

    public a(InterfaceC49462a interfaceC49462a, kotlin.reflect.d dVar, InterfaceC49462a interfaceC49462a2, p pVar, Kind kind, List list, int i12, C42822w c42822w) {
        this(interfaceC49462a, dVar, (i12 & 4) != 0 ? null : interfaceC49462a2, pVar, kind, (i12 & 32) != 0 ? C42784z0.f406748b : list);
    }
}
