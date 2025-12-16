package com.avito.android.services_transportation_widget.dialog;

import Y61.k;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationDisclaimerDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/dialog/i;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f280509I = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f280510E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final TextView f280511F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final TextView f280512G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Button f280513H;

    public i(@k ContextThemeWrapper contextThemeWrapper, @k com.avito.android.util.text.a aVar) {
        super(contextThemeWrapper, 0, 2, null);
        this.f280510E = aVar;
        setContentView(R.layout.service_transportation_widget_disclaimer_sheet);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        this.f280511F = (TextView) findViewById(R.id.title);
        this.f280512G = (TextView) findViewById(R.id.description);
        Button button = (Button) findViewById(R.id.button);
        this.f280513H = button;
        button.setOnClickListener(new h(this, 0));
    }
}
