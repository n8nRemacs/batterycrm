package com.avito.android.advert.item.similars;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.section.chips.SectionChip;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComplementaryBottomSheetState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/similars/m;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<SectionChip> f80304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f80305b;

    /* compiled from: ComplementaryBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/similars/m$a;", "", "a", "b", "c", "Lcom/avito/android/advert/item/similars/m$a$a;", "Lcom/avito/android/advert/item/similars/m$a$b;", "Lcom/avito/android/advert/item/similars/m$a$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ComplementaryBottomSheetState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/m$a$a;", "Lcom/avito/android/advert/item/similars/m$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.similars.m$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2374a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f80306a;

            public C2374a(boolean z12) {
                this.f80306a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2374a) && this.f80306a == ((C2374a) obj).f80306a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f80306a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("Error(isRemote="), this.f80306a, ')');
            }
        }

        /* compiled from: ComplementaryBottomSheetState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/similars/m$a$b;", "Lcom/avito/android/advert/item/similars/m$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f80307a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 305341295;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ComplementaryBottomSheetState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/m$a$c;", "Lcom/avito/android/advert/item/similars/m$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<PersistableSpannedItem> f80308a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(@Y61.k List<? extends PersistableSpannedItem> list) {
                this.f80308a = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f80308a, ((c) obj).f80308a);
            }

            public final int hashCode() {
                return this.f80308a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("Success(items="), this.f80308a, ')');
            }
        }
    }

    public m(@Y61.k List<SectionChip> list, @Y61.k a aVar) {
        this.f80304a = list;
        this.f80305b = aVar;
    }

    public static m a(m mVar, a aVar) {
        List<SectionChip> list = mVar.f80304a;
        mVar.getClass();
        return new m(list, aVar);
    }

    @Y61.l
    public final String b() {
        Object next;
        Iterator<T> it = this.f80304a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SectionChip) next).f264619d) {
                break;
            }
        }
        SectionChip sectionChip = (SectionChip) next;
        if (sectionChip != null) {
            return sectionChip.f264617b;
        }
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f80304a, mVar.f80304a) && L.f(this.f80305b, mVar.f80305b);
    }

    public final int hashCode() {
        return this.f80305b.hashCode() + (this.f80304a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ComplementaryBottomSheetState(chips=" + this.f80304a + ", contentState=" + this.f80305b + ')';
    }
}
