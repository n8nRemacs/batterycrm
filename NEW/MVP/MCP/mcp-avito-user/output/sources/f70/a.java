package F70;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.Display;
import com.avito.android.photo_camera_view.CameraPresenterState;
import com.avito.android.photo_picker.CameraType;
import kotlin.Metadata;

/* compiled from: CameraItemPresenterModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF70/a;", "", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Display f4546a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f4547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u80.c f4548c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CameraType.BackCamera f4549d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4550e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CameraPresenterState f4551f;

    public a(@k Display display, @k Resources resources, @k u80.c cVar, @k CameraType.BackCamera backCamera, boolean z12, @l CameraPresenterState cameraPresenterState) {
        this.f4546a = display;
        this.f4547b = resources;
        this.f4548c = cVar;
        this.f4549d = backCamera;
        this.f4550e = z12;
        this.f4551f = cameraPresenterState;
    }
}
