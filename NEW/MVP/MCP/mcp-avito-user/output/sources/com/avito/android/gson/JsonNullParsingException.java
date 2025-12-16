package com.avito.android.gson;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.util.C35785e6;
import com.google.gson.JsonParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsonNullParsingException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gson/JsonNullParsingException;", "Lcom/google/gson/JsonParseException;", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JsonNullParsingException extends JsonParseException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Class f161311c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Class f161312d;

    /* JADX WARN: Illegal instructions before constructor call */
    public JsonNullParsingException(@k String str, @k Class cls, @l Class cls2) {
        StringBuilder sbA = r.A("null json field for non-null kotlin field ", str, ": ");
        sbA.append(C35785e6.a(cls));
        sbA.append(" in ");
        sbA.append(C35785e6.a(cls2));
        super(sbA.toString());
        this.f161310b = str;
        this.f161311c = cls;
        this.f161312d = cls2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonNullParsingException)) {
            return false;
        }
        JsonNullParsingException jsonNullParsingException = (JsonNullParsingException) obj;
        return L.f(this.f161310b, jsonNullParsingException.f161310b) && L.f(this.f161311c, jsonNullParsingException.f161311c) && L.f(this.f161312d, jsonNullParsingException.f161312d);
    }

    public final int hashCode() {
        int iHashCode = (this.f161311c.hashCode() + (this.f161310b.hashCode() * 31)) * 31;
        Class cls = this.f161312d;
        return iHashCode + (cls == null ? 0 : cls.hashCode());
    }

    @Override // java.lang.Throwable
    @k
    public final String toString() {
        return "JsonNullParsingException(fieldName=" + this.f161310b + ", fieldType=" + this.f161311c + ", instanceClass=" + this.f161312d + ')';
    }
}
