package com.avito.beduin.v2.interaction.send_v1_action;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendV1ActionsClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/send_v1_action/e;", "", "send-v1-action_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f337836a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f337837b;

    public e(@k String str, @k String str2) {
        this.f337836a = str;
        this.f337837b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f337836a, eVar.f337836a) && L.f(this.f337837b, eVar.f337837b);
    }

    public final int hashCode() {
        return this.f337837b.hashCode() + (this.f337836a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("V1ActionEntity(formId=");
        sb2.append(this.f337836a);
        sb2.append(", json=");
        return C22026a.c(sb2, this.f337837b, ')');
    }
}
