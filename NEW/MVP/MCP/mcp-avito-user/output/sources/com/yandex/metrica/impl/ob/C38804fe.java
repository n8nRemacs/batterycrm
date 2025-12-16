package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38804fe implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38754de f380589a = new C38754de();

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cf.a fromModel(@j.N C38779ee c38779ee) {
        Cf.a aVar = new Cf.a();
        if (!TextUtils.isEmpty(c38779ee.f380481a)) {
            aVar.f377904a = c38779ee.f380481a;
        }
        aVar.f377905b = c38779ee.f380482b.toString();
        aVar.f377906c = c38779ee.f380483c;
        aVar.f377907d = c38779ee.f380484d;
        aVar.f377908e = this.f380589a.fromModel(c38779ee.f380485e).intValue();
        return aVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38779ee toModel(@j.N Cf.a aVar) {
        JSONObject jSONObject;
        String str = aVar.f377904a;
        String str2 = aVar.f377905b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C38779ee(str, jSONObject, aVar.f377906c, aVar.f377907d, this.f380589a.toModel(Integer.valueOf(aVar.f377908e)));
    }
}
