package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.crm_paid_cvs.dto.OptionItem;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FiltersReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class o extends N implements Y41.l<OptionItem, OptionItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<OptionItem> f130651l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Set<OptionItem> set) {
        super(1);
        this.f130651l = set;
    }

    @Override // Y41.l
    public final OptionItem invoke(OptionItem optionItem) {
        OptionItem optionItem2 = optionItem;
        return OptionItem.a(optionItem2, this.f130651l.contains(optionItem2), null, 61);
    }
}
