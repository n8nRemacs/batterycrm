package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Ud;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Sd implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38754de f379376a;

    public Sd() {
        this(new C38754de());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cf.b fromModel(@j.N Ud.a aVar) {
        Cf.b bVar = new Cf.b();
        if (!TextUtils.isEmpty(aVar.f379613a)) {
            bVar.f377910a = aVar.f379613a;
        }
        bVar.f377911b = aVar.f379614b.toString();
        bVar.f377912c = this.f379376a.fromModel(aVar.f379615c).intValue();
        return bVar;
    }

    @j.k0
    public Sd(@j.N C38754de c38754de) {
        this.f379376a = c38754de;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ud.a toModel(@j.N Cf.b bVar) {
        JSONObject jSONObject;
        String str = bVar.f377910a;
        String str2 = bVar.f377911b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new Ud.a(str, jSONObject, this.f379376a.toModel(Integer.valueOf(bVar.f377912c)));
    }
}
