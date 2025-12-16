package com.avito.android.gig_motivations_list.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MotivationsListRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_motivations_list.data.MotivationsListRepositoryImpl", f = "MotivationsListRepositoryImpl.kt", i = {}, l = {14}, m = "getMotivations", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160273q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f160274r;

    /* renamed from: s, reason: collision with root package name */
    public int f160275s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160274r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f160273q = obj;
        this.f160275s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f160274r.a(this);
    }
}
