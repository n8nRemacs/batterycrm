package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ui;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39041p2 implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ti f381276a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39191v9 f381277b;

    public C39041p2() {
        this(new Ti(), new C39191v9());
    }

    @Override // com.yandex.metrica.networktasks.api.NetworkResponseHandler
    @j.P
    public Object handle(@j.N ResponseDataHolder responseDataHolder) {
        if (200 != responseDataHolder.f382435a) {
            return null;
        }
        byte[] bArrA = responseDataHolder.f382436b;
        Map map = responseDataHolder.f382437c;
        List list = map != null ? (List) map.get("Content-Encoding") : null;
        if (!A2.b(list) && "encrypted".equals(list.get(0))) {
            bArrA = this.f381277b.a(responseDataHolder.f382436b, "hBnBQbZrmjPXEWVJ");
        }
        if (bArrA == null) {
            return null;
        }
        Ui uiA = this.f381276a.a(bArrA);
        if (Ui.a.OK == uiA.A()) {
            return uiA;
        }
        return null;
    }

    @j.k0
    public C39041p2(@j.N Ti ti2, @j.N C39191v9 c39191v9) {
        this.f381276a = ti2;
        this.f381277b = c39191v9;
    }
}
