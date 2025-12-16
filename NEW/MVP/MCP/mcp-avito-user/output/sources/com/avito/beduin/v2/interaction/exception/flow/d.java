package com.avito.beduin.v2.interaction.exception.flow;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.D;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExceptionInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/exception/flow/d;", "LdU0/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f337397a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f337398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String[] f337399c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final D f337400d;

    public d(@k String str, @l String str2, @k String[] strArr, @l D d12) {
        this.f337397a = str;
        this.f337398b = str2;
        this.f337399c = strArr;
        this.f337400d = d12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f337397a, dVar.f337397a) && L.f(this.f337398b, dVar.f337398b) && L.f(this.f337399c, dVar.f337399c) && L.f(this.f337400d, dVar.f337400d);
    }

    public final int hashCode() {
        int iHashCode = this.f337397a.hashCode() * 31;
        String str = this.f337398b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.f337399c)) * 31;
        D d12 = this.f337400d;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ExceptionInteraction(type=" + this.f337397a + ", property=" + this.f337398b + ", trace=" + Arrays.toString(this.f337399c) + ", renderState=" + this.f337400d + ')';
    }
}
