package com.avito.android.beduin.data;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;
import pi.C47091b;

/* compiled from: BeduinScreenRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lpi/b;", "typedResult", "Lqi/b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final b<T, R> f103894b = new b<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new TypedResult.Success(((C47091b) ((TypedResult.Success) typedResult).getResult()).getScreen());
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
