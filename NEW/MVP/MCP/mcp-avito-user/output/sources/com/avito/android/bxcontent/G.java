package com.avito.android.bxcontent;

import Cm0.C13324a;
import Cm0.InterfaceC13325b;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.mvi.entity.g;
import com.avito.android.remote.model.BxContentBusiness360;
import kotlin.Metadata;
import qK0.C47313c;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g.C f109332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109333m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(BxContentFragment bxContentFragment, g.C c12) {
        super(0);
        this.f109332l = c12;
        this.f109333m = bxContentFragment;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        BxContentBusiness360.ReplaceMain replaceMain = ((g.N) this.f109332l).f112217c;
        BxContentBusiness360.ReplaceMain.Onboarding onboarding = replaceMain != null ? replaceMain.getOnboarding() : null;
        if (onboarding != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            C47313c c47313c = this.f109333m.f108999e5;
            kotlin.reflect.n<Object> nVar = BxContentFragment.f108887w5[1];
            ((InterfaceC13325b) c47313c.a()).a(new C13324a(onboarding.getTitle(), onboarding.getSubtitle(), new C13324a.b(onboarding.getConfirmButton().getText(), onboarding.getConfirmButton().getClearShowId()), new C13324a.C0123a(onboarding.getCancelButton().getText()), onboarding.getShowId(), onboarding.getShowCount(), onboarding.getPriority(), onboarding.getShowDelayMs()));
        }
        return kotlin.G0.f406611a;
    }
}
