package com.avito.android.async_phone;

import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AsyncPhonePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f92125l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(1);
        this.f92125l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        this.f92125l.f92208b.c(apiError);
        return G0.f406611a;
    }
}
