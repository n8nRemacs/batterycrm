package com.avito.android.code_check.code_confirm;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.code_check.code_confirm.CodeConfirmFragment", f = "CodeConfirmFragment.kt", i = {}, l = {113}, m = "subscribeToRepositoryChanges", n = {}, s = {})
/* loaded from: classes12.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f118775q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f118776r;

    /* renamed from: s, reason: collision with root package name */
    public int f118777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CodeConfirmFragment codeConfirmFragment, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f118776r = codeConfirmFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f118775q = obj;
        this.f118777s |= BeduinInputModel.MIN_TEXT_VERSION;
        return CodeConfirmFragment.x5(this.f118776r, this);
    }
}
