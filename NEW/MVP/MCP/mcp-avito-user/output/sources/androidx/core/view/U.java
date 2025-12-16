package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.util.D6;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f44981c;

    public /* synthetic */ U(View view, int i12) {
        this.f44980b = i12;
        this.f44981c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height;
        View view = this.f44981c;
        switch (this.f44980b) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                D6.w(view);
                break;
            case 2:
                D6.H(view);
                break;
            case 3:
                int i12 = com.avito.android.home.appending_item.empty.e.f162209c;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null && (height = viewGroup.getHeight() - view.getBottom()) > 0) {
                    view.setMinimumHeight(height);
                    break;
                }
                break;
            case 4:
                view.setAlpha(0.0f);
                D6.H(view);
                break;
            case 5:
                D6.w(view);
                break;
            case 6:
                LegacyPhotoGalleryActivity.a aVar = LegacyPhotoGalleryActivity.f216531m0;
                view.setVisibility(0);
                break;
            case 7:
                Set<String> set = com.avito.android.publish.slots.delivery_all_toggles.item.o.f243506u;
                view.forceLayout();
                break;
            default:
                ru.cyberity.cbr.core.common.s.d(view);
                break;
        }
    }
}
