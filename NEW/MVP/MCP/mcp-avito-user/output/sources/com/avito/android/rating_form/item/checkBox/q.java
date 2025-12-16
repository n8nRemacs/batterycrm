package com.avito.android.rating_form.item.checkBox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.rating_form.item.checkBox.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableGroupItemAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/q;", "Lcom/avito/android/rating_form/item/checkBox/e;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class q extends e {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f248336d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f248337e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f248338f;

    /* compiled from: CheckableGroupItemAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/q$a;", "Lcom/avito/android/rating_form/item/checkBox/e$a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ListItemCompoundButton f248339b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Toggle f248340c;

        public a(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.radio_button_list_item);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCompoundButton");
            }
            ListItemCompoundButton listItemCompoundButton = (ListItemCompoundButton) viewFindViewById;
            this.f248339b = listItemCompoundButton;
            this.f248340c = (Toggle) listItemCompoundButton.findViewById(R.id.design_item_radio);
        }

        @Override // com.avito.android.rating_form.item.checkBox.e.a
        @Y61.k
        /* renamed from: B80, reason: from getter */
        public final ListItemCompoundButton getF248339b() {
            return this.f248339b;
        }

        @Override // com.avito.android.rating_form.item.checkBox.e.a
        @Y61.l
        /* renamed from: C80, reason: from getter */
        public final Toggle getF248340c() {
            return this.f248340c;
        }
    }

    public q(@Y61.k List<CheckableGroupItem.a> list) {
        this.f248336d = list;
        Iterator<CheckableGroupItem.a> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().f248295d) {
                break;
            } else {
                i12++;
            }
        }
        this.f248338f = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.rating_form.item.checkBox.CheckableGroupItem$a>] */
    @Override // com.avito.android.rating_form.item.checkBox.e
    @Y61.k
    public final List<CheckableGroupItem.a> j() {
        return this.f248336d;
    }

    @Override // com.avito.android.rating_form.item.checkBox.e, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l */
    public final void onBindViewHolder(@Y61.k final e.a aVar, final int i12) {
        super.onBindViewHolder(aVar, i12);
        aVar.getF248339b().e(new ListItemCompoundButton.a() { // from class: com.avito.android.rating_form.item.checkBox.p
            @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
            public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                int i13 = i12;
                q qVar = this.f248333a;
                e.a aVar2 = aVar;
                if (!z12) {
                    return;
                }
                Iterator it = ((Iterable) qVar.f248336d).iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        int i15 = qVar.f248338f;
                        qVar.f248338f = aVar2.getBindingAdapterPosition();
                        e.a aVar3 = (e.a) C42745f0.K(i15, qVar.f248337e);
                        ListItemCompoundButton f248339b = aVar3 != null ? aVar3.getF248339b() : null;
                        if (f248339b != null) {
                            f248339b.setChecked(false);
                        }
                        Y41.a<G0> aVar4 = qVar.f248307c;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            return;
                        }
                        return;
                    }
                    Object next = it.next();
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ((CheckableGroupItem.a) next).f248295d = i14 == i13;
                    i14 = i16;
                }
            }
        });
        this.f248337e.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(k(), viewGroup, false));
    }
}
