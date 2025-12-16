package com.avito.android.beduin.ui.universal;

import com.avito.android.beduin.common.action.BeduinNavigationBar;
import com.avito.android.beduin.common.component.model.BeduinScreenSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalBeduinScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/l;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final BeduinNavigationBar f104489a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104490b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final BeduinScreenSettings f104491c;

    public l(@Y61.l BeduinNavigationBar beduinNavigationBar, boolean z12, @Y61.l BeduinScreenSettings beduinScreenSettings) {
        this.f104489a = beduinNavigationBar;
        this.f104490b = z12;
        this.f104491c = beduinScreenSettings;
    }

    public static l a(l lVar, BeduinNavigationBar beduinNavigationBar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            beduinNavigationBar = lVar.f104489a;
        }
        if ((i12 & 2) != 0) {
            z12 = lVar.f104490b;
        }
        BeduinScreenSettings beduinScreenSettings = lVar.f104491c;
        lVar.getClass();
        return new l(beduinNavigationBar, z12, beduinScreenSettings);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f104489a, lVar.f104489a) && this.f104490b == lVar.f104490b && L.f(this.f104491c, lVar.f104491c);
    }

    public final int hashCode() {
        BeduinNavigationBar beduinNavigationBar = this.f104489a;
        int i12 = androidx.appcompat.app.r.i((beduinNavigationBar == null ? 0 : beduinNavigationBar.hashCode()) * 31, 31, this.f104490b);
        BeduinScreenSettings beduinScreenSettings = this.f104491c;
        return i12 + (beduinScreenSettings != null ? beduinScreenSettings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "UniversalBeduinScreen(navigationBar=" + this.f104489a + ", isExecuteRequestAction=" + this.f104490b + ", settings=" + this.f104491c + ')';
    }
}
