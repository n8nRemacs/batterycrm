package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.C42794h;
import kotlin.Function3;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonTreeReader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/c0;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC43450a f413066a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413067b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413068c;

    /* renamed from: d, reason: collision with root package name */
    public int f413069d;

    public c0(@Y61.k C43448f c43448f, @Y61.k AbstractC43450a abstractC43450a) {
        this.f413066a = abstractC43450a;
        this.f413067b = c43448f.f412983c;
        this.f413068c = c43448f.f412995o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0082 -> B:27:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.serialization.json.internal.c0 r13, kotlin.AbstractC42799j r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.c0.a(kotlinx.serialization.json.internal.c0, kotlin.j, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final JsonElement b() {
        JsonElement jsonObject;
        AbstractC43450a abstractC43450a = this.f413066a;
        byte bV2 = abstractC43450a.v();
        if (bV2 == 1) {
            return d(true);
        }
        if (bV2 == 0) {
            return d(false);
        }
        if (bV2 != 6) {
            if (bV2 == 8) {
                return c();
            }
            AbstractC43450a.q(abstractC43450a, "Cannot read Json element because of unexpected ".concat(C43451b.b(bV2)), 0, null, 6);
            throw null;
        }
        int i12 = this.f413069d + 1;
        this.f413069d = i12;
        if (i12 == 200) {
            jsonObject = (JsonElement) Function3.a(new C42794h(new a0(this, null)), G0.f406611a);
        } else {
            byte bG2 = abstractC43450a.g((byte) 6);
            if (abstractC43450a.v() == 4) {
                AbstractC43450a.q(abstractC43450a, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!abstractC43450a.c()) {
                    break;
                }
                String strL = this.f413067b ? abstractC43450a.l() : abstractC43450a.j();
                abstractC43450a.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG2 = abstractC43450a.f();
                if (bG2 != 4) {
                    if (bG2 != 7) {
                        AbstractC43450a.q(abstractC43450a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG2 == 6) {
                abstractC43450a.g((byte) 7);
            } else if (bG2 == 4) {
                if (!this.f413068c) {
                    D.f(abstractC43450a);
                    throw null;
                }
                abstractC43450a.g((byte) 7);
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f413069d--;
        return jsonObject;
    }

    public final JsonArray c() {
        AbstractC43450a abstractC43450a = this.f413066a;
        byte bF2 = abstractC43450a.f();
        if (abstractC43450a.v() == 4) {
            AbstractC43450a.q(abstractC43450a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC43450a.c()) {
            arrayList.add(b());
            bF2 = abstractC43450a.f();
            if (bF2 != 4) {
                boolean z12 = bF2 == 9;
                int i12 = abstractC43450a.f413049a;
                if (!z12) {
                    AbstractC43450a.q(abstractC43450a, "Expected end of the array or comma", i12, null, 4);
                    throw null;
                }
            }
        }
        if (bF2 == 8) {
            abstractC43450a.g((byte) 9);
        } else if (bF2 == 4) {
            if (!this.f413068c) {
                D.e(abstractC43450a, "array");
                throw null;
            }
            abstractC43450a.g((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z12) {
        boolean z13 = this.f413067b;
        AbstractC43450a abstractC43450a = this.f413066a;
        String strL = (z13 || !z12) ? abstractC43450a.l() : abstractC43450a.j();
        return (z12 || !kotlin.jvm.internal.L.f(strL, "null")) ? new kotlinx.serialization.json.w(strL, z12, null, 4, null) : JsonNull.INSTANCE;
    }
}
