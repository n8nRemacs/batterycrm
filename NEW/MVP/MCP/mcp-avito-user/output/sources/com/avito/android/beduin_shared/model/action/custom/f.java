package com.avito.android.beduin_shared.model.action.custom;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScrollHandlerScrollParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/f;", "Lcom/avito/android/beduin_shared/model/action/custom/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f extends d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f105293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105295c;

    public f(@k String str, int i12, boolean z12) {
        super(null);
        this.f105293a = str;
        this.f105294b = i12;
        this.f105295c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f105293a, fVar.f105293a) && this.f105294b == fVar.f105294b && this.f105295c == fVar.f105295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105295c) + r.e(this.f105294b, this.f105293a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScrollToInvalidComponentParameters(formId=");
        sb2.append(this.f105293a);
        sb2.append(", invalidComponentPosition=");
        sb2.append(this.f105294b);
        sb2.append(", requireFocus=");
        return r.x(sb2, this.f105295c, ')');
    }
}
