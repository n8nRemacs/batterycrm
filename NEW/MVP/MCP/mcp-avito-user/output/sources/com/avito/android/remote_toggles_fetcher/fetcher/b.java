package com.avito.android.remote_toggles_fetcher.fetcher;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RemoteTogglesFetcherImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.remote_toggles_fetcher.fetcher.RemoteTogglesFetcherImpl", f = "RemoteTogglesFetcherImpl.kt", i = {0, 0}, l = {35}, m = "load", n = {"this", "onStartup"}, s = {"L$0", "Z$0"})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f254450q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f254451r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f254452s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f254453t;

    /* renamed from: u, reason: collision with root package name */
    public int f254454u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f254453t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f254452s = obj;
        this.f254454u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f254453t.a(false, this);
    }
}
