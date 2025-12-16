package com.avito.android.beduin.common.component.real_estate_filter.dialog;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.real_estate_filter.A;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.beduin.common.component.select_option.dialog.OptionItem;
import com.avito.android.beduin.common.component.select_option.dialog.e;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateSelectOptionDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/dialog/a;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102300a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f102301b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Option> f102302c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f102303d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.l<String, G0> f102304e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f102305f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f102306g;

    /* compiled from: BeduinRealEstateSelectOptionDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/dialog/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.real_estate_filter.dialog.a$a, reason: collision with other inner class name */
    public interface InterfaceC3064a {
    }

    /* compiled from: BeduinRealEstateSelectOptionDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/Option;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/select_option/Option;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Option, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Option option) {
            a aVar = a.this;
            aVar.f102304e.invoke(option.getId());
            aVar.f102306g.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinRealEstateSelectOptionDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f102308l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f102309m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar, a aVar2) {
            super(0);
            this.f102308l = aVar;
            this.f102309m = aVar2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f102308l.invoke();
            this.f102309m.f102306g.dismiss();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k String str, @l String str2, @k List<Option> list, @l String str3, @k Y41.l<? super String, G0> lVar) throws BlueprintCollisionException {
        this.f102300a = str;
        this.f102301b = str2;
        this.f102302c = list;
        this.f102303d = str3;
        this.f102304e = lVar;
        d dVar = new d(new e(new b()));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        h hVar = new h(aVarA, aVarA, null, 4, null);
        this.f102305f = hVar;
        j jVar = new j(hVar, aVarA);
        List<Option> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new OptionItem(String.valueOf(i12), this.f102301b, (Option) obj));
            i12 = i13;
        }
        this.f102305f.f338510e = new UV0.c(arrayList);
        jVar.notifyDataSetChanged();
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_LookAndFeel), 0, 2, null);
        dVar2.D(R.layout.select_option_dialog, true);
        RecyclerView recyclerView = (RecyclerView) dVar2.findViewById(R.id.select_option_recycler);
        D6.f(recyclerView, 0, y6.b(12), 0, y6.b(32), 5);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
        A.a(dVar2, this.f102300a, this.f102303d);
        boolean z12 = this.f102303d != null;
        q qVar = dVar2.f178530x;
        if (qVar != null) {
            qVar.D(z12);
        }
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        this.f102306g = dVar2;
    }

    public final void a(@l Y41.a<G0> aVar) {
        this.f102306g.P(new c(aVar, this));
    }

    public /* synthetic */ a(Context context, String str, String str2, List list, String str3, Y41.l lVar, int i12, C42822w c42822w) {
        this(context, str, str2, list, (i12 & 16) != 0 ? context.getString(R.string.real_estate_reset) : str3, lVar);
    }
}
