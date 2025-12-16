package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.crm_paid_cvs.dto.OptionItem;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: FiltersReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class p extends N implements Y41.l<OptionItem, OptionItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q<Integer, Integer> f130652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Q<Integer, Integer> q12) {
        super(1);
        this.f130652l = q12;
    }

    @Override // Y41.l
    public final OptionItem invoke(OptionItem optionItem) {
        OptionItem optionItem2 = optionItem;
        Q<Integer, Integer> q12 = this.f130652l;
        return OptionItem.a(optionItem2, (q12.f406619b == null && q12.f406620c == null) ? false : true, q12, 45);
    }
}
