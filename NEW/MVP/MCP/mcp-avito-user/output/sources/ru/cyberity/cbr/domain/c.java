package ru.cyberity.cbr.domain;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantDataEntites.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\t\u0012 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R/\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lru/cyberity/cbr/domain/c;", "", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", "appConfig", "", "", "genders", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countries", "countryStates", "<init>", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/g;", "g", "()Lru/cyberity/cbr/core/data/model/g;", "b", "Lru/cyberity/cbr/core/data/model/e;", "f", "()Lru/cyberity/cbr/core/data/model/e;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "d", "h", "e", "i", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.g applicant;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.e appConfig;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, String> genders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, String> countries;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, Map<String, String>> countryStates;

    public c() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return L.f(this.applicant, cVar.applicant) && L.f(this.appConfig, cVar.appConfig) && L.f(this.genders, cVar.genders) && L.f(this.countries, cVar.countries) && L.f(this.countryStates, cVar.countryStates);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.e getAppConfig() {
        return this.appConfig;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.g getApplicant() {
        return this.applicant;
    }

    @Y61.k
    public final Map<String, String> h() {
        return this.countries;
    }

    public int hashCode() {
        ru.cyberity.cbr.core.data.model.g gVar = this.applicant;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        ru.cyberity.cbr.core.data.model.e eVar = this.appConfig;
        return this.countryStates.hashCode() + AK.c.c(AK.c.c((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.genders), 31, this.countries);
    }

    @Y61.k
    public final Map<String, Map<String, String>> i() {
        return this.countryStates;
    }

    @Y61.k
    public final Map<String, String> j() {
        return this.genders;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataResources(applicant=");
        sb2.append(this.applicant);
        sb2.append(", appConfig=");
        sb2.append(this.appConfig);
        sb2.append(", genders=");
        sb2.append(this.genders);
        sb2.append(", countries=");
        sb2.append(this.countries);
        sb2.append(", countryStates=");
        return r.w(sb2, this.countryStates, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.l ru.cyberity.cbr.core.data.model.g gVar, @Y61.l ru.cyberity.cbr.core.data.model.e eVar, @Y61.k Map<String, String> map, @Y61.k Map<String, String> map2, @Y61.k Map<String, ? extends Map<String, String>> map3) {
        this.applicant = gVar;
        this.appConfig = eVar;
        this.genders = map;
        this.countries = map2;
        this.countryStates = map3;
    }

    public /* synthetic */ c(ru.cyberity.cbr.core.data.model.g gVar, ru.cyberity.cbr.core.data.model.e eVar, Map map, Map map2, Map map3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : gVar, (i12 & 2) == 0 ? eVar : null, (i12 & 4) != 0 ? P0.c() : map, (i12 & 8) != 0 ? P0.c() : map2, (i12 & 16) != 0 ? P0.c() : map3);
    }
}
