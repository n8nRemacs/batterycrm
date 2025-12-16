package com.avito.android.api;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/appcompat/app/m;", "activity", "Lkotlin/G0;", "invoke", "(Landroidx/appcompat/app/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<androidx.appcompat.app.m, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApiError f91313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f91314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, ApiError apiError) {
        super(1);
        this.f91313l = apiError;
        this.f91314m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.appcompat.app.m mVar) {
        androidx.appcompat.app.m mVar2 = mVar;
        DeepLink link = ((com.avito.android.remote.error.p) this.f91313l).getLink();
        if (link != null) {
            this.f91314m.getClass();
            b.a.a(cv.c.a(mVar2).u4(), link, null, null, 6);
        }
        return G0.f406611a;
    }
}
