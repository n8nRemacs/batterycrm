package com.yandex.div.histogram.reporter;

import Y61.k;
import androidx.compose.foundation.H;
import com.yandex.div.histogram.p;
import j.InterfaceC42148d;
import kotlin.Metadata;

/* compiled from: HistogramReporter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/histogram/reporter/a;", "", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC42148d
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f370034a;

    public a(@k b bVar) {
        this.f370034a = bVar;
    }

    public static void a(a aVar, String str, long j12, String str2, String str3, p pVar, int i12) {
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        if ((i12 & 8) != 0) {
            str3 = null;
        }
        if ((i12 & 16) != 0) {
            p.f370030o2.getClass();
            pVar = p.a.f370032b;
        }
        aVar.getClass();
        boolean zB2 = pVar.b();
        b bVar = aVar.f370034a;
        if (zB2) {
            bVar.a(j12, str, str3);
        }
        if (str2 == null) {
            return;
        }
        String strI = H.i('.', str2, str);
        if (pVar.b()) {
            bVar.a(j12, strI, str3);
        }
    }
}
