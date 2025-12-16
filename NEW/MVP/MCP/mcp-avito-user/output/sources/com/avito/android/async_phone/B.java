package com.avito.android.async_phone;

import androidx.compose.runtime.internal.P;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneRequestLoadingRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/async_phone/B;", "Lcom/avito/android/async_phone/A;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B implements A {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Map<Q81.a, String> f92118b = P0.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f92119c = B0.f406639b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f92120d = "PhoneRequestLoadingRenderer_" + hashCode();

    @Inject
    public B() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Object next;
        G0 g02;
        DeepLink deepLink = aVar != null ? aVar.f134520a : null;
        PhoneRequestLink phoneRequestLink = deepLink instanceof PhoneRequestLink ? (PhoneRequestLink) deepLink : null;
        if (phoneRequestLink == null) {
            return;
        }
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("setLoading(itemId=");
        String str = phoneRequestLink.f92281b;
        sb2.append(str);
        sb2.append(", isLoading=");
        sb2.append(z12);
        sb2.append(')');
        String string = sb2.toString();
        String str2 = this.f92120d;
        v22.c(str2, string, null);
        this.f92119c = z12 ? b1.i(this.f92119c, str) : b1.e(this.f92119c, str);
        Iterator it = P0.o(this.f92118b).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f((String) ((Q) next).f406620c, str)) {
                    break;
                }
            }
        }
        Q q12 = (Q) next;
        if (q12 != null) {
            ((Q81.a) q12.f406619b).Ii(z12);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            V2.f318762a.c(str2, AK.c.k("setLoading(itemId=", str, ": view not found"), null);
        }
    }

    @Override // com.avito.android.deeplink_handler.view.impl.c.a
    public final boolean j1(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.f134520a instanceof PhoneRequestLink;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    @Override // com.avito.android.async_phone.A
    public final void n(@Y61.k Q81.a aVar, @Y61.k String str) {
        V2.f318762a.c(this.f92120d, "subscribe(view=" + aVar + ", itemId=" + str + ')', null);
        this.f92118b = P0.l(this.f92118b, new Q(aVar, str));
        aVar.Ii(this.f92119c.contains(str));
    }

    @Override // com.avito.android.async_phone.A
    public final void p(@Y61.k Q81.a aVar, @Y61.k String str) {
        String str2 = this.f92118b.get(aVar);
        String str3 = this.f92120d;
        if (str2 == null) {
            V2.f318762a.c(str3, "unsubscribe(view=" + aVar + ", itemId=" + str + "): view not found", null);
            return;
        }
        if (!str2.equals(str)) {
            V2.f318762a.c(str3, "unsubscribe(view=" + aVar + ", itemId=" + str + ": view is already registered with another itemId", null);
            return;
        }
        V2.f318762a.c(str3, "unsubscribe(view=" + aVar + ", itemId=" + str + ')', null);
        this.f92118b = P0.i(this.f92118b, aVar);
    }
}
