package dN;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.compatibility.v2.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ImvGoodsToolbarView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdN/b;", "LdN/a;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39603b implements InterfaceC39602a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f393833a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f393834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f393835c;

    public C39603b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.screen_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f393833a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.left_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f393834b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.right_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f393835c = (ImageView) viewFindViewById3;
    }

    @Override // dN.InterfaceC39602a
    public final void a(@k m mVar) {
        this.f393834b.setOnClickListener(mVar);
        this.f393835c.setOnClickListener(mVar);
    }

    @Override // dN.InterfaceC39602a
    public final void setTitle(@l String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 20) {
            str = C43066x.t0(20, str).concat("...");
        }
        this.f393833a.setText(str);
    }
}
