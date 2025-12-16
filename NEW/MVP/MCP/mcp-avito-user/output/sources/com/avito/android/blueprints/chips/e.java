package com.avito.android.blueprints.chips;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.blueprints.chips.f;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/chips/e;", "Lcom/avito/android/blueprints/chips/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f105848b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f105849c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final l41.g<Ij.b> f105850d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105851e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f105852f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105853g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f105854h;

    /* compiled from: ChipsSelectItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C.b f105856m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterElement.C.b bVar) {
            super(1);
            this.f105856m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            e.this.f105853g.accept(this.f105856m.f117222r.getDeepLink());
            return G0.f406611a;
        }
    }

    /* compiled from: ChipsSelectItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C.b f105857l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f105858m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, ParameterElement.C.b bVar) {
            super(2);
            this.f105857l = bVar;
            this.f105858m = eVar;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            Object next;
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                ParameterElement.C.b bVar = this.f105857l;
                Iterator<T> it = bVar.f117236E.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((m) next).f8961b, ((com.avito.android.blueprints.chips.a) hVar2).f105838b)) {
                        break;
                    }
                }
                m mVar = (m) next;
                if (mVar != null) {
                    mVar.f8964e = zBooleanValue;
                    e eVar = this.f105858m;
                    String str = bVar.f117181b;
                    eVar.f105851e.accept(new Ij.b(str, mVar, null, 4, null));
                    l41.g<Ij.b> gVar = eVar.f105850d;
                    if (gVar != null) {
                        gVar.accept(new Ij.b(bVar.f117181b, mVar, bVar));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    public e() {
        throw null;
    }

    public e(InterfaceC35807h4 interfaceC35807h4, Q1 q12, l41.g gVar, int i12, C42822w c42822w) {
        gVar = (i12 & 4) != 0 ? null : gVar;
        this.f105848b = interfaceC35807h4;
        this.f105849c = q12;
        this.f105850d = gVar;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105851e = cVar;
        this.f105852f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105853g = cVar2;
        this.f105854h = new C41981q0(cVar2);
    }

    public static void O(g gVar, ParameterElement.C.b bVar) {
        ItemWithState.State state = bVar.f117219o;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            gVar.setError(null);
        } else {
            gVar.G();
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        k(gVar, bVar);
        O(gVar, bVar);
        V(gVar, bVar);
    }

    public final void V(g gVar, ParameterElement.C.b bVar) {
        List<m> list = bVar.f117236E;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (m mVar : list) {
            arrayList.add(new com.avito.android.blueprints.chips.a(mVar.f8961b, mVar.f8962c));
        }
        m mVar2 = bVar.f117212h;
        gVar.L7(arrayList, mVar2 != null ? Collections.singletonList(new com.avito.android.blueprints.chips.a(mVar2.f8961b, mVar2.f8962c)) : null, new b(this, bVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.util.N) {
                obj = obj2;
            }
        }
        com.avito.android.util.N n12 = (com.avito.android.util.N) (obj instanceof com.avito.android.util.N ? obj : null);
        if (n12 == null) {
            k(gVar, bVar);
            O(gVar, bVar);
            V(gVar, bVar);
        } else {
            k(gVar, bVar);
            if (n12.f318691b != null) {
                O(gVar, bVar);
            }
            if (n12.f318690a != null) {
                V(gVar, bVar);
            }
        }
    }

    @Override // com.avito.android.blueprints.chips.d
    @k
    public final z<Ij.b> h() {
        return this.f105852f;
    }

    public final void k(g gVar, ParameterElement.C.b bVar) {
        CharSequence charSequenceA;
        ParameterElement.DisplayType displayType = bVar.f117213i;
        ParameterElement.DisplayType.Chips chips = displayType instanceof ParameterElement.DisplayType.Chips ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : f.a.f105859a[style.ordinal()];
        gVar.m2(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178701b : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b);
        Q1 q12 = this.f105849c;
        boolean zBooleanValue = q12.w().invoke().booleanValue();
        InterfaceC35807h4 interfaceC35807h4 = this.f105848b;
        boolean z12 = bVar.f117227w;
        boolean z13 = bVar.f117220p;
        String str = bVar.f117208d;
        if (zBooleanValue) {
            gVar.setTitle(interfaceC35807h4.a(str, z13, z12));
        } else {
            gVar.setTitle(z13 ? "" : str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (q12.w().invoke().booleanValue()) {
            charSequenceA = interfaceC35807h4.a(str, z13, z12);
        } else {
            charSequenceA = z13 ? "" : str;
        }
        spannableStringBuilder.append(charSequenceA);
        if (bVar.f117228x) {
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-54485), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        gVar.setTitle(spannableStringBuilder);
        gVar.k(bVar.f117209e);
        if (bVar.f117222r != null) {
            gVar.fF(new a(bVar));
        } else {
            gVar.fF(null);
        }
        gVar.i2(true);
        gVar.r3(SelectStrategy.f178716b);
        gVar.rb(bVar.f117211g);
    }

    @Override // com.avito.android.blueprints.chips.d
    @k
    /* renamed from: o, reason: from getter */
    public final C41981q0 getF105854h() {
        return this.f105854h;
    }
}
