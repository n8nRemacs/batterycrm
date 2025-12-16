package com.avito.android.passport.profile_add.merge.code_confirm;

import b60.InterfaceC25416a;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f212724l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CodeConfirmFragment codeConfirmFragment) {
        super(1);
        this.f212724l = codeConfirmFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
        CodeConfirmFragment codeConfirmFragment = this.f212724l;
        codeConfirmFragment.u5().accept(new InterfaceC25416a.C1991a(codeConfirmFragment.q5().f212680b, str));
        return G0.f406611a;
    }
}
