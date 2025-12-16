package com.avito.android.code_check.code_confirm;

import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CodeConfirmFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "phoneString", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class p<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f118778b;

    public p(CodeConfirmFragment codeConfirmFragment) {
        this.f118778b = codeConfirmFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        String str = (String) obj;
        if (str != null) {
            String strA = To.c.a(str);
            CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
            this.f118778b.C5(strA);
        }
        return G0.f406611a;
    }
}
