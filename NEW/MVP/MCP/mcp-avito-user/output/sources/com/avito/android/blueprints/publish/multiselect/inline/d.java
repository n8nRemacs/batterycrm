package com.avito.android.blueprints.publish.multiselect.inline;

import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35953u2;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInlineMultiselectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/inline/d;", "Lcom/avito/android/blueprints/publish/multiselect/inline/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f106372d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106373e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f106374f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106375g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f106376h;

    /* compiled from: PublishInlineMultiselectItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f106378m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ m f106379n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, m mVar) {
            super(1);
            this.f106378m = str;
            this.f106379n = mVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            d.this.f106373e.accept(new Ij.b(this.f106378m, m.a(this.f106379n, zBooleanValue), null, 4, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishInlineMultiselectItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f106381m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeepLink deepLink) {
            super(0);
            this.f106381m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f106375g.accept(this.f106381m);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106370b = aVar;
        this.f106371c = interfaceC35807h4;
        this.f106372d = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106373e = cVar;
        this.f106374f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106375g = cVar2;
        this.f106376h = new C41981q0(cVar2);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.c
    @k
    public final z<DeepLink> E() {
        return this.f106376h;
    }

    public final void O(f fVar, ItemWithState.State state, AttributedText attributedText) {
        CharSequence charSequenceC = null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceC = charSequence;
            } else if (attributedText != null) {
                charSequenceC = this.f106370b.c(fVar.getContext(), attributedText);
            }
            fVar.u(charSequenceC);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            fVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            fVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            fVar.H(null);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ParameterElement.v) aVar);
    }

    public final void V(f fVar, String str, m mVar, Integer num) {
        DeepLink deepLink = mVar.f8966g;
        b bVar = deepLink != null ? new b(deepLink) : null;
        fVar.b8(mVar.f8961b, mVar.f8962c, mVar.f8963d, mVar.f8964e, bVar, num, new a(str, mVar));
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.c
    @k
    public final z<Ij.b> g() {
        return this.f106374f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        String str;
        f fVar = (f) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35953u2) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C35953u2)) {
            obj = null;
        }
        C35953u2 c35953u2 = (C35953u2) obj;
        if (c35953u2 == null) {
            k(fVar, vVar);
            return;
        }
        List<m> list2 = vVar.f117545f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i13 = 0;
        for (Object obj3 : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new Q(Integer.valueOf(i13), (m) obj3));
            i13 = i14;
        }
        int iF2 = P0.f(C42745f0.q(arrayList, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((m) ((Q) next).f406620c).f8961b, next);
        }
        Iterator<T> it2 = c35953u2.f319089a.iterator();
        while (it2.hasNext()) {
            fVar.L8((String) it2.next());
        }
        Iterator<T> it3 = c35953u2.f319091c.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            str = vVar.f117181b;
            if (!zHasNext) {
                break;
            }
            Q q12 = (Q) linkedHashMap.get((String) it3.next());
            V(fVar, str, (m) q12.f406620c, Integer.valueOf(((Number) q12.f406619b).intValue()));
        }
        Iterator it4 = c35953u2.f319090b.iterator();
        while (it4.hasNext()) {
            Q q13 = (Q) linkedHashMap.get((String) it4.next());
            int iIntValue = ((Number) q13.f406619b).intValue();
            m mVar = (m) q13.f406620c;
            fVar.L8(mVar.f8961b);
            V(fVar, str, mVar, Integer.valueOf(iIntValue));
        }
        ItemWithState.State state = c35953u2.f319092d;
        if (state != null) {
            O(fVar, state, vVar.f117546g);
        }
    }

    public final void k(@k f fVar, @k ParameterElement.v vVar) {
        fVar.yr(vVar.f117563x);
        boolean z12 = vVar.f117556q;
        String str = vVar.f117543d;
        String str2 = z12 ? null : str;
        CharSequence charSequenceC = this.f106370b.c(fVar.getContext(), vVar.f117557r);
        boolean z13 = ((str2 == null || str2.length() == 0) && (charSequenceC == null || charSequenceC.length() == 0)) ? false : true;
        if (this.f106372d.w().invoke().booleanValue()) {
            fVar.setTitle(this.f106371c.a(str, z12, vVar.f117564y));
        } else {
            fVar.setTitle(str2);
        }
        fVar.setSubtitle(charSequenceC);
        fVar.I1(vVar.f117565z);
        fVar.A20(z13);
        fVar.s(str);
        fVar.za();
        Iterator<T> it = vVar.f117545f.iterator();
        while (it.hasNext()) {
            V(fVar, vVar.f117181b, (m) it.next(), null);
        }
        ParameterElement.v.a aVar = vVar.f117551l;
        fVar.R8(aVar != null ? aVar.f117566a : null, aVar != null ? aVar.f117567b : null);
        O(fVar, vVar.f117555p, vVar.f117546g);
    }
}
