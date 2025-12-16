package com.avito.android.beduin.common;

import Y41.p;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: ExecuteRequestStates.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/beduin_models/BeduinAction;", "<anonymous parameter 0>", "Lcom/avito/android/remote/error/ApiError;", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_models/BeduinAction;Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements p<BeduinAction, ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f103423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Y41.l<? super ApiError, G0> lVar) {
        super(2);
        this.f103423l = (H) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // Y41.p
    public final G0 invoke(BeduinAction beduinAction, ApiError apiError) {
        this.f103423l.invoke(apiError);
        return G0.f406611a;
    }
}
