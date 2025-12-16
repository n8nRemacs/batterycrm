package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34088o extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34088o(C34076c c34076c) {
        super(1);
        this.f241285l = c34076c;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f241285l.f241181K.K5(PublishDetailsInternalAction.InternalStateAction.ShowRetry.f241448b);
        return G0.f406611a;
    }
}
