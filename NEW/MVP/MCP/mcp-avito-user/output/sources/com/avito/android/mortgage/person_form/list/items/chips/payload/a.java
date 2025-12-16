package com.avito.android.mortgage.person_form.list.items.chips.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.chips.ChipsItem;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChipsPayload.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "", "a", "b", "c", "d", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.list.items.chips.payload.a$a, reason: collision with other inner class name */
    public static final class C5940a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ChipsItem.Chip> f200682a;

        public C5940a(@k List<ChipsItem.Chip> list) {
            this.f200682a = list;
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f200683a;

        public b(@l PrintableText printableText) {
            this.f200683a = printableText;
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f200684a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200685b;

        public c(@k ArrayList arrayList, @k String str) {
            this.f200684a = arrayList;
            this.f200685b = str;
        }
    }

    /* compiled from: ChipsPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a$d;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f200686a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1648221110;
        }

        @k
        public final String toString() {
            return "UnselectChip";
        }
    }
}
