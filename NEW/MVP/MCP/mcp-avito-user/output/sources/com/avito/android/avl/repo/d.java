package com.avito.android.avl.repo;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AvlRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.avl.repo.AvlRepositoryImpl", f = "AvlRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 2}, l = {42, 51, 68}, m = "reinitializeState", n = {"this", "key", "categoryId", "xHash", "itemId", "this", "key", "avlItems"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$0"})
/* loaded from: classes11.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f98281q;

    /* renamed from: r, reason: collision with root package name */
    public String f98282r;

    /* renamed from: s, reason: collision with root package name */
    public String f98283s;

    /* renamed from: t, reason: collision with root package name */
    public String f98284t;

    /* renamed from: u, reason: collision with root package name */
    public String f98285u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f98286v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f98287w;

    /* renamed from: x, reason: collision with root package name */
    public int f98288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f98287w = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f98286v = obj;
        this.f98288x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f98287w.a(null, null, null, null, this);
    }
}
