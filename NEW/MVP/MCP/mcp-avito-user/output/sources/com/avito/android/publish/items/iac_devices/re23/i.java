package com.avito.android.publish.items.iac_devices.re23;

import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_settings_extended.adapter.phones.l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishIacDevicesItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/re23/i;", "LHj/c;", "Lcom/avito/android/publish/items/iac_devices/re23/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends Hj.c implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f236900o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Context f236901m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Input f236902n;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.publish_iac_devices_item_content, aVar);
        this.f236901m = this.f7656e.getContext();
        this.f236902n = (Input) this.f7656e.findViewById(R.id.select);
    }

    @Override // com.avito.android.publish.items.iac_devices.re23.h
    public final void Lb(@k Y41.a<G0> aVar) {
        this.f236902n.setOnClickListener(new l(3, aVar));
    }

    @Override // com.avito.android.publish.items.iac_devices.re23.h
    @k
    /* renamed from: getContext, reason: from getter */
    public final Context getF236901m() {
        return this.f236901m;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f236902n.setOnClickListener(null);
    }

    @Override // com.avito.android.publish.items.iac_devices.re23.h
    public final void pe(@k String str) {
        Input.t(this.f236902n, str, false, 6);
    }
}
