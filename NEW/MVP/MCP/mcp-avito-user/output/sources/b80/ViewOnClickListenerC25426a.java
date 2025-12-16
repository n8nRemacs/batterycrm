package b80;

import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.photo_list_view.re23.image.content.PublishImageContent;
import com.avito.android.photo_list_view.re23.image.error.PublishImageError;
import com.avito.android.photo_list_view.re23.image.loading.PublishImageLoading;
import com.avito.android.photo_list_view_groups.image_with_group.ImageWithGroupContent;
import com.avito.android.photo_list_view_groups.image_with_group_error.ImageWithGroupError;
import com.avito.android.photo_list_view_groups.image_with_group_loading.ImageWithGroupLoading;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class ViewOnClickListenerC25426a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f56942c;

    public /* synthetic */ ViewOnClickListenerC25426a(FrameLayout frameLayout, int i12) {
        this.f56941b = i12;
        this.f56942c = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FrameLayout frameLayout = this.f56942c;
        switch (this.f56941b) {
            case 0:
                int i12 = PublishImageContent.f218213m;
                frameLayout.performClick();
                break;
            case 1:
                int i13 = PublishImageError.f218236j;
                frameLayout.performClick();
                break;
            case 2:
                int i14 = PublishImageLoading.f218254l;
                frameLayout.performClick();
                break;
            case 3:
                int i15 = ImageWithGroupContent.f218548m;
                frameLayout.performClick();
                break;
            case 4:
                int i16 = ImageWithGroupError.f218571j;
                frameLayout.performClick();
                break;
            default:
                int i17 = ImageWithGroupLoading.f218589l;
                frameLayout.performClick();
                break;
        }
    }
}
