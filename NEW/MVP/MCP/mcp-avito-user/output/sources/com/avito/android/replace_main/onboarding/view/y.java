package com.avito.android.replace_main.onboarding.view;

import Cm0.InterfaceC13326c;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainOnboardingViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class y extends N implements Y41.l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13326c.a f254586l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InterfaceC13326c.a aVar) {
        super(1);
        this.f254586l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        ApiError apiError2 = apiError;
        boolean z12 = apiError2 instanceof ApiError.UnknownError;
        InterfaceC13326c.a aVar = this.f254586l;
        aVar.f2666b.invoke(z12 ? aVar.f2665a.getString(R.string.replace_main_onboarding_error) : apiError2.getF244063c());
        return G0.f406611a;
    }
}
