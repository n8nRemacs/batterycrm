package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import Y61.k;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import l51.C43548b;
import s51.C48000a;

/* compiled from: BuiltInSerializerProtocol.kt */
@s0
/* loaded from: classes8.dex */
public final class a extends C48000a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f409779m = new a();

    public a() {
        f fVar = new f();
        C43548b.a(fVar);
        super(fVar, C43548b.f413514c, C43548b.f413513b, C43548b.f413515d, C43548b.f413516e, C43548b.f413517f, C43548b.f413518g, C43548b.f413520i, C43548b.f413519h, C43548b.f413521j, C43548b.f413522k, C43548b.f413523l);
    }

    @k
    public static String a(@k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.b().replace('.', '/'));
        sb2.append('/');
        sb2.append((cVar.d() ? "default-package" : cVar.f().b()).concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
