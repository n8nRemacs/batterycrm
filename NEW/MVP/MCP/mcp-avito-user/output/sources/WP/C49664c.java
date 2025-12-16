package wp;

import Y61.k;
import Y61.l;
import Yo.C18309a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DigitalRegistrationAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwp/c;", "Lwp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49664c implements InterfaceC49662a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f441799a;

    @Inject
    public C49664c(@k InterfaceC28373a interfaceC28373a) {
        this.f441799a = interfaceC28373a;
    }

    public static C49663b l(C49664c c49664c, int i12, int i13, String str, String str2, String str3, int i14) {
        String str4 = (i14 & 8) != 0 ? null : str2;
        String str5 = (i14 & 16) != 0 ? null : str3;
        c49664c.getClass();
        return new C49663b(i12, i13, str, str4, str5);
    }

    @Override // wp.InterfaceC49662a
    public final void a(@k String str, @k String str2) {
        this.f441799a.c(new C49663b(12380, 1, "cd_big_widget", str, str2));
    }

    @Override // wp.InterfaceC49662a
    public final void b() {
        this.f441799a.c(l(this, 12371, 2, "cd_mini_widget", null, null, 24));
    }

    @Override // wp.InterfaceC49662a
    public final void c(@k String str, @l String str2, @l String str3) {
        this.f441799a.c(new C18309a("view", str, str3, str2));
    }

    @Override // wp.InterfaceC49662a
    public final void d(@k String str) {
        this.f441799a.c(l(this, 12527, 0, "cd_big_widget", null, str, 8));
    }

    @Override // wp.InterfaceC49662a
    public final void e(@k String str) {
        this.f441799a.c(l(this, 12372, 2, "cd_mini_widget", str, null, 16));
    }

    @Override // wp.InterfaceC49662a
    public final void f(@k String str, @k String str2, boolean z12) {
        this.f441799a.c(new C49663b(12377, 1, z12 ? "cd_big_widget" : "cd_mini_widget", str, str2));
    }

    @Override // wp.InterfaceC49662a
    public final void g(@k String str, @k String str2, boolean z12) {
        this.f441799a.c(new C49663b(12376, 1, z12 ? "cd_big_widget" : "cd_mini_widget", str, str2));
    }

    @Override // wp.InterfaceC49662a
    public final void h() {
        this.f441799a.c(l(this, 12370, 2, "cd_mini_widget", null, null, 24));
    }

    @Override // wp.InterfaceC49662a
    public final void i() {
        this.f441799a.c(l(this, 12378, 1, "cd_big_widget", null, null, 24));
    }

    @Override // wp.InterfaceC49662a
    public final void j(@k String str, @l String str2, @l String str3) {
        this.f441799a.c(new C18309a("click", str, str3, str2));
    }

    @Override // wp.InterfaceC49662a
    public final void k(@k String str, @k String str2) {
        this.f441799a.c(new C49663b(12375, 1, "cd_mini_widget", str, str2));
    }
}
