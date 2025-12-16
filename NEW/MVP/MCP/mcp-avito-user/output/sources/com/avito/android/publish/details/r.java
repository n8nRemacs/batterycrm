package com.avito.android.publish.details;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ItemDetailsPaddingHelper.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/r;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f234904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f234905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234906c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f234907d;

    public r(@Y61.k View view) {
        this.f234904a = view;
        this.f234905b = view.getResources().getDimensionPixelSize(R.dimen.publish_params_bottom_padding);
        this.f234906c = view.getResources().getDimensionPixelSize(R.dimen.publish_continue_button_vertical_margin);
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f234907d = (RecyclerView) viewFindViewById;
    }

    public final void a(int i12) {
        View view;
        View view2 = this.f234904a;
        while (true) {
            view = null;
            if (view2 == null) {
                break;
            }
            View viewFindViewById = view2.findViewById(R.id.editor_panel);
            if (viewFindViewById != null) {
                view = viewFindViewById;
                break;
            } else {
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
        }
        D6.f(this.f234907d, 0, 0, 0, i12 + (view != null ? view.getHeight() : 0), 7);
    }
}
