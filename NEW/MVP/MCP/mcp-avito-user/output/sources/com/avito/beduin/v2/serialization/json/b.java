package com.avito.beduin.v2.serialization.json;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.EnableTypedPrimitives;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultJsonDataDeserializer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/serialization/json/b;", "Lcom/avito/beduin/v2/serialization/json/f;", "a", "json_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PU0.b f338338a;

    /* compiled from: DefaultJsonDataDeserializer.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/serialization/json/b$a;", "", "json_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PU0.b f338339a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C36272i f338340b;

        public a(@k PU0.b bVar, @k C36272i c36272i) {
            this.f338339a = bVar;
            this.f338340b = c36272i;
        }

        public final com.avito.beduin.v2.engine.field.d a(PU0.f fVar) {
            if (fVar instanceof PU0.g) {
                return com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            if (fVar instanceof PU0.j) {
                PU0.j jVar = (PU0.j) fVar;
                C36272i c36272i = this.f338340b;
                c36272i.getClass();
                EnableTypedPrimitives.f336458c.getClass();
                EnableTypedPrimitives enableTypedPrimitives = EnableTypedPrimitives.f336459d;
                EnableTypedPrimitives enableTypedPrimitives2 = c36272i.f336893a;
                return (v) i.a(jVar, enableTypedPrimitives2 == enableTypedPrimitives || enableTypedPrimitives2 == EnableTypedPrimitives.f336460e, new com.avito.beduin.v2.serialization.json.a(c36272i));
            }
            if (fVar instanceof PU0.d) {
                PU0.d dVar = (PU0.d) fVar;
                ArrayList arrayList = new ArrayList(C42745f0.q(dVar, 10));
                Iterator<PU0.f> it = dVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return new C36268a(arrayList);
            }
            if (!(fVar instanceof PU0.h)) {
                return com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            PU0.h hVar = (PU0.h) fVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(hVar.size()));
            Iterator<T> it2 = hVar.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), a((PU0.f) entry.getValue()));
            }
            return new A(new m(linkedHashMap), null, 2, null);
        }
    }

    public b(@k PU0.b bVar) {
        this.f338338a = bVar;
    }

    @Override // com.avito.beduin.v2.serialization.json.f
    @k
    public final com.avito.beduin.v2.engine.field.d a(@k C36272i c36272i, @k String str) {
        PU0.b bVar = this.f338338a;
        return new a(bVar, c36272i).a(bVar.d(str));
    }
}
