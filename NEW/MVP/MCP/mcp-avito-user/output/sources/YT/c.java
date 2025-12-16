package Yt;

import Xt.InterfaceC17045a;
import Xt.g;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CircularGalleryItemViewProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LYt/c;", "", "a", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f19711a = a.f19712a;

    /* compiled from: CircularGalleryItemViewProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYt/c$a;", "", "<init>", "()V", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f19712a = new a();

        public static void a(@k View view, @l g gVar, boolean z12) {
            if (gVar == null) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.top_picture_container);
                if (linearLayout != null) {
                    D6.w(linearLayout);
                    return;
                }
                return;
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.image_view_1);
            if (simpleDraweeView != null) {
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f169500r = z12;
                aVarA.d(gVar.f19122a);
                aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
                aVarA.c();
            }
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) view.findViewById(R.id.image_view_2);
            if (simpleDraweeView2 != null) {
                ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView2);
                aVarA2.f169500r = z12;
                aVarA2.d(gVar.f19123b);
                aVarA2.f169495m = ImageRequest.SourcePlace.f169477b;
                aVarA2.c();
            }
        }
    }

    @k
    View a(@k ViewPager viewPager, @k InterfaceC17045a interfaceC17045a);
}
