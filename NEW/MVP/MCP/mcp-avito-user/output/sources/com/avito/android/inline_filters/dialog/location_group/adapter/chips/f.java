package com.avito.android.inline_filters.dialog.location_group.adapter.chips;

import Y41.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupFilterItemChipsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f171732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f171733m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i12) {
        super(1);
        this.f171732l = gVar;
        this.f171733m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f171732l.f171734b.invoke(Integer.valueOf(this.f171733m), new InlineFilterValue.InlineFilterFootWalkingMetroChipsValue(str));
        return G0.f406611a;
    }
}
