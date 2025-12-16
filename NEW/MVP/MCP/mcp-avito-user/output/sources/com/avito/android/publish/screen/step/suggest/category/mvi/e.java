package com.avito.android.publish.screen.step.suggest.category.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.CategoryModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SuggestCategoryActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.mvi.SuggestCategoryActor", f = "SuggestCategoryActor.kt", i = {2, 2}, l = {96, UpdateStatusCode.DialogButton.CONFIRM, 104}, m = "selectCategory", n = {"this", "category"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f242356q;

    /* renamed from: r, reason: collision with root package name */
    public CategoryModel f242357r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f242358s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f242359t;

    /* renamed from: u, reason: collision with root package name */
    public int f242360u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242359t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f242358s = obj;
        this.f242360u |= BeduinInputModel.MIN_TEXT_VERSION;
        return f.c(this.f242359t, null, false, null, this);
    }
}
