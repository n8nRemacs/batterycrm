package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.entity.x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f336773a = a.f336774a;

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f336774a = new a();

        public static final Object a(a aVar, d dVar, z zVar) {
            aVar.getClass();
            if (zVar.getF175484a().f19477a) {
                return dVar;
            }
            return m0.f406844a.b(dVar.getClass()).l0();
        }
    }

    /* compiled from: Field.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        @Y61.l
        public static void a(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to ArrayData");
        }

        @Y61.l
        public static void b(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to ComponentData");
        }

        @Y61.l
        public static void c(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to InteractionData");
        }

        @Y61.l
        public static void d(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to MutableData");
        }

        @Y61.l
        public static void e(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to PrimitiveData");
        }

        @Y61.k
        public static void f(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to RawData");
        }

        @Y61.l
        public static void g(@Y61.k z zVar, @Y61.k d dVar) {
            throw new UnsupportedOperationException(a.a(d.f336773a, dVar, zVar) + " can't be converted to StructureData");
        }

        public static boolean h(@Y61.k d dVar, @Y61.k z zVar, @Y61.k d dVar2) {
            return L.f(dVar.h(zVar), dVar2.h(zVar));
        }
    }

    @Y61.l
    A a(@Y61.k z zVar);

    boolean b(@Y61.k z zVar, @Y61.k d dVar);

    @Y61.k
    d c(@Y61.k z zVar);

    @Y61.l
    com.avito.beduin.v2.engine.field.entity.l e(@Y61.k z zVar);

    @Y61.k
    x g(@Y61.k z zVar);

    @Y61.k
    d h(@Y61.k z zVar);

    @Y61.l
    com.avito.beduin.v2.engine.field.entity.p k(@Y61.k z zVar);

    @Y61.l
    C36268a l(@Y61.k z zVar);

    @Y61.k
    f<d> m(@Y61.k z zVar);

    @Y61.l
    v q(@Y61.k z zVar);

    @Y61.l
    com.avito.beduin.v2.engine.field.entity.c r(@Y61.k z zVar);
}
