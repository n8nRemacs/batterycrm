package com.avito.android.beduin_shared.model.action.custom;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScrollHandlerScrollParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/e;", "Lcom/avito/android/beduin_shared/model/action/custom/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e extends d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f105288a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105289b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105290c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BeduinScrollPosition f105291d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105292e;

    public e(@l String str, @k String str2, boolean z12, @k BeduinScrollPosition beduinScrollPosition, boolean z13) {
        super(null);
        this.f105288a = str;
        this.f105289b = str2;
        this.f105290c = z12;
        this.f105291d = beduinScrollPosition;
        this.f105292e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f105288a, eVar.f105288a) && L.f(this.f105289b, eVar.f105289b) && this.f105290c == eVar.f105290c && this.f105291d == eVar.f105291d && this.f105292e == eVar.f105292e;
    }

    public final int hashCode() {
        String str = this.f105288a;
        return Boolean.hashCode(this.f105292e) + ((this.f105291d.hashCode() + r.i(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f105289b), 31, this.f105290c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScrollToComponentParameters(targetFormId=");
        sb2.append(this.f105288a);
        sb2.append(", modelId=");
        sb2.append(this.f105289b);
        sb2.append(", isAnimated=");
        sb2.append(this.f105290c);
        sb2.append(", scrollPosition=");
        sb2.append(this.f105291d);
        sb2.append(", requireFocus=");
        return r.x(sb2, this.f105292e, ')');
    }
}
