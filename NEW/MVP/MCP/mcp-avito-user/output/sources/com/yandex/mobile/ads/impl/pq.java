package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.core.C37916k;
import com.yandex.div2.DivAction;

/* loaded from: classes8.dex */
public final class pq extends C37916k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final pl f388923a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final qq f388924b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final sq f388925c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final hr f388926d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final gr f388927e;

    @X41.j
    public pq(@Y61.k Context context, @Y61.k vi viVar, @Y61.k pl plVar, @Y61.k qq qqVar) {
        this(context, viVar, plVar, qqVar, 0);
    }

    public final void a(int i12, @Y61.k vi viVar) {
        this.f388925c.a(i12, viVar);
    }

    @Override // com.yandex.div.core.C37916k
    public final boolean handleAction(@Y61.k DivAction divAction, @Y61.k com.yandex.div.core.n0 n0Var) {
        if (super.handleAction(divAction, n0Var)) {
            return true;
        }
        com.yandex.div.json.expressions.b<Uri> bVar = divAction.f371220e;
        return bVar != null && a(divAction, bVar.a(n0Var.getExpressionResolver()), n0Var);
    }

    public /* synthetic */ pq(Context context, vi viVar, pl plVar, qq qqVar, int i12) {
        this(context, viVar, plVar, qqVar, new sq(viVar), new hr(new qs0(context)), new gr(context));
    }

    private final boolean a(DivAction divAction, Uri uri, com.yandex.div.core.n0 n0Var) {
        if (!kotlin.jvm.internal.L.f(uri.getScheme(), "mobileads")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != 94750088) {
                if (iHashCode != 866535483) {
                    if (iHashCode != 986975867) {
                        if (iHashCode == 1270469668 && host.equals("trackUrl")) {
                            this.f388926d.a(uri);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        this.f388927e.a(uri, divAction.f371218c);
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.f388923a.e();
                    return true;
                }
            } else if (host.equals("click")) {
                this.f388925c.a(uri, n0Var);
                return true;
            }
        }
        return this.f388924b.a(uri);
    }

    @X41.j
    public pq(@Y61.k Context context, @Y61.k vi viVar, @Y61.k pl plVar, @Y61.k qq qqVar, @Y61.k sq sqVar, @Y61.k hr hrVar, @Y61.k gr grVar) {
        this.f388923a = plVar;
        this.f388924b = qqVar;
        this.f388925c = sqVar;
        this.f388926d = hrVar;
        this.f388927e = grVar;
    }
}
