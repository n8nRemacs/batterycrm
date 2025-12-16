package gw;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.design.State;
import kotlin.Metadata;

/* compiled from: ImageLoadable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgw/a;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40743a {
    @l
    Drawable getImage();

    @l
    View getImageContainerView();

    void setImage(@l Drawable drawable);

    void setState(@k State state);
}
