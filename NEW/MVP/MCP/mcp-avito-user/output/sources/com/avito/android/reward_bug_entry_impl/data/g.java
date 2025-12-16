package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RewardBugEntryRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.data.RewardBugEntryRepositoryImpl", f = "RewardBugEntryRepositoryImpl.kt", i = {}, l = {69}, m = "hideFloatingPoint", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f255582q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f255583r;

    /* renamed from: s, reason: collision with root package name */
    public int f255584s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f255583r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f255582q = obj;
        this.f255584s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f255583r.a(this);
    }
}
