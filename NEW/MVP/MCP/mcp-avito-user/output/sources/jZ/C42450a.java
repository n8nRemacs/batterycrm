package jz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import jz.InterfaceC42452c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljz/a;", "", "a", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C42450a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C11595a f405961d = new C11595a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C42450a f405962e = new C42450a("", "", InterfaceC42452c.b.f405973a);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42452c f405963a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405964b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405965c;

    /* compiled from: EmployeeInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljz/a$a;", "", "<init>", "()V", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz.a$a, reason: collision with other inner class name */
    public static final class C11595a {
        public /* synthetic */ C11595a(C42822w c42822w) {
            this();
        }

        public C11595a() {
        }
    }

    public C42450a(@k String str, @k String str2, @k InterfaceC42452c interfaceC42452c) {
        this.f405963a = interfaceC42452c;
        this.f405964b = str;
        this.f405965c = str2;
    }

    public static C42450a a(C42450a c42450a, InterfaceC42452c interfaceC42452c) {
        String str = c42450a.f405964b;
        String str2 = c42450a.f405965c;
        c42450a.getClass();
        return new C42450a(str, str2, interfaceC42452c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42450a)) {
            return false;
        }
        C42450a c42450a = (C42450a) obj;
        return L.f(this.f405963a, c42450a.f405963a) && L.f(this.f405964b, c42450a.f405964b) && L.f(this.f405965c, c42450a.f405965c);
    }

    public final int hashCode() {
        return this.f405965c.hashCode() + H.d(this.f405963a.hashCode() * 31, 31, this.f405964b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmployeeInfo(modeInfo=");
        sb2.append(this.f405963a);
        sb2.append(", profileId=");
        sb2.append(this.f405964b);
        sb2.append(", profileHashId=");
        return C22026a.c(sb2, this.f405965c, ')');
    }
}
