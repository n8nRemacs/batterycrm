package com.avito.android.iac_calls_history.impl_module.api;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.api.remote.elements.CallsHistoryElement;
import com.avito.android.iac_calls_history.impl_module.api.remote.elements.IacCallsHistoryElement;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/CallsHistoryTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/elements/CallsHistoryElement;", "<init>", "()V", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallsHistoryTypeAdapter implements h<CallsHistoryElement> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a> f164681a = Collections.singletonList(new a());

    /* compiled from: CallsHistoryTypeAdapter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/CallsHistoryTypeAdapter$a;", "", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return IacCallsHistoryElement.class.equals(IacCallsHistoryElement.class);
        }

        public final int hashCode() {
            return IacCallsHistoryElement.class.hashCode() + 103178912;
        }

        @k
        public final String toString() {
            return "Mapping(typeValue=iac, valueKey=iac, valueType=" + IacCallsHistoryElement.class + ')';
        }
    }

    @Override // com.google.gson.h
    public final CallsHistoryElement deserialize(i iVar, Type type, com.google.gson.g gVar) {
        Object next;
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Iterator<T> it = this.f164681a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((a) next).getClass();
            if ("iac".equals(strS)) {
                break;
            }
        }
        if (((a) next) == null) {
            return null;
        }
        i iVarD2 = kVarI.D("iac");
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        if (kVarI2 == null) {
            return null;
        }
        return (CallsHistoryElement) gVar.b(kVarI2, IacCallsHistoryElement.class);
    }
}
