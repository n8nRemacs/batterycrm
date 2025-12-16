package com.avito.android.blueprints.job_multigeo_address;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobMultiGeoView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/job_multigeo_address/n;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface n extends TV0.e {

    /* compiled from: JobMultiGeoView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void HS(@Y61.l Boolean bool);

    void Ia(@Y61.l String str);

    void JF(boolean z12);

    void KG(@Y61.l List<ParameterElement.q.a> list, @Y61.l String str, @Y61.l Integer num, @Y61.k Y41.l<? super ParameterElement.q.a, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k JobMultiGeoLink.FlowType flowType);

    void KX(@Y61.k Y41.a<G0> aVar);

    void RO(@Y61.l AttributedText attributedText);

    void Re(@Y61.l String str);

    void V3(@Y61.l CharSequence charSequence);

    void h5(@Y61.k Y41.a<G0> aVar);

    void j(@Y61.l String str);

    void kZ(@Y61.l String str);

    void q(@Y61.l AttributedText attributedText);
}
