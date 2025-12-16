package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiIdentificationsConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiIdentificationsConfig;", "", "Lru/mts/biometry/api/entity/config/ApiDocumentSelector;", "selector", "Lru/mts/biometry/api/entity/config/ApiSuccessPage;", "successPage", "Lru/mts/biometry/api/entity/config/ApiDocumentPhotos;", "documentPhotos", "<init>", "(Lru/mts/biometry/api/entity/config/ApiDocumentSelector;Lru/mts/biometry/api/entity/config/ApiSuccessPage;Lru/mts/biometry/api/entity/config/ApiDocumentPhotos;)V", "Lru/mts/biometry/api/entity/config/ApiDocumentSelector;", "b", "()Lru/mts/biometry/api/entity/config/ApiDocumentSelector;", "Lru/mts/biometry/api/entity/config/ApiSuccessPage;", "c", "()Lru/mts/biometry/api/entity/config/ApiSuccessPage;", "Lru/mts/biometry/api/entity/config/ApiDocumentPhotos;", "a", "()Lru/mts/biometry/api/entity/config/ApiDocumentPhotos;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiIdentificationsConfig {

    @c("documentPhotos")
    @l
    private final ApiDocumentPhotos documentPhotos;

    @c("documentSelector")
    @l
    private final ApiDocumentSelector selector;

    @c("successPage")
    @l
    private final ApiSuccessPage successPage;

    public ApiIdentificationsConfig(@l ApiDocumentSelector apiDocumentSelector, @l ApiSuccessPage apiSuccessPage, @l ApiDocumentPhotos apiDocumentPhotos) {
        this.selector = apiDocumentSelector;
        this.successPage = apiSuccessPage;
        this.documentPhotos = apiDocumentPhotos;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiDocumentPhotos getDocumentPhotos() {
        return this.documentPhotos;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiDocumentSelector getSelector() {
        return this.selector;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ApiSuccessPage getSuccessPage() {
        return this.successPage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiIdentificationsConfig)) {
            return false;
        }
        ApiIdentificationsConfig apiIdentificationsConfig = (ApiIdentificationsConfig) obj;
        return L.f(this.selector, apiIdentificationsConfig.selector) && L.f(this.successPage, apiIdentificationsConfig.successPage) && L.f(this.documentPhotos, apiIdentificationsConfig.documentPhotos);
    }

    public final int hashCode() {
        ApiDocumentSelector apiDocumentSelector = this.selector;
        int iHashCode = (apiDocumentSelector == null ? 0 : apiDocumentSelector.hashCode()) * 31;
        ApiSuccessPage apiSuccessPage = this.successPage;
        int iHashCode2 = (iHashCode + (apiSuccessPage == null ? 0 : apiSuccessPage.hashCode())) * 31;
        ApiDocumentPhotos apiDocumentPhotos = this.documentPhotos;
        return iHashCode2 + (apiDocumentPhotos != null ? apiDocumentPhotos.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ApiIdentificationsConfig(selector=" + this.selector + ", successPage=" + this.successPage + ", documentPhotos=" + this.documentPhotos + ')';
    }
}
