package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f362042b = a(ToNumberPolicy.f361981c);

    /* renamed from: a, reason: collision with root package name */
    public final ToNumberPolicy f362043a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362045a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f362045a = iArr;
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362045a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362045a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(ToNumberPolicy toNumberPolicy) {
        this.f362043a = toNumberPolicy;
    }

    public static r a(ToNumberPolicy toNumberPolicy) {
        return new r() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.r
            public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public final Number read(com.google.gson.stream.a aVar) {
        JsonToken jsonTokenF = aVar.F();
        int iOrdinal = jsonTokenF.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6) {
            return this.f362043a.a(aVar);
        }
        if (iOrdinal == 8) {
            aVar.z();
            return null;
        }
        StringBuilder sbK = com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expecting number, got: ", jsonTokenF, "; at path ");
        sbK.append(aVar.getPath());
        throw new JsonSyntaxException(sbK.toString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
        cVar.p(number);
    }
}
