package com.avito.android.advert.item.select.controls;

import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.auto_select.AutoSelectContactMeModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectControlsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectControlsItem f79396l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f79397m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutoSelectControlsItem autoSelectControlsItem, b bVar) {
        super(1);
        this.f79396l = autoSelectControlsItem;
        this.f79397m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        AutoSelectContactMeModel autoSelectContactMeModel = this.f79396l.f79395h;
        b bVar = this.f79397m;
        Long lValueOf = autoSelectContactMeModel != null ? Long.valueOf(bVar.f79400d.a(autoSelectContactMeModel)) : null;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        if (lValueOf != null) {
            bVarT.add(new Q("content_bag_contact_me_id_arg", lValueOf));
        }
        bVarT.add(new Q("advert_id_arg", bVar.f79398b));
        Q[] qArr = (Q[]) C42745f0.p(bVarT).toArray(new Q[0]);
        b.a.a(bVar.f79399c, deepLink2, null, C22777e.b((Q[]) Arrays.copyOf(qArr, qArr.length)), 2);
        return G0.f406611a;
    }
}
