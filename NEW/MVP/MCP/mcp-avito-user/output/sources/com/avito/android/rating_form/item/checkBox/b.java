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
import com.avito.android.rating_form.item.checkBox.o;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableGroupItemAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/b;", "Lcom/avito/android/rating_form/item/checkBox/e;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class b extends e {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f248300d;

    /* compiled from: CheckableGroupItemAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/b$a;", "Lcom/avito/android/rating_form/item/checkBox/e$a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ListItemCompoundButton f248301b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Toggle f248302c;

        public a(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.check_box_list_item);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCompoundButton");
            }
            ListItemCompoundButton listItemCompoundButton = (ListItemCompoundButton) viewFindViewById;
            this.f248301b = listItemCompoundButton;
            this.f248302c = (Toggle) listItemCompoundButton.findViewById(R.id.design_item_checkbox);
        }

        @Override // com.avito.android.rating_form.item.checkBox.e.a
        @Y61.k
        /* renamed from: B80, reason: from getter */
        public final ListItemCompoundButton getF248339b() {
            return this.f248301b;
        }

        @Override // com.avito.android.rating_form.item.checkBox.e.a
        @Y61.l
        /* renamed from: C80, reason: from getter */
        public final Toggle getF248340c() {
            return this.f248302c;
        }
    }

    public b(@Y61.k List<CheckableGroupItem.a> list) {
        this.f248300d = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.rating_form.item.checkBox.CheckableGroupItem$a>] */
    @Override // com.avito.android.rating_form.item.checkBox.e
    @Y61.k
    public final List<CheckableGroupItem.a> j() {
        return this.f248300d;
    }

    @Override // com.avito.android.rating_form.item.checkBox.e, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l */
    public final void onBindViewHolder(@Y61.k e.a aVar, final int i12) {
        super.onBindViewHolder(aVar, i12);
        aVar.getF248339b().e(new ListItemCompoundButton.a() { // from class: com.avito.android.rating_form.item.checkBox.a
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
            @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
            public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                b bVar = this.f248298a;
                ((CheckableGroupItem.a) bVar.f248300d.get(i12)).f248295d = z12;
                Y41.a<G0> aVar2 = bVar.f248307c;
                if (aVar2 != null) {
                    ((o.b) aVar2).invoke();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(k(), viewGroup, false));
    }
}
