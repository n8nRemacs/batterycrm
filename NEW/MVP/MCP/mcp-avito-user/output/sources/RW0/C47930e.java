package rw0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/e;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rw0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47930e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437190a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC47929d f437191b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC47929d f437192c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC47929d f437193d;

    public C47930e(@Y61.k String str, @Y61.k AbstractC47929d abstractC47929d, @Y61.k AbstractC47929d abstractC47929d2, @Y61.k AbstractC47929d abstractC47929d3) {
        this.f437190a = str;
        this.f437191b = abstractC47929d;
        this.f437192c = abstractC47929d2;
        this.f437193d = abstractC47929d3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47930e)) {
            return false;
        }
        C47930e c47930e = (C47930e) obj;
        return L.f(this.f437190a, c47930e.f437190a) && L.f(this.f437191b, c47930e.f437191b) && L.f(this.f437192c, c47930e.f437192c) && L.f(this.f437193d, c47930e.f437193d);
    }

    public final int hashCode() {
        return this.f437193d.hashCode() + ((this.f437192c.hashCode() + ((this.f437191b.hashCode() + (this.f437190a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ContactsInfo(title=" + this.f437190a + ", nameField=" + this.f437191b + ", phoneField=" + this.f437192c + ", emailField=" + this.f437193d + ')';
    }
}
