package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplinkKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.validation.n1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ParametersListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a,\u0012\u0004\u0012\u00020\u0004 \u0001*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ParametersTree;", "kotlin.jvm.PlatformType", "it", "Ljava/util/ArrayList;", "Lcom/avito/android/validation/n1;", "Lkotlin/collections/ArrayList;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/ParametersTree;)Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<ParametersTree, ArrayList<n1>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36045z f319415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C36045z c36045z) {
        super(1);
        this.f319415l = c36045z;
    }

    @Override // Y41.l
    public final ArrayList<n1> invoke(ParametersTree parametersTree) {
        String text;
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parametersTree) {
            if (parameterSlot instanceof EditableParameter) {
                arrayList.add(parameterSlot);
            }
        }
        ArrayList<n1> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EditableParameter<?> editableParameter = (EditableParameter) it.next();
            boolean zHasErrorMessage = editableParameter.hasErrorMessage();
            C36045z c36045z = this.f319415l;
            if (zHasErrorMessage) {
                c36045z.getClass();
                AttributedText errorMessage = editableParameter.getErrorMessage();
                n1 c9897a = errorMessage != null ? new n1.a.C9897a(editableParameter.getId(), editableParameter.getTitle(), errorMessage, null, WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter), 8, null) : null;
                AttributedText errorMessage2 = editableParameter.getErrorMessage();
                if (errorMessage2 != null && (text = errorMessage2.getText()) != null) {
                    if (c9897a == null) {
                        c9897a = new n1.a.b(editableParameter.getId(), editableParameter.getTitle(), text, null, WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter), null, 40, null);
                    }
                    arrayList2.add(c9897a);
                }
            } else if (editableParameter.getError() instanceof HasError.Error.WithoutMessage) {
                arrayList2.add(new n1.a.c(editableParameter.getId(), editableParameter.getTitle(), c36045z.f319446f.a(editableParameter), WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter)));
            } else if (editableParameter.hasValue()) {
                d1 d1Var = c36045z.f319441a;
                ParametersTree parametersTree2 = c36045z.f319449i;
                n1 n1VarA = d1Var.a(editableParameter, parametersTree2 != null ? parametersTree2 : null, false);
                if ((n1VarA instanceof n1.a) || (n1VarA instanceof n1.b)) {
                    arrayList2.add(n1VarA);
                }
            }
        }
        return arrayList2;
    }
}
