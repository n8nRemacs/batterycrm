package com.avito.android.passport_lib;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportStateRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport_lib.PassportStateRepositoryImpl", f = "PassportStateRepository.kt", i = {}, l = {33}, m = "loadPassportAvailability", n = {}, s = {})
/* loaded from: classes15.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f213939q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f213940r;

    /* renamed from: s, reason: collision with root package name */
    public int f213941s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213940r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213939q = obj;
        this.f213941s |= BeduinInputModel.MIN_TEXT_VERSION;
        return q.b(this.f213940r, this);
    }
}
