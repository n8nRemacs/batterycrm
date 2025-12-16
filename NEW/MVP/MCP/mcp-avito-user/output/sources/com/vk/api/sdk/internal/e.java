package com.vk.api.sdk.internal;

import Y61.k;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;
import kotlin.Metadata;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/internal/e;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f366623a = new e();

    public static boolean a(@k String str, @k String str2) throws MalformedJsonException {
        try {
            return b(str, str2);
        } catch (MalformedJsonException e12) {
            throw new MalformedJsonException(((Object) e12.getMessage()) + ". Json: '" + str + '\'');
        }
    }

    public static boolean b(String str, String str2) throws IOException {
        JsonToken jsonTokenPeek;
        if (str.length() == 0) {
            return false;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        if (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            jsonReader.beginObject();
            while (jsonReader.hasNext() && (jsonTokenPeek = jsonReader.peek()) != JsonToken.END_DOCUMENT) {
                if (jsonTokenPeek != JsonToken.NAME) {
                    jsonReader.skipValue();
                } else if (str2.equals(jsonReader.nextName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
