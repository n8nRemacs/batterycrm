package com.avito.android.mortgage.landing.list.items.chips.payload;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/payload/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.chips.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5898a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ChipsItem.Chip> f199687a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ChipsItem.Chip f199688b;

        public C5898a(@k List<ChipsItem.Chip> list, @l ChipsItem.Chip chip) {
            this.f199687a = list;
            this.f199688b = chip;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5898a)) {
                return false;
            }
            C5898a c5898a = (C5898a) obj;
            return L.f(this.f199687a, c5898a.f199687a) && L.f(this.f199688b, c5898a.f199688b);
        }

        public final int hashCode() {
            int iHashCode = this.f199687a.hashCode() * 31;
            ChipsItem.Chip chip = this.f199688b;
            return iHashCode + (chip == null ? 0 : chip.hashCode());
        }

        @k
        public final String toString() {
            return "ChipsChanged(chips=" + this.f199687a + ", selectedChip=" + this.f199688b + ')';
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199689a;

        public b(boolean z12) {
            this.f199689a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f199689a == ((b) obj).f199689a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199689a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsEnabledChanged(isEnabled="), this.f199689a, ')');
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ChipsItem.Chip> f199690a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ChipsItem.Chip f199691b;

        public c(@k List<ChipsItem.Chip> list, @l ChipsItem.Chip chip) {
            this.f199690a = list;
            this.f199691b = chip;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f199690a, cVar.f199690a) && L.f(this.f199691b, cVar.f199691b);
        }

        public final int hashCode() {
            int iHashCode = this.f199690a.hashCode() * 31;
            ChipsItem.Chip chip = this.f199691b;
            return iHashCode + (chip == null ? 0 : chip.hashCode());
        }

        @k
        public final String toString() {
            return "SelectedChipChanged(chips=" + this.f199690a + ", selectedChip=" + this.f199691b + ')';
        }
    }
}
