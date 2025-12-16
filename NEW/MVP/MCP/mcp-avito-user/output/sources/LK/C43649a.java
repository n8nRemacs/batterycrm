package lK;

import NK.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_dialer.impl_module.analytics.i;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.permissions.u;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mK.InterfaceC43975a;
import mK.b;
import nJ.F;

/* compiled from: IacCallLauncherImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlK/a;", "LNK/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: lK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43649a implements NK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43975a f413697a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f413698b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BL.a f413699c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f413700d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final i f413701e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final IacTechInfoStorage f413702f;

    /* compiled from: IacCallLauncherImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LlK/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK.a$a, reason: collision with other inner class name */
    public static final class C11782a {
        public /* synthetic */ C11782a(C42822w c42822w) {
            this();
        }

        public C11782a() {
        }
    }

    static {
        new C11782a(null);
    }

    @Inject
    public C43649a(@k InterfaceC43975a interfaceC43975a, @k InterfaceC28373a interfaceC28373a, @k BL.a aVar, @k u uVar, @k i iVar, @k IacTechInfoStorage iacTechInfoStorage) {
        this.f413697a = interfaceC43975a;
        this.f413698b = interfaceC28373a;
        this.f413699c = aVar;
        this.f413700d = uVar;
        this.f413701e = iVar;
        this.f413702f = iacTechInfoStorage;
    }

    @Override // NK.a
    public final void a(@k a.b bVar) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallLauncher", "startRecallFromSystemApi", null);
        IacCallDirection iacCallDirection = IacCallDirection.OUTGOING;
        IacTechInfoStorage iacTechInfoStorage = this.f413702f;
        String str = bVar.f11371a;
        iacTechInfoStorage.a(str, iacCallDirection, null);
        u uVar = this.f413700d;
        this.f413698b.c(new F(null, bVar.f11371a, bVar.f11372b, uVar.b("android.permission.RECORD_AUDIO"), uVar.b("android.permission.CAMERA"), null, null, iacTechInfoStorage.b(str)));
        this.f413697a.a(new b.C11825b(str, bVar.f11372b, bVar.f11373c, bVar.f11374d), "IacCallLauncher");
    }

    @Override // NK.a
    public final void b(@k a.C0728a c0728a) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallLauncher", "startNewCall", null);
        IacCallDirection iacCallDirection = IacCallDirection.OUTGOING;
        IacTechInfoStorage iacTechInfoStorage = this.f413702f;
        String str = c0728a.f11363a;
        iacTechInfoStorage.a(str, iacCallDirection, null);
        Long l12 = c0728a.f11368f;
        String string = l12 != null ? l12.toString() : null;
        u uVar = this.f413700d;
        this.f413698b.c(new F(string, c0728a.f11363a, c0728a.f11366d, uVar.b("android.permission.RECORD_AUDIO"), uVar.b("android.permission.CAMERA"), Boolean.valueOf(c0728a.f11367e), c0728a.f11370h, iacTechInfoStorage.b(str)));
        this.f413701e.a(str, c0728a.f11370h);
        this.f413697a.a(new b.a(c0728a.f11363a, c0728a.f11364b, c0728a.f11367e, c0728a.f11365c, c0728a.f11366d, c0728a.f11368f, c0728a.f11369g, c0728a.f11370h), "IacCallLauncher");
    }
}
