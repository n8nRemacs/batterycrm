package com.avito.android.publish.slots.user_verification.blocker;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserVerificationBlockerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/blocker/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/user_verification/blocker/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f245117g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f245118b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f245119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f245120d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f245121e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f245122f;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f245118b = aVar;
        LinearLayout linearLayout = (LinearLayout) view;
        View viewFindViewById = linearLayout.findViewById(R.id.user_verification_blocker_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245119c = (TextView) viewFindViewById;
        View viewFindViewById2 = linearLayout.findViewById(R.id.user_verification_blocker_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245120d = (TextView) viewFindViewById2;
        View viewFindViewById3 = linearLayout.findViewById(R.id.user_verification_back_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f245121e = (Button) viewFindViewById3;
        View viewFindViewById4 = linearLayout.findViewById(R.id.user_verification_support_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245122f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.publish.slots.user_verification.blocker.h
    public final void DQ(@l AttributedText attributedText) {
        j.a(this.f245122f, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.user_verification.blocker.h
    public final void Wb(@l String str, @k Y41.a<G0> aVar) {
        Button button = this.f245121e;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(8, aVar));
    }

    @Override // com.avito.android.publish.slots.user_verification.blocker.h
    public final void e(@k AttributedText attributedText) {
        j.c(this.f245119c, attributedText, this.f245118b);
    }

    @Override // com.avito.android.publish.slots.user_verification.blocker.h
    public final void r(@k AttributedText attributedText) {
        j.c(this.f245120d, attributedText, this.f245118b);
    }
}
