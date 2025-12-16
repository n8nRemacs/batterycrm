package com.avito.android.work_profile.domain.entity;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/avito/android/work_profile/domain/entity/Vacancy;", "", "geoReferences", "", "Lcom/avito/android/remote/model/GeoReference;", "id", "", "title", "", "salary", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getGeoReferences", "()Ljava/util/List;", "getId", "()J", "getSalary", "()Ljava/lang/String;", "getTitle", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Vacancy {

    @l
    private final List<GeoReference> geoReferences;
    private final long id;

    @k
    private final String salary;

    @k
    private final String title;

    @k
    private final DeepLink uri;

    public Vacancy(@l List<GeoReference> list, long j12, @k String str, @k String str2, @k DeepLink deepLink) {
        this.geoReferences = list;
        this.id = j12;
        this.title = str;
        this.salary = str2;
        this.uri = deepLink;
    }

    public static /* synthetic */ Vacancy copy$default(Vacancy vacancy, List list, long j12, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = vacancy.geoReferences;
        }
        if ((i12 & 2) != 0) {
            j12 = vacancy.id;
        }
        long j13 = j12;
        if ((i12 & 4) != 0) {
            str = vacancy.title;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            str2 = vacancy.salary;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            deepLink = vacancy.uri;
        }
        return vacancy.copy(list, j13, str3, str4, deepLink);
    }

    @l
    public final List<GeoReference> component1() {
        return this.geoReferences;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getSalary() {
        return this.salary;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final Vacancy copy(@l List<GeoReference> geoReferences, long id2, @k String title, @k String salary, @k DeepLink uri) {
        return new Vacancy(geoReferences, id2, title, salary, uri);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vacancy)) {
            return false;
        }
        Vacancy vacancy = (Vacancy) other;
        return L.f(this.geoReferences, vacancy.geoReferences) && this.id == vacancy.id && L.f(this.title, vacancy.title) && L.f(this.salary, vacancy.salary) && L.f(this.uri, vacancy.uri);
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    public final long getId() {
        return this.id;
    }

    @k
    public final String getSalary() {
        return this.salary;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        List<GeoReference> list = this.geoReferences;
        return this.uri.hashCode() + H.d(H.d(r.g((list == null ? 0 : list.hashCode()) * 31, 31, this.id), 31, this.title), 31, this.salary);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Vacancy(geoReferences=");
        sb2.append(this.geoReferences);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", salary=");
        sb2.append(this.salary);
        sb2.append(", uri=");
        return a.v(sb2, this.uri, ')');
    }
}
