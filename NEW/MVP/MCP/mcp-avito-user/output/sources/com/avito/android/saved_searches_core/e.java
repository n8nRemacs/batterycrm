package com.avito.android.saved_searches_core;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedSearchesInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.saved_searches_core.SavedSearchesInteractorImpl", f = "SavedSearchesInteractorImpl.kt", i = {0, 0}, l = {41}, m = "updateSearchSubscription", n = {"this", "subscriptionId"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f258791q;

    /* renamed from: r, reason: collision with root package name */
    public String f258792r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f258794t;

    /* renamed from: u, reason: collision with root package name */
    public int f258795u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f258794t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f258793s = obj;
        this.f258795u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f258794t.a(null, null, null, false, false, null, null, this);
    }
}
