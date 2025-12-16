package com.avito.android.serp.adapter.gig_shifts;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.gig_snippet.GigSnippetWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigShiftsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/gig_shifts/j;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GigSnippetWidget f270124b;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.widget);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.gig_snippet.GigSnippetWidget");
        }
        this.f270124b = (GigSnippetWidget) viewFindViewById;
    }
}
