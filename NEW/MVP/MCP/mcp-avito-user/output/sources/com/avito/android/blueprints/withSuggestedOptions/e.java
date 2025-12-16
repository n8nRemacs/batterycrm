package com.avito.android.blueprints.withSuggestedOptions;

import JO.m;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectWithSuggestedOptionsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/withSuggestedOptions/e;", "Lcom/avito/android/blueprints/withSuggestedOptions/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106777b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f106778c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Resources f106779d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C> f106780e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f106781f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106782g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f106783h;

    /* compiled from: SelectWithSuggestedOptionsItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C.b f106785m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g f106786n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterElement.C.b bVar, g gVar) {
            super(2);
            this.f106785m = bVar;
            this.f106786n = gVar;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            Object next;
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            if (bool.booleanValue()) {
                String str = ((com.avito.android.blueprints.withSuggestedOptions.a) hVar2).f106768b;
                boolean zF2 = L.f(str, "CHOOSE_CHIPABLE_ID");
                e eVar = e.this;
                ParameterElement.C.b bVar = this.f106785m;
                if (zF2) {
                    eVar.f106780e.accept(bVar);
                    eVar.k(this.f106786n, bVar);
                } else {
                    Iterator<T> it = bVar.f117236E.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (L.f(((m) next).f8961b, str)) {
                            break;
                        }
                    }
                    m mVar = (m) next;
                    if (mVar != null) {
                        mVar.f8964e = true;
                        String str2 = bVar.f117181b;
                        eVar.f106782g.accept(new Ij.b(str2, mVar, null, 4, null));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    public e(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12, @k Resources resources) {
        this.f106777b = interfaceC35807h4;
        this.f106778c = q12;
        this.f106779d = resources;
        com.jakewharton.rxrelay3.c<ParameterElement.C> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106780e = cVar;
        this.f106781f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<Ij.b> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106782g = cVar2;
        this.f106783h = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        boolean zBooleanValue = this.f106778c.w().invoke().booleanValue();
        boolean z12 = bVar.f117220p;
        String str = bVar.f117208d;
        if (zBooleanValue) {
            gVar.setTitle(this.f106777b.a(str, z12, bVar.f117227w));
        } else {
            if (z12) {
                str = "";
            }
            gVar.setTitle(str);
        }
        gVar.k(bVar.f117209e);
        ItemWithState.State state = bVar.f117219o;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            gVar.setError(null);
        } else {
            gVar.II();
        }
        k(gVar, bVar);
    }

    public final void k(g gVar, ParameterElement.C.b bVar) {
        List<m> list = bVar.f117236E;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            m mVar = (m) next;
            List<Long> list2 = bVar.f117237F;
            if (list2 != null ? list2.contains(Long.valueOf(Long.parseLong(mVar.f8961b))) : false) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        m mVar2 = bVar.f117212h;
        if (mVar2 != null) {
            boolean z12 = true;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (L.f(((m) it2.next()).f8961b, mVar2.f8961b)) {
                        z12 = false;
                        break;
                    }
                }
            }
            if (z12) {
                arrayList2.add(mVar2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            arrayList3.add(new com.avito.android.blueprints.withSuggestedOptions.a(mVar3.f8961b, mVar3.f8962c, mVar3.equals(mVar2)));
        }
        gVar.WS(C42745f0.i0(new com.avito.android.blueprints.withSuggestedOptions.a("CHOOSE_CHIPABLE_ID", this.f106779d.getString(R.string.select_with_suggested_options_choose_title), false), arrayList3), new a(bVar, gVar));
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.d
    @k
    /* renamed from: k5, reason: from getter */
    public final C41981q0 getF106783h() {
        return this.f106783h;
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.d
    @k
    /* renamed from: r6, reason: from getter */
    public final C41981q0 getF106781f() {
        return this.f106781f;
    }
}
