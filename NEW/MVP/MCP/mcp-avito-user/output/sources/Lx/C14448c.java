package Lx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLx/c;", "LLx/b;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lx.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14448c implements InterfaceC14447b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f10282a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f10283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f10284c;

    @Inject
    public C14448c(@k InterfaceC28373a interfaceC28373a, @k E e12, @k ReEarlyAccessData reEarlyAccessData) {
        String str;
        this.f10282a = interfaceC28373a;
        this.f10283b = e12;
        ReEarlyAccessData.PopupType popupType = reEarlyAccessData.f145331k;
        if (popupType == null || (str = popupType.f145381b) == null) {
            ReEarlyAccessData.PopupType popupType2 = ReEarlyAccessData.PopupType.f145373c;
            str = "popup_purchase";
        }
        this.f10284c = str;
    }

    @Override // Lx.InterfaceC14447b
    public final void a(int i12) {
        c("button_select_" + i12);
    }

    @Override // Lx.InterfaceC14447b
    public final void b(@k String str) {
        this.f10282a.c(new f(this.f10283b.a(), str, this.f10284c));
    }

    @Override // Lx.InterfaceC14447b
    public final void c(@k String str) {
        this.f10282a.c(new e(this.f10283b.a(), str, this.f10284c));
    }

    @Override // Lx.InterfaceC14447b
    public final void d() {
        this.f10282a.c(new e(this.f10283b.a(), "button_click_refill", this.f10284c));
    }

    @Override // Lx.InterfaceC14447b
    public final void e(@l Integer num) {
        String strG = num != null ? AK.c.g(num.intValue(), "_") : null;
        if (strG == null) {
            strG = "";
        }
        g("button_click_purchase".concat(strG));
    }

    @Override // Lx.InterfaceC14447b
    public final void f() {
        this.f10282a.c(new e(this.f10283b.a(), "button_click_step_1", this.f10284c));
    }

    @Override // Lx.InterfaceC14447b
    public final void g(@k String str) {
        this.f10282a.c(new e(this.f10283b.a(), str, this.f10284c));
    }

    @Override // Lx.InterfaceC14447b
    public final void h() {
        this.f10282a.c(new e(this.f10283b.a(), "background_close", this.f10284c));
    }
}
