package com.avito.android.verification.storage;

import AK0.l;
import Y61.k;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/storage/b;", "Lcom/avito/android/verification/storage/a;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.verification.storage.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f324886a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f324887b = C42727D.c(C10048b.f324888l);

    /* compiled from: VerificationStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/verification/storage/b$a;", "", "<init>", "()V", "", "KEY_ESIA_CODE_VERIFIER", "Ljava/lang/String;", "KEY_SBER_ID_META_MAP", "KEY_TINKOFF_META_MAP", "KEY_USER_HASH_ID_FOR_SBER_ID", "KEY_USER_HASH_ID_FOR_TINKOFF", "KEY_VTB_META_MAP", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.storage.b$b, reason: collision with other inner class name */
    public static final class C10048b extends N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10048b f324888l = new C10048b();

        public C10048b() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.google.gson.reflect.a<Map<String, ? extends String>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.google.gson.reflect.a<Map<String, ? extends String>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends com.google.gson.reflect.a<Map<String, ? extends String>> {
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k l lVar) {
        this.f324886a = lVar;
    }

    @Override // com.avito.android.verification.storage.a
    public final void a(@Y61.l String str) {
        this.f324886a.putString("user_hash_id_for_tinkoff", str);
    }

    @Override // com.avito.android.verification.storage.a
    @Y61.l
    public final String b() {
        return this.f324886a.getString("user_hash_id_for_sber_id");
    }

    @Override // com.avito.android.verification.storage.a
    @k
    public final Map<String, String> c() {
        Object objE;
        try {
            Gson gsonM = m();
            String string = this.f324886a.getString("key_verification_tinkoff_meta_map");
            if (string == null) {
                string = "";
            }
            try {
                Type type = new c().getType();
                objE = gsonM.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            Map<String, String> map = (Map) objE;
            return map == null ? P0.c() : map;
        } catch (Throwable unused2) {
            return P0.c();
        }
    }

    @Override // com.avito.android.verification.storage.a
    public final void d(@k Map<String, String> map) {
        this.f324886a.putString("key_verification_tinkoff_meta_map", m().l(map));
    }

    @Override // com.avito.android.verification.storage.a
    @k
    public final Map<String, String> e() {
        Object objE;
        try {
            Gson gsonM = m();
            String string = this.f324886a.getString("key_verification_sber_id_meta_map");
            if (string == null) {
                string = "";
            }
            try {
                Type type = new d().getType();
                objE = gsonM.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            Map<String, String> map = (Map) objE;
            return map == null ? P0.c() : map;
        } catch (Throwable unused2) {
            return P0.c();
        }
    }

    @Override // com.avito.android.verification.storage.a
    public final void f(@k Map<String, String> map) {
        this.f324886a.putString("key_verification_vtb_meta_map", m().l(map));
    }

    @Override // com.avito.android.verification.storage.a
    @k
    public final Map<String, String> g() {
        Object objE;
        try {
            Gson gsonM = m();
            String string = this.f324886a.getString("key_verification_vtb_meta_map");
            if (string == null) {
                string = "";
            }
            try {
                Type type = new e().getType();
                objE = gsonM.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            Map<String, String> map = (Map) objE;
            return map == null ? P0.c() : map;
        } catch (Throwable unused2) {
            return P0.c();
        }
    }

    @Override // com.avito.android.verification.storage.a
    public final void h(@Y61.l String str) {
        this.f324886a.putString("key_esia_code_verifier", str);
    }

    @Override // com.avito.android.verification.storage.a
    public final void i(@k LinkedHashMap linkedHashMap) {
        this.f324886a.putString("key_verification_sber_id_meta_map", m().l(linkedHashMap));
    }

    @Override // com.avito.android.verification.storage.a
    @Y61.l
    public final String j() {
        return this.f324886a.getString("key_esia_code_verifier");
    }

    @Override // com.avito.android.verification.storage.a
    @Y61.l
    public final String k() {
        return this.f324886a.getString("user_hash_id_for_tinkoff");
    }

    @Override // com.avito.android.verification.storage.a
    public final void l(@Y61.l String str) {
        this.f324886a.putString("user_hash_id_for_sber_id", str);
    }

    public final Gson m() {
        return (Gson) this.f324887b.getValue();
    }
}
