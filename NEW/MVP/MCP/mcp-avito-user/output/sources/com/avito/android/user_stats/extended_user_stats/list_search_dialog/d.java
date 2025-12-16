package com.avito.android.user_stats.extended_user_stats.list_search_dialog;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.util.g;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.select.SelectResult;
import com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.CheckBoxData;
import com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.CheckboxType;
import com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.i;
import com.avito.konveyor.adapter.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ListSearchDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/d;", "Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/i;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f317238a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f317239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.c f317240c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f317241d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f317242e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public ArrayList f317243f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f317244g;

    /* renamed from: h, reason: collision with root package name */
    public Button f317245h;

    /* renamed from: i, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f317246i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public String f317247j = "";

    public d(@k j jVar, @k com.avito.konveyor.adapter.a aVar, @k com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.c cVar, @k a aVar2, @k f fVar) {
        this.f317238a = jVar;
        this.f317239b = aVar;
        this.f317240c = cVar;
        this.f317241d = aVar2;
        this.f317242e = fVar;
        this.f317243f = new ArrayList(aVar2.f317229a);
        this.f317244g = new ArrayList(aVar2.f317232d);
    }

    public static ArrayList d(String str, ArrayList arrayList) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C43066x.q(((CheckBoxData) obj).f317250d, str, true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CheckBoxData checkBoxData = (CheckBoxData) it.next();
            if (arrayList2.contains(checkBoxData)) {
                arrayList3.add(checkBoxData);
            } else {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    CheckBoxData checkBoxData2 = (CheckBoxData) next;
                    List<String> list = checkBoxData.f317254h;
                    if (list != null && list.contains(checkBoxData2.f317249c)) {
                        break;
                    }
                }
                if (next != null) {
                    arrayList3.add(checkBoxData);
                }
            }
        }
        return arrayList3;
    }

    @Override // com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.i
    public final void a(@k String str, boolean z12) {
        int i12;
        List<String> list;
        List<String> list2;
        Iterator it = this.f317243f.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (L.f(((CheckBoxData) it.next()).f317249c, str)) {
                break;
            } else {
                i13++;
            }
        }
        CheckBoxData checkBoxData = (CheckBoxData) C42745f0.K(i13, this.f317243f);
        if (checkBoxData != null) {
            CheckboxType checkboxType = z12 ? CheckboxType.f317256b : CheckboxType.f317257c;
            b(checkBoxData.f317249c, checkBoxData.f317250d, checkboxType);
            this.f317243f.set(i13, CheckBoxData.a(checkBoxData, checkboxType));
            List<String> list3 = checkBoxData.f317254h;
            if (list3 != null) {
                for (String str2 : list3) {
                    Iterator it2 = this.f317243f.iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i14 = -1;
                            break;
                        } else if (L.f(((CheckBoxData) it2.next()).f317249c, str2)) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i14 != -1) {
                        CheckBoxData checkBoxData2 = (CheckBoxData) this.f317243f.get(i14);
                        b(checkBoxData2.f317249c, checkBoxData2.f317250d, checkboxType);
                        this.f317243f.set(i14, CheckBoxData.a(checkBoxData2, checkboxType));
                    }
                }
            }
            List<String> list4 = checkBoxData.f317253g;
            if (list4 != null) {
                for (String str3 : list4) {
                    Iterator it3 = this.f317243f.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i15 = -1;
                            break;
                        } else if (L.f(((CheckBoxData) it3.next()).f317249c, str3)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    CheckBoxData checkBoxData3 = (CheckBoxData) C42745f0.K(i15, this.f317243f);
                    if (checkBoxData3 == null || (list2 = checkBoxData3.f317254h) == null) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (String str4 : list2) {
                            Iterator it4 = this.f317243f.iterator();
                            int i16 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i16 = -1;
                                    break;
                                } else if (L.f(((CheckBoxData) it4.next()).f317249c, str4)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            CheckBoxData checkBoxData4 = (CheckBoxData) C42745f0.K(i16, this.f317243f);
                            if ((checkBoxData4 != null ? checkBoxData4.f317251e : null) == CheckboxType.f317256b) {
                                i12++;
                            }
                        }
                    }
                    CheckboxType checkboxType2 = i12 == 0 ? CheckboxType.f317257c : (checkBoxData3 == null || (list = checkBoxData3.f317254h) == null || i12 != list.size()) ? CheckboxType.f317258d : CheckboxType.f317256b;
                    if (checkBoxData3 != null) {
                        b(checkBoxData3.f317249c, checkBoxData3.f317250d, checkboxType2);
                        this.f317243f.set(i15, CheckBoxData.a(checkBoxData3, checkboxType2));
                    }
                }
            }
        }
        this.f317239b.c(new UV0.c(!L.f(this.f317247j, "") ? d(this.f317247j, this.f317243f) : this.f317243f));
        c();
    }

    public final void b(String str, String str2, CheckboxType checkboxType) {
        NameIdEntity nameIdEntity = new NameIdEntity(str, str2);
        CheckboxType checkboxType2 = CheckboxType.f317256b;
        ArrayList arrayList = this.f317244g;
        if (checkboxType != checkboxType2 || arrayList.contains(nameIdEntity)) {
            arrayList.remove(nameIdEntity);
        } else {
            arrayList.add(nameIdEntity);
        }
    }

    public final void c() {
        boolean z12 = this.f317244g.size() > 0;
        Button button = this.f317245h;
        if (button == null) {
            button = null;
        }
        button.setEnabled(z12);
        int i12 = z12 ? R.color.common_blue : R.color.common_gray_20;
        Button button2 = this.f317245h;
        (button2 == null ? null : button2).setTextColor((button2 != null ? button2 : null).getContext().getColor(i12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@k Context context) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, 0 == true ? 1 : 0);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        View viewInflate = View.inflate(context, R.layout.bottom_sheet_list_layout, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_dialog_stats);
        Button button = (Button) viewInflate.findViewById(R.id.btn_dialog_search);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.ib_dialog_search_close);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_search_title);
        Input input = (Input) viewInflate.findViewById(R.id.input_dialog_search);
        this.f317245h = (Button) viewInflate.findViewById(R.id.btn_dialog_search_clear);
        recyclerView.setAdapter(this.f317238a);
        recyclerView.setItemAnimator(null);
        a aVar = this.f317241d;
        textView.setText(aVar.f317230b);
        this.f317239b.c(new UV0.c(this.f317243f));
        input.setVisibility(this.f317243f.size() <= 6 ? 8 : 0);
        input.setHint(aVar.f317231c);
        input.setClearButtonClickListener(new com.avito.android.tariff.cpx.configure.levels.d(18, this, input));
        n.c(input, new c(this, recyclerView));
        this.f317240c.G3(this);
        c();
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_stats.extended_user_stats.list_search_dialog.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f317235c;

            {
                this.f317235c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        d dVar2 = this.f317235c;
                        a aVar2 = dVar2.f317241d;
                        dVar2.f317242e.a3(new SelectResult(String.valueOf(aVar2.f317233e), dVar2.f317244g, null, 4, null), aVar2.f317233e);
                        com.avito.android.lib.design.bottom_sheet.d dVar3 = dVar2.f317246i;
                        if (dVar3 == null) {
                            dVar3 = null;
                        }
                        dVar3.dismiss();
                        break;
                    case 1:
                        com.avito.android.lib.design.bottom_sheet.d dVar4 = this.f317235c.f317246i;
                        if (dVar4 == null) {
                            dVar4 = null;
                        }
                        dVar4.dismiss();
                        break;
                    default:
                        d dVar5 = this.f317235c;
                        dVar5.f317244g.clear();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = dVar5.f317243f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(CheckBoxData.a((CheckBoxData) it.next(), CheckboxType.f317257c));
                        }
                        dVar5.f317243f = arrayList;
                        dVar5.f317239b.c(new UV0.c(arrayList));
                        dVar5.c();
                        break;
                }
            }
        });
        final int i13 = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_stats.extended_user_stats.list_search_dialog.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f317235c;

            {
                this.f317235c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        d dVar2 = this.f317235c;
                        a aVar2 = dVar2.f317241d;
                        dVar2.f317242e.a3(new SelectResult(String.valueOf(aVar2.f317233e), dVar2.f317244g, null, 4, null), aVar2.f317233e);
                        com.avito.android.lib.design.bottom_sheet.d dVar3 = dVar2.f317246i;
                        if (dVar3 == null) {
                            dVar3 = null;
                        }
                        dVar3.dismiss();
                        break;
                    case 1:
                        com.avito.android.lib.design.bottom_sheet.d dVar4 = this.f317235c.f317246i;
                        if (dVar4 == null) {
                            dVar4 = null;
                        }
                        dVar4.dismiss();
                        break;
                    default:
                        d dVar5 = this.f317235c;
                        dVar5.f317244g.clear();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = dVar5.f317243f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(CheckBoxData.a((CheckBoxData) it.next(), CheckboxType.f317257c));
                        }
                        dVar5.f317243f = arrayList;
                        dVar5.f317239b.c(new UV0.c(arrayList));
                        dVar5.c();
                        break;
                }
            }
        });
        Button button2 = this.f317245h;
        final int i14 = 2;
        (button2 != null ? button2 : null).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_stats.extended_user_stats.list_search_dialog.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f317235c;

            {
                this.f317235c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        d dVar2 = this.f317235c;
                        a aVar2 = dVar2.f317241d;
                        dVar2.f317242e.a3(new SelectResult(String.valueOf(aVar2.f317233e), dVar2.f317244g, null, 4, null), aVar2.f317233e);
                        com.avito.android.lib.design.bottom_sheet.d dVar3 = dVar2.f317246i;
                        if (dVar3 == null) {
                            dVar3 = null;
                        }
                        dVar3.dismiss();
                        break;
                    case 1:
                        com.avito.android.lib.design.bottom_sheet.d dVar4 = this.f317235c.f317246i;
                        if (dVar4 == null) {
                            dVar4 = null;
                        }
                        dVar4.dismiss();
                        break;
                    default:
                        d dVar5 = this.f317235c;
                        dVar5.f317244g.clear();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = dVar5.f317243f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(CheckBoxData.a((CheckBoxData) it.next(), CheckboxType.f317257c));
                        }
                        dVar5.f317243f = arrayList;
                        dVar5.f317239b.c(new UV0.c(arrayList));
                        dVar5.c();
                        break;
                }
            }
        });
        dVar.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        g.a(dVar);
        this.f317246i = dVar;
    }
}
