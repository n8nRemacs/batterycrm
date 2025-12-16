package com.avito.android.autoteka.data;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutotekaRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.AutotekaRepository", f = "AutotekaRepository.kt", i = {}, l = {60}, m = "getReport", n = {}, s = {})
/* loaded from: classes11.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96114q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f96115r;

    /* renamed from: s, reason: collision with root package name */
    public int f96116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96115r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96114q = obj;
        this.f96116s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96115r.b(null, null, null, this);
    }
}
