package com.avito.android.publish.iac_devices;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: IacDevicesInfoDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_devices/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f236034E = 0;

    /* compiled from: IacDevicesInfoDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            b bVar = (b) this.receiver;
            int i12 = b.f236034E;
            bVar.getClass();
            ((Button) view.findViewById(R.id.devices_info_btn)).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(bVar, 12));
            return G0.f406611a;
        }
    }

    public b(@Y61.k Context context) {
        super(context, 0, 2, null);
        C(R.layout.iac_devices_info_dialog, new a(1, this, b.class, "createView", "createView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.j.c(this, context.getString(R.string.iac_devices_info_dialog_title), true, 0, 0, 0, 120);
    }
}
