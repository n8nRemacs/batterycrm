package com.avito.android.rating_form.item.photo_picker;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.I;
import com.avito.android.photo_list_view.z;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormPhotoPickerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/photo_picker/k;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33210d.a f248547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f248548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f248549d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f248550e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f248551f;

    public l(@Y61.k View view, @Y61.k C33210d.a aVar) {
        super(view);
        this.f248547b = aVar;
        View viewFindViewById = view.findViewById(R.id.rating_form_photo_picker_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248548c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_form_photo_picker_attributed_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f248549d = textView;
        View viewFindViewById3 = view.findViewById(R.id.rating_form_photo_picker_images);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f248550e = recyclerView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        recyclerView.l(new I(view.getContext(), 0, 0, 6, null), -1);
    }

    @Override // com.avito.android.rating_form.item.photo_picker.k
    public final void B2(@Y61.k com.avito.android.photo_list_view.s sVar) {
        sVar.A(new z(this.f248550e, sVar, this.f248547b));
    }

    @Override // com.avito.android.rating_form.item.photo_picker.k
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f248551f = aVar;
    }

    @Override // com.avito.android.rating_form.item.photo_picker.k
    public final void h(@Y61.k String str) {
        I5.a(this.f248548c, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f248551f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.rating_form.item.photo_picker.k
    public final void m0(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f248549d, attributedText, null);
    }
}
