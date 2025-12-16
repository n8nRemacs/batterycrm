package com.avito.android.avl.repo;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AvlRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.avl.repo.AvlRepositoryImpl", f = "AvlRepositoryImpl.kt", i = {0, 0, 0, 0, 1}, l = {79, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "loadMoreContent", n = {"this", "key", "onComplete", "currentPage", "onComplete"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0"})
/* loaded from: classes11.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f98274q;

    /* renamed from: r, reason: collision with root package name */
    public String f98275r;

    /* renamed from: s, reason: collision with root package name */
    public l f98276s;

    /* renamed from: t, reason: collision with root package name */
    public int f98277t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f98278u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f98279v;

    /* renamed from: w, reason: collision with root package name */
    public int f98280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f98279v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f98278u = obj;
        this.f98280w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f98279v.d(null, null, this);
    }
}
