package com.avito.android.verification.links.tochka;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationTochkaLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.tochka.VerificationTochkaLinkInteractor", f = "VerificationTochkaLinkInteractor.kt", i = {}, l = {11}, m = "tochkaFinish", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f324672q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f324673r;

    /* renamed from: s, reason: collision with root package name */
    public int f324674s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324673r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f324672q = obj;
        this.f324674s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f324673r.a(null, this);
    }
}
