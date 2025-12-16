package M21;

import Y61.k;
import Y61.l;
import com.yandex.div.json.c;
import kotlin.Metadata;

/* compiled from: CachingTemplateProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"LM21/a;", "Lcom/yandex/div/json/c;", "T", "LM21/f;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class a<T extends com.yandex.div.json.c<?>> implements f<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b<T> f10360b;

    public a(@k b bVar, @k d dVar) {
        this.f10360b = bVar;
    }

    @Override // M21.f
    @l
    public final T get(@k String str) {
        T t12 = (T) this.f10360b.get(str);
        if (t12 == null) {
            return null;
        }
        return t12;
    }
}
