package com.avito.android.user_stats.extended_user_stats.metrics;

import Y41.l;
import com.avito.android.user_stats.extended_user_stats.metrics.item.DataMetrics;
import com.avito.android.user_stats.extended_user_stats.metrics.item.MetricDialogData;
import com.avito.android.user_stats.extended_user_stats.metrics.item.StatMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: MetricsBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f317284l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(1);
        this.f317284l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ArrayList arrayList;
        String str2 = str;
        a aVar = this.f317284l;
        if (!str2.equals(aVar.f317276c)) {
            if (str2.length() > 1) {
                ArrayList arrayListB = aVar.b(str2);
                if (C43066x.K(str2)) {
                    DataMetrics dataMetrics = aVar.f317274a;
                    arrayList = (dataMetrics != null ? dataMetrics : null).f317288c;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    DataMetrics dataMetrics2 = aVar.f317274a;
                    ArrayList<MetricDialogData> arrayList3 = (dataMetrics2 != null ? dataMetrics2 : null).f317288c;
                    if (arrayList3 != null) {
                        for (MetricDialogData metricDialogData : arrayList3) {
                            List<StatMetric> list = metricDialogData.f317292e;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : list) {
                                if (C43066x.q(((StatMetric) obj).f317298d, str2, true)) {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList2.add(new MetricDialogData(metricDialogData.f317289b, true, metricDialogData.f317291d, arrayList4, metricDialogData.f317293f));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                aVar.c(arrayListB, arrayList);
            } else {
                ArrayList arrayListB2 = aVar.b(null);
                DataMetrics dataMetrics3 = aVar.f317274a;
                aVar.c(arrayListB2, (dataMetrics3 != null ? dataMetrics3 : null).f317288c);
            }
        }
        aVar.f317276c = str2;
        return G0.f406611a;
    }
}
