package com.avito.android.advert.item.gig.similar_shifts;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.lib.design.chips.Chips;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSimilarShiftsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/similar_shifts/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/gig/similar_shifts/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f75787b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f75788c;

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.days_shifts);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f75787b = (Chips) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.time_shifts);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f75788c = (Chips) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.gig.similar_shifts.c
    public final void Db(@k String str, @k List list) {
        Object obj;
        Object next;
        Chips chips = this.f75787b;
        chips.setData(list);
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((AdvertDetailsSimilarShiftsItem.SimilarShiftDaysContent) next).f75768b, str)) {
                    break;
                }
            }
        }
        AdvertDetailsSimilarShiftsItem.SimilarShiftDaysContent similarShiftDaysContent = (AdvertDetailsSimilarShiftsItem.SimilarShiftDaysContent) next;
        if (similarShiftDaysContent != null) {
            chips.q(similarShiftDaysContent, false);
            boolean z12 = similarShiftDaysContent.f75771e;
            if (z12) {
                chips.o(similarShiftDaysContent, true);
            }
            Chips chips2 = this.f75788c;
            chips2.j();
            List<AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent> list2 = similarShiftDaysContent.f75770d;
            chips2.setData(list2);
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent) next2).f75776e) {
                    obj = next2;
                    break;
                }
            }
            AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent similarShiftTimeContent = (AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent) obj;
            if (similarShiftTimeContent != null) {
                chips2.q(similarShiftTimeContent, false);
                if (z12) {
                    chips2.o(similarShiftTimeContent, true);
                }
            }
        }
    }

    @Override // com.avito.android.advert.item.gig.similar_shifts.c
    public final void vU(@k e eVar) {
        this.f75787b.setChipsSelectedListener(new a(eVar));
        this.f75788c.setChipsSelectedListener(new b(eVar));
    }

    /* compiled from: AdvertDetailsSimilarShiftsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/gig/similar_shifts/d$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f75789a;

        public a(e eVar) {
            this.f75789a = eVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            this.f75789a.Z0(((AdvertDetailsSimilarShiftsItem.SimilarShiftDaysContent) hVar).f75768b);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: AdvertDetailsSimilarShiftsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/gig/similar_shifts/d$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f75790a;

        public b(e eVar) {
            this.f75790a = eVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            this.f75790a.F(((AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent) hVar).f75773b);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
