package com.avito.android.success;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.success.models.AnimationUrl;
import com.avito.android.success.models.CharitySignBlock;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/h;", "Lcom/avito/android/success/g;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.success.g
    @Y61.k
    public final ArrayList a(@Y61.k AnimationUrl animationUrl, @Y61.k AttributedText attributedText, @Y61.l List list, @Y61.l CharitySignBlock charitySignBlock) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.success.konveyor.header.c(animationUrl));
        arrayList.add(new com.avito.android.success.konveyor.title.c(attributedText));
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList2.add(Boolean.valueOf(arrayList.add(new com.avito.android.success.konveyor.service.c(AK.c.g(i12, "success_service_item_"), (AttributedText) obj))));
                i12 = i13;
            }
        }
        if (charitySignBlock != null) {
            arrayList.add(new com.avito.android.success.konveyor.charity.c(charitySignBlock.getTitle(), charitySignBlock.getSubtitle(), charitySignBlock.getImage(), charitySignBlock.getDeeplink()));
        }
        return arrayList;
    }
}
