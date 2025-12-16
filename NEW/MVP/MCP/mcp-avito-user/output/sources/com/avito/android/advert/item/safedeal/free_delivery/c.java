package com.avito.android.advert.item.safedeal.free_delivery;

import aa.C19849b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: FreeDeliveryInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Laa/b;", "response", "Lcom/avito/android/advert/item/safedeal/free_delivery/f;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f78804b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C19849b c19849b = (C19849b) ((TypedResult.Success) typedResult).getResult();
            return new TypedResult.Success(new f(c19849b.getChatDeeplink(), new SafeDeal.Component.CombinedButtons.FreeDeliveryBlock(c19849b.getText(), true, Boolean.FALSE), c19849b.getToastMessage()));
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
