package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JsonExceptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    @Y61.k
    public static final JsonEncodingException a(@Y61.k Number number, @Y61.k String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, str)));
    }

    @Y61.k
    public static final JsonEncodingException b(@Y61.k SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.getF412728a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getF412729b() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @Y61.k
    public static final JsonDecodingException c(int i12, @Y61.k String str) {
        if (i12 >= 0) {
            str = "Unexpected JSON token at offset " + i12 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    @Y61.k
    public static final JsonDecodingException d(@Y61.k String str, @Y61.k CharSequence charSequence, int i12) {
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, "\nJSON input: ");
        sbZ.append((Object) g(i12, charSequence));
        return c(i12, sbZ.toString());
    }

    @Y61.k
    public static final void e(@Y61.k AbstractC43450a abstractC43450a, @Y61.k String str) {
        abstractC43450a.p(abstractC43450a.f413049a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void f(AbstractC43450a abstractC43450a) {
        e(abstractC43450a, "object");
        throw null;
    }

    @Y61.k
    public static final CharSequence g(int i12, @Y61.k CharSequence charSequence) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i12 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i13 = i12 - 30;
        int i14 = i12 + 30;
        String str = i13 <= 0 ? "" : ".....";
        String str2 = i14 >= charSequence.length() ? "" : ".....";
        StringBuilder sbR = androidx.compose.foundation.H.r(str);
        if (i13 < 0) {
            i13 = 0;
        }
        int length2 = charSequence.length();
        if (i14 > length2) {
            i14 = length2;
        }
        sbR.append(charSequence.subSequence(i13, i14).toString());
        sbR.append(str2);
        return sbR.toString();
    }

    public static final String h(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, str2));
    }
}
