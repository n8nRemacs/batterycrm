package com.avito.android.messenger.conversation.mvi.send;

import aZ.C19843a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LaZ/a;", "result", "Larrow/core/Y0;", "LaZ/b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32219j0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194524b;

    public C32219j0(D d12) {
        this.f194524b = d12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Error)) {
            if (typedResult instanceof TypedResult.Success) {
                return arrow.core.Z0.b(((C19843a) ((TypedResult.Success) typedResult).getResult()).getInformer());
            }
            throw new NoWhenBranchMatchedException();
        }
        V2.f318762a.d(this.f194524b.f207131E, "getIncidentWarning() returned error = " + typedResult);
        return arrow.core.X0.f56264b;
    }
}
