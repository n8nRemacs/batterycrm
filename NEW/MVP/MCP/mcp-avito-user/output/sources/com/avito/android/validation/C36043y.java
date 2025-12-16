package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.validation.n1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/validation/n1;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.validation.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36043y extends kotlin.jvm.internal.N implements Y41.l<List<? extends n1>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36045z f319439l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36043y(C36045z c36045z) {
        super(1);
        this.f319439l = c36045z;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends n1> list) {
        List<? extends n1> list2 = list;
        C36045z c36045z = this.f319439l;
        C36045z.i(c36045z, list2);
        for (n1 n1Var : list2) {
            EditableParameter<?> editableParameterK = c36045z.k(n1Var.f319402a);
            editableParameterK.setErrorMessage(n1Var instanceof n1.a.c ? C36018l.a((n1.a.c) n1Var, editableParameterK) : n1Var instanceof n1.a.b ? ((n1.a.b) n1Var).f319404c : null);
        }
        return kotlin.G0.f406611a;
    }
}
