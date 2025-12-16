package com.avito.android.crm_paid_cvs.view.list_items.chips_filter;

import Y41.l;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/OptionItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements l<OptionItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f130819l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FilterItem f130820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, FilterItem filterItem) {
        super(1);
        this.f130819l = gVar;
        this.f130820m = filterItem;
    }

    @Override // Y41.l
    public final G0 invoke(OptionItem optionItem) {
        this.f130819l.f130821b.invoke(this.f130820m.f130357b, optionItem);
        return G0.f406611a;
    }
}
