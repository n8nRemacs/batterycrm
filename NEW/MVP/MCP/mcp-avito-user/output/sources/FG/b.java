package Fg;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.res.i;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortVideosWidgetResourcesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFg/b;", "LFg/a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC13800a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f5951a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f5952b;

    @Inject
    public b(@k Resources resources) {
        this.f5951a = resources;
        this.f5952b = resources.getString(R.string.avl_entry_widget_carousel_show_all_videos_title);
    }

    @Override // Fg.InterfaceC13800a
    @l
    public final Drawable a() {
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return this.f5951a.getDrawable(R.drawable.avl_entry_ic_play, null);
    }

    @Override // Fg.InterfaceC13800a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF5952b() {
        return this.f5952b;
    }
}
