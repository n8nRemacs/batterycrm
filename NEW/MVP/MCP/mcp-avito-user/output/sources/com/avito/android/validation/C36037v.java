package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.validation.n1;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ParametersListInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/validation/n1;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)Lcom/avito/android/validation/n1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.validation.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36037v extends kotlin.jvm.internal.N implements Y41.l<EditableParameter<?>, n1> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f319427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C36045z f319428m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36037v(Set<String> set, C36045z c36045z) {
        super(1);
        this.f319427l = set;
        this.f319428m = c36045z;
    }

    @Override // Y41.l
    public final n1 invoke(EditableParameter<?> editableParameter) {
        EditableParameter<?> editableParameter2 = editableParameter;
        if (this.f319427l.contains(editableParameter2.getId())) {
            return new n1.c(editableParameter2.getId(), null);
        }
        C36045z c36045z = this.f319428m;
        boolean zBooleanValue = c36045z.f319447g.C().invoke().booleanValue();
        ParametersTree parametersTree = c36045z.f319449i;
        return c36045z.f319441a.a(editableParameter2, parametersTree != null ? parametersTree : null, zBooleanValue);
    }
}
