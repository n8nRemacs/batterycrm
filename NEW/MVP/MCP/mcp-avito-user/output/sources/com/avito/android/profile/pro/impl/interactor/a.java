package com.avito.android.profile.pro.impl.interactor;

import Y61.k;
import Y61.l;
import jz.C42454e;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProEmployeeInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42451b f222682a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42454e f222683b;

    public a(@k InterfaceC42451b interfaceC42451b, @k C42454e c42454e) {
        this.f222682a = interfaceC42451b;
        this.f222683b = c42454e;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f222682a, aVar.f222682a) && L.f(this.f222683b, aVar.f222683b);
    }

    public final int hashCode() {
        return this.f222683b.f405981a.hashCode() + (this.f222682a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ProfileProEmployeeInfo(currentMode=" + this.f222682a + ", passportModes=" + this.f222683b + ')';
    }
}
