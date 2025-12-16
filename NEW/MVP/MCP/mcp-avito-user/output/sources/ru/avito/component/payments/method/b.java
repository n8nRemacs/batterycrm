package ru.avito.component.payments.method;

import android.view.View;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.mnz_common.ui.ActionFloatingFooter;
import com.avito.android.user_adverts_views_util.CpxPromoWidgetView;
import ru.cyberity.cbr.core.common.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f430386c;

    public /* synthetic */ b(int i12, Y41.a aVar) {
        this.f430385b = i12;
        this.f430386c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f430386c;
        switch (this.f430385b) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                if (aVar != null) {
                    break;
                }
                break;
            case 2:
                v.a(aVar, view);
                break;
            case 3:
                int i12 = PhotoUploaderImage.f179945E;
                aVar.invoke();
                break;
            case 4:
                int i13 = PhotoUploaderImage.f179945E;
                aVar.invoke();
                break;
            case 5:
                int i14 = PhotoUploaderImage.f179945E;
                aVar.invoke();
                break;
            case 6:
                int i15 = PhotoUploaderImage.f179945E;
                aVar.invoke();
                break;
            case 7:
                int i16 = ActionFloatingFooter.f197972f;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 8:
                int i17 = CpxPromoWidgetView.f316737e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
