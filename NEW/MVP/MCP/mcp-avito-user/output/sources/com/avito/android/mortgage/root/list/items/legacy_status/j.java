package com.avito.android.mortgage.root.list.items.legacy_status;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PersonalStatusView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f202675f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202677c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f202678d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f202679e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202676b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202677c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202678d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202679e = (Button) viewFindViewById4;
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void L9(boolean z12) {
        this.f202679e.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void Qx(int i12) {
        this.f202676b.setImageResource(i12);
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void n(@l String str) {
        I5.a(this.f202678d, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void setEnabled(boolean z12) {
        this.f202679e.setEnabled(z12);
        TextView textView = this.f202678d;
        TextView textView2 = this.f202677c;
        ImageView imageView = this.f202676b;
        if (z12) {
            imageView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.4f);
            textView2.setAlpha(0.4f);
            textView.setAlpha(0.4f);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void setTitle(@k String str) {
        this.f202677c.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void sv(@l Integer num) {
        Button button = this.f202679e;
        if (num == null) {
            D6.w(button);
        } else {
            D6.G(button, true);
            button.setText(num.intValue());
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.legacy_status.h
    public final void wy(@k Y41.a<G0> aVar) {
        this.f202679e.setOnClickListener(new i(0, aVar));
    }
}
