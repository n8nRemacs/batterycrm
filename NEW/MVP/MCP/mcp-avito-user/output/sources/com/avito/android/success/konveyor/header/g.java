package com.avito.android.success.konveyor.header;

import Y61.k;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.success.models.AnimationUrl;
import kotlin.Metadata;

/* compiled from: SuccessHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success/konveyor/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/success/konveyor/header/f;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AnimationView f291645b;

    public g(@k AnimationView animationView) {
        super(animationView);
        this.f291645b = animationView;
        animationView.setRepeatCount(-1);
    }

    @Override // com.avito.android.success.konveyor.header.f
    public final void ll(@k AnimationUrl animationUrl) {
        AnimationView animationView = this.f291645b;
        animationView.setAnimationData(new AnimationView.a.e(animationUrl.a(com.avito.android.lib.util.darkTheme.c.b(animationView.getContext())), null, null, 6, null));
    }
}
