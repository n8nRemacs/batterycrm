package com.avito.android.iac_api_utils.util_module;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.Metadata;

/* compiled from: IacApiTracker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcom/avito/android/remote/model/TypedResult;", "typedResult", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f164314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164315c;

    public g(b bVar, String str) {
        this.f164314b = bVar;
        this.f164315c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        String str = this.f164315c;
        b bVar = this.f164314b;
        if (z12) {
            bVar.f(str);
        } else if (typedResult instanceof TypedResult.Error) {
            TypedResult.Error error = (TypedResult.Error) typedResult;
            bVar.d(str, C35936s.a(error.getError(), error.getCause()));
        }
    }
}
