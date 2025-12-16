package com.avito.android.update;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.search.filter.RunnableC34589p;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UpdateApplicationView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/update/i;", "Lcom/avito/android/update/h;", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f306651a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f306652b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f306653c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.button.c f306654d;

    public i(@Y61.k View view) {
        this.f306651a = view;
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f306652b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_update_application);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f306653c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.button_update_application);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        com.avito.android.lib.deprecated_design.button.c cVar = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById3);
        this.f306654d = cVar;
        cVar.b(view.getContext().getText(R.string.update_application_button));
        viewFindViewById.post(new RunnableC34589p(20, viewFindViewById, viewFindViewById2));
    }
}
