package com.avito.android.publish.screen.step.suggest.category;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SuggestCategoryFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment", f = "SuggestCategoryFragment.kt", i = {0}, l = {247}, m = "setupOnboarding", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public SuggestCategoryFragment f242258q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuggestCategoryFragment f242260s;

    /* renamed from: t, reason: collision with root package name */
    public int f242261t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SuggestCategoryFragment suggestCategoryFragment, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242260s = suggestCategoryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f242259r = obj;
        this.f242261t |= BeduinInputModel.MIN_TEXT_VERSION;
        return SuggestCategoryFragment.q5(this.f242260s, this);
    }
}
