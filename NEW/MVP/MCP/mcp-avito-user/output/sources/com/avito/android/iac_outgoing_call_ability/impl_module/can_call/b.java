package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import kotlin.Metadata;
import l41.o;

/* compiled from: IacCanCallInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "it", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/remote/CanCallResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IacCanCallInteractorImpl f168531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IacCallContext f168533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DeepLink f168534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f168535f;

    public b(IacCanCallInteractorImpl iacCanCallInteractorImpl, String str, IacCallContext iacCallContext, DeepLink deepLink, String str2) {
        this.f168531b = iacCanCallInteractorImpl;
        this.f168532c = str;
        this.f168533d = iacCallContext;
        this.f168534e = deepLink;
        this.f168535f = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CanCallResult canCallResult = (CanCallResult) obj;
        return this.f168531b.f168521j.a(canCallResult, this.f168532c, this.f168533d, this.f168534e, this.f168535f);
    }
}
