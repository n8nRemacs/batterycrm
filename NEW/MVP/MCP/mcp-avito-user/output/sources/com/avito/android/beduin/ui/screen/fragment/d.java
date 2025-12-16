package com.avito.android.beduin.ui.screen.fragment;

import android.view.View;
import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBaseScreenFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Lcom/avito/android/remote/error/ApiError;", "kotlin.jvm.PlatformType", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseScreenFragment<i> f104249l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BeduinBaseScreenFragment<i> beduinBaseScreenFragment) {
        super(1);
        this.f104249l = beduinBaseScreenFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        ApiError apiError2 = apiError;
        View view = this.f104249l.getView();
        if (view != null) {
            com.avito.android.component.toast.b.b(view, z.k(apiError2), 0, null, 0, null, 0, null, new f.c(apiError2), null, 130942);
        }
        return G0.f406611a;
    }
}
