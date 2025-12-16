package com.avito.android.code_confirmation.code_confirmation.timer;

import java.util.Calendar;
import kotlin.Metadata;
import l41.o;

/* compiled from: RxTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "apply", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f119633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f119634c;

    public b(long j12, d dVar) {
        this.f119633b = j12;
        this.f119634c = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        this.f119634c.getClass();
        return Long.valueOf(this.f119633b - Calendar.getInstance().getTimeInMillis());
    }
}
