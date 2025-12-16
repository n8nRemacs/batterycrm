package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.C43066x;

/* compiled from: JvmPackagePartSource.kt */
@s0
/* loaded from: classes8.dex */
public final class t implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p51.d f408544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final p51.d f408545c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final z f408546d;

    public t() {
        throw null;
    }

    public t(@Y61.k z zVar, @Y61.k ProtoBuf.f fVar, @Y61.k m51.f fVar2) {
        p51.d dVarB = p51.d.b(zVar.c());
        KotlinClassHeader kotlinClassHeaderA = zVar.a();
        kotlinClassHeaderA.getClass();
        p51.d dVarD = null;
        String str = kotlinClassHeaderA.f408489a == KotlinClassHeader.Kind.f408503j ? kotlinClassHeaderA.f408494f : null;
        if (str != null && str.length() > 0) {
            dVarD = p51.d.d(str);
        }
        this.f408544b = dVarB;
        this.f408545c = dVarD;
        this.f408546d = zVar;
        Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(fVar, JvmProtoBuf.f409157m);
        if (num != null) {
            fVar2.getString(num.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b0
    @Y61.k
    public final c0 a() {
        return c0.f407540a;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b c() {
        kotlin.reflect.jvm.internal.impl.name.c cVar;
        p51.d dVar = this.f408544b;
        String str = dVar.f428199a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = kotlin.reflect.jvm.internal.impl.name.c.f409242c;
            if (cVar == null) {
                p51.d.a(7);
                throw null;
            }
        } else {
            cVar = new kotlin.reflect.jvm.internal.impl.name.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = dVar.e();
        return new kotlin.reflect.jvm.internal.impl.name.b(cVar, kotlin.reflect.jvm.internal.impl.name.f.e(C43066x.n0('/', strE, strE)));
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(t.class, sb2, ": ");
        sb2.append(this.f408544b);
        return sb2.toString();
    }
}
