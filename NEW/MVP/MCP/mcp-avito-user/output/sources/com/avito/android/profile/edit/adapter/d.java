package com.avito.android.profile.edit.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.V0;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvatarItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/adapter/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/edit/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f222025d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f222026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f222027c;

    public d(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f222026b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar_button_layer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
        this.f222027c = simpleDraweeView;
        Context context = view.getContext();
        Drawable drawable = context.getDrawable(R.drawable.ic_photo_camera_24);
        if (drawable != null) {
            V0.d(drawable, C35835l0.d(R.attr.constantWhite, context));
        } else {
            drawable = null;
        }
        simpleDraweeView.getHierarchy().o(drawable, 1);
    }

    @Override // com.avito.android.profile.edit.adapter.b
    public final void Wr() {
        C35949t5.a(this.f222026b).b();
    }

    @Override // com.avito.android.profile.edit.adapter.b
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f222027c.setOnClickListener(new c(0, aVar));
    }

    @Override // com.avito.android.profile.edit.adapter.b
    public final void z5(@Y61.k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f222026b);
        aVarA.d(kVar);
        aVarA.c();
    }
}
