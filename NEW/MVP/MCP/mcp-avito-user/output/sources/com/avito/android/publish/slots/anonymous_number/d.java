package com.avito.android.publish.slots.anonymous_number;

import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AnonymousNumberSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "it", "Lkotlin/Q;", "", "apply", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final d<T, R> f243023b = new d<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        PhoneParameter phoneParameter = (PhoneParameter) ((EditableParameter) obj);
        return new Q(phoneParameter.getId(), phoneParameter.getValue());
    }
}
