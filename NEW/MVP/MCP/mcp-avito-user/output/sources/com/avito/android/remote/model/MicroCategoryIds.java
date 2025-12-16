package com.avito.android.remote.model;

import Y61.k;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MicroCategoryIds.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/MicroCategoryIds;", "", "()V", "MOPEDS_AND_SCOOTERS", "", "", "getMOPEDS_AND_SCOOTERS", "()Ljava/util/List;", "MOTORCYCLES", "getMOTORCYCLES", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MicroCategoryIds {

    @k
    public static final MicroCategoryIds INSTANCE = new MicroCategoryIds();

    @k
    private static final List<String> MOTORCYCLES = C42745f0.U("3723", "3724", "3725", "3726", "3727");

    @k
    private static final List<String> MOPEDS_AND_SCOOTERS = Collections.singletonList("218");

    private MicroCategoryIds() {
    }

    @k
    public final List<String> getMOPEDS_AND_SCOOTERS() {
        return MOPEDS_AND_SCOOTERS;
    }

    @k
    public final List<String> getMOTORCYCLES() {
        return MOTORCYCLES;
    }
}
