package com.avito.android.vas_planning.domain;

import com.avito.android.advertising.loaders.beduin.CallableC28348b;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlannerDateTimeFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning/domain/i;", "Lcom/avito/android/vas_planning/domain/h;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f322331b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final org.threeten.bp.format.c f322332a = org.threeten.bp.format.c.b("yyyy-MM-dd HH:mm");

    /* compiled from: VasPlannerDateTimeFormatter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/domain/i$a;", "", "<init>", "()V", "", "VAS_DATE_TIME_PATTERN", "Ljava/lang/String;", "ZONE_ID_TO_CONVERT", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i() {
    }

    @Override // com.avito.android.vas_planning.domain.h
    @Y61.k
    public final G a(@Y61.k ArrayList arrayList, boolean z12) {
        return new G(new CallableC28348b(z12, arrayList, this));
    }
}
