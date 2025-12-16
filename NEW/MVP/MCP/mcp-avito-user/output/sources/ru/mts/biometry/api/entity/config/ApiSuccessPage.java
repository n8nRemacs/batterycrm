package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiSuccessPage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiSuccessPage;", "", "", "isEnabled", "<init>", "(Z)V", "Z", "a", "()Z", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiSuccessPage {

    @c("isEnabled")
    private final boolean isEnabled;

    public ApiSuccessPage(boolean z12) {
        this.isEnabled = z12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiSuccessPage) && this.isEnabled == ((ApiSuccessPage) obj).isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ApiSuccessPage(isEnabled="), this.isEnabled, ')');
    }
}
