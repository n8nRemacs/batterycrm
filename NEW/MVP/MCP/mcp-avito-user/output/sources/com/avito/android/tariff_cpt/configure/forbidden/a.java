package com.avito.android.tariff_cpt.configure.forbidden;

import Y41.l;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.cpx.configure.levels.d;
import com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mC0.C43945a;

/* compiled from: CptForbiddenFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements l<g.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CptForbiddenFragment f297604l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CptForbiddenFragment cptForbiddenFragment) {
        super(1);
        this.f297604l = cptForbiddenFragment;
    }

    @Override // Y41.l
    public final G0 invoke(g.b bVar) {
        g.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof g.b.C9088b;
        CptForbiddenFragment cptForbiddenFragment = this.f297604l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = cptForbiddenFragment.f297589q0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
            ViewGroup viewGroup = cptForbiddenFragment.f297595w0;
            D6.w(viewGroup != null ? viewGroup : null);
        } else if (bVar2 instanceof g.b.c) {
            com.avito.android.progress_overlay.l lVar2 = cptForbiddenFragment.f297589q0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.j();
            ViewGroup viewGroup2 = cptForbiddenFragment.f297595w0;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            D6.H(viewGroup2);
            C43945a c43945a = ((g.b.c) bVar2).f297645a;
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(c43945a.f414399a, com.avito.android.lib.util.darkTheme.c.c(cptForbiddenFragment.getResources())));
            SimpleDraweeView simpleDraweeView = cptForbiddenFragment.f297591s0;
            if (simpleDraweeView == null) {
                simpleDraweeView = null;
            }
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVarB);
            aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
            aVarA.c();
            TextView textView = cptForbiddenFragment.f297592t0;
            if (textView == null) {
                textView = null;
            }
            textView.setText(c43945a.f414400b);
            TextView textView2 = cptForbiddenFragment.f297593u0;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView3 = cptForbiddenFragment.f297593u0;
            if (textView3 == null) {
                textView3 = null;
            }
            j.a(textView3, c43945a.f414401c, null);
            Button button = cptForbiddenFragment.f297594v0;
            if (button == null) {
                button = null;
            }
            button.setText(c43945a.f414402d.getTitle());
            Button button2 = cptForbiddenFragment.f297594v0;
            (button2 != null ? button2 : null).setOnClickListener(new d(3, cptForbiddenFragment, c43945a));
        } else if (bVar2 instanceof g.b.a) {
            com.avito.android.progress_overlay.l lVar3 = cptForbiddenFragment.f297589q0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.a(((g.b.a) bVar2).f297643a);
            ViewGroup viewGroup3 = cptForbiddenFragment.f297595w0;
            D6.w(viewGroup3 != null ? viewGroup3 : null);
        }
        return G0.f406611a;
    }
}
