package com.avito.android.messenger;

import jz.C42450a;
import kotlin.Metadata;

/* compiled from: MessengerUserIdInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/w;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* data */ class C32574w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f197461a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42450a f197462b;

    public C32574w(@Y61.k String str, @Y61.k C42450a c42450a) {
        this.f197461a = str;
        this.f197462b = c42450a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32574w)) {
            return false;
        }
        C32574w c32574w = (C32574w) obj;
        return kotlin.jvm.internal.L.f(this.f197461a, c32574w.f197461a) && kotlin.jvm.internal.L.f(this.f197462b, c32574w.f197462b);
    }

    public final int hashCode() {
        return this.f197462b.hashCode() + (this.f197461a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "LocalInfo(userHashId=" + this.f197461a + ", employeeInfo=" + this.f197462b + ')';
    }
}
