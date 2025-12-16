package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import android.net.Uri;
import com.avito.android.crm_paid_cvs.dto.CvBadge;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CvItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/l;", "LTV0/e;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l extends TV0.e {

    /* compiled from: CvItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C0();

    void DX(@Y61.k Y41.a aVar, boolean z12);

    void Fr(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar);

    void Ze(@Y61.k Y41.a<G0> aVar);

    void Zm(@Y61.k Y41.a aVar, boolean z12);

    void c0();

    void f(@Y61.k String str);

    void j7(@Y61.k String str);

    void kr(@Y61.k Y41.a aVar, boolean z12);

    void l60(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar);

    void l9(@Y61.k Y41.a<G0> aVar);

    void pl(@Y61.k String str);

    void qe(@Y61.l Uri uri);

    void setActive(boolean z12);

    void setTitle(@Y61.k String str);

    void uK(@Y61.l CvStatus cvStatus);

    void v7(@Y61.k String str);

    void wC(@Y61.k List<CvBadge> list);

    void xG(@Y61.k Y41.a aVar, boolean z12);
}
