package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacDialerLogger.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/s;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class s implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f165638a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f165639b;

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && L.f(this.f165638a, ((s) obj).f165638a);
    }

    public final int hashCode() {
        return this.f165638a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("LogWrongState(place="), this.f165638a, ')');
    }

    public s(@Y61.k String str) {
        this.f165638a = str;
        this.f165639b = "";
    }

    public /* synthetic */ s(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str);
    }
}
