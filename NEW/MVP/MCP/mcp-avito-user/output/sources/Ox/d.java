package ox;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api3DevelopmentSuggestPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lox/d;", "", "", "id", "", "locationName", "name", "officialDeveloper", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    @com.google.gson.annotations.c("id")
    @l
    private final Long id;

    @com.google.gson.annotations.c("locationName")
    @l
    private final String locationName;

    @com.google.gson.annotations.c("name")
    @l
    private final String name;

    @com.google.gson.annotations.c("officialDeveloper")
    @l
    private final String officialDeveloper;

    public d(@l Long l12, @l String str, @l String str2, @l String str3) {
        this.id = l12;
        this.locationName = str;
        this.name = str2;
        this.officialDeveloper = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getOfficialDeveloper() {
        return this.officialDeveloper;
    }
}
