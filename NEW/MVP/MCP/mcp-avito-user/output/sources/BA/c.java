package Ba;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import ir.e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileSnippetRestyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBa/c;", "Lir/e;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f1482b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CompactFlexibleLayout f1483c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f1484d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f1485e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f1486f;

    public c(@k View view, @k ir.d dVar) {
        this.f1481a = new b(view, dVar);
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f1482b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.seller_badge_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
        }
        this.f1483c = (CompactFlexibleLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.contact_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f1484d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.contact_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f1485e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.contact_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f1486f = (ViewGroup) viewFindViewById5;
    }

    @Override // ir.e
    public final void P3(@l List<SerpBadge> list) {
        Q81.b.a(this.f1483c, list, R.style.Design_Widget_BadgeView_Restyle);
    }

    @Override // ir.e
    public final void a(@l Y41.a<G0> aVar) {
        this.f1481a.a(aVar);
    }

    @Override // ir.e
    public final void b(@l com.avito.android.image_loader.a aVar, @k UserIconType userIconType, @l AvatarShape avatarShape) {
        AvatarShape avatarShape2 = AvatarShape.SQUARE;
        SimpleDraweeView simpleDraweeView = this.f1482b;
        if (avatarShape == avatarShape2) {
            simpleDraweeView.getHierarchy().s(RoundingParams.b(y6.b(16)));
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            layoutParams.width = y6.b(86);
            simpleDraweeView.setLayoutParams(layoutParams);
        }
        if (aVar != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVar);
            aVarA.c();
        }
    }

    @Override // ir.e
    public final void c(@l Float f12, @l CharSequence charSequence) {
        this.f1481a.c(f12, charSequence);
    }

    @Override // ir.e
    public final void d(@l Y41.a<G0> aVar) {
        this.f1481a.d(aVar);
    }

    @Override // ir.e
    public final void e(@l CharSequence charSequence) {
        this.f1481a.e(charSequence);
    }

    @Override // ir.e
    public final void f(@l CharSequence charSequence, @l Integer num) {
        boolean z12 = (charSequence == null || charSequence.length() == 0) ? false : true;
        ViewGroup viewGroup = this.f1486f;
        D6.G(viewGroup, z12);
        I5.a(this.f1484d, charSequence, false);
        I5.a(this.f1485e, viewGroup.getContext().getString(R.string.profile_snippet_contact_name), false);
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, viewGroup.getContext().getResources().getDimensionPixelSize(iIntValue), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // ir.e
    public final void g(@l CharSequence charSequence) {
        this.f1481a.g(charSequence);
    }

    @Override // ir.e
    public final void gb(@l String str, @l String str2, @l UniversalColor universalColor) {
        this.f1481a.gb(str, str2, universalColor);
    }

    @Override // ir.e
    public final void h(@l CharSequence charSequence) {
        this.f1481a.h(charSequence);
    }

    @Override // ir.e
    public final void hb(@l Y41.l<? super Integer, G0> lVar) {
        this.f1481a.f1476a.f405311t = lVar;
    }

    @Override // ir.e
    public final void setSubtitle(@l CharSequence charSequence) {
        this.f1481a.setSubtitle(charSequence);
    }

    @Override // ir.e
    public final void setTitle(@l CharSequence charSequence) {
        this.f1481a.setTitle(charSequence);
    }
}
