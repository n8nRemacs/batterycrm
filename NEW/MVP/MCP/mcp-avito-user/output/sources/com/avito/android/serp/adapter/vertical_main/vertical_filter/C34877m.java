package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.vertical_main.SearchFormResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/vertical_main/SearchFormResult;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/vertical_main/Form;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34877m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C34877m<T, R> f273565b = new C34877m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return io.reactivex.rxjava3.core.z.c0(((SearchFormResult) ((TypedResult.Success) typedResult).getResult()).getForm());
        }
        if (typedResult instanceof TypedResult.Error) {
            return io.reactivex.rxjava3.core.z.M(new Exception(((TypedResult.Error) typedResult).getError().getF244063c()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
