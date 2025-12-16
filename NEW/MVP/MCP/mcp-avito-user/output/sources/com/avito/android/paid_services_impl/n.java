package com.avito.android.paid_services_impl;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import v50.g;

/* compiled from: PaymentFlowInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/paid_services_impl/n;", "Lv50/g;", "a", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements v50.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f210654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f210655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public DeepLink f210656c;

    /* compiled from: PaymentFlowInteractorImpl.kt */
    @ContributesBinding
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/paid_services_impl/n$a;", "Lv50/g$b;", "<init>", "()V", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g.b {
        @Inject
        public a() {
        }

        @Override // v50.g.b
        @Y61.k
        public final n a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k String str) {
            return new n(aVar, str);
        }
    }

    public n(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k String str) {
        this.f210654a = aVar;
        this.f210655b = str;
    }

    @Override // v50.g
    @Y61.k
    public final r a() {
        return new r(new s(new p(new C43197r1(new t(2, this, n.class, "trySetSuccessFlowUri", "trySetSuccessFlowUri(Lcom/avito/android/deep_linking/links/result/DeeplinkResult;)V", 4), new q(new o(y.a(this.f210654a.V9()), this))), this), this), this);
    }

    @Override // v50.g
    public final void b(@Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2) {
        if (deepLink != null) {
            b.a.a(this.f210654a, deepLink, this.f210655b, null, 4);
        }
        this.f210656c = deepLink2;
    }
}
