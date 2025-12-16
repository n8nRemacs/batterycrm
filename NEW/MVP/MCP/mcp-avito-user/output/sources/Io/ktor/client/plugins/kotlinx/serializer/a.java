package io.ktor.client.plugins.kotlinx.serializer;

import Y41.l;
import Y61.k;
import io.ktor.client.plugins.json.h;
import io.ktor.http.C41524i;
import io.ktor.http.content.w;
import io.ktor.utils.io.core.x;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import kotlin.reflect.r;
import kotlinx.serialization.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43446d;
import kotlinx.serialization.json.v;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.modules.m;

/* compiled from: KotlinxSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/kotlinx/serializer/a;", "Lio/ktor/client/plugins/json/h;", "b", "ktor-client-serialization"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final AbstractC43443a f399484b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC43443a f399485a;

    /* compiled from: KotlinxSerializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/d;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/json/d;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.client.plugins.kotlinx.serializer.a$a, reason: collision with other inner class name */
    public static final class C11405a extends N implements l<C43446d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11405a f399486l = new C11405a();

        public C11405a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43446d c43446d) {
            C43446d c43446d2 = c43446d;
            c43446d2.f412967d = false;
            c43446d2.f412966c = false;
            c43446d2.f412975l = true;
            c43446d2.f412972i = false;
            return G0.f406611a;
        }
    }

    /* compiled from: KotlinxSerializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/kotlinx/serializer/a$b;", "", "<init>", "()V", "ktor-client-serialization"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f399484b = v.a(C11405a.f399486l);
    }

    public a() {
        this(null, 1, null);
    }

    @Override // io.ktor.client.plugins.json.h
    @k
    public final Object a(@k U31.b bVar, @k x xVar) throws Throwable {
        String strY = x.y(xVar);
        AbstractC43443a abstractC43443a = this.f399485a;
        f fVar = abstractC43443a.f412956b;
        d<?> dVar = bVar.f16154a;
        KSerializer<Object> kSerializerB = fVar.b(dVar, C42784z0.f406748b);
        if (kSerializerB == null) {
            r rVar = bVar.f16156c;
            kSerializerB = rVar != null ? C.e(m.f413167a, rVar) : C.c(dVar);
        }
        return abstractC43443a.d(strY, kSerializerB);
    }

    @Override // io.ktor.client.plugins.json.h
    @k
    public final w b(@k C41524i c41524i, @k Object obj) {
        AbstractC43443a abstractC43443a = this.f399485a;
        return new w(abstractC43443a.c(io.ktor.client.plugins.kotlinx.serializer.b.a(obj, abstractC43443a.f412956b), obj), c41524i, null, 4, null);
    }

    public a(AbstractC43443a abstractC43443a, int i12, C42822w c42822w) {
        this.f399485a = (i12 & 1) != 0 ? f399484b : abstractC43443a;
    }
}
