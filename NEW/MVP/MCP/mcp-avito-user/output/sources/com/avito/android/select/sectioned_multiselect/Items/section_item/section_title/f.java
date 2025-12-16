package com.avito.android.select.sectioned_multiselect.Items.section_item.section_title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_title/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f266389b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f266389b = (TextView) viewFindViewById;
    }
}
