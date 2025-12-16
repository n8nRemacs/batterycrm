package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: TaskCoroutineExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "result", "Lkotlin/G0;", "onSuccess", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class m<T> implements ru.rustore.sdk.core.tasks.e {
    @Override // ru.rustore.sdk.core.tasks.e
    public final void onSuccess(T t12) {
        a.a(null, Z.a(t12));
    }
}
