package com.avito.android.device_orientation;

import kotlin.Metadata;

/* compiled from: StoppableRotationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "degree", "apply", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k<T, R> f139242b = new k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Integer.valueOf(360 - ((Number) obj).intValue());
    }
}
