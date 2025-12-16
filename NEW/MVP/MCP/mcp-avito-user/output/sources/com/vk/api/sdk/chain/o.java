package com.vk.api.sdk.chain;

import Y41.q;
import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.m;
import com.vk.api.sdk.p;
import com.vk.api.sdk.t;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ValidationHandlerChainCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/chain/o;", "T", "Lcom/vk/api/sdk/chain/j;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class o<T> extends j<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f366574c;

    public o(@Y61.k p pVar, int i12, @Y61.k h hVar) {
        super(pVar, i12);
        this.f366574c = hVar;
    }

    @Y61.l
    public static Object b(@Y61.k String str, @Y61.l Object obj, @Y61.k q qVar) throws InterruptedException {
        if (obj == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        t.a aVar = new t.a(countDownLatch);
        qVar.invoke(obj, str, aVar);
        countDownLatch.await();
        return aVar.f366686b;
    }

    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    public final T a(@Y61.k c cVar) throws VKApiException {
        String string;
        String string2;
        String string3;
        String string4;
        int i12 = this.f366567b;
        if (i12 >= 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                try {
                    return (T) this.f366574c.a(cVar);
                } catch (VKApiExecutionException e12) {
                    int i15 = e12.f366584b;
                    p pVar = this.f366553a;
                    Bundle bundle = e12.f366586d;
                    String str = "";
                    if (i15 == 14) {
                        if (bundle == null || (string3 = bundle.getString("captcha_img", "")) == null) {
                            string3 = "";
                        }
                        String str2 = (String) b(string3, pVar.f366678c, l.f366571b);
                        if (str2 == null) {
                            throw e12;
                        }
                        if (bundle != null && (string4 = bundle.getString("captcha_sid", "")) != null) {
                            str = string4;
                        }
                        cVar.f366550a = str;
                        cVar.f366551b = str2;
                    } else if (i15 == 17) {
                        if (bundle != null && (string2 = bundle.getString("validation_url", "")) != null) {
                            str = string2;
                        }
                        t.b bVar = (t.b) b(str, pVar.f366678c, n.f366573b);
                        t.b.f366687d.getClass();
                        if (!L.f(bVar, t.b.f366688e)) {
                            if (bVar == null || !bVar.f366691c) {
                                throw e12;
                            }
                            String str3 = bVar.f366689a;
                            String str4 = bVar.f366690b;
                            com.vk.api.sdk.okhttp.l lVar = (com.vk.api.sdk.okhttp.l) pVar.f366679d.getValue();
                            lVar.getClass();
                            com.vk.api.sdk.m.f366630c.getClass();
                            lVar.f366657c = m.a.a(str4, str3);
                        }
                    } else {
                        if (i15 != 24) {
                            t tVar = pVar.f366678c;
                            if (tVar == null) {
                                throw e12;
                            }
                            tVar.a(e12);
                            throw null;
                        }
                        if (bundle != null && (string = bundle.getString("confirmation_text", "")) != null) {
                            str = string;
                        }
                        Boolean bool = (Boolean) b(str, pVar.f366678c, m.f366572b);
                        if (bool == null) {
                            throw e12;
                        }
                        if (bool.equals(Boolean.FALSE)) {
                            throw e12;
                        }
                        cVar.f366552c = bool.booleanValue();
                    }
                    if (i13 == i12) {
                        break;
                    }
                    i13 = i14;
                }
            }
        }
        throw new VKApiException("Can't confirm validation due to retry limit!");
    }
}
