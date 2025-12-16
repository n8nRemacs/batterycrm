package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentRecognitionFormData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionFormData;", "", "Lru/mts/biometry/api/entity/state/ApiDocumentData;", "passport", "document", "<init>", "(Lru/mts/biometry/api/entity/state/ApiDocumentData;Lru/mts/biometry/api/entity/state/ApiDocumentData;)V", "Lru/mts/biometry/api/entity/state/ApiDocumentData;", "b", "()Lru/mts/biometry/api/entity/state/ApiDocumentData;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentRecognitionFormData {

    @c("document")
    @l
    private final ApiDocumentData document;

    @c("passport")
    @l
    private final ApiDocumentData passport;

    public ApiDocumentRecognitionFormData(@l ApiDocumentData apiDocumentData, @l ApiDocumentData apiDocumentData2) {
        this.passport = apiDocumentData;
        this.document = apiDocumentData2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiDocumentData getDocument() {
        return this.document;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiDocumentData getPassport() {
        return this.passport;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentRecognitionFormData)) {
            return false;
        }
        ApiDocumentRecognitionFormData apiDocumentRecognitionFormData = (ApiDocumentRecognitionFormData) obj;
        return L.f(this.passport, apiDocumentRecognitionFormData.passport) && L.f(this.document, apiDocumentRecognitionFormData.document);
    }

    public final int hashCode() {
        ApiDocumentData apiDocumentData = this.passport;
        int iHashCode = (apiDocumentData == null ? 0 : apiDocumentData.hashCode()) * 31;
        ApiDocumentData apiDocumentData2 = this.document;
        return iHashCode + (apiDocumentData2 != null ? apiDocumentData2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ApiDocumentRecognitionFormData(passport=" + this.passport + ", document=" + this.document + ')';
    }
}
