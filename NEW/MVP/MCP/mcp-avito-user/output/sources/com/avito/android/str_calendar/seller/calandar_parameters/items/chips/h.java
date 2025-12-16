package com.avito.android.str_calendar.seller.calandar_parameters.items.chips;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_calendar.seller.calandar_parameters.items.chips.h;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/h;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/f;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f287105e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f287106b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f287107c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287108d;

    /* compiled from: ChipsSelectItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/h$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287109b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f287110c;

        public a(@k String str, boolean z12) {
            this.f287109b = str;
            this.f287110c = z12;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
                return false;
            }
            String str = this.f287109b;
            if (str.length() > 0) {
                com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
                if (hVar.getF262141c().length() > 0) {
                    return L.f(str, hVar.getF262141c());
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f287109b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f287109b, aVar.f287109b) && this.f287110c == aVar.f287110c;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287110c) + (this.f287109b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled, reason: from getter */
        public final boolean getF15843e() {
            return this.f287110c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipableChip(chipTitle=");
            sb2.append(this.f287109b);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f287110c, ')');
        }
    }

    /* compiled from: ChipsSelectItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_calendar/seller/calandar_parameters/items/chips/h$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<m, Boolean, G0> f287111a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<m> f287112b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super m, ? super Boolean, G0> pVar, List<m> list) {
            this.f287111a = pVar;
            this.f287112b = list;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            m mVarC = c(hVar);
            if (mVarC == null) {
                return;
            }
            ((d) this.f287111a).invoke(mVarC, Boolean.FALSE);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            m mVarC = c(hVar);
            if (mVarC == null) {
                return;
            }
            ((d) this.f287111a).invoke(mVarC, Boolean.TRUE);
        }

        public final m c(com.avito.android.lib.design.chips.h hVar) {
            Object next;
            Iterator<T> it = this.f287112b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(hVar.getF262141c(), ((m) next).f8962c)) {
                    break;
                }
            }
            return (m) next;
        }
    }

    public h(@k View view) {
        super(view);
        this.f287106b = view;
        this.f287107c = (Chips) view.findViewById(R.id.chips);
        View viewFindViewById = view.findViewById(R.id.subtitle_tv);
        ((TextView) viewFindViewById).setMovementMethod(LinkMovementMethod.getInstance());
        this.f287108d = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void DA(@k Chips.DisplayType displayType) {
        this.f287107c.setDisplayType(displayType);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void E50(@k final m mVar) {
        this.f287107c.post(new Runnable() { // from class: com.avito.android.str_calendar.seller.calandar_parameters.items.chips.g
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = h.f287105e;
                h.a aVar = new h.a(mVar.f8962c, !r1.f8968i);
                Chips chips = this.f287103b.f287107c;
                int i13 = Chips.f178664L;
                chips.o(aVar, false);
            }
        });
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void Sb(@k List<m> list, @l m mVar, @k p<? super m, ? super Boolean, G0> pVar) throws Resources.NotFoundException {
        Object obj;
        Chips chips = this.f287107c;
        int dimensionPixelSize = chips.getResources().getDimensionPixelSize(R.dimen.seller_edit_calendar_recycler_view_horizontal_padding);
        chips.setDisplayType(Chips.DisplayType.f178703d);
        List<m> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((m) it.next()).f8962c, !r4.f8968i));
        }
        chips.setData(arrayList);
        chips.t(dimensionPixelSize, dimensionPixelSize);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (L.f(((a) next).f287109b, mVar != null ? mVar.f8962c : null)) {
                obj = next;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar == null) {
            aVar = (a) C42745f0.G(arrayList);
        }
        if (aVar != null) {
            chips.j();
            chips.q(aVar, true);
        }
        chips.setChipsSelectedListener(new b(pVar, list));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void i2(boolean z12) {
        this.f287107c.setKeepSelected(true);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void jr(@k CustomPaddings customPaddings) {
        Integer top = customPaddings.getTop();
        Integer numValueOf = Integer.valueOf(top != null ? y6.b(top.intValue()) : 0);
        Integer bottom = customPaddings.getBottom();
        D6.c(this.f287106b, null, numValueOf, null, Integer.valueOf(bottom != null ? y6.b(bottom.intValue()) : 0), 5);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void k(@l AttributedText attributedText) {
        j.a(this.f287108d, attributedText, null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void r3(@k SelectStrategy selectStrategy) {
        this.f287107c.setSelectStrategy(SelectStrategy.f178716b);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void setError(@l String str) {
        this.f287107c.setError(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.chips.f
    public final void setTitle(@k String str) {
        this.f287107c.setTitle(str);
    }
}
