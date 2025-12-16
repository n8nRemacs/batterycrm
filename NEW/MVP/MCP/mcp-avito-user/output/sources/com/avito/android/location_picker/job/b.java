package com.avito.android.location_picker.job;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import vW.t;

/* compiled from: JobAssistantInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "", "response", "LvW/t;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)LvW/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final b<T, R> f182410b = new b<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return t.b.f440818a;
        }
        if (typedResult instanceof TypedResult.Error) {
            return new t.a(((TypedResult.Error) typedResult).getError().getF244063c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
