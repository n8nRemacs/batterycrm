package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class Qh implements Yh {

    /* renamed from: b, reason: collision with root package name */
    private static final IIdentifierCallback f379263b = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AtomicReference<IIdentifierCallback> f379264a;

    public Qh(@j.N IIdentifierCallback iIdentifierCallback) {
        this.f379264a = new AtomicReference<>(iIdentifierCallback);
    }

    @Override // com.yandex.metrica.impl.ob.Yh
    public void a(@j.N IParamsCallback.Reason reason, Map<String, W0> map) {
        IIdentifierCallback andSet = this.f379264a.getAndSet(f379263b);
        int iOrdinal = reason.ordinal();
        andSet.onRequestError(iOrdinal != 1 ? iOrdinal != 2 ? IIdentifierCallback.Reason.UNKNOWN : IIdentifierCallback.Reason.INVALID_RESPONSE : IIdentifierCallback.Reason.NETWORK);
    }

    @Override // com.yandex.metrica.impl.ob.Yh
    public void onReceive(Map<String, W0> map) {
        IIdentifierCallback andSet = this.f379264a.getAndSet(f379263b);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, W0> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().f379795a);
        }
        andSet.onReceive(map2);
    }

    public class a implements IIdentifierCallback {
        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }
}
