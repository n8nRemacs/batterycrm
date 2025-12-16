package com.avito.android.blueprints.radiogroup;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RadioGroupSelectItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/radiogroup/i;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface i extends TV0.e {

    /* compiled from: RadioGroupSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void S4(int i12);

    void Ya();

    void b3(@l String str);

    void gn(@k List<m> list, @l m mVar, boolean z12, @k Y41.l<? super DeepLink, G0> lVar, @k p<? super String, ? super Boolean, G0> pVar);

    void k(@l AttributedText attributedText);

    void k0(@l CustomPaddings customPaddings);

    void s(@l String str);

    void s8(@k p<? super String, ? super Boolean, G0> pVar);

    void setError(@l String str);

    void setTitle(@l CharSequence charSequence);

    void um(@l AttributedText attributedText);
}
