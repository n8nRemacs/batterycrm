package com.avito.android.authorization.select_profile.adapter.profile;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/profile/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/authorization/select_profile/adapter/profile/f;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f94274b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f94275c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f94276d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f94277e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f94278f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f94279g;

    public g(@k View view) {
        super(view);
        this.f94274b = view;
        View viewFindViewById = view.findViewById(R.id.select_profile_item_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94276d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_profile_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f94277e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.select_profile_item_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f94278f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.select_profile_item_avatar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f94279g = (SimpleDraweeView) viewFindViewById4;
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    @k
    public final z<G0> A() {
        return C37722i.a(this.f94274b);
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    public final void Pv() {
        this.f94276d.setBackground(null);
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    public final void d(@l Y41.a<G0> aVar) {
        this.f94275c = aVar;
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    public final void f(@l String str) {
        I5.a(this.f94278f, str, false);
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    public final void h1(@k Image image) {
        com.avito.android.advert.item.delivery_suggests.l.w(image, C35949t5.a(this.f94279g));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f94275c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.authorization.select_profile.adapter.profile.f
    public final void setTitle(@k String str) {
        this.f94277e.setText(str);
    }
}
