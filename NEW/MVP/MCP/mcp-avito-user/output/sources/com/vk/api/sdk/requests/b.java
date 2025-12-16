package com.vk.api.sdk.requests;

import Y61.k;
import Y61.l;
import com.vk.api.sdk.chain.h;
import com.vk.api.sdk.chain.i;
import com.vk.api.sdk.g;
import com.vk.api.sdk.okhttp.o;
import com.vk.api.sdk.p;
import com.vk.api.sdk.r;
import com.vk.api.sdk.utils.f;
import com.vk.api.sdk.z;
import java.util.LinkedHashMap;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: VKRequest.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/api/sdk/requests/b;", "T", "Lcom/vk/api/sdk/r;", "Lcom/vk/api/sdk/internal/a;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class b<T> extends com.vk.api.sdk.internal.a<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f366682a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f366683b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, String> f366684c;

    /* compiled from: VKRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/requests/b$a;", "", "<init>", "()V", "", "ERROR_MALFORMED_RESPONSE", "I", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    public b(String str, String str2, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        this.f366682a = str;
        this.f366683b = str2;
        this.f366684c = new LinkedHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.vk.api.sdk.chain.f] */
    public final T a(@k p pVar) {
        g gVar = pVar.f366676a;
        String str = this.f366683b;
        if (str == null) {
            str = gVar.f366596f;
        }
        LinkedHashMap<String, String> linkedHashMap = this.f366684c;
        Y41.a<String> aVar = gVar.f366606p;
        linkedHashMap.put("lang", aVar.invoke());
        InterfaceC42726C<String> interfaceC42726C = gVar.f366595e;
        linkedHashMap.put("device_id", interfaceC42726C.getValue());
        String value = gVar.f366611u.getValue();
        if (value != null) {
            linkedHashMap.put("external_device_id", value);
        }
        linkedHashMap.put("v", str);
        z.a aVar2 = new z.a();
        aVar2.f366758c.putAll(linkedHashMap);
        aVar2.f366756a = this.f366682a;
        aVar2.f366757b = str;
        z zVar = new z(aVar2);
        com.vk.api.sdk.okhttp.l lVar = (com.vk.api.sdk.okhttp.l) pVar.f366679d.getValue();
        o.a aVar3 = new o.a();
        String str2 = zVar.f366752a;
        aVar3.f366665a = str2;
        aVar3.f366666b = zVar.f366753b;
        aVar3.f366667c.putAll(zVar.f366754c);
        h hVar = new h(pVar, lVar, aVar3, interfaceC42726C.getValue(), aVar.invoke(), this);
        int i12 = zVar.f366755d;
        i iVar = new i(pVar, str2, (f) pVar.f366677b.getValue(), new com.vk.api.sdk.chain.k(pVar, i12, L11.b.f9751a, new com.vk.api.sdk.chain.g(pVar, new com.vk.api.sdk.chain.b(pVar, new com.vk.api.sdk.chain.o(pVar, i12, hVar), zVar, gVar.f366610t), 1)));
        if (i12 > 0) {
            iVar = new com.vk.api.sdk.chain.f(pVar, i12, iVar);
        }
        return iVar.a(new com.vk.api.sdk.chain.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T b(@k JSONObject jSONObject) {
        return jSONObject;
    }
}
