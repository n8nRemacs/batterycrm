package com.avito.android.das_date_picker.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/das_date_picker/mvi/entity/a$b;", "Lcom/avito/android/das_date_picker/mvi/entity/a$c;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C3960a f132396b = new C3960a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f132397c = c.f132399d;

    /* compiled from: DasCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/a$a;", "", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.das_date_picker.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C3960a {
        public /* synthetic */ C3960a(C42822w c42822w) {
            this();
        }

        public C3960a() {
        }
    }

    /* compiled from: DasCalendarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/a$b;", "Lcom/avito/android/das_date_picker/mvi/entity/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f132398d;

        public b(@k List<? extends TV0.a> list) {
            super(null);
            this.f132398d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f132398d, ((b) obj).f132398d);
        }

        public final int hashCode() {
            return this.f132398d.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("Content(items="), this.f132398d, ')');
        }
    }

    /* compiled from: DasCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/a$c;", "Lcom/avito/android/das_date_picker/mvi/entity/a;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final c f132399d = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -290617056;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
