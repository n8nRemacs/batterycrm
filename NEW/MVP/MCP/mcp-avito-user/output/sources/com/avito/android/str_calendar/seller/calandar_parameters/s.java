package com.avito.android.str_calendar.seller.calandar_parameters;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35945t1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SellerCalendarParametersElementConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/s;", "Lcom/avito/android/category_parameters/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s extends com.avito.android.category_parameters.a {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a f287465t;

    public s() {
        throw null;
    }

    public s(InterfaceC35945t1 interfaceC35945t1, Resources resources, com.avito.android.server_time.f fVar, boolean z12, boolean z13, Locale locale, hJ.e eVar, hJ.g gVar, Q1 q12, com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a aVar, u3.l lVar, int i12, C42822w c42822w) {
        super(interfaceC35945t1, resources, fVar, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31808, null);
        this.f287465t = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.C.b N(com.avito.android.remote.model.category_parameters.IntParameter r29, java.util.List<com.avito.android.remote.model.category_parameters.StrAgeVariant> r30, java.util.Set<java.lang.Integer> r31) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.s.N(com.avito.android.remote.model.category_parameters.IntParameter, java.util.List, java.util.Set):com.avito.android.category_parameters.ParameterElement$C$b");
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0476 A[SYNTHETIC] */
    @Override // com.avito.android.category_parameters.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(@Y61.k UV0.a r35, @Y61.l com.avito.android.category_parameters.e r36, @Y61.k java.util.Set r37, @Y61.l com.avito.android.remote.model.search.Theme r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.s.b(UV0.a, com.avito.android.category_parameters.e, java.util.Set, com.avito.android.remote.model.search.Theme):java.util.ArrayList");
    }

    @Override // com.avito.android.category_parameters.a
    @Y61.l
    public final String g(@Y61.k CategoryParameter categoryParameter) {
        if (categoryParameter instanceof EditableParameter) {
            EditableParameter editableParameter = (EditableParameter) categoryParameter;
            HasError.Error error = editableParameter.getError();
            if (error instanceof HasError.Error.WithMessage) {
                AttributedText errorMessage = editableParameter.getErrorMessage();
                if (errorMessage != null) {
                    return errorMessage.getText();
                }
            } else if (error instanceof HasError.Error.WithoutMessage) {
                return "";
            }
        } else if (categoryParameter instanceof EditCategoryParameter) {
            EditCategoryParameter editCategoryParameter = (EditCategoryParameter) categoryParameter;
            HasError.Error error2 = editCategoryParameter.getError();
            if (error2 instanceof HasError.Error.WithMessage) {
                AttributedText errorMessage2 = editCategoryParameter.getErrorMessage();
                if (errorMessage2 != null) {
                    return errorMessage2.getText();
                }
            } else if (error2 instanceof HasError.Error.WithoutMessage) {
                return "";
            }
        }
        return null;
    }
}
