package com.avito.android.toggle_comparison_state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/toggle_comparison_state/s$a;", "Lcom/avito/android/toggle_comparison_state/s$b;", "Lcom/avito/android/toggle_comparison_state/s$c;", "Lcom/avito/android/toggle_comparison_state/s$d;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class s {

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s$a;", "Lcom/avito/android/toggle_comparison_state/s;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final o f301632a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f301633b;

        public a(@Y61.k o oVar, @Y61.k String str) {
            super(null);
            this.f301632a = oVar;
            this.f301633b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f301632a, aVar.f301632a) && L.f(this.f301633b, aVar.f301633b);
        }

        public final int hashCode() {
            return this.f301633b.hashCode() + (this.f301632a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddedToComparison(comparison=");
            sb2.append(this.f301632a);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f301633b, ')');
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s$b;", "Lcom/avito/android/toggle_comparison_state/s;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final o f301634a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f301635b;

        public b(@Y61.k o oVar, @Y61.k String str) {
            super(null);
            this.f301634a = oVar;
            this.f301635b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f301634a, bVar.f301634a) && L.f(this.f301635b, bVar.f301635b);
        }

        public final int hashCode() {
            return this.f301635b.hashCode() + (this.f301634a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ComparisonLimitReached(comparison=");
            sb2.append(this.f301634a);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f301635b, ')');
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s$c;", "Lcom/avito/android/toggle_comparison_state/s;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final p f301636a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f301637b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f301638c;

        public c(@Y61.k p pVar, @Y61.k Throwable th2, @Y61.k String str) {
            super(null);
            this.f301636a = pVar;
            this.f301637b = th2;
            this.f301638c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f301636a, cVar.f301636a) && L.f(this.f301637b, cVar.f301637b) && L.f(this.f301638c, cVar.f301638c);
        }

        public final int hashCode() {
            return this.f301638c.hashCode() + ((this.f301637b.hashCode() + (this.f301636a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(data=");
            sb2.append(this.f301636a);
            sb2.append(", throwable=");
            sb2.append(this.f301637b);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f301638c, ')');
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s$d;", "Lcom/avito/android/toggle_comparison_state/s;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.toggle_comparison_state.a f301639a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f301640b;

        public d(@Y61.k com.avito.android.toggle_comparison_state.a aVar, @Y61.k String str) {
            super(null);
            this.f301639a = aVar;
            this.f301640b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f301639a, dVar.f301639a) && L.f(this.f301640b, dVar.f301640b);
        }

        public final int hashCode() {
            return this.f301640b.hashCode() + (this.f301639a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemovedFromComparison(alert=");
            sb2.append(this.f301639a);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f301640b, ')');
        }
    }

    public /* synthetic */ s(C42822w c42822w) {
        this();
    }

    public s() {
    }
}
