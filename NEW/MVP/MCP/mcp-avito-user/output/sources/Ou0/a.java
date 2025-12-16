package OU0;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.q;

/* compiled from: KotlinxJson.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LOU0/a;", "LPU0/b;", "<init>", "()V", "a", "LOU0/a$a;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a implements PU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C0792a f12286a = new C0792a(null);

    /* compiled from: KotlinxJson.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOU0/a$a;", "LOU0/a;", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OU0.a$a, reason: collision with other inner class name */
    public static final class C0792a extends a {
        public /* synthetic */ C0792a(C42822w c42822w) {
            this();
        }

        public C0792a() {
            super(null);
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @Override // PU0.b
    public final j a(float f12) {
        return new j(kotlinx.serialization.json.k.b(Float.valueOf(f12)));
    }

    @Override // PU0.b
    public final h b(l lVar) {
        i iVar = new i();
        lVar.invoke(iVar);
        return new h(new JsonObject(iVar.f12293a));
    }

    @Override // PU0.b
    public final g c() {
        return g.f12291b;
    }

    @Override // PU0.b
    @k
    public final e d(@k String str) {
        AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
        c11757a.getClass();
        return f.b((JsonElement) c11757a.d(str, q.f413138a));
    }

    @Override // PU0.b
    public final j e(String str) {
        return new j(kotlinx.serialization.json.k.c(str));
    }

    @Override // PU0.b
    public final j f(long j12) {
        return new j(kotlinx.serialization.json.k.b(Long.valueOf(j12)));
    }

    @Override // PU0.b
    public final c g(l lVar) {
        d dVar = new d();
        lVar.invoke(dVar);
        return new c(new JsonArray(dVar.f12290a));
    }

    @Override // PU0.b
    public final j h(boolean z12) {
        return new j(kotlinx.serialization.json.k.a(Boolean.valueOf(z12)));
    }

    @Override // PU0.b
    public final j i(double d12) {
        return new j(kotlinx.serialization.json.k.b(Double.valueOf(d12)));
    }

    public a() {
    }
}
