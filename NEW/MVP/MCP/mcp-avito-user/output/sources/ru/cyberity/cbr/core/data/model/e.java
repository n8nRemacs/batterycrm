package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppConfig.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'BÁ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u0007\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0007\u0012 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u0007\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R1\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R+\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R1\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\bI\u0010\u001fR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\b'\u0010N¨\u0006O"}, d2 = {"Lru/cyberity/cbr/core/data/model/e;", "", "", "applicantId", "Lru/cyberity/cbr/core/data/model/FlowType;", "flowType", "idDocSetType", "", "sdkDict", "documentsByCountries", "uiConf", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneCountryCodeWithMasks", "initMetadata", "Lru/cyberity/cbr/core/data/model/remote/n;", "tinCountryInfo", "countryStates", "", "Lru/cyberity/cbr/core/data/model/j;", "eKycConfig", "countryDependingFields", "Lru/cyberity/cbr/core/data/model/u;", "ekycSources", "verificationUrl", "accessToken", "Lru/cyberity/cbr/core/data/model/e$a;", "action", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/e$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "s", "b", "Lru/cyberity/cbr/core/data/model/FlowType;", "y", "()Lru/cyberity/cbr/core/data/model/FlowType;", "c", "z", "d", "Ljava/util/Map;", "C", "()Ljava/util/Map;", "e", "v", "f", "E", "g", "B", "h", "A", "i", "D", "j", "u", "k", "w", "l", "t", "m", "x", "n", "F", "o", "q", "p", "Lru/cyberity/cbr/core/data/model/e$a;", "r", "()Lru/cyberity/cbr/core/data/model/e$a;", "(Lru/cyberity/cbr/core/data/model/e$a;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String applicantId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final FlowType flowType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String idDocSetType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> sdkDict;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> documentsByCountries;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> uiConf;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, ru.cyberity.cbr.core.data.model.remote.c> phoneCountryCodeWithMasks;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> initMetadata;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, ru.cyberity.cbr.core.data.model.remote.n> tinCountryInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Map<String, String>> countryStates;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, List<j>> eKycConfig;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Map<String, String>> countryDependingFields;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, u> ekycSources;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String verificationUrl;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String accessToken;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private a action;

    /* compiled from: AppConfig.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/data/model/e$a;", "", "", "id", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "type", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "d", "()Lru/cyberity/cbr/core/data/model/FlowActionType;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final FlowActionType type;

        public a(@Y61.k String str, @Y61.k FlowActionType flowActionType) {
            this.id = str;
            this.type = flowActionType;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final FlowActionType getType() {
            return this.type;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.id, aVar.id) && L.f(this.type, aVar.type);
        }

        public int hashCode() {
            return this.type.hashCode() + (this.id.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            return "Action(id=" + this.id + ", type=" + this.type + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k String str, @Y61.k FlowType flowType, @Y61.l String str2, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2, @Y61.l Map<String, ? extends Object> map3, @Y61.l Map<String, ru.cyberity.cbr.core.data.model.remote.c> map4, @Y61.l Map<String, String> map5, @Y61.l Map<String, ru.cyberity.cbr.core.data.model.remote.n> map6, @Y61.l Map<String, ? extends Map<String, String>> map7, @Y61.l Map<String, ? extends List<j>> map8, @Y61.l Map<String, ? extends Map<String, String>> map9, @Y61.l Map<String, u> map10, @Y61.l String str3, @Y61.l String str4, @Y61.l a aVar) {
        this.applicantId = str;
        this.flowType = flowType;
        this.idDocSetType = str2;
        this.sdkDict = map;
        this.documentsByCountries = map2;
        this.uiConf = map3;
        this.phoneCountryCodeWithMasks = map4;
        this.initMetadata = map5;
        this.tinCountryInfo = map6;
        this.countryStates = map7;
        this.eKycConfig = map8;
        this.countryDependingFields = map9;
        this.ekycSources = map10;
        this.verificationUrl = str3;
        this.accessToken = str4;
        this.action = aVar;
    }

    @Y61.l
    public final Map<String, String> A() {
        return this.initMetadata;
    }

    @Y61.l
    public final Map<String, ru.cyberity.cbr.core.data.model.remote.c> B() {
        return this.phoneCountryCodeWithMasks;
    }

    @Y61.l
    public final Map<String, Object> C() {
        return this.sdkDict;
    }

    @Y61.l
    public final Map<String, ru.cyberity.cbr.core.data.model.remote.n> D() {
        return this.tinCountryInfo;
    }

    @Y61.l
    public final Map<String, Object> E() {
        return this.uiConf;
    }

    @Y61.l
    /* renamed from: F, reason: from getter */
    public final String getVerificationUrl() {
        return this.verificationUrl;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return L.f(this.applicantId, eVar.applicantId) && this.flowType == eVar.flowType && L.f(this.idDocSetType, eVar.idDocSetType) && L.f(this.sdkDict, eVar.sdkDict) && L.f(this.documentsByCountries, eVar.documentsByCountries) && L.f(this.uiConf, eVar.uiConf) && L.f(this.phoneCountryCodeWithMasks, eVar.phoneCountryCodeWithMasks) && L.f(this.initMetadata, eVar.initMetadata) && L.f(this.tinCountryInfo, eVar.tinCountryInfo) && L.f(this.countryStates, eVar.countryStates) && L.f(this.eKycConfig, eVar.eKycConfig) && L.f(this.countryDependingFields, eVar.countryDependingFields) && L.f(this.ekycSources, eVar.ekycSources) && L.f(this.verificationUrl, eVar.verificationUrl) && L.f(this.accessToken, eVar.accessToken) && L.f(this.action, eVar.action);
    }

    public int hashCode() {
        int iHashCode = (this.flowType.hashCode() + (this.applicantId.hashCode() * 31)) * 31;
        String str = this.idDocSetType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.sdkDict;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.documentsByCountries;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.uiConf;
        int iHashCode5 = (iHashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> map4 = this.phoneCountryCodeWithMasks;
        int iHashCode6 = (iHashCode5 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, String> map5 = this.initMetadata;
        int iHashCode7 = (iHashCode6 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map<String, ru.cyberity.cbr.core.data.model.remote.n> map6 = this.tinCountryInfo;
        int iHashCode8 = (iHashCode7 + (map6 == null ? 0 : map6.hashCode())) * 31;
        Map<String, Map<String, String>> map7 = this.countryStates;
        int iHashCode9 = (iHashCode8 + (map7 == null ? 0 : map7.hashCode())) * 31;
        Map<String, List<j>> map8 = this.eKycConfig;
        int iHashCode10 = (iHashCode9 + (map8 == null ? 0 : map8.hashCode())) * 31;
        Map<String, Map<String, String>> map9 = this.countryDependingFields;
        int iHashCode11 = (iHashCode10 + (map9 == null ? 0 : map9.hashCode())) * 31;
        Map<String, u> map10 = this.ekycSources;
        int iHashCode12 = (iHashCode11 + (map10 == null ? 0 : map10.hashCode())) * 31;
        String str2 = this.verificationUrl;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.action;
        return iHashCode14 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: s, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @Y61.l
    public final Map<String, Map<String, String>> t() {
        return this.countryDependingFields;
    }

    @Y61.k
    public String toString() {
        return "AppConfig(applicantId=" + this.applicantId + ", flowType=" + this.flowType + ", idDocSetType=" + this.idDocSetType + ", sdkDict=" + this.sdkDict + ", documentsByCountries=" + this.documentsByCountries + ", uiConf=" + this.uiConf + ", phoneCountryCodeWithMasks=" + this.phoneCountryCodeWithMasks + ", initMetadata=" + this.initMetadata + ", tinCountryInfo=" + this.tinCountryInfo + ", countryStates=" + this.countryStates + ", eKycConfig=" + this.eKycConfig + ", countryDependingFields=" + this.countryDependingFields + ", ekycSources=" + this.ekycSources + ", verificationUrl=" + this.verificationUrl + ", accessToken=" + this.accessToken + ", action=" + this.action + ')';
    }

    @Y61.l
    public final Map<String, Map<String, String>> u() {
        return this.countryStates;
    }

    @Y61.l
    public final Map<String, Object> v() {
        return this.documentsByCountries;
    }

    @Y61.l
    public final Map<String, List<j>> w() {
        return this.eKycConfig;
    }

    @Y61.l
    public final Map<String, u> x() {
        return this.ekycSources;
    }

    @Y61.k
    /* renamed from: y, reason: from getter */
    public final FlowType getFlowType() {
        return this.flowType;
    }

    @Y61.l
    /* renamed from: z, reason: from getter */
    public final String getIdDocSetType() {
        return this.idDocSetType;
    }

    public /* synthetic */ e(String str, FlowType flowType, String str2, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, String str3, String str4, a aVar, int i12, C42822w c42822w) {
        this(str, flowType, str2, map, map2, map3, map4, map5, map6, map7, map8, map9, map10, str3, str4, (i12 & 32768) != 0 ? null : aVar);
    }
}
