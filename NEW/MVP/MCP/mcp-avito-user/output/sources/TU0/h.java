package TU0;

import com.avito.beduin.v2.engine.field.entity.w;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.o;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LTU0/h;", "Lcom/avito/beduin/v2/serialization/json/h;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.beduin.v2.serialization.json.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f15679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f15680b;

    public h(o oVar, j jVar) {
        this.f15679a = oVar;
        this.f15680b = jVar;
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final w a(long j12) {
        return this.f15679a.c(this.f15680b, j12);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final w b(String str) {
        this.f15679a.getClass();
        return new w.e(this.f15680b, str);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final w c(double d12) {
        return this.f15679a.b(this.f15680b, d12);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final w d(boolean z12) {
        return this.f15679a.d(this.f15680b, z12);
    }
}
