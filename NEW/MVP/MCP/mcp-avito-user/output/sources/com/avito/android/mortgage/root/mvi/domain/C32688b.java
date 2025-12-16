package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ApplicationPollingInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.ApplicationPollingInteractorImpl", f = "ApplicationPollingInteractor.kt", i = {0}, l = {149, 151}, m = "handleUxFeedback", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.mortgage.root.mvi.domain.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32688b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C32691e f203051q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32691e f203053s;

    /* renamed from: t, reason: collision with root package name */
    public int f203054t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32688b(C32691e c32691e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f203053s = c32691e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f203052r = obj;
        this.f203054t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C32691e.d(this.f203053s, null, this);
    }
}
