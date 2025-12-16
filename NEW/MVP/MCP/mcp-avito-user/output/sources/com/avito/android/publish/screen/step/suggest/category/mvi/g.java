package com.avito.android.publish.screen.step.suggest.category.mvi;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestCategoryActor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/WizardParameter;", "child", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<WizardParameter, WizardParameter> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Navigation f242372l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Navigation navigation2) {
        super(1);
        this.f242372l = navigation2;
    }

    @Override // Y41.l
    public final WizardParameter invoke(WizardParameter wizardParameter) {
        return wizardParameter.findNodeByNavigation(this.f242372l);
    }
}
