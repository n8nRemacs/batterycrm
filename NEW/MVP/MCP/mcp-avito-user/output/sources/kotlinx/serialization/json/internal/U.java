package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.C43471w;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/U;", "Lkotlinx/serialization/json/internal/c;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
class U extends AbstractC43452c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final JsonObject f413025f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f413026g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final SerialDescriptor f413027h;

    /* renamed from: i, reason: collision with root package name */
    public int f413028i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f413029j;

    public /* synthetic */ U(AbstractC43443a abstractC43443a, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i12, C42822w c42822w) {
        this(abstractC43443a, jsonObject, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c, kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    public final boolean E() {
        return !this.f413029j && super.E();
    }

    @Override // kotlinx.serialization.internal.AbstractC43424q0
    @Y61.k
    public String V(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        Object next;
        AbstractC43443a abstractC43443a = this.f413063c;
        kotlinx.serialization.json.z zVarD = L.d(serialDescriptor, abstractC43443a);
        String strD = serialDescriptor.d(i12);
        if (zVarD == null && (!this.f413065e.f412992l || getF413043k().f412952b.keySet().contains(strD))) {
            return strD;
        }
        Map map = (Map) abstractC43443a.f412957c.a(serialDescriptor, L.f413014a, new I(serialDescriptor, abstractC43443a));
        Iterator<T> it = getF413043k().f412952b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) map.get((String) next);
            if (num != null && num.intValue() == i12) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strA = zVarD != null ? zVarD.a(strD) : null;
        return strA == null ? strD : strA;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    public JsonElement W(@Y61.k String str) {
        return (JsonElement) P0.d(getF413043k(), str);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    /* renamed from: b0, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getF413020f() {
        return this.f413025f;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c, kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final kotlinx.serialization.encoding.c c(@Y61.k SerialDescriptor serialDescriptor) {
        SerialDescriptor serialDescriptor2 = this.f413027h;
        if (serialDescriptor != serialDescriptor2) {
            return super.c(serialDescriptor);
        }
        JsonElement jsonElementX = X();
        if (jsonElementX instanceof JsonObject) {
            String str = this.f413026g;
            return new U(this.f413063c, (JsonObject) jsonElementX, str, serialDescriptor2);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        sb2.append(n0Var.b(JsonObject.class));
        sb2.append(" as the serialized body of ");
        sb2.append(serialDescriptor2.getF412799a());
        sb2.append(", but had ");
        sb2.append(n0Var.b(jsonElementX.getClass()));
        throw D.c(-1, sb2.toString());
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c, kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.c
    public void d(@Y61.k SerialDescriptor serialDescriptor) {
        Set setH;
        C43448f c43448f = this.f413065e;
        if (c43448f.f412982b || (serialDescriptor.getF412729b() instanceof kotlinx.serialization.descriptors.d)) {
            return;
        }
        AbstractC43443a abstractC43443a = this.f413063c;
        kotlinx.serialization.json.z zVarD = L.d(serialDescriptor, abstractC43443a);
        if (zVarD == null && !c43448f.f412992l) {
            setH = D0.a(serialDescriptor);
        } else if (zVarD != null) {
            setH = ((Map) abstractC43443a.f412957c.a(serialDescriptor, L.f413014a, new I(serialDescriptor, abstractC43443a))).keySet();
        } else {
            Set<String> setA = D0.a(serialDescriptor);
            C43471w c43471w = abstractC43443a.f412957c;
            C43471w.a<Map<String, Integer>> aVar = L.f413014a;
            Map map = (Map) c43471w.f413131a.get(serialDescriptor);
            Object obj = map != null ? map.get(aVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = B0.f406639b;
            }
            setH = b1.h(setA, setKeySet);
        }
        for (String str : getF413043k().f412952b.keySet()) {
            if (!setH.contains(str) && !kotlin.jvm.internal.L.f(str, this.f413026g)) {
                String string = getF413043k().toString();
                StringBuilder sbA = androidx.appcompat.app.r.A("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbA.append((Object) D.g(-1, string));
                throw D.c(-1, sbA.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public int j(@Y61.k SerialDescriptor serialDescriptor) {
        while (this.f413028i < serialDescriptor.getF412801c()) {
            int i12 = this.f413028i;
            this.f413028i = i12 + 1;
            String strV = V(serialDescriptor, i12);
            int i13 = this.f413028i - 1;
            boolean z12 = false;
            this.f413029j = false;
            boolean zContainsKey = getF413043k().containsKey(strV);
            AbstractC43443a abstractC43443a = this.f413063c;
            if (!zContainsKey) {
                if (!abstractC43443a.f412955a.f412986f && !serialDescriptor.i(i13) && serialDescriptor.h(i13).b()) {
                    z12 = true;
                }
                this.f413029j = z12;
                if (!z12) {
                    continue;
                }
            }
            if (this.f413065e.f412988h && serialDescriptor.i(i13)) {
                SerialDescriptor serialDescriptorH = serialDescriptor.h(i13);
                if (serialDescriptorH.b() || !(W(strV) instanceof JsonNull)) {
                    if (kotlin.jvm.internal.L.f(serialDescriptorH.getF412729b(), o.b.f412750a) && (!serialDescriptorH.b() || !(W(strV) instanceof JsonNull))) {
                        JsonElement jsonElementW = W(strV);
                        String f413144d = null;
                        JsonPrimitive jsonPrimitive = jsonElementW instanceof JsonPrimitive ? (JsonPrimitive) jsonElementW : null;
                        if (jsonPrimitive != null) {
                            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
                            if (!(jsonPrimitive instanceof JsonNull)) {
                                f413144d = jsonPrimitive.getF413144d();
                            }
                        }
                        if (f413144d != null && L.a(serialDescriptorH, abstractC43443a, f413144d) == -3) {
                        }
                    }
                }
            }
            return i13;
        }
        return -1;
    }

    public U(@Y61.k AbstractC43443a abstractC43443a, @Y61.k JsonObject jsonObject, @Y61.l String str, @Y61.l SerialDescriptor serialDescriptor) {
        super(abstractC43443a, jsonObject, null);
        this.f413025f = jsonObject;
        this.f413026g = str;
        this.f413027h = serialDescriptor;
    }
}
