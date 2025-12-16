package com.avito.android.publish.screen.objects.domain.repository;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ObjectValidateRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.repository.ObjectValidateRepositoryImpl", f = "ObjectValidateRepository.kt", i = {0, 1, 2, 3}, l = {47, 52, 57, 61}, m = "validate", n = {"this", "this", "result", "locallyResult"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes16.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f240052q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f240053r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f240054s;

    /* renamed from: t, reason: collision with root package name */
    public int f240055t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f240054s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f240053r = obj;
        this.f240055t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f240054s.a(this);
    }
}
