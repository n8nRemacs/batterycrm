package com.avito.android.profile_phones.confirm_phone;

import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmPhoneParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/k;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f227036a;

    /* renamed from: b, reason: collision with root package name */
    public final int f227037b;

    /* renamed from: c, reason: collision with root package name */
    public final long f227038c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227039d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227040e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RequestCodeV2Source f227041f;

    public k(@Y61.k String str, int i12, long j12, boolean z12, boolean z13, @Y61.k RequestCodeV2Source requestCodeV2Source) {
        this.f227036a = str;
        this.f227037b = i12;
        this.f227038c = j12;
        this.f227039d = z12;
        this.f227040e = z13;
        this.f227041f = requestCodeV2Source;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f227036a, kVar.f227036a) && this.f227037b == kVar.f227037b && this.f227038c == kVar.f227038c && this.f227039d == kVar.f227039d && this.f227040e == kVar.f227040e && this.f227041f == kVar.f227041f;
    }

    public final int hashCode() {
        return this.f227041f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(androidx.appcompat.app.r.e(this.f227037b, this.f227036a.hashCode() * 31, 31), 31, this.f227038c), 31, this.f227039d), 31, this.f227040e);
    }

    @Y61.k
    public final String toString() {
        return "ConfirmPhoneParams(phone=" + this.f227036a + ", codeLength=" + this.f227037b + ", timeout=" + this.f227038c + ", codeRequestNeeded=" + this.f227039d + ", phoneValidationNeeded=" + this.f227040e + ", src=" + this.f227041f + ')';
    }
}
