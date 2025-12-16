package com.avito.android.avl.repo;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AvlRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.avl.repo.AvlRepositoryImpl", f = "AvlRepositoryImpl.kt", i = {0}, l = {107}, m = "getShortVideosItems", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f98270q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f98272s;

    /* renamed from: t, reason: collision with root package name */
    public int f98273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f98272s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f98271r = obj;
        this.f98273t |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f98263g;
        return this.f98272s.h(null, null, null, null, null, this);
    }
}
