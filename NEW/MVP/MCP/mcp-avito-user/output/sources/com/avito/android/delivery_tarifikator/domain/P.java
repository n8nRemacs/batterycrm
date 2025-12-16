package com.avito.android.delivery_tarifikator.domain;

import Ju.InterfaceC14249c;
import Ov.C14739b;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.delivery_tarifikator.domain.N;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import cw.C39421b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: TariffEditorResultParser.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/P;", "Lcom/avito/android/delivery_tarifikator/domain/O;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class P implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f135253a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h0 f135254b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d0 f135255c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Mv.i f135256d;

    /* compiled from: TariffEditorResultParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/P$a;", "", "<init>", "()V", "", "RESULT_PARAM_TARIFF_CREATED_KEY", "Ljava/lang/String;", "RESULT_PARAM_TARIFF_UPDATED_KEY", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Gsons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<C39421b> {
    }

    static {
        new a(null);
    }

    @Inject
    public P(@Y61.k Gson gson, @Y61.k h0 h0Var, @Y61.k d0 d0Var, @Y61.k Mv.i iVar) {
        this.f135253a = gson;
        this.f135254b = h0Var;
        this.f135255c = d0Var;
        this.f135256d = iVar;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.O
    @Y61.k
    public final N a(@Y61.k InterfaceC14249c interfaceC14249c) {
        if (interfaceC14249c instanceof BeduinUniversalPageLink.b.C3987b) {
            Map<String, Object> map = ((BeduinUniversalPageLink.b.C3987b) interfaceC14249c).f133046b;
            Object obj = map.get("created");
            Map<String, ? extends Object> map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 != null) {
                C14739b c14739bB = b(map2);
                return c14739bB != null ? N.c.a(c14739bB) : N.b.f135250a;
            }
            Object obj2 = map.get("updated");
            Map<String, ? extends Object> map3 = obj2 instanceof Map ? (Map) obj2 : null;
            if (map3 != null) {
                C14739b c14739bB2 = b(map3);
                return c14739bB2 != null ? N.d.a(c14739bB2) : N.b.f135250a;
            }
        }
        return N.a.f135249a;
    }

    public final C14739b b(Map<String, ? extends Object> map) {
        try {
            JSONObject jSONObject = new JSONObject(map);
            Gson gson = this.f135253a;
            String string = jSONObject.toString();
            Type type = new b().getType();
            return this.f135255c.a((C39421b) gson.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type)), new Q(1, this.f135254b, h0.class, "getTariff", "getTariff(Ljava/lang/String;)Lcom/avito/android/delivery_tarifikator/domain/model/AvitoTariff;", 0));
        } catch (Throwable unused) {
            this.f135256d.b();
            return null;
        }
    }
}
