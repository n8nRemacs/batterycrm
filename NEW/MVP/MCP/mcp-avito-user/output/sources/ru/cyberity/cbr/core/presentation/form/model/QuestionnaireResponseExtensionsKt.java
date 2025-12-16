package ru.cyberity.cbr.core.presentation.form.model;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.FieldType;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt;

/* compiled from: QuestionnaireResponseExtensions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a$\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Lru/cyberity/cbr/core/data/model/q;", "getFieldFormat", "Lru/cyberity/cbr/core/data/model/FieldType;", "typeEnum", "", "getInputType", "", "value", "Lru/cyberity/cbr/core/presentation/form/model/FieldError;", "check", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/o;", "options", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class QuestionnaireResponseExtensionsKt {
    @l
    public static final FieldError check(@k h hVar, @l String str) {
        if (L.f(hVar.getRequired(), Boolean.TRUE) && (str == null || C43066x.K(str))) {
            return FieldError.REQUIRED;
        }
        if (ApplicantDataFieldFormatUtilsKt.checkField(getFieldFormat(hVar), str)) {
            return null;
        }
        return FieldError.NOT_VALID;
    }

    @l
    public static final q getFieldFormat(@k h hVar) {
        return q.INSTANCE.a(hVar.getFormat());
    }

    public static final int getInputType(@k h hVar) {
        Integer inputType;
        q qVarA = q.INSTANCE.a(hVar.getFormat());
        if (qVarA == null || (inputType = ApplicantDataFieldFormatUtilsKt.getInputType(qVarA)) == null) {
            return 1;
        }
        return inputType.intValue();
    }

    @l
    public static final FieldType typeEnum(@k h hVar) {
        return FieldType.INSTANCE.a(hVar.getType());
    }

    @l
    public static final FieldError check(@k h hVar, @l String str, @k List<o> list) {
        if (L.f(hVar.getRequired(), Boolean.TRUE) && (str == null || C43066x.K(str))) {
            return FieldError.REQUIRED;
        }
        if (!list.isEmpty() && str != null && !C43066x.K(str)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (L.f(((o) it.next()).getValue(), str)) {
                    }
                }
            }
            return FieldError.NOT_VALID;
        }
        return null;
    }
}
