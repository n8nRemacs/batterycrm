package com.avito.android.advert.item.properties;

import android.content.DialogInterface;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.advert.item.properties.PropertiesDialogPresenterImpl;
import com.avito.android.advertising.adapter.items.buzzoola.premium.j;
import com.avito.android.advertising.adapter.items.buzzoola.video.l;
import com.avito.android.beduin.ui.universal.UniversalBeduinPushBottomSheetDialog;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.profile_settings_extended.deep_linking.a;
import fA.InterfaceC40265a;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f78286d;

    public /* synthetic */ g(int i12, Object obj, Object obj2) {
        this.f78284b = i12;
        this.f78285c = obj;
        this.f78286d = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.f78286d;
        Object obj2 = this.f78285c;
        switch (this.f78284b) {
            case 0:
                PropertiesDialogPresenterImpl propertiesDialogPresenterImpl = (PropertiesDialogPresenterImpl) obj2;
                propertiesDialogPresenterImpl.f78270c = PropertiesDialogPresenterImpl.PropertiesDialogState.a((PropertiesDialogPresenterImpl.PropertiesDialogState) obj);
                propertiesDialogPresenterImpl.f78269b.e();
                break;
            case 1:
                com.avito.android.advertising.adapter.items.buzzoola.avl.f fVar = (com.avito.android.advertising.adapter.items.buzzoola.avl.f) obj2;
                if (L.f(fVar.f87283g, (com.avito.android.advertising.ui.buzzoola.i) obj)) {
                    fVar.f87283g = null;
                    break;
                }
                break;
            case 2:
                com.avito.android.advertising.adapter.items.buzzoola.media_x2.f fVar2 = (com.avito.android.advertising.adapter.items.buzzoola.media_x2.f) obj2;
                if (L.f(fVar2.f87340g, (com.avito.android.advertising.ui.buzzoola.i) obj)) {
                    fVar2.f87340g = null;
                    break;
                }
                break;
            case 3:
                j jVar = (j) obj2;
                if (L.f(jVar.f87410g, (com.avito.android.advertising.ui.buzzoola.i) obj)) {
                    jVar.f87410g = null;
                    break;
                }
                break;
            case 4:
                com.avito.android.advertising.adapter.items.buzzoola.premium_v2.j jVar2 = (com.avito.android.advertising.adapter.items.buzzoola.premium_v2.j) obj2;
                if (L.f(jVar2.f87475g, (com.avito.android.advertising.ui.buzzoola.i) obj)) {
                    jVar2.f87475g = null;
                    break;
                }
                break;
            case 5:
                l lVar = (l) obj2;
                if (L.f(lVar.f87582l, (com.avito.android.advertising.ui.buzzoola.i) obj)) {
                    lVar.f87582l = null;
                    break;
                }
                break;
            case 6:
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).setOnDismissListener(null);
                ((com.avito.android.advertising.kebab.d) obj).f87827d = null;
                break;
            case 7:
                UniversalBeduinPushBottomSheetDialog.a aVar = UniversalBeduinPushBottomSheetDialog.f104450h0;
                ((Y41.a) obj2).invoke();
                ActivityC22955m activityC22955mRequireActivity = ((UniversalBeduinPushBottomSheetDialog) obj).requireActivity();
                if (!activityC22955mRequireActivity.isFinishing()) {
                    activityC22955mRequireActivity.finish();
                    break;
                }
                break;
            case 8:
                com.avito.android.deeplink_handler.handler.bundle.a aVar2 = (com.avito.android.deeplink_handler.handler.bundle.a) obj2;
                com.avito.android.deeplink_handler.view.impl.b bVar = (com.avito.android.deeplink_handler.view.impl.b) obj;
                if (aVar2 != null) {
                    ExtendedProfileFragment.d dVar = bVar.f134598c;
                    ExtendedProfileFragment.a aVar3 = ExtendedProfileFragment.f149283Y0;
                    ExtendedProfileFragment.this.D5().accept(new InterfaceC40265a.x(aVar2));
                }
                bVar.f134599d = null;
                break;
            case 9:
                if (((l0.a) obj2).f406838b) {
                    ((com.avito.android.profile_settings_extended.deep_linking.i) obj).j(a.C7003a.f230046b);
                    break;
                }
                break;
            default:
                ru.cyberity.cbr.presentation.screen.verification.a.a((ru.cyberity.cbr.presentation.screen.verification.a) obj2, (Map) obj, dialogInterface);
                break;
        }
    }
}
