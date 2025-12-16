package com.avito.android.work_profile.domain.entity;

import Y61.k;
import androidx.annotation.Keep;
import com.avito.android.remote.model.cv.CvsItemType;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CvsEntity.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/CvsEntity;", "", "list", "", "Lcom/avito/android/remote/model/cv/CvsItemType;", "action", "Lcom/avito/android/work_profile/domain/entity/CvsAction;", "(Ljava/util/List;Lcom/avito/android/work_profile/domain/entity/CvsAction;)V", "getAction", "()Lcom/avito/android/work_profile/domain/entity/CvsAction;", "getList", "()Ljava/util/List;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CvsEntity {

    @k
    private final CvsAction action;

    @k
    private final List<CvsItemType> list;

    /* JADX WARN: Multi-variable type inference failed */
    public CvsEntity(@k List<? extends CvsItemType> list, @k CvsAction cvsAction) {
        this.list = list;
        this.action = cvsAction;
    }

    @k
    public final CvsAction getAction() {
        return this.action;
    }

    @k
    public final List<CvsItemType> getList() {
        return this.list;
    }
}
