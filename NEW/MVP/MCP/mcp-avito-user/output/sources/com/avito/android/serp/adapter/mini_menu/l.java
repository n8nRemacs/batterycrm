package com.avito.android.serp.adapter.mini_menu;

import com.avito.android.remote.model.serp.Onboarding;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MiniMenuBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/serp/Onboarding;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f270376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f270377c;

    public l(e eVar, m mVar) {
        this.f270376b = eVar;
        this.f270377c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        this.f270376b.gG(((Number) q12.f406619b).intValue(), new k(this.f270377c, (Onboarding) q12.f406620c));
    }
}
