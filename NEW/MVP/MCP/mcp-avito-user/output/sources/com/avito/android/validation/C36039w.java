package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.validation.n1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000624\u0010\u0005\u001a0\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0017\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00040\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/validation/n1;", "kotlin.jvm.PlatformType", "", "Lj41/e;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.validation.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36039w extends kotlin.jvm.internal.N implements Y41.l<List<n1>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36045z f319432l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36039w(C36045z c36045z) {
        super(1);
        this.f319432l = c36045z;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<n1> list) {
        List<n1> list2 = list;
        C36045z c36045z = this.f319432l;
        C36045z.i(c36045z, list2);
        for (n1 n1Var : list2) {
            EditableParameter<?> editableParameterK = c36045z.k(n1Var.f319402a);
            editableParameterK.setErrorMessage(n1Var instanceof n1.a.c ? C36018l.a((n1.a.c) n1Var, editableParameterK) : n1Var instanceof n1.a.b ? ((n1.a.b) n1Var).f319404c : null);
        }
        return kotlin.G0.f406611a;
    }
}
