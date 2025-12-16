package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl", f = "BxContentInteractor.kt", i = {}, l = {1419}, m = "closeRecentQuerySearch", n = {}, s = {})
/* loaded from: classes12.dex */
final class G extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111315q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f111316r;

    /* renamed from: s, reason: collision with root package name */
    public int f111317s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(F f12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f111316r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f111315q = obj;
        this.f111317s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f111316r.k(null, null, this);
    }
}
