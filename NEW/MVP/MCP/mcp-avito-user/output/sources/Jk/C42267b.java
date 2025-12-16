package jK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacShortVibrationPlayer.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjK/b;", "LjK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: jK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42267b implements InterfaceC42266a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k f405546a;

    @Inject
    public C42267b(@k com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k kVar) {
        this.f405546a = kVar;
    }

    @Override // jK.InterfaceC42266a
    public final void a(@k C42270e c42270e) {
        if (c42270e.f405548a.getIsVibrationAllowed()) {
            this.f405546a.a();
        }
    }
}
