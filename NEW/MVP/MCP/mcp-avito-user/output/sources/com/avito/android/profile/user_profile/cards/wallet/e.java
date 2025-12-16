package com.avito.android.profile.user_profile.cards.wallet;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AvitoFinanceItemDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.AvitoFinanceItemViewModel", f = "AvitoFinanceItemDelegate.kt", i = {}, l = {70}, m = "getAvitoFinanceItem", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f225645q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f225646r;

    /* renamed from: s, reason: collision with root package name */
    public int f225647s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f225646r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f225645q = obj;
        this.f225647s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f225646r.E5(this);
    }
}
