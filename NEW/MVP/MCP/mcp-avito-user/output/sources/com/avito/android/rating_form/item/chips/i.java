package com.avito.android.rating_form.item.chips;

import Y61.k;
import Y61.l;
import android.view.View;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/chips/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/chips/h;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f248363b;

    /* compiled from: ChipsItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/chips/i$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f248364b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f248365c;

        public a(@k String str, @k String str2) {
            this.f248364b = str;
            this.f248365c = str2;
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
            if (!(obj instanceof a)) {
                return false;
            }
            String str = this.f248365c;
            if (str.length() > 0) {
                String str2 = ((a) obj).f248365c;
                if (str2.length() > 0) {
                    return L.f(str, str2);
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f248364b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
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

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    /* compiled from: ChipsItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating_form/item/chips/i$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<? extends ParcelableEntity<String>>, G0> f248366a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f248367b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super List<? extends ParcelableEntity<String>>, G0> lVar, i iVar) {
            this.f248366a = lVar;
            this.f248367b = iVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            i iVar = this.f248367b;
            SelectStrategy selectStrategy = iVar.f248363b.getSelectStrategy();
            SelectStrategy selectStrategy2 = SelectStrategy.f178717c;
            Chips chips = iVar.f248363b;
            if (selectStrategy == selectStrategy2 || ((ArrayList) chips.s()).isEmpty()) {
                List<com.avito.android.lib.design.chips.h> listS = chips.s();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) listS).iterator();
                while (it.hasNext()) {
                    com.avito.android.lib.design.chips.h hVar2 = (com.avito.android.lib.design.chips.h) it.next();
                    a aVar = hVar2 instanceof a ? (a) hVar2 : null;
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                ((e) this.f248366a).invoke(i.B80(iVar, arrayList));
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            i iVar = this.f248367b;
            List<com.avito.android.lib.design.chips.h> listS = iVar.f248363b.s();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) listS).iterator();
            while (it.hasNext()) {
                com.avito.android.lib.design.chips.h hVar2 = (com.avito.android.lib.design.chips.h) it.next();
                a aVar = hVar2 instanceof a ? (a) hVar2 : null;
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            ((e) this.f248366a).invoke(i.B80(iVar, arrayList));
        }
    }

    public i(@k View view) {
        super(view);
        this.f248363b = (Chips) view;
    }

    public static final ArrayList B80(i iVar, ArrayList arrayList) {
        iVar.getClass();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            a aVar = (a) it.next();
            arrayList2.add(new SelectParameter.Value(aVar.f248365c, aVar.f248364b.toString(), null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null));
        }
        return arrayList2;
    }

    public static ArrayList C80(List list) {
        List<RatingFormField.Value> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (RatingFormField.Value value : list2) {
            arrayList.add(new a(value.getLabel(), value.getValue()));
        }
        return arrayList;
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void X0(@l Boolean bool) {
        this.f248363b.setEnabled(bool.booleanValue());
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void f(@l String str) {
        if (str == null) {
            str = "";
        }
        this.f248363b.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void hX(@k List<RatingFormField.Value> list) {
        this.f248363b.setData(C80(list));
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void iv(@k List<RatingFormField.Value> list) {
        Chips chips = this.f248363b;
        chips.j();
        chips.r(C80(list));
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void l0(@k Y41.l<? super List<? extends ParcelableEntity<String>>, G0> lVar) {
        this.f248363b.setChipsSelectedListener(new b(lVar, this));
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void o(@l String str) {
        this.f248363b.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void s0(@l PrintableText printableText) {
        Chips chips = this.f248363b;
        chips.setError(printableText != null ? printableText.k0(chips.getContext()) : null);
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void sV(boolean z12) {
        SelectStrategy selectStrategy = z12 ? SelectStrategy.f178717c : SelectStrategy.f178716b;
        Chips chips = this.f248363b;
        chips.setSelectStrategy(selectStrategy);
        chips.setKeepSelected(!z12);
    }

    @Override // com.avito.android.rating_form.item.chips.h
    public final void setTitle(@l String str) {
        this.f248363b.setTitle(str);
    }
}
