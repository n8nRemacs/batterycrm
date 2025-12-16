package com.avito.android.publish.enrichment_feedback;

import Y41.p;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.profile.pro.impl.screen.item.recommendations.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobEnrichmentFeedbackDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/enrichment_feedback/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends d {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f235637H = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Input f235638E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Button f235639F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final ComponentContainer f235640G;

    public b(@k Context context, @k p pVar) {
        super(context, R.style.JobEnrichmentFeedbackDialogStyle);
        setContentView(R.layout.enrichment_feedback_content);
        d.I(this, true);
        d.M(this, null, false, true, 7);
        Button button = (Button) findViewById(R.id.enrichment_button);
        this.f235639F = button;
        this.f235640G = (ComponentContainer) findViewById(R.id.enrichment_input_container);
        Input input = (Input) findViewById(R.id.enrichment_input);
        this.f235638E = input;
        n.c(input, new a(this));
        button.setOnClickListener(new h(19, this, pVar));
    }

    public final void V(int[] iArr, boolean z12, String str, boolean z13) {
        G0 g02;
        Input input = this.f235638E;
        input.setState(iArr);
        input.setEnabled(z12);
        ComponentContainer componentContainer = this.f235640G;
        if (str != null) {
            ComponentContainer.n(componentContainer, str, 2);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            componentContainer.k();
        }
        this.f235639F.setEnabled(z13);
    }
}
