package com.avito.android.deeplink_analytics.parsing;

import Nu.InterfaceC14612b;
import Ru.InterfaceC15081a;
import Ru.d;
import Y61.k;
import android.net.Uri;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.n;
import kotlin.text.C43066x;

/* compiled from: DeeplinkParsingAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_analytics/parsing/d;", "LNu/b;", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class d implements InterfaceC14612b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f134132a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f134133b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P f134134c;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k b bVar, @k P p12) {
        this.f134132a = interfaceC28373a;
        this.f134133b = bVar;
        this.f134134c = p12;
    }

    @Override // Nu.InterfaceC14612b
    public final void a(@k InterfaceC15081a interfaceC15081a) {
        DeeplinkParsingStatus deeplinkParsingStatus;
        Integer numY0;
        if (interfaceC15081a instanceof d.b) {
            P p12 = this.f134134c;
            p12.getClass();
            n<Object> nVar = P.f67370w0[70];
            if (((Boolean) p12.f67403d0.a().invoke()).booleanValue()) {
                d.b bVar = (d.b) interfaceC15081a;
                Uri f14723a = bVar.getF14723a();
                String path = bVar.getF14723a().getPath();
                if (path == null) {
                    path = "";
                }
                boolean z12 = bVar instanceof d.C0991d;
                if (z12 && ((d.C0991d) bVar).f14725c) {
                    path = C43066x.c0(path, "/", "ID");
                }
                String host = f14723a.getHost();
                boolean zAdd = true;
                int iIntValue = (host == null || (numY0 = C43066x.y0(host)) == null) ? 1 : numY0.intValue();
                if (z12) {
                    deeplinkParsingStatus = DeeplinkParsingStatus.f134121c;
                } else {
                    if (!(bVar instanceof d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iOrdinal = ((d.a) bVar).f14720b.ordinal();
                    if (iOrdinal == 0) {
                        deeplinkParsingStatus = DeeplinkParsingStatus.f134122d;
                    } else if (iOrdinal == 1) {
                        deeplinkParsingStatus = DeeplinkParsingStatus.f134123e;
                    } else if (iOrdinal == 2) {
                        deeplinkParsingStatus = DeeplinkParsingStatus.f134124f;
                    } else {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        deeplinkParsingStatus = DeeplinkParsingStatus.f134125g;
                    }
                }
                String string = f14723a.toString();
                b bVar2 = this.f134133b;
                bVar2.getClass();
                if (deeplinkParsingStatus == DeeplinkParsingStatus.f134121c) {
                    zAdd = bVar2.f134130a.add(iIntValue + '/' + path);
                }
                if (zAdd) {
                    this.f134132a.c(new a(deeplinkParsingStatus.f134128b, path, iIntValue, string));
                }
            }
        }
    }
}
