package Hb0;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingItemInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHb0/b;", "LHb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13948b implements InterfaceC13947a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f7332a;

    @Inject
    public C13948b(@k l lVar) {
        this.f7332a = lVar;
    }

    @Override // Hb0.InterfaceC13947a
    public final boolean a(@k String str) {
        return !this.f7332a.contains(str);
    }

    @Override // Hb0.InterfaceC13947a
    public final void b(@k String str) {
        this.f7332a.putBoolean(str, true);
    }
}
