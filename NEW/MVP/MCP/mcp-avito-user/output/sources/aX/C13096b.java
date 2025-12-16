package Ax;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.A4;
import com.avito.android.util.Kundle;
import com.google.gson.k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerPDViewedInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx/b;", "LAx/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ax.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13096b implements InterfaceC13095a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public Kundle f708a;

    @Override // Ax.InterfaceC13095a
    public final boolean a() {
        return L.f(d(), "1");
    }

    @Override // Ax.InterfaceC13095a
    @l
    /* renamed from: b, reason: from getter */
    public final Kundle getF708a() {
        return this.f708a;
    }

    @Override // Ax.InterfaceC13095a
    public final void c() {
        Kundle kundle = this.f708a;
        if (kundle != null) {
            kundle.m("jobDisclaimerPDViewed", null);
        }
    }

    @Override // Ax.InterfaceC13095a
    @l
    public final String d() {
        Kundle kundle = this.f708a;
        if (kundle != null) {
            return kundle.g("jobDisclaimerPDViewed");
        }
        return null;
    }

    @Override // Ax.InterfaceC13095a
    public final void e() {
        Kundle kundle = this.f708a;
        if (kundle != null) {
            kundle.m("jobDisclaimerPDViewed", "1");
        }
    }

    @Override // Ax.InterfaceC13095a
    @l
    public final String f() {
        if (!L.f(d(), "1")) {
            return null;
        }
        k kVar = new k();
        kVar.y("jobDisclaimerPDViewed", "1");
        String string = kVar.toString();
        A4.f318516a.getClass();
        return A4.b(string);
    }
}
