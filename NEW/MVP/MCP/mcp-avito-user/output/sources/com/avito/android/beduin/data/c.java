package com.avito.android.beduin.data;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import l41.g;
import qi.InterfaceC47401b;

/* compiled from: BeduinScreenRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lqi/b;", "typedResult", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f103895b;

    public c(d dVar) {
        this.f103895b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            this.f103895b.f103898c = (InterfaceC47401b) ((TypedResult.Success) typedResult).getResult();
        }
    }
}
