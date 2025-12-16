package Ba;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import ir.e;
import ir.g;
import j.InterfaceC42161q;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileSnippetRedesign.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBa/b;", "Lir/e;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1476a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f1477b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f1478c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1479d;

    /* compiled from: ProfileSnippetRedesign.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1480a;

        static {
            int[] iArr = new int[UserIconType.values().length];
            try {
                iArr[UserIconType.SHOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserIconType.COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1480a = iArr;
        }
    }

    public b(@k View view, @k ir.d dVar) {
        this.f1476a = new g(view, dVar);
        View viewFindViewById = view.findViewById(R.id.subscribe);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f1477b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f1478c = (SimpleDraweeView) viewFindViewById2;
        this.f1479d = view.getContext();
    }

    @Override // ir.e
    public final void P3(@l List<SerpBadge> list) {
        this.f1476a.P3(list);
    }

    @Override // ir.e
    public final void a(@l Y41.a<G0> aVar) {
        this.f1476a.a(aVar);
    }

    @Override // ir.e
    public final void b(@l com.avito.android.image_loader.a aVar, @k UserIconType userIconType, @l AvatarShape avatarShape) {
        int i12 = a.f1480a[userIconType.ordinal()];
        Context context = this.f1479d;
        Drawable drawableL = i12 != 1 ? i12 != 2 ? null : C35835l0.l(context.getDrawable(R.drawable.ic_company_40), C35835l0.d(R.attr.gray28, context)) : C35835l0.l(context.getDrawable(R.drawable.ic_shop_40), C35835l0.d(R.attr.gray28, context));
        SimpleDraweeView simpleDraweeView = this.f1478c;
        simpleDraweeView.getHierarchy().o(drawableL, 1);
        if (aVar != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVar);
            aVarA.c();
        }
    }

    @Override // ir.e
    public final void c(@l Float f12, @l CharSequence charSequence) {
        this.f1476a.c(f12, charSequence);
    }

    @Override // ir.e
    public final void d(@l Y41.a<G0> aVar) {
        this.f1477b.setOnClickListener(new ViewOnClickListenerC13121a(0, aVar));
    }

    @Override // ir.e
    public final void e(@l CharSequence charSequence) {
        this.f1476a.e(charSequence);
    }

    @Override // ir.e
    public final void f(@l CharSequence charSequence, @InterfaceC42161q @l Integer num) {
        this.f1476a.f(charSequence, num);
    }

    @Override // ir.e
    public final void g(@l CharSequence charSequence) {
        this.f1476a.g(charSequence);
    }

    @Override // ir.e
    public final void gb(@l String str, @l String str2, @l UniversalColor universalColor) {
        this.f1476a.gb(str, str2, universalColor);
    }

    @Override // ir.e
    public final void h(@l CharSequence charSequence) {
        I5.a(this.f1477b, charSequence, false);
    }

    @Override // ir.e
    public final void hb(@l Y41.l<? super Integer, G0> lVar) {
        this.f1476a.f405311t = lVar;
    }

    @Override // ir.e
    public final void setSubtitle(@l CharSequence charSequence) {
        this.f1476a.setSubtitle(charSequence);
    }

    @Override // ir.e
    public final void setTitle(@l CharSequence charSequence) {
        this.f1476a.setTitle(charSequence);
    }
}
