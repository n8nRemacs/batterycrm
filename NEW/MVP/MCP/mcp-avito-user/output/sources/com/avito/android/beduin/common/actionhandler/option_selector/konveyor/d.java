package com.avito.android.beduin.common.actionhandler.option_selector.konveyor;

import Y41.l;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f100331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f100332m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, a aVar) {
        super(1);
        this.f100331l = eVar;
        this.f100332m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f100331l.f100333b.invoke(this.f100332m);
        }
        return G0.f406611a;
    }
}
