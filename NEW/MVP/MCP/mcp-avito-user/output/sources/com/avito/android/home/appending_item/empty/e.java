package com.avito.android.home.appending_item.empty;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.U;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppendingEmptyItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/appending_item/empty/e;", "Lcom/avito/android/home/appending_item/empty/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f162209c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f162210b;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.create_first_advert_hint);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162210b = (TextView) viewFindViewById;
        view.post(new U(view, 3));
    }

    @Override // com.avito.android.home.appending_item.empty.d
    public final void setTitle(@k String str) {
        this.f162210b.setText(str);
    }
}
