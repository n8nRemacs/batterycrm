package com.avito.android.mortgage.person_form.list.items.nav_button;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavButtonView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/nav_button/g;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/nav_button/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends C00.a implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f200739c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f200740b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f200740b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.nav_button.f
    public final void Zl(int i12) {
        this.f200740b.setText(i12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.nav_button.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f200740b.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(13, aVar));
    }

    @Override // C00.a, C00.c
    public final void setEnabled(boolean z12) {
        this.f200740b.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.nav_button.f
    public final void setLoading(boolean z12) {
        this.f200740b.setLoading(z12);
    }
}
