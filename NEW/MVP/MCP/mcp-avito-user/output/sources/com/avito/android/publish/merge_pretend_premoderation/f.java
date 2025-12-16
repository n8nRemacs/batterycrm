package com.avito.android.publish.merge_pretend_premoderation;

import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import re0.AbstractC47643a;

/* compiled from: MergePretendPremoderationViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class f extends H implements Y41.l<AdvertProactiveModerationResult, G0> {
    @Override // Y41.l
    public final G0 invoke(AdvertProactiveModerationResult advertProactiveModerationResult) {
        AbstractC47643a.b cVar;
        AbstractC47643a.b bVar;
        AdvertProactiveModerationResult advertProactiveModerationResult2 = advertProactiveModerationResult;
        j jVar = (j) this.receiver;
        jVar.getClass();
        if (advertProactiveModerationResult2 instanceof AdvertProactiveModerationResult.Ok) {
            bVar = AbstractC47643a.b.C12385b.f429937a;
        } else {
            if (advertProactiveModerationResult2 instanceof AdvertProactiveModerationResult.Duplicate) {
                cVar = new AbstractC47643a.b.C12384a(((AdvertProactiveModerationResult.Duplicate) advertProactiveModerationResult2).getDuplicateBody());
            } else {
                if (!(advertProactiveModerationResult2 instanceof AdvertProactiveModerationResult.WrongCategory)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new AbstractC47643a.b.c(((AdvertProactiveModerationResult.WrongCategory) advertProactiveModerationResult2).getWrongCategorySuggest());
            }
            bVar = cVar;
        }
        jVar.f237434R = bVar;
        jVar.le();
        return G0.f406611a;
    }
}
