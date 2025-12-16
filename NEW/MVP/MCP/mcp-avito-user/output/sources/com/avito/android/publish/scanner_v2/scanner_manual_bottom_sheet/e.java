package com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet;

import Y61.k;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstructionBottomSheetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/scanner_manual_bottom_sheet/e;", "Lcom/avito/android/publish/scanner_v2/scanner_manual_bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f239429a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f239430b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f239431c;

    public e(@k com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f239429a = (TextView) dVar.findViewById(R.id.title);
        this.f239430b = (TextView) dVar.findViewById(R.id.description);
        this.f239431c = (Button) dVar.findViewById(R.id.retry_button);
    }
}
