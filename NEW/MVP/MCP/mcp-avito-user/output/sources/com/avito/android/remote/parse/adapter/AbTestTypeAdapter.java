package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Navigation;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import u3.C48777a;
import u3.C48781e;

/* compiled from: AbTestTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AbTestTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lu3/a;", "<init>", "()V", "a", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbTestTypeAdapter extends TypeAdapter<C48777a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.google.gson.l f254144a = new com.google.gson.l();

    /* compiled from: AbTestTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AbTestTypeAdapter$a;", "", "<init>", "()V", "", "KEY_AB_ANALYTIC_PARAMS", "Ljava/lang/String;", "KEY_AB_TEST_CONFIG", "KEY_AB_TEST_GROUP", "KEY_AP_CLIENT_EXPOSURE", "KEY_AP_TOKEN", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.google.gson.TypeAdapter
    public final C48777a read(com.google.gson.stream.a aVar) throws IOException {
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362204j;
        if (jsonTokenF == jsonToken) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken2) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        C48781e c48781e = null;
        String string = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                if (iHashCode != -1354792126) {
                    if (iHashCode != -1202336499) {
                        if (iHashCode == 273563251 && strX.equals("analyticParams")) {
                            if (aVar.F() == jsonToken) {
                                throw new JsonParseException("");
                            }
                            if (aVar.F() != jsonToken2) {
                                throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                            }
                            aVar.b();
                            String strB2 = null;
                            Boolean boolValueOf = null;
                            while (aVar.k()) {
                                String strX2 = aVar.x();
                                if (kotlin.jvm.internal.L.f(strX2, "ab")) {
                                    strB2 = aVar.B();
                                } else if (kotlin.jvm.internal.L.f(strX2, "defaultEvent")) {
                                    boolValueOf = Boolean.valueOf(aVar.o());
                                } else {
                                    aVar.L();
                                }
                            }
                            aVar.g();
                            if (strB2 != null) {
                                c48781e = new C48781e(strB2, boolValueOf != null ? boolValueOf.booleanValue() : false);
                            } else {
                                c48781e = null;
                            }
                        }
                    } else if (strX.equals("testGroup")) {
                        strB = aVar.B();
                    }
                } else if (strX.equals(Navigation.CONFIG)) {
                    this.f254144a.getClass();
                    string = com.google.gson.l.a(aVar).i().toString();
                }
            }
            aVar.L();
        }
        aVar.g();
        if (strB != null) {
            return new C48777a(strB, c48781e, string);
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(com.google.gson.stream.c cVar, C48777a c48777a) {
    }
}
