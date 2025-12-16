package com.avito.android.work_profile.domain.entity;

import Y61.k;
import Y61.l;
import aQ0.AbstractC19808b;
import androidx.annotation.Keep;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AppliesToVacancy.kt */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/AppliesToVacancy;", "", "", "LaQ0/b;", "list", "Lcom/avito/android/work_profile/domain/entity/AppliesBanner;", AdFormat.BANNER, "<init>", "(Ljava/util/List;Lcom/avito/android/work_profile/domain/entity/AppliesBanner;)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Lcom/avito/android/work_profile/domain/entity/AppliesBanner;", "getBanner", "()Lcom/avito/android/work_profile/domain/entity/AppliesBanner;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppliesToVacancy {

    @l
    private final AppliesBanner banner;

    @k
    private final List<AbstractC19808b> list;

    /* JADX WARN: Multi-variable type inference failed */
    public AppliesToVacancy(@k List<? extends AbstractC19808b> list, @l AppliesBanner appliesBanner) {
        this.list = list;
        this.banner = appliesBanner;
    }

    @l
    public final AppliesBanner getBanner() {
        return this.banner;
    }

    @k
    public final List<AbstractC19808b> getList() {
        return this.list;
    }
}
