package com.avito.android.code_check.code_confirm;

import Jo.InterfaceC14224a;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f118692l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CodeConfirmFragment codeConfirmFragment) {
        super(1);
        this.f118692l = codeConfirmFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
        ((A) this.f118692l.f118636F0.getValue()).accept(new InterfaceC14224a.b(str));
        return G0.f406611a;
    }
}
