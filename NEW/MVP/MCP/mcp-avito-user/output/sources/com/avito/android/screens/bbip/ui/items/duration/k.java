package com.avito.android.screens.bbip.ui.items.duration;

import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DurationItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/duration/k;", "Lcom/avito/android/lib/design/chips/h;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260364b;

    public k(String str) {
        this.f260364b = str;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
            return false;
        }
        String str = this.f260364b;
        if (str.length() > 0) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
            if (hVar.getF278901b().length() > 0) {
                return L.f(str, hVar.getF278901b());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W */
    public final CharSequence getF278901b() {
        return this.f260364b;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF13713d() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF171727d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }
}
