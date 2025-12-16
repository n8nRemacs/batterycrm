package com.avito.android.publish.items.iac_devices;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_settings_extended.adapter.phones.l;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacDevicesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/iac_devices/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f236879f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f236880b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f236881c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f236882d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f236883e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.iac_devices_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f236880b = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iac_devices_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f236881c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iac_devices_error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f236882d = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iac_devices_badge);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f236883e = viewFindViewById4;
    }

    @Override // com.avito.android.publish.items.iac_devices.i
    public final void IX(boolean z12) {
        D6.G(this.f236883e, z12);
    }

    @Override // com.avito.android.publish.items.iac_devices.i
    public final void Lb(@k Y41.a<G0> aVar) {
        this.f236880b.setOnClickListener(new l(2, aVar));
    }

    @Override // com.avito.android.publish.items.iac_devices.i
    public final void Zj(boolean z12) {
        D6.G(this.f236882d, z12);
    }

    @Override // com.avito.android.publish.items.iac_devices.i
    public final void me(@k String str) {
        Input.t(this.f236880b, str, false, 6);
    }

    @Override // com.avito.android.publish.items.iac_devices.i
    public final void setEnabled(boolean z12) {
        this.f236880b.setEnabled(z12);
        this.f236881c.setAlpha(z12 ? 1.0f : 0.5f);
        this.f236883e.setAlpha(z12 ? 1.0f : 0.5f);
    }
}
