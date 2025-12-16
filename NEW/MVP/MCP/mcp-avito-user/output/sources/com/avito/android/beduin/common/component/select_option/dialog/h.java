package com.avito.android.beduin.common.component.select_option.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedOptionDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/h;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102491a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Option> f102493c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f102494d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f102495e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f102496f;

    /* compiled from: SelectedOptionDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/h$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: SelectedOptionDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/Option;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/select_option/Option;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Option, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Option option) {
            h hVar = h.this;
            hVar.f102494d.invoke(option.getId());
            hVar.f102496f.dismiss();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k Context context, @k String str, @k String str2, @k List<Option> list, @k l<? super String, G0> lVar) throws BlueprintCollisionException {
        this.f102491a = str;
        this.f102492b = str2;
        this.f102493c = list;
        this.f102494d = lVar;
        com.avito.android.beduin.common.component.select_option.dialog.b bVar = new com.avito.android.beduin.common.component.select_option.dialog.b(new e(new b()));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f102495e = hVar;
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
            arrayList.add(new OptionItem(String.valueOf(i12), this.f102492b, (Option) obj));
            i12 = i13;
        }
        this.f102495e.f338510e = new UV0.c(arrayList);
        jVar.notifyDataSetChanged();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.D(R.layout.select_option_dialog, true);
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.select_option_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
        recyclerView.l(new c(y6.b(24)), -1);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(dVar.getContext()).inflate(R.layout.select_option_dialog_header, (ViewGroup) null);
        View viewFindViewById = viewGroup.findViewById(R.id.select_option_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.bottom_sheet_close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        textView.setText(this.f102491a);
        ((ImageView) viewFindViewById2).setOnClickListener(new S7.a(dVar, 11));
        dVar.H(viewGroup);
        this.f102496f = dVar;
    }
}
