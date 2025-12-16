package com.avito.android.autoteka.data;

import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.analytics.event.report.ReportButtons;
import kotlin.Metadata;

/* compiled from: AutotekaAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/a;", "", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    void a(@Y61.l String str, int i12, @Y61.l Long l12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4);

    void b(@Y61.k String str, @Y61.k String str2, @Y61.k FromBlock fromBlock, int i12);

    void c(long j12, @Y61.k String str);

    void d(@Y61.k String str);

    void e(@Y61.l String str, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14);

    void f();

    void g();

    void h(@Y61.k String str);

    void i(@Y61.k String str);

    void j(@Y61.k String str);

    void k(@Y61.l String str, @Y61.k ReportButtons reportButtons, @Y61.k String str2);

    void l(@Y61.k String str, @Y61.k String str2, @Y61.k FromBlock fromBlock);
}
