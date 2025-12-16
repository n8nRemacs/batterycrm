package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/deep_linking/links/DeepLink;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class C<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts_common.ux_feedback.a f312228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312229c;

    public C(UserAdvertsHostFragment userAdvertsHostFragment, com.avito.android.user_adverts_common.ux_feedback.a aVar) {
        this.f312228b = aVar;
        this.f312229c = userAdvertsHostFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        List<? extends DeepLink> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (T t12 : list) {
            if (!(((DeepLink) t12) instanceof UxFeedbackStartCampaignLink)) {
                arrayList.add(t12);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserAdvertsHostFragment.G5(this.f312229c, (DeepLink) it.next());
        }
        this.f312228b.a(list);
        return G0.f406611a;
    }
}
