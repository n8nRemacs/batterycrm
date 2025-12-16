package com.avito.android.notification;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AskNotificationProblemsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification.AskNotificationProblemsInteractorImpl", f = "AskNotificationProblemsInteractor.kt", i = {0, 0, 1}, l = {48, 49}, m = "getNotificationProblems", n = {"this", "problems", "problems"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes15.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f207414q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f207415r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f207416s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f207417t;

    /* renamed from: u, reason: collision with root package name */
    public int f207418u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207417t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207416s = obj;
        this.f207418u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207417t.b(this);
    }
}
