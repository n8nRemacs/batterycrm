package wj0;

import Y61.k;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: MobileItemEditingTagResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwj0/a;", "", "Lcom/avito/android/remote/model/BeduinV2;", "components", "Lwj0/b;", "footer", "", SearchParamsConverterKt.LOCATION_ID, "<init>", "(Lcom/avito/android/remote/model/BeduinV2;Lwj0/b;J)V", "Lcom/avito/android/remote/model/BeduinV2;", "a", "()Lcom/avito/android/remote/model/BeduinV2;", "Lwj0/b;", "b", "()Lwj0/b;", "J", "c", "()J", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C49640a {

    @com.google.gson.annotations.c("components")
    @k
    private final BeduinV2 components;

    @com.google.gson.annotations.c("footer")
    @k
    private final C49641b footer;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    public C49640a(@k BeduinV2 beduinV2, @k C49641b c49641b, long j12) {
        this.components = beduinV2;
        this.footer = c49641b;
        this.locationId = j12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final BeduinV2 getComponents() {
        return this.components;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C49641b getFooter() {
        return this.footer;
    }

    /* renamed from: c, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }
}
