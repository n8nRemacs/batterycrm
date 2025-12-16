package com.avito.android.edit_address.dialog.time_interval;

import Y61.k;
import com.avito.android.lib.design.toggle.State;
import kotlin.Metadata;

/* compiled from: TimeIntervalPickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/dialog/time_interval/g;", "LJV/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements JV.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f145882b;

    public g(b bVar) {
        this.f145882b = bVar;
    }

    @Override // JV.b
    public final void b(@k State state) {
        boolean z12 = state == State.f181147b;
        b bVar = this.f145882b;
        bVar.f145877l = z12;
        h hVar = bVar.f145873h;
        if (hVar != null) {
            boolean z13 = !z12;
            hVar.f145885c.setEnabled(z13);
            hVar.f145886d.setEnabled(z13);
        }
        h hVar2 = bVar.f145873h;
        if (hVar2 != null) {
            hVar2.c(null, false, false);
        }
    }
}
