package di0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1NdTrxDevelopmentsByDevelopmentIdBuildingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ldi0/e;", "", "", "id", "", "isCheckerboardAvailable", "", "name", "sectionsLotsCount", "<init>", "(JZLjava/lang/String;Ljava/lang/String;)V", "J", "a", "()J", "Z", "d", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: di0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39735e {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("isCheckerboardAvailable")
    private final boolean isCheckerboardAvailable;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("sectionsLotsCount")
    @k
    private final String sectionsLotsCount;

    public C39735e(long j12, boolean z12, @k String str, @k String str2) {
        this.id = j12;
        this.isCheckerboardAvailable = z12;
        this.name = str;
        this.sectionsLotsCount = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSectionsLotsCount() {
        return this.sectionsLotsCount;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsCheckerboardAvailable() {
        return this.isCheckerboardAvailable;
    }
}
