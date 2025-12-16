package com.my.tracker.obfuscated;

import com.android.billingclient.api.BillingResult;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.my.tracker.obfuscated.C37848w;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f365274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f365275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f365276e;

    public /* synthetic */ D(Object obj, Object obj2, Object obj3, int i12) {
        this.f365273b = i12;
        this.f365274c = obj;
        this.f365275d = obj2;
        this.f365276e = obj3;
    }

    private final void a() {
        ((C37828b0) this.f365274c).b((BillingResult) this.f365275d, (List) this.f365276e);
    }

    private final void b() {
        ((C37829c) this.f365274c).a((ProductInfoReq) this.f365275d, (ArrayList) this.f365276e);
    }

    private final void c() {
        ((C37829c) this.f365274c).a((ProductInfoResult) this.f365275d, (List) this.f365276e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365273b) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                ((C37829c) this.f365274c).a((Exception) this.f365275d, (List) this.f365276e);
                break;
            case 4:
                ((c0) this.f365274c).a((String) this.f365275d, (String) this.f365276e);
                break;
            case 5:
                ((C37848w) this.f365274c).a((C37848w.c) this.f365275d, (List) this.f365276e);
                break;
            default:
                ((C37848w) this.f365274c).a((C37848w.a) this.f365275d, (List) this.f365276e);
                break;
        }
    }
}
