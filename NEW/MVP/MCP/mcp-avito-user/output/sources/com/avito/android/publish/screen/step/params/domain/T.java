package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.details.K1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSuccess", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f241157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C34076c c34076c, DeepLink deepLink) {
        super(1);
        this.f241156l = c34076c;
        this.f241157m = deepLink;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f241156l.f241182L.setValue(new K1.AbstractC33668b.f(this.f241157m));
        }
        return G0.f406611a;
    }
}
