package com.avito.android.job.interview.mvi.logics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobInterviewInvitationLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.job.interview.mvi.logics.JobInterviewInvitationLoader", f = "JobInterviewInvitationLoader.kt", i = {0, 0}, l = {12, 14, 13}, m = "loadDraft", n = {"$this$loadDraft", "interactor"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f174624q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.job.interview.domain.e f174625r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f174626s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f174627t;

    /* renamed from: u, reason: collision with root package name */
    public int f174628u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f174627t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f174626s = obj;
        this.f174628u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f174627t.b(null, null, this);
    }
}
