package com.my.tracker.obfuscated;

import android.app.Activity;
import android.content.Intent;
import com.android.installreferrer.api.ReferrerDetails;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.obfuscated.C37829c;
import com.my.tracker.obfuscated.C37848w;
import com.my.tracker.obfuscated.c0;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f365283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f365284d;

    public /* synthetic */ H(int i12, Object obj, Object obj2) {
        this.f365282b = i12;
        this.f365283c = obj;
        this.f365284d = obj2;
    }

    private final void a() {
        ((C37829c.d) this.f365283c).a((OwnedPurchasesResult) this.f365284d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365282b) {
            case 0:
                a();
                break;
            case 1:
                ((C37829c.d) this.f365283c).a((String) this.f365284d);
                break;
            case 2:
                ((c0.a) this.f365283c).a((Map) this.f365284d);
                break;
            case 3:
                ((C37825a) this.f365283c).a((Activity) this.f365284d);
                break;
            case 4:
                ((C37829c) this.f365283c).b((Intent) this.f365284d);
                break;
            case 5:
                ((c0) this.f365283c).a((List) this.f365284d);
                break;
            case 6:
                ((d2) this.f365283c).a((Runnable) this.f365284d);
                break;
            case 7:
                ((e0) this.f365283c).b((ReferrerDetails) this.f365284d);
                break;
            case 8:
                C37836j.a((MyTracker.AttributionListener) this.f365283c, (MyTrackerAttribution) this.f365284d);
                break;
            case 9:
                ((p1) this.f365283c).a((w1) this.f365284d);
                break;
            case 10:
                ((C37848w) this.f365283c).b((C37848w.c) this.f365284d);
                break;
            case 11:
                ((C37848w) this.f365283c).c((MyTracker.FlushListener) this.f365284d);
                break;
            case 12:
                ((C37848w) this.f365283c).b((C37848w.a) this.f365284d);
                break;
            default:
                ((x0) this.f365283c).b((List) this.f365284d);
                break;
        }
    }
}
