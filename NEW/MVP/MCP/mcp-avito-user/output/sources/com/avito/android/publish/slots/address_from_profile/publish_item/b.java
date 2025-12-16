package com.avito.android.publish.slots.address_from_profile.publish_item;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AddressListItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends com.avito.konveyor.adapter.b implements com.avito.android.publish.slots.address_from_profile.publish_item.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f242878o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f242879b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f242880c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f242881d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f242882e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f242883f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f242884g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f242885h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f242886i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f242887j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f242888k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f242889l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Spinner f242890m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f242891n;

    /* compiled from: AddressListItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f242892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f242892l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f242892l.invoke(str);
            return G0.f406611a;
        }
    }

    public b(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f242879b = view;
        this.f242880c = aVar;
        this.f242881d = dVar;
        View viewFindViewById = view.findViewById(R.id.input_search);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f242883f = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.setAdapter(dVar);
        this.f242884g = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.empty_search_hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242885h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.error_not_selected_hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242886i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242887j = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.error_hint);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242888k = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.retry_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f242889l = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.address_list_spinner);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f242890m = (Spinner) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.error_layout);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f242891n = (LinearLayout) viewFindViewById9;
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void GF(boolean z12) {
        this.f242883f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    @SuppressLint({"NotifyDataSetChanged"})
    public final void V40(@Y61.k List<k> list) {
        this.f242880c.c(new UV0.c(list));
        this.f242881d.notifyDataSetChanged();
        boolean zIsEmpty = list.isEmpty();
        this.f242884g.setVisibility(!zIsEmpty ? 0 : 8);
        this.f242885h.setVisibility(zIsEmpty ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void VV(@Y61.k String str, @Y61.k String str2) {
        this.f242888k.setText(str);
        this.f242889l.setText(str2);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f242882e = aVar;
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void gu(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f242889l;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(24, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f242882e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void kM(boolean z12) {
        this.f242884g.setVisibility(z12 ? 0 : 8);
        this.f242883f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    @SuppressLint({"NotifyDataSetChanged"})
    public final void pI(@Y61.k r rVar, @Y61.k List<k> list, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f242880c.c(new UV0.c(list));
        this.f242881d.notifyDataSetChanged();
        a aVar = new a(lVar);
        Input input = this.f242883f;
        com.avito.android.lib.design.input.n.c(input, aVar);
        input.setHint(rVar.f242951h);
        CharSequence charSequence = rVar.f242950g;
        AttributedText attributedText = charSequence != null ? new AttributedText(charSequence.toString(), C42784z0.f406748b, 1) : null;
        TextView textView = this.f242885h;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        Boolean bool = rVar.f242949f;
        GF(bool != null ? bool.booleanValue() : false);
        boolean zIsEmpty = list.isEmpty();
        RecyclerView recyclerView = this.f242884g;
        TextView textView2 = this.f242887j;
        if (zIsEmpty) {
            D6.w(textView2);
            D6.w(textView);
            D6.w(recyclerView);
        } else {
            D6.H(textView2);
            boolean zIsEmpty2 = list.isEmpty();
            recyclerView.setVisibility(!zIsEmpty2 ? 0 : 8);
            textView.setVisibility(zIsEmpty2 ? 0 : 8);
        }
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void wK(@Y61.l String str, boolean z12) {
        TextView textView = this.f242886i;
        I5.a(textView, str, false);
        D6.G(textView, z12);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void wj(boolean z12) {
        this.f242891n.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.a
    public final void yD(boolean z12) {
        this.f242890m.setVisibility(z12 ? 0 : 8);
    }
}
