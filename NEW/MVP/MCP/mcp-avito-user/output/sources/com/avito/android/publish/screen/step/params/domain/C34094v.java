package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.V0;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needConfirmation", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34094v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f241293c;

    public C34094v(C34076c c34076c, String str) {
        this.f241292b = c34076c;
        this.f241293c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C34076c c34076c = this.f241292b;
        c34076c.f241181K.K5(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
        if (!zBooleanValue) {
            c34076c.r();
            return;
        }
        long longOrDefault = Util.toLongOrDefault(this.f241293c, 0L);
        V0 v02 = c34076c.f241187b;
        c34076c.f241182L.setValue(new K1.AbstractC33668b.f(new PriceReductionLink(longOrDefault, v02.e8(), v02.qd())));
    }
}
