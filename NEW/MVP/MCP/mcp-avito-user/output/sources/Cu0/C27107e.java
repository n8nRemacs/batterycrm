package cU0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.component.InterfaceC36242b;
import com.avito.beduin.v2.engine.field.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetaFunctionBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU0/e;", "Lcom/avito/beduin/v2/engine/component/b;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C27107e implements InterfaceC36242b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final h f57906a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.engine.field.f<?> f57907b;

    public C27107e(@l h hVar, @k com.avito.beduin.v2.engine.field.f<?> fVar) {
        this.f57906a = hVar;
        this.f57907b = fVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27107e)) {
            return false;
        }
        C27107e c27107e = (C27107e) obj;
        return L.f(this.f57906a, c27107e.f57906a) && L.f(this.f57907b, c27107e.f57907b);
    }

    public final int hashCode() {
        h hVar = this.f57906a;
        return this.f57907b.hashCode() + ((hVar == null ? 0 : hVar.f336867a.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "MetaFunctionBlueprint(params=" + this.f57906a + ", result=" + this.f57907b + ')';
    }
}
