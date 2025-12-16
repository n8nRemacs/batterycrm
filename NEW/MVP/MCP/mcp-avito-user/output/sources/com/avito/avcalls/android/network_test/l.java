package com.avito.avcalls.android.network_test;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkTestResultFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/network_test/l;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f331821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f331822c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f331823d;

    public l(@Y61.k String str, @Y61.k i iVar, @Y61.k a aVar, @Y61.k String str2) {
        this.f331820a = str;
        this.f331821b = iVar;
        this.f331822c = aVar;
        this.f331823d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f331820a, lVar.f331820a) && L.f(this.f331821b, lVar.f331821b) && L.f(this.f331822c, lVar.f331822c) && L.f(this.f331823d, lVar.f331823d);
    }

    public final int hashCode() {
        return this.f331823d.hashCode() + ((this.f331822c.hashCode() + ((this.f331821b.hashCode() + (this.f331820a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkTestResult(id=");
        sb2.append(this.f331820a);
        sb2.append(", data=");
        sb2.append(this.f331821b);
        sb2.append(", config=");
        sb2.append(this.f331822c);
        sb2.append(", report=");
        return C22026a.c(sb2, this.f331823d, ')');
    }
}
