package com.avito.android.inline_filters.dialog.location_group.adapter.checkbox;

import Y41.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupFilterItemCheckboxItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f171718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f171719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f171720n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, e eVar, int i12) {
        super(1);
        this.f171718l = fVar;
        this.f171719m = eVar;
        this.f171720n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f171718l.Z1(zBooleanValue);
        this.f171719m.f171721b.invoke(Integer.valueOf(this.f171720n), new InlineFilterValue.InlineFilterBooleanValue(zBooleanValue));
        return G0.f406611a;
    }
}
