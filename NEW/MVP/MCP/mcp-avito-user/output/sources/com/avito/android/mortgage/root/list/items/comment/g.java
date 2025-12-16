package com.avito.android.mortgage.root.list.items.comment;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationCommentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/comment/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/comment/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f202501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DockingBadge f202503d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f202504e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f202501b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202502c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f202503d = (DockingBadge) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.comment);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202504e = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.mortgage.root.list.items.comment.f
    public final void IG(@k AttributedText attributedText) {
        j.c(this.f202504e, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.comment.f
    public final void zH(@l String str, @l String str2) {
        View view = this.f202501b;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        I5.a(this.f202502c, str, false);
        DockingBadge dockingBadge = this.f202503d;
        if (str2 == null) {
            dockingBadge.setVisibility(8);
        } else {
            dockingBadge.setVisibility(0);
            dockingBadge.setText(str2);
        }
    }
}
