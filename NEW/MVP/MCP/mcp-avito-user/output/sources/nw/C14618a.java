package Nw;

import Y61.k;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: AgencySearchResultOutlineProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNw/a;", "Landroid/view/ViewOutlineProvider;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14618a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public int f11872a;

    public C14618a(int i12) {
        this.f11872a = i12;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@k View view, @k Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), y6.b(this.f11872a));
    }
}
