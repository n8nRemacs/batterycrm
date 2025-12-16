package n11;

import Y41.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.view.C23050m0;
import com.avito.android.advert.item.anchor_trust_factors.layout.AnchorsExpandContainer;
import com.avito.android.iac_dialer.impl_module.services.media_service.IacMediaService;
import com.my.tracker.campaign.CampaignService;
import io.reactivex.rxjava3.core.B;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import qW.C47352a;
import qW.C47353b;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import ru.avito.messenger.internal.connection.k0;
import ru.cyberity.cbr.camera.photo.presentation.document.b;
import ru.cyberity.cbr.core.widget.CBRErrorBottomSheetView;
import ru.mts.biometry.sdk.feature.registration.ui.camera.h;
import ry.DialogC47939a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: n11.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC44167a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f414849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f414850c;

    public /* synthetic */ RunnableC44167a(Object obj, int i12) {
        this.f414849b = i12;
        this.f414850c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        l<? super Integer, G0> lVar;
        Object obj = this.f414850c;
        switch (this.f414849b) {
            case 0:
                ((CampaignService) obj).stopSelf();
                return;
            case 1:
                AnchorsExpandContainer anchorsExpandContainer = (AnchorsExpandContainer) obj;
                Integer num = anchorsExpandContainer.f72841g;
                if (num == null || (lVar = anchorsExpandContainer.f72842h) == null) {
                    return;
                }
                lVar.invoke(num);
                return;
            case 2:
                ((h) obj).f436512l0.a();
                return;
            case 3:
                int i12 = C47353b.f429296c;
                B<Location> b12 = ((C47352a) obj).f429291e.f181750a;
                if (b12.getF318621e()) {
                    return;
                }
                b12.e();
                return;
            case 4:
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) obj;
                TextView textView = collapsingTitleAppBarLayout.f430576C;
                if (textView == null) {
                    textView = null;
                }
                int width = collapsingTitleAppBarLayout.getWidth();
                FrameLayout frameLayout = collapsingTitleAppBarLayout.f430577D;
                textView.setWidth(width - (Math.max((frameLayout != null ? frameLayout : null).getWidth(), collapsingTitleAppBarLayout.getActionViewContainer().getWidth()) * 2));
                return;
            case 5:
                C23050m0.f46822j.getClass();
                C23050m0.f46823k.f46829g.a((k0) obj);
                return;
            case 6:
                b.n((b) obj);
                return;
            case 7:
                CBRErrorBottomSheetView.m294showCallback$lambda1((CBRErrorBottomSheetView) obj);
                return;
            case 8:
                ru.cyberity.cbr.presentation.screen.preview.selfie.a.b((ru.cyberity.cbr.presentation.screen.preview.selfie.a) obj);
                return;
            case 9:
                int i13 = DialogC47939a.f437267E;
                ((DialogC47939a) obj).dismiss();
                return;
            case 10:
                throw ((IllegalArgumentException) obj);
            default:
                com.avito.android.iac_dialer.impl_module.services.media_service.a aVar = (com.avito.android.iac_dialer.impl_module.services.media_service.a) obj;
                AtomicBoolean atomicBoolean = aVar.f166364d;
                if (!atomicBoolean.get()) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacMediaServiceLauncher", "don't stopService cause service was started again", null);
                    return;
                }
                atomicBoolean.set(false);
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacMediaServiceLauncher", "stopService", null);
                IacMediaService.f166354g.getClass();
                Context context = aVar.f166361a;
                context.stopService(new Intent(context, (Class<?>) IacMediaService.class));
                return;
        }
    }
}
