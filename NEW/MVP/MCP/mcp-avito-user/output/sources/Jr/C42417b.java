package jr;

import OU.d;
import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import e11.ViewOnClickListenerC39879j1;
import hw.InterfaceC41177b;
import java.util.ArrayList;
import java.util.List;
import jr.InterfaceC42416a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BannerCard.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljr/b;", "Ljr/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42417b implements InterfaceC42416a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f405830b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f405831c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f405832d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f405833e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f405834f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f405835g;

    public C42417b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.banner_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f405830b = (SimpleDraweeView) viewFindViewById;
        this.f405831c = new d(view.findViewById(R.id.banner_message));
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f405832d = (ImageView) viewFindViewById2;
        this.f405833e = (ViewGroup) view.findViewById(R.id.actions_container);
        this.f405834f = new ArrayList();
        this.f405835g = LayoutInflater.from(view.getContext());
    }

    @Override // jr.InterfaceC42416a
    public final void B7(@l Y41.a<G0> aVar) {
        ImageView imageView = this.f405832d;
        if (aVar == null) {
            imageView.setOnClickListener(null);
        } else {
            imageView.setOnClickListener(new A(27, aVar));
        }
    }

    @Override // jr.InterfaceC42416a
    public final void G4(@l com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView = this.f405830b;
        if (aVar == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.c();
    }

    @Override // jr.InterfaceC42416a
    public final void P2(@k CharSequence charSequence) {
        this.f405831c.g0(charSequence);
    }

    @Override // jr.InterfaceC42416a
    public final void h2(@k List<InterfaceC42416a.C11584a> list) {
        int iJ2;
        int size;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((InterfaceC42416a.C11584a) obj).f405827a;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f405834f;
        int size2 = arrayList2.size();
        int size3 = arrayList.size();
        ViewGroup viewGroup = this.f405833e;
        if (size2 < size3) {
            int size4 = arrayList.size();
            for (int size5 = arrayList2.size(); size5 < size4; size5++) {
                View viewInflate = this.f405835g.inflate(R.layout.button_flat_primary, viewGroup, false);
                TextView textView = (TextView) viewInflate;
                arrayList2.add(textView);
                viewGroup.addView(viewInflate);
                textView.setGravity(3);
            }
        }
        if (arrayList.size() < arrayList2.size() && (size = arrayList.size()) <= (iJ2 = C42745f0.J(arrayList2))) {
            while (true) {
                viewGroup.removeView((TextView) arrayList2.remove(iJ2));
                if (iJ2 == size) {
                    break;
                } else {
                    iJ2--;
                }
            }
        }
        int size6 = arrayList.size();
        for (int i12 = 0; i12 < size6; i12++) {
            TextView textView2 = (TextView) arrayList2.get(i12);
            InterfaceC42416a.C11584a c11584a = (InterfaceC42416a.C11584a) arrayList.get(i12);
            textView2.setText(c11584a.f405827a);
            textView2.setOnClickListener(new ViewOnClickListenerC39879j1(c11584a, 15));
        }
    }

    @Override // jr.InterfaceC42416a
    public final void setCloseButtonVisible(boolean z12) {
        D6.G(this.f405832d, z12);
    }
}
