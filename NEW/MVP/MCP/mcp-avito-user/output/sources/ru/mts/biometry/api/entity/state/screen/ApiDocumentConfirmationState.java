package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentConfirmationState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationTexts;", "texts", "", "Lru/mts/biometry/api/entity/state/screen/DocumentConfirmationField;", LocalPublishState.FIELDS, "", "fieldsLanguageTag", "<init>", "(Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationTexts;Ljava/util/List;Ljava/lang/String;)V", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationTexts;", "b", "()Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationTexts;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "getFieldsLanguageTag", "()Ljava/lang/String;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentConfirmationState {

    @l
    private final List<DocumentConfirmationField> fields;

    @l
    private final String fieldsLanguageTag;

    @c("i18n")
    @l
    private final ApiDocumentConfirmationTexts texts;

    public ApiDocumentConfirmationState(@l ApiDocumentConfirmationTexts apiDocumentConfirmationTexts, @l List<DocumentConfirmationField> list, @l String str) {
        this.texts = apiDocumentConfirmationTexts;
        this.fields = list;
        this.fieldsLanguageTag = str;
    }

    @l
    public final List<DocumentConfirmationField> a() {
        return this.fields;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiDocumentConfirmationTexts getTexts() {
        return this.texts;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentConfirmationState)) {
            return false;
        }
        ApiDocumentConfirmationState apiDocumentConfirmationState = (ApiDocumentConfirmationState) obj;
        return L.f(this.texts, apiDocumentConfirmationState.texts) && L.f(this.fields, apiDocumentConfirmationState.fields) && L.f(this.fieldsLanguageTag, apiDocumentConfirmationState.fieldsLanguageTag);
    }

    public final int hashCode() {
        ApiDocumentConfirmationTexts apiDocumentConfirmationTexts = this.texts;
        int iHashCode = (apiDocumentConfirmationTexts == null ? 0 : apiDocumentConfirmationTexts.hashCode()) * 31;
        List<DocumentConfirmationField> list = this.fields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.fieldsLanguageTag;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentConfirmationState(texts=");
        sb2.append(this.texts);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", fieldsLanguageTag=");
        return C22026a.c(sb2, this.fieldsLanguageTag, ')');
    }
}
