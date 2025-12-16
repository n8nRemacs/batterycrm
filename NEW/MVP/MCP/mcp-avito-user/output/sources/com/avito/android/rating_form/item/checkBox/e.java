package com.avito.android.rating_form.item.checkBox;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableGroupItemAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/e;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/rating_form/item/checkBox/e$a;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class e extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f248307c;

    /* compiled from: CheckableGroupItemAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/e$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends RecyclerView.C {
        @Y61.k
        /* renamed from: B80 */
        public abstract ListItemCompoundButton getF248339b();

        @Y61.l
        /* renamed from: C80 */
        public abstract Toggle getF248340c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return j().size();
    }

    @Y61.k
    public abstract List<CheckableGroupItem.a> j();

    public abstract int k();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@Y61.k a aVar, int i12) {
        int[] iArr;
        CheckableGroupItem.a aVar2 = j().get(i12);
        ListItemCompoundButton listItemCompoundButtonB80 = aVar.getF248339b();
        listItemCompoundButtonB80.setTitle(aVar2.f248292a);
        listItemCompoundButtonB80.setSubtitle(aVar2.f248293b);
        listItemCompoundButtonB80.setSubtitleColor(R.color.legacy_gray_54);
        listItemCompoundButtonB80.setChecked(aVar2.f248295d);
        listItemCompoundButtonB80.setEnabled(aVar2.f248296e);
        m(aVar, aVar2.getF248297f());
        Toggle toggleC80 = aVar.getF248340c();
        if (toggleC80 != null) {
            if (aVar2.getF248297f()) {
                Toggle.f181152k.getClass();
                iArr = Toggle.f181154m;
            } else {
                Toggle.f181152k.getClass();
                iArr = Toggle.f181153l;
            }
            toggleC80.setState(iArr);
        }
    }

    public abstract void m(@Y61.k a aVar, boolean z12);
}
