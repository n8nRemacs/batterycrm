package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pi.C47090a;
import pi.C47093d;
import qi.C47404e;

/* compiled from: BottomSheetScreenState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/n;", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class n implements com.avito.android.beduin.ui.screen.fragment.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final pi.e f104194a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final pi.e f104195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C47093d f104196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<BeduinModel> f104197d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C47090a f104198e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C47404e f104199f;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.l pi.e eVar, @Y61.l pi.e eVar2, @Y61.l C47093d c47093d, @Y61.l List<? extends BeduinModel> list, @Y61.l C47090a c47090a, @Y61.k C47404e c47404e) {
        this.f104194a = eVar;
        this.f104195b = eVar2;
        this.f104196c = c47093d;
        this.f104197d = list;
        this.f104198e = c47090a;
        this.f104199f = c47404e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f104194a, nVar.f104194a) && L.f(this.f104195b, nVar.f104195b) && L.f(this.f104196c, nVar.f104196c) && L.f(this.f104197d, nVar.f104197d) && L.f(this.f104198e, nVar.f104198e) && L.f(this.f104199f, nVar.f104199f);
    }

    public final int hashCode() {
        pi.e eVar = this.f104194a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        pi.e eVar2 = this.f104195b;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        C47093d c47093d = this.f104196c;
        int iHashCode3 = (iHashCode2 + (c47093d == null ? 0 : c47093d.hashCode())) * 31;
        List<BeduinModel> list = this.f104197d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C47090a c47090a = this.f104198e;
        return this.f104199f.hashCode() + ((iHashCode4 + (c47090a != null ? c47090a.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BottomSheetScreenState(navBar=" + this.f104194a + ", bottomSheetNavBar=" + this.f104195b + ", gallery=" + this.f104196c + ", extraContent=" + this.f104197d + ", analyticsParams=" + this.f104198e + ", form=" + this.f104199f + ')';
    }
}
