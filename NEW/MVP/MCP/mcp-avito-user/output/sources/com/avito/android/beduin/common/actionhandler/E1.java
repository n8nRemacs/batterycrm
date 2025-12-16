package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.ModifyCartItemsCacheAction;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.CallableC31182z;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: ModifyCartItemsCacheActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ChannelContext.Item.USER_ID, "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class E1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1 f100073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModifyCartItemsCacheAction f100074c;

    public E1(D1 d12, ModifyCartItemsCacheAction modifyCartItemsCacheAction) {
        this.f100073b = d12;
        this.f100074c = modifyCartItemsCacheAction;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        D1 d12 = this.f100073b;
        Integer numValueOf = Integer.valueOf(this.f100074c.getItemsTotalQuantity());
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.F f12 = d12.f100065c;
        f12.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31182z((String) obj, numValueOf, f12));
    }
}
