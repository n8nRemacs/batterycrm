package com.avito.android.blueprints.publish.date_interval;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;

/* compiled from: DateIntervalItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprints/publish/date_interval/c;", "LTV0/f;", "Lcom/avito/android/blueprints/publish/date_interval/i;", "Lcom/avito/android/category_parameters/ParameterElement$d;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c extends TV0.f<i, ParameterElement.C29376d> {

    /* compiled from: DateIntervalItemPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/date_interval/c$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParameterElement.C29376d f106126a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f106127b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f106128c;

        public a(@k ParameterElement.C29376d c29376d, @l Long l12, boolean z12) {
            this.f106126a = c29376d;
            this.f106127b = l12;
            this.f106128c = z12;
        }
    }

    @k
    C41981q0 E0();

    @k
    C41981q0 R();

    @k
    C41981q0 b0();
}
