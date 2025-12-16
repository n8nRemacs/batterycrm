package C21;

import Y61.k;
import com.yandex.div.json.i;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ErrorsCollectorEnvironment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC21/e;", "Lcom/yandex/div/json/e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements com.yandex.div.json.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f1880a;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final M21.f<com.yandex.div.json.c<?>> f1882c;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f1881b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f1883d = new i() { // from class: C21.d
        @Override // com.yandex.div.json.i
        public final void a(Exception exc) {
            e eVar = this.f1879b;
            eVar.f1881b.add(exc);
            eVar.f1880a.a(exc);
        }
    };

    /* JADX WARN: Type inference failed for: r2v2, types: [C21.d] */
    public e(@k com.yandex.div.json.e eVar) {
        this.f1880a = eVar.getF370579a();
        this.f1882c = eVar.a();
    }

    @Override // com.yandex.div.json.e
    @k
    public final M21.f<com.yandex.div.json.c<?>> a() {
        return this.f1882c;
    }

    @Override // com.yandex.div.json.e
    @k
    /* renamed from: b */
    public final i getF370579a() {
        return this.f1883d;
    }
}
