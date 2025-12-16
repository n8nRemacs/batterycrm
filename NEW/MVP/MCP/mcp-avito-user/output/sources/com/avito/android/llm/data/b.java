package com.avito.android.llm.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LlmDescriptionRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.llm.data.LlmDescriptionRepositoryImpl", f = "LlmDescriptionRepositoryImpl.kt", i = {}, l = {15}, m = "beautifyDescription", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f181671q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f181672r;

    /* renamed from: s, reason: collision with root package name */
    public int f181673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181672r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f181671q = obj;
        this.f181673s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181672r.a(0L, null, this);
    }
}
