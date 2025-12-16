package com.avito.android.sbc.autodispatches;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesCache.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sbc/autodispatches/B;", "", "a", "b", "c", "d", "Lcom/avito/android/sbc/autodispatches/B$a;", "Lcom/avito/android/sbc/autodispatches/B$b;", "Lcom/avito/android/sbc/autodispatches/B$c;", "Lcom/avito/android/sbc/autodispatches/B$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface B {

    /* compiled from: SbcAutoDispatchesCache.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/B$a;", "Lcom/avito/android/sbc/autodispatches/B;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C34466b f258812a;

        public a(@Y61.k C34466b c34466b) {
            this.f258812a = c34466b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f258812a, ((a) obj).f258812a);
        }

        public final int hashCode() {
            return this.f258812a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AddActive(activeAutoDispatches=" + this.f258812a + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesCache.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/B$b;", "Lcom/avito/android/sbc/autodispatches/B;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C34466b f258813a;

        public b(@Y61.k C34466b c34466b) {
            this.f258813a = c34466b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f258813a, ((b) obj).f258813a);
        }

        public final int hashCode() {
            return this.f258813a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AddInactive(inactiveAutoDispatches=" + this.f258813a + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesCache.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/B$c;", "Lcom/avito/android/sbc/autodispatches/B;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C34466b f258814a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C34466b f258815b;

        public c(@Y61.k C34466b c34466b, @Y61.k C34466b c34466b2) {
            this.f258814a = c34466b;
            this.f258815b = c34466b2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f258814a, cVar.f258814a) && L.f(this.f258815b, cVar.f258815b);
        }

        public final int hashCode() {
            return this.f258815b.hashCode() + (this.f258814a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Init(activeAutoDispatches=" + this.f258814a + ", inactiveAutoDispatches=" + this.f258815b + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesCache.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatches/B$d;", "Lcom/avito/android/sbc/autodispatches/B;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f258816a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 790322637;
        }

        @Y61.k
        public final String toString() {
            return "Invalidate";
        }
    }
}
