package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.core.api.JsonParser;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38853hd implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ JsonParser f380702a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Converter f380703b;

    public C38853hd(@Y61.k RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration) {
        this.f380702a = remoteConfigExtensionConfiguration.c();
        this.f380703b = remoteConfigExtensionConfiguration.e();
    }

    @Override // com.yandex.metrica.core.api.Parser
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object parse(@Y61.k JSONObject jSONObject) {
        return this.f380702a.parse(jSONObject);
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object fromModel(Object obj) {
        return (byte[]) this.f380703b.fromModel(obj);
    }

    @Override // com.yandex.metrica.core.api.Parser
    public Object parseOrNull(Object obj) {
        return this.f380702a.parseOrNull((JSONObject) obj);
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object toModel(Object obj) {
        return this.f380703b.toModel((byte[]) obj);
    }

    @j.N
    @Y61.k
    public Object a(@j.N @Y61.k byte[] bArr) {
        return this.f380703b.toModel(bArr);
    }

    @j.N
    @Y61.k
    public byte[] a(@j.N @Y61.k Object obj) {
        return (byte[]) this.f380703b.fromModel(obj);
    }
}
