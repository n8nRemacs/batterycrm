package com.avito.android.api;

import android.content.ComponentName;
import android.content.Intent;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/appcompat/app/m;", "activity", "Lkotlin/G0;", "invoke", "(Landroidx/appcompat/app/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<androidx.appcompat.app.m, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApiError f91315l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f91316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, ApiError apiError) {
        super(1);
        this.f91315l = apiError;
        this.f91316m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.appcompat.app.m mVar) {
        androidx.appcompat.app.m mVar2 = mVar;
        boolean z12 = ((ApiError.CertificatePinningError) this.f91315l).f253390b;
        k kVar = this.f91316m;
        if (z12) {
            kVar.getClass();
            ComponentName componentName = mVar2.getComponentName();
            InterfaceC42726C interfaceC42726C = kVar.f91328i;
            if (!L.f(componentName, ((Intent) interfaceC42726C.getValue()).getComponent())) {
                mVar2.startActivity((Intent) interfaceC42726C.getValue());
            }
        } else if (!z12) {
            kVar.getClass();
            ComponentName componentName2 = mVar2.getComponentName();
            InterfaceC42726C interfaceC42726C2 = kVar.f91329j;
            if (!L.f(componentName2, ((Intent) interfaceC42726C2.getValue()).getComponent())) {
                mVar2.startActivity((Intent) interfaceC42726C2.getValue());
                mVar2.finish();
            }
        }
        return G0.f406611a;
    }
}
