package com.avito.android.messenger;

import kotlin.Metadata;

/* compiled from: HashIdChangeUiControllerImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/n0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f196914a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f196915b;

    public n0(boolean z12, boolean z13) {
        this.f196914a = z12;
        this.f196915b = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f196914a == n0Var.f196914a && this.f196915b == n0Var.f196915b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196915b) + (Boolean.hashCode(this.f196914a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReloadCondition(userIdChanged=");
        sb2.append(this.f196914a);
        sb2.append(", messengerFragmentIsInFocus=");
        return androidx.appcompat.app.r.x(sb2, this.f196915b, ')');
    }
}
