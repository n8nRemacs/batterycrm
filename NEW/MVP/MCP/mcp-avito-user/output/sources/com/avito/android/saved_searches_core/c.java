package com.avito.android.saved_searches_core;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedSearchesInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.saved_searches_core.SavedSearchesInteractorImpl", f = "SavedSearchesInteractorImpl.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "loadSearchSubscriptions", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f258789q;

    /* renamed from: r, reason: collision with root package name */
    public int f258790r;

    public c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f258789q = obj;
        this.f258790r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
