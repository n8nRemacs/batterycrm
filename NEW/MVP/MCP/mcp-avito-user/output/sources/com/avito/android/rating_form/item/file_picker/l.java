package com.avito.android.rating_form.item.file_picker;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: RatingFormFilePickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/file_picker/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f248436b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f248437c;

    public l(@Y61.k View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_form_file_picker_recycler_view);
        this.f248436b = (TextView) view.findViewById(R.id.rating_form_file_picker_description);
        a aVar = new a();
        this.f248437c = aVar;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(aVar);
    }
}
