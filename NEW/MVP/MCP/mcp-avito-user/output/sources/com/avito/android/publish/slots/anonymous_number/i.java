package com.avito.android.publish.slots.anonymous_number;

import com.avito.android.phone_protection_info.item.b;
import com.avito.android.remote.model.PublishAnonymousNumber;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AnonymousNumberSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PublishAnonymousNumber;", "it", "Lcom/avito/android/phone_protection_info/item/b$a;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f243031b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            PublishAnonymousNumber publishAnonymousNumber = (PublishAnonymousNumber) ((TypedResult.Success) typedResult).getResult();
            return new TypedResult.Success(publishAnonymousNumber instanceof PublishAnonymousNumber.Required ? ((PublishAnonymousNumber.Required) publishAnonymousNumber).isNewDesign() : false ? new b.a(null, null, null, null, 15, null) : null);
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
