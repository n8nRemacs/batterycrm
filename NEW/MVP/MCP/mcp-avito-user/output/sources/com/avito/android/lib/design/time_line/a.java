package com.avito.android.lib.design.time_line;

import androidx.compose.foundation.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimeLineItemPayload.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/time_line/a;", "T", "", "<init>", "()V", "a", "b", "Lcom/avito/android/lib/design/time_line/a$a;", "Lcom/avito/android/lib/design/time_line/a$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a<T> {

    /* compiled from: TimeLineItemPayload.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/time_line/a$a;", "T", "Lcom/avito/android/lib/design/time_line/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.time_line.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5325a<T> extends a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f180964a;

        public C5325a(T t12) {
            super(null);
            this.f180964a = t12;
        }

        @Override // com.avito.android.lib.design.time_line.a
        public final void a(@Y61.k Y41.l<? super T, G0> lVar) {
            lVar.invoke(this.f180964a);
        }

        @Override // com.avito.android.lib.design.time_line.a
        /* renamed from: b */
        public final boolean getF180965a() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5325a) && L.f(this.f180964a, ((C5325a) obj).f180964a);
        }

        public final int hashCode() {
            T t12 = this.f180964a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Changed(value="), this.f180964a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public abstract void a(@Y61.k Y41.l<? super T, G0> lVar);

    /* renamed from: b */
    public abstract boolean getF180965a();

    public a() {
    }

    /* compiled from: TimeLineItemPayload.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/time_line/a$b;", "T", "Lcom/avito/android/lib/design/time_line/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> extends a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f180965a;

        public b() {
            super(null);
            this.f180965a = true;
        }

        @Override // com.avito.android.lib.design.time_line.a
        /* renamed from: b, reason: from getter */
        public final boolean getF180965a() {
            return this.f180965a;
        }

        @Override // com.avito.android.lib.design.time_line.a
        public final void a(@Y61.k Y41.l<? super T, G0> lVar) {
        }
    }
}
