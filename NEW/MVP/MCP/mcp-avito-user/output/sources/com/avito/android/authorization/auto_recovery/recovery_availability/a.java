package com.avito.android.authorization.auto_recovery.recovery_availability;

import Y41.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.help_center.InterfaceC30751h;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HelpCenterContract.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/recovery_availability/a;", "Li/a;", "Lkotlin/G0;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC41201a<G0, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecoveryAvailabilityFragment f93285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<Integer, G0> f93286c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(RecoveryAvailabilityFragment recoveryAvailabilityFragment, l<? super Integer, G0> lVar) {
        this.f93285b = recoveryAvailabilityFragment;
        this.f93286c = lVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        InterfaceC30751h interfaceC30751h = this.f93285b.f93273o0;
        if (interfaceC30751h == null) {
            interfaceC30751h = null;
        }
        return interfaceC30751h.a("request/715?eventData[contextId]=117");
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        this.f93286c.invoke(Integer.valueOf(i12));
        return G0.f406611a;
    }
}
