package com.avito.android.notification;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AskNotificationProblemsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification.AskNotificationProblemsInteractorImpl", f = "AskNotificationProblemsInteractor.kt", i = {0}, l = {40}, m = "canCheckProblems", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f207410q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207411r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f207412s;

    /* renamed from: t, reason: collision with root package name */
    public int f207413t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207412s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207411r = obj;
        this.f207413t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207412s.a(this);
    }
}
