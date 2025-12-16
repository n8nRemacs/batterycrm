package com.avito.avcalls.android.network_test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NetworkTestData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/network_test/i;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f331817a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f331818b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f331819c = new LinkedHashSet();

    @Y61.k
    public final String toString() {
        List listM0;
        List listM02;
        StringBuilder sb2 = new StringBuilder("NetworkTestData(");
        StringBuilder sb3 = new StringBuilder("sent=");
        synchronized (this) {
            listM0 = C42745f0.M0(this.f331817a);
        }
        sb3.append(listM0.size());
        sb3.append(", ");
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("received=");
        synchronized (this) {
            listM02 = C42745f0.M0(this.f331818b);
        }
        sb4.append(listM02.size());
        sb4.append(", ");
        sb2.append(sb4.toString());
        sb2.append("missed=" + this.f331819c.size());
        sb2.append(")");
        return sb2.toString();
    }
}
