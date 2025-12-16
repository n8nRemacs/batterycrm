package Vt;

import Wt.C15797a;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

/* compiled from: CircularGallery.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVt/b;", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends ViewPager.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f17462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15797a f17463c;

    public b(c cVar, C15797a c15797a) {
        this.f17462b = cVar;
        this.f17463c = c15797a;
    }

    @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        TextView textView = this.f17462b.f17466c;
        C15797a c15797a = this.f17463c;
        textView.setText((c15797a.c(i12) + 1) + " · " + c15797a.f18079a.size());
    }
}
