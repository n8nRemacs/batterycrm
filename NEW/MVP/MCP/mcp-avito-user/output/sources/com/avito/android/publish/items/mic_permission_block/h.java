package com.avito.android.publish.items.mic_permission_block;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.D6;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: MicPermissionBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/mic_permission_block/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f237043h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f237044b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f237045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f237046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237047e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f237048f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Drawable f237049g;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237044b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.mic_permission_block_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f237045c = (ConstraintLayout) viewFindViewById2;
        this.f237046d = D6.t(view, R.dimen.publish_container_horizontal_padding);
        this.f237047e = D6.t(view, R.dimen.publish_container_horizontal_padding_redesign);
        this.f237048f = C43852a.a(view.getContext(), R.drawable.background_mic_permission_block);
        this.f237049g = C43852a.a(view.getContext(), R.drawable.background_mic_permission_block_redesign);
    }

    @Override // com.avito.android.publish.items.mic_permission_block.g
    public final void H8(@e0 int i12) {
        this.f237044b.setText(this.itemView.getContext().getString(i12));
    }

    @Override // com.avito.android.publish.items.mic_permission_block.g
    public final void qm(@l Theme theme) {
        boolean zIsAvitoRe23 = Theme.INSTANCE.isAvitoRe23(theme);
        int i12 = zIsAvitoRe23 ? this.f237047e : this.f237046d;
        D6.c(this.f237045c, Integer.valueOf(i12), null, Integer.valueOf(i12), null, 10);
        this.f237045c.setBackground(zIsAvitoRe23 ? this.f237049g : this.f237048f);
    }

    @Override // com.avito.android.publish.items.mic_permission_block.g
    public final void u1(@k Y41.a<G0> aVar) {
        this.f237044b.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(17, aVar));
    }
}
