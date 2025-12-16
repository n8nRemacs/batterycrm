package jj;

import Y61.k;
import Y61.l;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import gj.o;
import gj.p;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastSettingsRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljj/a;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42388a implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f405777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.view.impl.k f405778c;

    /* JADX WARN: Multi-variable type inference failed */
    public C42388a(@k ActivityC22955m activityC22955m, @k Y41.a aVar) {
        this.f405777b = (N) aVar;
        this.f405778c = new com.avito.android.deeplink_handler.view.impl.k(activityC22955m, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@k PrintableText printableText, @l List<? extends c.a> list, @l List<? extends c.a> list2, @l FrameLayout frameLayout, @k f fVar, int i12, @k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @l i.b bVar, @l String str) {
        c.b(c.f125244a, p.a((o) this.f405777b.invoke(), fVar).f396763a, printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, null, z12, z13, bVar, null, 2176);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        this.f405778c.Y1(i12);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void b2(int i12, @k f.c cVar, @k ToastBarPosition toastBarPosition) {
        com.avito.android.deeplink_handler.view.impl.k kVar = this.f405778c;
        kVar.getClass();
        a.i.C4057a.a(kVar, i12, cVar, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void m0(@k String str, @k f fVar, int i12, @k ToastBarPosition toastBarPosition) {
        com.avito.android.deeplink_handler.view.impl.k kVar = this.f405778c;
        kVar.getClass();
        a.i.C4057a.b(kVar, str, fVar, i12, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void z1(@k String str) {
        this.f405778c.z1(str);
    }
}
