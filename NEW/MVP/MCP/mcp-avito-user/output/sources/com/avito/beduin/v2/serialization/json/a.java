package com.avito.beduin.v2.serialization.json;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.v;
import kotlin.Metadata;

/* compiled from: DefaultJsonDataDeserializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/serialization/json/a;", "Lcom/avito/beduin/v2/serialization/json/h;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "json_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36272i f338337a;

    public a(C36272i c36272i) {
        this.f338337a = c36272i;
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final v a(long j12) {
        return this.f338337a.d(j12);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final v b(String str) {
        return this.f338337a.e(str);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final v c(double d12) {
        return this.f338337a.a(d12);
    }

    @Override // com.avito.beduin.v2.serialization.json.h
    public final v d(boolean z12) {
        return this.f338337a.f(z12);
    }
}
