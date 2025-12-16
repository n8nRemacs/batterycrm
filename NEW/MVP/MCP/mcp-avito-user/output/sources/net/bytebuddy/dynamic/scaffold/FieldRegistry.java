package net.bytebuddy.dynamic.scaffold;

import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.Transformer;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.utility.nullability.b;

/* loaded from: classes8.dex */
public interface FieldRegistry {

    public interface Compiled extends TypeWriter.FieldPool {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Compiled {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f416826b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f416826b.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public final TypeWriter.FieldPool.a a(net.bytebuddy.description.field.a aVar) {
                return new TypeWriter.FieldPool.a.b(aVar);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements FieldRegistry {

        /* renamed from: a, reason: collision with root package name */
        public final List<b> f416827a;

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.FieldRegistry$a$a, reason: collision with other inner class name */
        public static class C12049a implements Compiled {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f416828b;

            /* renamed from: c, reason: collision with root package name */
            public final ArrayList f416829c;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.scaffold.FieldRegistry$a$a$a, reason: collision with other inner class name */
            public static class C12050a implements InterfaceC44410t<net.bytebuddy.description.field.a> {

                /* renamed from: b, reason: collision with root package name */
                public final InterfaceC44410t<? super net.bytebuddy.description.field.a> f416830b;

                /* renamed from: c, reason: collision with root package name */
                public final FieldAttributeAppender f416831c;

                /* renamed from: d, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                @net.bytebuddy.utility.nullability.b
                public final Long f416832d;

                /* renamed from: e, reason: collision with root package name */
                public final Transformer.NoOp f416833e;

                public C12050a(InterfaceC44410t interfaceC44410t, FieldAttributeAppender fieldAttributeAppender, @net.bytebuddy.utility.nullability.b Long l12, Transformer.NoOp noOp) {
                    this.f416830b = interfaceC44410t;
                    this.f416831c = fieldAttributeAppender;
                    this.f416832d = l12;
                    this.f416833e = noOp;
                }

                @Override // net.bytebuddy.matcher.InterfaceC44410t
                public final boolean b(@net.bytebuddy.utility.nullability.b net.bytebuddy.description.field.a aVar) {
                    return this.f416830b.b(aVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
                
                    if (r2 != null) goto L24;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.dynamic.scaffold.FieldRegistry$a$a$a r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.a.C12049a.C12050a) r5
                        net.bytebuddy.matcher.t<? super net.bytebuddy.description.field.a> r2 = r5.f416830b
                        net.bytebuddy.matcher.t<? super net.bytebuddy.description.field.a> r3 = r4.f416830b
                        boolean r2 = r3.equals(r2)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r2 = r4.f416831c
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r3 = r5.f416831c
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.Long r2 = r4.f416832d
                        java.lang.Long r3 = r5.f416832d
                        if (r3 == 0) goto L3a
                        if (r2 == 0) goto L3c
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3a:
                        if (r2 == 0) goto L3d
                    L3c:
                        return r1
                    L3d:
                        net.bytebuddy.dynamic.Transformer$NoOp r2 = r4.f416833e
                        net.bytebuddy.dynamic.Transformer$NoOp r5 = r5.f416833e
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L48
                        return r1
                    L48:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.FieldRegistry.a.C12049a.C12050a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    int iHashCode = (this.f416831c.hashCode() + ((this.f416830b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31;
                    Long l12 = this.f416832d;
                    if (l12 != null) {
                        iHashCode += l12.hashCode();
                    }
                    return this.f416833e.hashCode() + (iHashCode * 31);
                }
            }

            public C12049a(TypeDescription typeDescription, ArrayList arrayList) {
                this.f416828b = typeDescription;
                this.f416829c = arrayList;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public final TypeWriter.FieldPool.a a(net.bytebuddy.description.field.a aVar) {
                Iterator it = this.f416829c.iterator();
                while (it.hasNext()) {
                    C12050a c12050a = (C12050a) it.next();
                    if (c12050a.f416830b.b(aVar)) {
                        c12050a.f416833e.getClass();
                        return new TypeWriter.FieldPool.a.C12067a(c12050a.f416831c, c12050a.f416832d, aVar);
                    }
                }
                return new TypeWriter.FieldPool.a.b(aVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12049a c12049a = (C12049a) obj;
                return this.f416828b.equals(c12049a.f416828b) && this.f416829c.equals(c12049a.f416829c);
            }

            public final int hashCode() {
                return this.f416829c.hashCode() + D8.j(this.f416828b, getClass().hashCode() * 31, 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements LatentMatcher<net.bytebuddy.description.field.a> {

            /* renamed from: b, reason: collision with root package name */
            public final LatentMatcher.c f416834b;

            /* renamed from: c, reason: collision with root package name */
            public final FieldAttributeAppender.ForInstrumentedField f416835c;

            /* renamed from: d, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            @net.bytebuddy.utility.nullability.b
            public final Long f416836d;

            /* renamed from: e, reason: collision with root package name */
            public final Transformer.NoOp f416837e;

            public b(LatentMatcher.c cVar, FieldAttributeAppender.ForInstrumentedField forInstrumentedField, @net.bytebuddy.utility.nullability.b Long l12, Transformer.NoOp noOp) {
                this.f416834b = cVar;
                this.f416835c = forInstrumentedField;
                this.f416836d = l12;
                this.f416837e = noOp;
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public final InterfaceC44410t<? super net.bytebuddy.description.field.a> a(TypeDescription typeDescription) {
                return this.f416834b.a(typeDescription);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
            
                if (r2 != null) goto L24;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$a$b r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.a.b) r5
                    net.bytebuddy.matcher.LatentMatcher$c r2 = r5.f416834b
                    net.bytebuddy.matcher.LatentMatcher$c r3 = r4.f416834b
                    boolean r2 = r3.equals(r2)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r2 = r4.f416835c
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r3 = r5.f416835c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.lang.Long r2 = r4.f416836d
                    java.lang.Long r3 = r5.f416836d
                    if (r3 == 0) goto L3a
                    if (r2 == 0) goto L3c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3a:
                    if (r2 == 0) goto L3d
                L3c:
                    return r1
                L3d:
                    net.bytebuddy.dynamic.Transformer$NoOp r2 = r4.f416837e
                    net.bytebuddy.dynamic.Transformer$NoOp r5 = r5.f416837e
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.FieldRegistry.a.b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                int iHashCode = (this.f416835c.hashCode() + ((this.f416834b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31;
                Long l12 = this.f416836d;
                if (l12 != null) {
                    iHashCode += l12.hashCode();
                }
                return this.f416837e.hashCode() + (iHashCode * 31);
            }
        }

        public a() {
            this(Collections.emptyList());
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public final C12049a a(TypeDescription typeDescription) {
            List<b> list = this.f416827a;
            ArrayList arrayList = new ArrayList(list.size());
            HashMap map = new HashMap();
            for (b bVar : list) {
                FieldAttributeAppender fieldAttributeAppender = (FieldAttributeAppender) map.get(bVar.f416835c);
                if (fieldAttributeAppender == null) {
                    fieldAttributeAppender = bVar.f416835c;
                    fieldAttributeAppender.getClass();
                    map.put(fieldAttributeAppender, fieldAttributeAppender);
                }
                arrayList.add(new C12049a.C12050a(bVar.f416834b.a(typeDescription), fieldAttributeAppender, bVar.f416836d, bVar.f416837e));
            }
            return new C12049a(typeDescription, arrayList);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public final a b(LatentMatcher.c cVar, FieldAttributeAppender.ForInstrumentedField forInstrumentedField, @net.bytebuddy.utility.nullability.b Long l12, Transformer.NoOp noOp) {
            List<b> list = this.f416827a;
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(new b(cVar, forInstrumentedField, l12, noOp));
            arrayList.addAll(list);
            return new a(arrayList);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416827a.equals(((a) obj).f416827a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416827a.hashCode() + (getClass().hashCode() * 31);
        }

        public a(List<b> list) {
            this.f416827a = list;
        }
    }

    a.C12049a a(TypeDescription typeDescription);

    a b(LatentMatcher.c cVar, FieldAttributeAppender.ForInstrumentedField forInstrumentedField, @b Long l12, Transformer.NoOp noOp);
}
