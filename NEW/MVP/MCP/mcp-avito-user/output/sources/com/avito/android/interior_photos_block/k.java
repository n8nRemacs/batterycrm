package com.avito.android.interior_photos_block;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.O0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import vN0.C49240a;

/* compiled from: InteriorPhotoBlockViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/interior_photos_block/k;", "Lcom/avito/android/interior_photos_block/b;", "LiO/d;", VoiceInfo.STATE, "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f173052a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public com.avito.android.interior_photos_block.mvi.l f173053b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f173054c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final O0 f173055d = new O0(m0.f406844a.b(com.avito.android.interior_photos_block.mvi.k.class), new h(this), new j(this), null, 8, null);

    public k(@Y61.k ViewGroup viewGroup, @Y61.k m mVar) {
        this.f173052a = viewGroup;
        this.f173054c = C42727D.c(new f(0, viewGroup, C49240a.class, "findClosestViewModelStoreOwner", "findClosestViewModelStoreOwner(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", 1));
        com.avito.android.interior_photos_block.di.a.a().a(mVar).a(this);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 0, 6, null);
        viewGroup.addView(composeView, new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new C22096n(-392094829, new e(this), true));
    }
}
