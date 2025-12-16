package Zp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneCallState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZp/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C19585c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f20495i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f20496b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f20497c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f20498d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20499e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20500f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20501g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final d f20502h;

    /* compiled from: PhoneCallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZp/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zp.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C19585c(@k String str, @k String str2, @l String str3, boolean z12, boolean z13, boolean z14, @k d dVar) {
        this.f20496b = str;
        this.f20497c = str2;
        this.f20498d = str3;
        this.f20499e = z12;
        this.f20500f = z13;
        this.f20501g = z14;
        this.f20502h = dVar;
    }

    public static C19585c a(C19585c c19585c, String str, boolean z12, boolean z13, boolean z14, d dVar, int i12) {
        String str2 = c19585c.f20496b;
        String str3 = c19585c.f20497c;
        if ((i12 & 4) != 0) {
            str = c19585c.f20498d;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            z12 = c19585c.f20499e;
        }
        boolean z15 = z12;
        if ((i12 & 16) != 0) {
            z13 = c19585c.f20500f;
        }
        boolean z16 = z13;
        if ((i12 & 32) != 0) {
            z14 = c19585c.f20501g;
        }
        boolean z17 = z14;
        if ((i12 & 64) != 0) {
            dVar = c19585c.f20502h;
        }
        c19585c.getClass();
        return new C19585c(str2, str3, str4, z15, z16, z17, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19585c)) {
            return false;
        }
        C19585c c19585c = (C19585c) obj;
        return L.f(this.f20496b, c19585c.f20496b) && L.f(this.f20497c, c19585c.f20497c) && L.f(this.f20498d, c19585c.f20498d) && this.f20499e == c19585c.f20499e && this.f20500f == c19585c.f20500f && this.f20501g == c19585c.f20501g && L.f(this.f20502h, c19585c.f20502h);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f20496b.hashCode() * 31, 31, this.f20497c);
        String str = this.f20498d;
        return this.f20502h.hashCode() + r.i(r.i(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20499e), 31, this.f20500f), 31, this.f20501g);
    }

    @k
    public final String toString() {
        return "PhoneCallState(dealId=" + this.f20496b + ", clientId=" + this.f20497c + ", phone=" + this.f20498d + ", isTemporary=" + this.f20499e + ", isLoading=" + this.f20500f + ", isError=" + this.f20501g + ", viewState=" + this.f20502h + ')';
    }
}
