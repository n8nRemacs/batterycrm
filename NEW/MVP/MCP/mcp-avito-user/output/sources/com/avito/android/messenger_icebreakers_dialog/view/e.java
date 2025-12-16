package com.avito.android.messenger_icebreakers_dialog.view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerIcebreakerDialogChip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/view/e;", "Lcom/avito/android/lib/design/chips/h;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f197710b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f197711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f197712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f197713e;

    public e(int i12, int i13, @k String str, @k String str2) {
        this.f197710b = str;
        this.f197711c = str2;
        this.f197712d = i12;
        this.f197713e = i13;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (obj instanceof e) {
            return L.f(this.f197710b, ((e) obj).f197710b);
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF264620e() {
        return this.f197710b;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f197710b, eVar.f197710b) && L.f(this.f197711c, eVar.f197711c) && this.f197712d == eVar.f197712d && this.f197713e == eVar.f197713e;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF106770d() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197713e) + r.e(this.f197712d, H.d(this.f197710b.hashCode() * 31, 31, this.f197711c), 31);
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
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerIcebreakerDialogChip(chipTitle=");
        sb2.append(this.f197710b);
        sb2.append(", chipTitleFull=");
        sb2.append(this.f197711c);
        sb2.append(", icebreakerId=");
        sb2.append(this.f197712d);
        sb2.append(", icebreakerPosition=");
        return r.t(sb2, this.f197713e, ')');
    }
}
