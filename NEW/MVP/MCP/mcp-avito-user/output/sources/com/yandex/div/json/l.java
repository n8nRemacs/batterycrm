package com.yandex.div.json;

import androidx.collection.C20199a;
import com.yandex.div.internal.parser.B;
import com.yandex.div.internal.parser.w;
import com.yandex.div.internal.parser.z;
import com.yandex.div.json.c;
import com.yandex.div2.AbstractC38259a7;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TemplateParsingEnvironment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/json/l;", "Lcom/yandex/div/json/c;", "T", "Lcom/yandex/div/json/e;", "a", "b", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class l<T extends c<?>> implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f370579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M21.a<T> f370580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M21.a f370581c;

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/l$a;", "T", "", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a<T> {
    }

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/json/l$b;", "T", "", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<T> {
    }

    @X41.j
    public l(@Y61.k i iVar, @Y61.k M21.a<T> aVar) {
        this.f370579a = iVar;
        this.f370580b = aVar;
        this.f370581c = aVar;
    }

    @Override // com.yandex.div.json.e
    @Y61.k
    public M21.f<T> a() {
        return this.f370581c;
    }

    @Override // com.yandex.div.json.e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final i getF370579a() {
        return this.f370579a;
    }

    public final void c(@Y61.k JSONObject jSONObject) throws JSONException {
        M21.a<T> aVar = this.f370580b;
        i iVar = this.f370579a;
        C20199a c20199a = new C20199a();
        C20199a c20199a2 = new C20199a();
        try {
            w.f370146a.getClass();
            LinkedHashMap linkedHashMapC = w.c(jSONObject, iVar, this);
            c20199a.putAll(aVar.f10360b.f10361b);
            M21.f.f10363a.getClass();
            M21.e eVar = new M21.e(c20199a);
            for (Map.Entry entry : linkedHashMapC.entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    z zVar = new z(eVar, new B(iVar, str));
                    AK.c cVar = ((C21.c) this).f1878e;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    cVar.getClass();
                    AbstractC38259a7.f374357a.getClass();
                    c20199a.put(str, AbstractC38259a7.b.a(zVar, true, jSONObject2));
                    if (!set.isEmpty()) {
                        c20199a2.put(str, set);
                    }
                } catch (ParsingException e12) {
                    iVar.b(e12);
                }
            }
        } catch (Exception e13) {
            iVar.a(e13);
        }
        aVar.getClass();
        for (Map.Entry entry2 : c20199a.entrySet()) {
            aVar.f10360b.f10361b.put((String) entry2.getKey(), (c) entry2.getValue());
        }
    }

    public l(i iVar, M21.a aVar, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            M21.b bVar = new M21.b();
            M21.f.f10363a.getClass();
            aVar = new M21.a(bVar, new M21.d());
        }
        this(iVar, aVar);
    }
}
