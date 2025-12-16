package com.avito.android.widget_filters.domain;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersParametersValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/widget_filters/domain/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/widget_filters/domain/a$a;", "Lcom/avito/android/widget_filters/domain/a$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.widget_filters.domain.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36153a {

    /* compiled from: WidgetFiltersParametersValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/a$a;", "Lcom/avito/android/widget_filters/domain/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.domain.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10249a extends AbstractC36153a {

        /* renamed from: a, reason: collision with root package name */
        public final int f329847a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f329848b;

        public C10249a(int i12, @Y61.l String str) {
            super(null);
            this.f329847a = i12;
            this.f329848b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10249a)) {
                return false;
            }
            C10249a c10249a = (C10249a) obj;
            return this.f329847a == c10249a.f329847a && L.f(this.f329848b, c10249a.f329848b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f329847a) * 31;
            String str = this.f329848b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(invalidatedPosition=");
            sb2.append(this.f329847a);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f329848b, ')');
        }
    }

    /* compiled from: WidgetFiltersParametersValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/domain/a$b;", "Lcom/avito/android/widget_filters/domain/a;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.domain.a$b */
    public static final /* data */ class b extends AbstractC36153a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f329849a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1049974707;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }

    public /* synthetic */ AbstractC36153a(C42822w c42822w) {
        this();
    }

    public AbstractC36153a() {
    }
}
