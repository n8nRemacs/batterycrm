package com.avito.android.validation;

import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.DependentConstraint;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasHtmlValueSupport;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplinkKt;
import com.avito.android.validation.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParametersValidator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/validation/e1;", "Lcom/avito/android/validation/d1;", "a", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e1 implements d1 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final hJ.h f319362d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g1 f319363a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final hJ.i f319364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final hJ.e f319365c;

    /* compiled from: ParametersValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/validation/e1$a;", "", "<init>", "()V", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ParametersValidator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Constraint;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Constraint, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f319366l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Constraint constraint) {
            Constraint constraint2 = constraint;
            return Boolean.valueOf(kotlin.jvm.internal.L.f(constraint2.getSeverity(), "error") || constraint2.getSeverity() == null);
        }
    }

    /* compiled from: ParametersValidator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Constraint;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Constraint, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f319367l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Constraint constraint) {
            return Boolean.valueOf(kotlin.jvm.internal.L.f(constraint.getSeverity(), ConstraintKt.WARNING_ON_FLOW_FINISH));
        }
    }

    /* compiled from: ParametersValidator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Constraint;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Constraint, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f319368l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Constraint constraint) {
            return Boolean.valueOf(kotlin.jvm.internal.L.f(constraint.getSeverity(), ConstraintKt.WARNING));
        }
    }

    static {
        new a(null);
        f319362d = new hJ.h(0, 0, 0, "—", false, 0, 16, null);
    }

    @Inject
    public e1(@Y61.k g1 g1Var, @Y61.k hJ.i iVar, @Y61.k hJ.e eVar) {
        this.f319363a = g1Var;
        this.f319364b = iVar;
        this.f319365c = eVar;
    }

    public static EditableParameter e(String str, IterableParameters iterableParameters) {
        ParameterSlot parameterSlotFindParameter = iterableParameters.findParameter(str);
        EditableParameter editableParameter = parameterSlotFindParameter instanceof EditableParameter ? (EditableParameter) parameterSlotFindParameter : null;
        if (editableParameter != null) {
            return editableParameter;
        }
        throw new IllegalArgumentException(AK.c.k("Parameter with ", str, " is not present in the list"));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.validation.n1 f(com.avito.android.remote.model.category_parameters.base.EditableParameter r17, java.util.List r18, com.avito.android.remote.model.IterableParameters r19, Y41.l r20) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.validation.e1.f(com.avito.android.remote.model.category_parameters.base.EditableParameter, java.util.List, com.avito.android.remote.model.IterableParameters, Y41.l):com.avito.android.validation.n1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(EditableParameter editableParameter) {
        if (editableParameter instanceof PhotoParameter) {
            HasConstraints hasConstraints = editableParameter instanceof HasConstraints ? (HasConstraints) editableParameter : null;
            List<Constraint> constraints = hasConstraints != null ? hasConstraints.getConstraints() : null;
            if (constraints != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : constraints) {
                    if (obj instanceof Constraint.Limit) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Constraint.Limit limit = (Constraint.Limit) it.next();
                        if (limit.getSeverity() == null || kotlin.jvm.internal.L.f(limit.getSeverity(), "error")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.avito.android.validation.d1
    @Y61.k
    public final n1 a(@Y61.k EditableParameter<?> editableParameter, @Y61.k IterableParameters iterableParameters, boolean z12) {
        return c(editableParameter, iterableParameters, z12);
    }

    @Override // com.avito.android.validation.d1
    @Y61.k
    public final List b(@Y61.k EditableParameter editableParameter, @Y61.k ParametersTree parametersTree) {
        return d(editableParameter, parametersTree, new LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n1 c(EditableParameter<?> editableParameter, IterableParameters iterableParameters, boolean z12) {
        Constraint constraint;
        n1 cVar;
        List<Constraint> constraints;
        Object next;
        if (editableParameter instanceof HasHtmlValueSupport) {
            HasHtmlValueSupport hasHtmlValueSupport = (HasHtmlValueSupport) editableParameter;
            DisplayingOptions displayingOptions = hasHtmlValueSupport.getDisplayingOptions();
            if (kotlin.jvm.internal.L.f(displayingOptions != null ? displayingOptions.getType() : null, "htmlEditor")) {
                Object value = editableParameter.getValue();
                String str = value instanceof String ? (String) value : null;
                hasHtmlValueSupport.setRenderedHtmlValue(str != null ? this.f319364b.a(this.f319365c.a(str), f319362d).f164164b.toString() : null);
            }
        }
        g1 g1Var = this.f319363a;
        if (z12) {
            HasConstraints hasConstraints = editableParameter instanceof HasConstraints ? (HasConstraints) editableParameter : null;
            if (hasConstraints == null || (constraints = hasConstraints.getConstraints()) == null) {
                constraint = null;
            } else {
                Iterator<T> it = constraints.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((Constraint) next) instanceof Constraint.Required) {
                        break;
                    }
                }
                constraint = (Constraint) next;
            }
            if (constraint == null || editableParameter.hasValue()) {
                cVar = (!editableParameter.getRequired() || editableParameter.hasValue() || g(editableParameter)) ? null : new n1.a.c(editableParameter.getId(), editableParameter.getTitle(), g1Var.a(editableParameter), WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter));
            } else {
                String id2 = editableParameter.getId();
                String title = editableParameter.getTitle();
                String message = constraint.getMessage();
                if (message == null) {
                    message = "";
                }
                cVar = new n1.a.b(id2, title, message, constraint.getTag(), WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter), "required", null);
            }
            if (cVar != null) {
                return cVar;
            }
        } else if (editableParameter.getRequired() && !editableParameter.hasValue() && !g(editableParameter)) {
            return new n1.a.c(editableParameter.getId(), editableParameter.getTitle(), g1Var.a(editableParameter), WithOnValidationFailedDeeplinkKt.getOnValidationFailedDeeplink(editableParameter));
        }
        HasConstraints hasConstraints2 = editableParameter instanceof HasConstraints ? (HasConstraints) editableParameter : null;
        List<Constraint> constraints2 = hasConstraints2 != null ? hasConstraints2.getConstraints() : null;
        if (constraints2 == null) {
            return new n1.c(editableParameter.getId(), null);
        }
        n1 n1VarF = f(editableParameter, constraints2, iterableParameters, b.f319366l);
        if (n1VarF != null) {
            return n1VarF;
        }
        n1 n1VarF2 = f(editableParameter, constraints2, iterableParameters, c.f319367l);
        if (n1VarF2 != null) {
            return n1VarF2;
        }
        n1 n1VarF3 = f(editableParameter, constraints2, iterableParameters, d.f319368l);
        return n1VarF3 == null ? new n1.c(editableParameter.getId(), null) : n1VarF3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List d(EditableParameter editableParameter, ParametersTree parametersTree, LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        HasConstraints hasConstraints = editableParameter instanceof HasConstraints ? (HasConstraints) editableParameter : null;
        List<Constraint> constraints = hasConstraints != null ? hasConstraints.getConstraints() : null;
        if (constraints != null) {
            arrayList2 = new ArrayList();
            for (Object obj : constraints) {
                if (((Constraint) obj) instanceof DependentConstraint) {
                    arrayList2.add(obj);
                }
            }
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return Collections.singletonList(c(editableParameter, parametersTree, false));
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(arrayList2);
        n1 n1VarC = c(editableParameter, parametersTree, false);
        linkedHashSet.add(editableParameter.getId());
        arrayList.add(n1VarC);
        while (!linkedList.isEmpty()) {
            DependentConstraint dependentConstraint = (DependentConstraint) linkedList.remove();
            if (!linkedHashSet.contains(dependentConstraint.getDependentId())) {
                arrayList.addAll(d(e(dependentConstraint.getDependentId(), parametersTree), parametersTree, linkedHashSet));
            }
        }
        return arrayList;
    }
}
