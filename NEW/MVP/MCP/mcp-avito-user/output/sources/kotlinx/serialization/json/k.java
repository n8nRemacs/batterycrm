package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.internal.T;
import kotlinx.serialization.internal.V;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.m0;

/* compiled from: JsonElement.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final T f413132a;

    static {
        u0 u0Var = u0.f406856a;
        f413132a = V.a("kotlinx.serialization.json.JsonUnquotedLiteral", V0.f412822a);
    }

    @Y61.k
    public static final JsonPrimitive a(@Y61.l Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new w(bool, false, null, 4, null);
    }

    @Y61.k
    public static final JsonPrimitive b(@Y61.l Number number) {
        return number == null ? JsonNull.INSTANCE : new w(number, false, null, 4, null);
    }

    @Y61.k
    public static final JsonPrimitive c(@Y61.l String str) {
        return str == null ? JsonNull.INSTANCE : new w(str, true, null, 4, null);
    }

    public static final int d(@Y61.k JsonPrimitive jsonPrimitive) {
        try {
            long jI2 = new m0(jsonPrimitive.getF413144d()).i();
            if (-2147483648L <= jI2 && jI2 <= 2147483647L) {
                return (int) jI2;
            }
            throw new NumberFormatException(jsonPrimitive.getF413144d() + " is not an Int");
        } catch (JsonDecodingException e12) {
            throw new NumberFormatException(e12.getMessage());
        }
    }
}
