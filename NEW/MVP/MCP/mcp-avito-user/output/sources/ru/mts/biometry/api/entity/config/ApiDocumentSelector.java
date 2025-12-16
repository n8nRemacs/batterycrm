package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentSelector.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiDocumentSelector;", "", "", "Lru/mts/biometry/api/entity/config/ApiDocumentCountry;", "countries", "", "", "Lru/mts/biometry/api/entity/config/ApiDocumentProp;", "documents", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentSelector {

    @c("countries")
    @k
    private final List<ApiDocumentCountry> countries;

    @c("documents")
    @k
    private final Map<String, ApiDocumentProp> documents;

    public ApiDocumentSelector(@k List<ApiDocumentCountry> list, @k Map<String, ApiDocumentProp> map) {
        this.countries = list;
        this.documents = map;
    }

    @k
    public final List<ApiDocumentCountry> a() {
        return this.countries;
    }

    @k
    public final Map<String, ApiDocumentProp> b() {
        return this.documents;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentSelector)) {
            return false;
        }
        ApiDocumentSelector apiDocumentSelector = (ApiDocumentSelector) obj;
        return L.f(this.countries, apiDocumentSelector.countries) && L.f(this.documents, apiDocumentSelector.documents);
    }

    public final int hashCode() {
        return this.documents.hashCode() + (this.countries.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentSelector(countries=");
        sb2.append(this.countries);
        sb2.append(", documents=");
        return r.w(sb2, this.documents, ')');
    }
}
