package com.avito.android.blueprints.publish.multiselect.inline;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.remote.model.search.Theme;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishInlineMultiselectItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/inline/f;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f extends TV0.e {

    /* compiled from: PublishInlineMultiselectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void A20(boolean z12);

    void H(@l CharSequence charSequence);

    void I1(@l String str);

    void L8(@k String str);

    void R8(@l Integer num, @l Integer num2);

    void b8(@k String str, @k String str2, @l String str3, boolean z12, @l Y41.a<G0> aVar, @l Integer num, @l Y41.l<? super Boolean, G0> lVar);

    @k
    Context getContext();

    void s(@k String str);

    void setSubtitle(@l CharSequence charSequence);

    void setTitle(@l CharSequence charSequence);

    void u(@l CharSequence charSequence);

    void yr(@l Theme theme);

    void za();
}
