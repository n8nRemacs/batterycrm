package mV0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.d;
import kotlin.Metadata;
import oV0.C44695a;

/* compiled from: InMemoryRepositoryClient.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LmV0/a;", "LoV0/c;", "", "Lcom/avito/beduin/v2/engine/field/d;", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44019a implements oV0.c<String, d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44695a f414543a;

    public C44019a(@k C44695a c44695a) {
        this.f414543a = c44695a;
    }

    @Override // oV0.d
    public final void a(String str) {
        this.f414543a.a(str);
    }

    @Override // oV0.d
    public final Object b(Object obj) {
        d dVar = (d) this.f414543a.f419806a.get((String) obj);
        if (dVar != null) {
            return dVar.h(F.f336593b);
        }
        return null;
    }

    public final void d(@k String str) {
        this.f414543a.a(str);
    }

    @Override // oV0.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void c(@l d dVar, @k String str) {
        this.f414543a.c(dVar != null ? dVar.h(F.f336593b) : null, str);
    }
}
