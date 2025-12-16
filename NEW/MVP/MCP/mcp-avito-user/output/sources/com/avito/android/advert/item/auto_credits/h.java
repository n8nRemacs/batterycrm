package com.avito.android.advert.item.auto_credits;

import Me.n;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAutoLoansView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/auto_credits/h;", "Lcom/avito/android/advert/item/auto_credits/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f72902c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f72903d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f72904e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f72901b = textView;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        this.f72902c = textView2;
        View viewFindViewById3 = view.findViewById(R.id.icon_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById3;
        this.f72903d = frameLayout;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(frameLayout.getContext());
        Resources resources = view.getContext().getResources();
        this.f72904e = new n(layoutInflaterFrom, resources.getDimensionPixelSize(R.dimen.auto_loans_icon_size), resources.getDimensionPixelSize(R.dimen.auto_loans_icon_overlay), resources.getDimensionPixelSize(R.dimen.auto_loans_icon_border));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        if (linkMovementMethod != null) {
            textView.setMovementMethod(linkMovementMethod);
            textView2.setMovementMethod(linkMovementMethod);
        }
    }

    @Override // com.avito.android.advert.item.auto_credits.g
    public final void L60(@l List<UniversalImage> list, @l List<Image> list2) {
        this.f72904e.b(this.f72903d, list, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()), list2);
    }

    @Override // com.avito.android.advert.item.auto_credits.g
    public final void R(@l AttributedText attributedText) {
        j.a(this.f72902c, attributedText, null);
    }

    @Override // com.avito.android.advert.item.auto_credits.g
    public final void b(@l String str) {
        I5.a(this.f72901b, str, false);
    }
}
