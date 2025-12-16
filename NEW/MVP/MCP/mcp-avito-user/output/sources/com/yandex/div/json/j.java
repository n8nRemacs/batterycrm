package com.yandex.div.json;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParsingException.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    @Y61.k
    public static final ParsingException a(@Y61.k JSONObject jSONObject, @Y61.k String str, @Y61.k ParsingException parsingException) {
        return new ParsingException(ParsingExceptionReason.f370549g, AK.c.k("Value for key '", str, "' is failed to create"), parsingException, new com.yandex.div.internal.util.h(jSONObject), com.yandex.div.internal.util.j.b(jSONObject));
    }

    @Y61.k
    public static final ParsingException b(Object obj, @Y61.k String str) {
        return new ParsingException(ParsingExceptionReason.f370548f, "Value '" + j(obj) + "' at path '" + str + "' is not valid", null, null, null, 28, null);
    }

    @Y61.k
    public static final <T> ParsingException c(@Y61.k JSONArray jSONArray, @Y61.k String str, int i12, T t12) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.f370548f;
        StringBuilder sb2 = new StringBuilder("Value '");
        sb2.append(j(t12));
        sb2.append("' at ");
        sb2.append(i12);
        sb2.append(" position of '");
        return new ParsingException(parsingExceptionReason, AK.c.s(sb2, str, "' is not valid"), null, new com.yandex.div.internal.util.f(jSONArray), com.yandex.div.internal.util.j.a(jSONArray), 4, null);
    }

    @Y61.k
    public static final ParsingException d(@Y61.k JSONArray jSONArray, @Y61.k String str, int i12, Object obj, @Y61.k Exception exc) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.f370548f;
        StringBuilder sb2 = new StringBuilder("Value '");
        sb2.append(j(obj));
        sb2.append("' at ");
        sb2.append(i12);
        sb2.append(" position of '");
        return new ParsingException(parsingExceptionReason, AK.c.s(sb2, str, "' is not valid"), exc, new com.yandex.div.internal.util.f(jSONArray), null, 16, null);
    }

    @Y61.k
    public static final <T> ParsingException e(@Y61.k JSONObject jSONObject, @Y61.k String str, T t12) {
        return new ParsingException(ParsingExceptionReason.f370548f, "Value '" + j(t12) + "' for key '" + str + "' is not valid", null, new com.yandex.div.internal.util.h(jSONObject), com.yandex.div.internal.util.j.b(jSONObject), 4, null);
    }

    @Y61.k
    public static final ParsingException f(@Y61.k JSONObject jSONObject, @Y61.k String str, Object obj, @Y61.k Exception exc) {
        return new ParsingException(ParsingExceptionReason.f370548f, "Value '" + j(obj) + "' for key '" + str + "' is not valid", exc, new com.yandex.div.internal.util.h(jSONObject), null, 16, null);
    }

    @Y61.k
    public static final ParsingException g(@Y61.k String str, @Y61.k JSONObject jSONObject) {
        return new ParsingException(ParsingExceptionReason.f370545c, AK.c.k("Value for key '", str, "' is missing"), null, new com.yandex.div.internal.util.h(jSONObject), com.yandex.div.internal.util.j.b(jSONObject), 4, null);
    }

    @Y61.k
    public static final ParsingException h(@Y61.k JSONArray jSONArray, @Y61.k String str, int i12) {
        return new ParsingException(ParsingExceptionReason.f370545c, "Value at " + i12 + " position of '" + str + "' is missing", null, new com.yandex.div.internal.util.f(jSONArray), com.yandex.div.internal.util.j.a(jSONArray), 4, null);
    }

    @Y61.k
    public static final ParsingException i(@Y61.k String str, Object obj, @Y61.l Exception exc) {
        return new ParsingException(ParsingExceptionReason.f370548f, "Value '" + j(obj) + "' for key '" + str + "' could not be resolved", exc, null, null, 24, null);
    }

    public static final String j(Object obj) {
        String strValueOf = String.valueOf(obj);
        return strValueOf.length() > 100 ? L.j("...", C43066x.t0(97, strValueOf)) : strValueOf;
    }

    @Y61.k
    public static final ParsingException k(@Y61.k String str, @Y61.k String str2, @Y61.l Object obj, @Y61.l ClassCastException classCastException) {
        return new ParsingException(ParsingExceptionReason.f370547e, H.n(C23088b.b("Expression '", str, "': '", str2, "' received value of wrong type: '"), obj, '\''), classCastException, null, null, 24, null);
    }

    @Y61.k
    public static final ParsingException l(@Y61.k JSONArray jSONArray, @Y61.k String str, int i12, @Y61.k Object obj) {
        return new ParsingException(ParsingExceptionReason.f370547e, "Value at " + i12 + " position of '" + str + "' has wrong type " + ((Object) obj.getClass().getName()), null, new com.yandex.div.internal.util.f(jSONArray), com.yandex.div.internal.util.j.a(jSONArray), 4, null);
    }

    @Y61.k
    public static final ParsingException m(@Y61.k JSONObject jSONObject, @Y61.k String str, @Y61.k Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.f370547e;
        StringBuilder sbA = r.A("Value for key '", str, "' has wrong type ");
        sbA.append((Object) obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, sbA.toString(), null, new com.yandex.div.internal.util.h(jSONObject), com.yandex.div.internal.util.j.b(jSONObject), 4, null);
    }
}
