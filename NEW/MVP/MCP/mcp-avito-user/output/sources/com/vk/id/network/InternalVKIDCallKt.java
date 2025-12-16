package com.vk.id.network;

import Y41.l;
import Y61.k;
import com.vk.id.common.InternalVKIDApi;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Z;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONException;

/* compiled from: InternalVKIDCall.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\b\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lokhttp3/Call;", "Lkotlin/Function1;", "Lokhttp3/Response;", "Lkotlin/S;", "name", "response", "Lkotlin/Z;", "responseMapping", "Lcom/vk/id/network/InternalVKIDCall;", "internalVKIDWrapToVKIDCall", "(Lokhttp3/Call;LY41/l;)Lcom/vk/id/network/InternalVKIDCall;", "network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDCallKt {
    @InternalVKIDApi
    @k
    public static final <T> InternalVKIDCall<T> internalVKIDWrapToVKIDCall(@k final Call call, @k final l<? super Response, ? extends Z<? extends T>> lVar) {
        return new InternalVKIDCall<T>() { // from class: com.vk.id.network.InternalVKIDCallKt.internalVKIDWrapToVKIDCall.1
            @Override // com.vk.id.network.InternalVKIDCall
            /* renamed from: execute-d1pmJ48 */
            public Object mo119executed1pmJ48() {
                Z.b bVar;
                try {
                    return lVar.invoke(call.execute()).f406625b;
                } catch (IOException e12) {
                    int i12 = Z.f406624c;
                    bVar = new Z.b(e12);
                    return bVar;
                } catch (JSONException e13) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(e13);
                    return bVar;
                }
            }
        };
    }
}
