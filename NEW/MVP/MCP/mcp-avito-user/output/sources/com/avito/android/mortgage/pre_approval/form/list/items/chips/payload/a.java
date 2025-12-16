package com.avito.android.mortgage.pre_approval.form.list.items.chips.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5983a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f201757a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final c.a f201758b;

        public C5983a(@k ArrayList arrayList, @l c.a aVar) {
            this.f201757a = arrayList;
            this.f201758b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5983a)) {
                return false;
            }
            C5983a c5983a = (C5983a) obj;
            return this.f201757a.equals(c5983a.f201757a) && L.f(this.f201758b, c5983a.f201758b);
        }

        public final int hashCode() {
            int iHashCode = this.f201757a.hashCode() * 31;
            c.a aVar = this.f201758b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ChipsChanged(chips=" + this.f201757a + ", selectedChip=" + this.f201758b + ')';
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f201759a;

        public b(@l PrintableText printableText) {
            this.f201759a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f201759a, ((b) obj).f201759a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f201759a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ErrorChanged(error="), this.f201759a, ')');
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a$c;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f201760a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final c.a f201761b;

        public c(@k ArrayList arrayList, @l c.a aVar) {
            this.f201760a = arrayList;
            this.f201761b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f201760a.equals(cVar.f201760a) && L.f(this.f201761b, cVar.f201761b);
        }

        public final int hashCode() {
            int iHashCode = this.f201760a.hashCode() * 31;
            c.a aVar = this.f201761b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "SelectedChipChanged(chips=" + this.f201760a + ", selectedChip=" + this.f201761b + ')';
        }
    }
}
