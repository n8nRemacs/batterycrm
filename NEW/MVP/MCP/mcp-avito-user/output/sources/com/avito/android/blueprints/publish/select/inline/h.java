package com.avito.android.blueprints.publish.select.inline;

import Y61.l;
import android.content.Context;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckboxSelectItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/select/inline/h;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h extends TV0.e {

    /* compiled from: CheckboxSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bi(@l CharSequence charSequence);

    void H(@l CharSequence charSequence);

    void NZ(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void Rd(@l String str);

    void Z1(boolean z12);

    void b3(@l String str);

    @Y61.k
    Context getContext();

    void qa(@l Y41.a<G0> aVar, @l TipIconParameters.Position position);

    void setTitle(@l String str);

    void t00(@l Integer num, @l Integer num2);

    void u(@l CharSequence charSequence);
}
