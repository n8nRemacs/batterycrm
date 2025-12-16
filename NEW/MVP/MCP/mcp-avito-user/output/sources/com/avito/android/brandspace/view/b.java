package com.avito.android.brandspace.view;

import Y41.l;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.view.BrandspaceFragment;
import com.avito.android.error.z;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BrandspaceFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/brandspace/remote/model/Brandspace;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<P2<? super Brandspace>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BrandspaceFragment f107786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f107787m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BrandspaceFragment brandspaceFragment, h hVar) {
        super(1);
        this.f107786l = brandspaceFragment;
        this.f107787m = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super Brandspace> p22) {
        P2<? super Brandspace> p23 = p22;
        BrandspaceFragment.a aVar = BrandspaceFragment.f107771D0;
        BrandspaceFragment brandspaceFragment = this.f107786l;
        boolean z12 = p23 instanceof P2.b;
        h hVar = this.f107787m;
        com.avito.android.progress_overlay.l lVar = hVar.f107801j;
        if (z12) {
            WeakReference weakReference = new WeakReference(brandspaceFragment);
            P2.b bVar = (P2.b) p23;
            String logoUrl = ((Brandspace) bVar.f318720a).getLogoUrl();
            if (logoUrl == null) {
                logoUrl = "";
            }
            boolean zA2 = com.avito.android.lib.util.darkTheme.c.a(brandspaceFragment.requireContext());
            T t12 = bVar.f318720a;
            if (zA2) {
                String logoUrlDark = ((Brandspace) t12).getLogoUrlDark();
                logoUrl = logoUrlDark != null ? logoUrlDark : "";
            }
            hVar.d(logoUrl, brandspaceFragment.f107774C0, ((Brandspace) t12).getHideDefaultLogo(), new d(weakReference));
            lVar.j();
        } else if (L.f(p23, P2.c.f318721a)) {
            lVar.k(null);
        } else if (p23 instanceof P2.a) {
            lVar.a(z.k(((P2.a) p23).f318719a));
        }
        return G0.f406611a;
    }
}
