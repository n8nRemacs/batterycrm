package com.avito.android.rating_form.item.checkBox;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/checkBox/n;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248328b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f248330d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f248331e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f248332f;

    /* compiled from: CheckableGroupItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CheckableGroupItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckableGroupItem.Type type = CheckableGroupItem.Type.f248288b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CheckableGroupItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((Y41.a) this.receiver).invoke();
            return G0.f406611a;
        }
    }

    public o(@Y61.k View view, boolean z12, boolean z13) {
        super(view);
        this.f248328b = z12;
        this.f248329c = z13;
        View viewFindViewById = view.findViewById(R.id.checkable_group_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248330d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.checkable_group_item_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f248331e = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkable_group_item_error_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248332f = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.rating_form.item.checkBox.n
    public final void pv(@Y61.k CheckableGroupItem.Type type, @Y61.k List<CheckableGroupItem.a> list, @Y61.k Y41.a<G0> aVar) {
        e dVar;
        int iOrdinal = type.ordinal();
        boolean z12 = this.f248328b;
        if (iOrdinal == 0) {
            dVar = z12 ? new d(list) : new c(list);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = z12 ? new s(list) : new r(list);
        }
        dVar.f248307c = new b(0, aVar, Y41.a.class, "invoke", "invoke()Ljava/lang/Object;", 0);
        RecyclerView recyclerView = this.f248331e;
        recyclerView.setAdapter(dVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.rating_form.item.checkBox.n
    public final void s0(@Y61.l PrintableText printableText) {
        TextView textView = this.f248332f;
        I5.a(textView, printableText != null ? printableText.k0(textView.getContext()) : null, this.f248329c);
    }

    @Override // com.avito.android.rating_form.item.checkBox.n
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f248330d, str, false);
    }
}
