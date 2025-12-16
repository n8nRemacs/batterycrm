package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Dj.C13406a;
import Lm.C14411b;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CartMenuIconRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LDj/a;", "it", "LLm/b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31178v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C31178v<T, R> f176533b = new C31178v<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C13406a c13406a = (C13406a) ((TypedResult.Success) typedResult).getResult();
            return new TypedResult.Success(new C14411b(Integer.valueOf((int) c13406a.getQuantity()), c13406a.a()));
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
