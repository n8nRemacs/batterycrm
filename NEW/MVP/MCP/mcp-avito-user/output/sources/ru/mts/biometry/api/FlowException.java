package ru.mts.biometry.api;

import Y61.k;
import kotlin.Metadata;
import ru.mts.biometry.api.entity.FlowStatus;

/* compiled from: FlowException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/mts/biometry/api/FlowException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlowException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FlowStatus f436292b;

    public FlowException(@k FlowStatus flowStatus) {
        this.f436292b = flowStatus;
    }
}
