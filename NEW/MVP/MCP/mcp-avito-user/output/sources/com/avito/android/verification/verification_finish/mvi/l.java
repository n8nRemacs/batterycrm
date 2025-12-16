package com.avito.android.verification.verification_finish.mvi;

import QM0.c;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.VerificationFinishResult;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.verification.verification_finish.d;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import com.avito.android.verification.verification_finish.p;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: FinishReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "LQM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<FinishInternalAction, QM0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_finish.d f325299b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f325300c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325301d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325302e = true;

    @Inject
    public l(@Y61.k com.avito.android.verification.verification_finish.d dVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f325299b = dVar;
        this.f325300c = interfaceC35741a1;
        this.f325301d = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final QM0.c a(FinishInternalAction finishInternalAction, QM0.c cVar) {
        ArrayList arrayList;
        DeepLink noMatchLink;
        DeepLink noMatchLink2;
        FinishInternalAction finishInternalAction2 = finishInternalAction;
        QM0.c cVar2 = cVar;
        if (finishInternalAction2.equals(FinishInternalAction.Close.f325282b)) {
            return cVar2;
        }
        if (finishInternalAction2 instanceof FinishInternalAction.Error) {
            return new c.a(InterfaceC35741a1.a.a(this.f325300c, ((FinishInternalAction.Error) finishInternalAction2).f325283b, null, null, 6));
        }
        if (!(finishInternalAction2 instanceof FinishInternalAction.Loaded)) {
            if (finishInternalAction2 instanceof FinishInternalAction.Loading) {
                return c.C0901c.f13701b;
            }
            if (!(finishInternalAction2 instanceof FinishInternalAction.OpenDeeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.f325302e) {
                return cVar2;
            }
            this.f325302e = false;
            b.a.a(this.f325301d, ((FinishInternalAction.OpenDeeplink) finishInternalAction2).f325286b, null, null, 6);
            return cVar2;
        }
        com.avito.android.verification.verification_finish.d dVar = this.f325299b;
        dVar.getClass();
        VerificationFinishResult verificationFinishResult = ((FinishInternalAction.Loaded) finishInternalAction2).f325285b;
        String title = verificationFinishResult.getTitle();
        String str = title == null ? "" : title;
        AttributedText subtitle = verificationFinishResult.getSubtitle();
        List<VerificationListItem> items = verificationFinishResult.getItems();
        if (items != null) {
            List<VerificationListItem> list = items;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (VerificationListItem verificationListItem : list) {
                dVar.f325244a.getClass();
                arrayList.add(com.avito.android.verification.common.a.a(verificationListItem));
            }
        } else {
            arrayList = null;
        }
        List list2 = arrayList == null ? C42784z0.f406748b : arrayList;
        VerificationAction action = verificationFinishResult.getAction();
        String title2 = action != null ? action.getTitle() : null;
        if (title2 == null) {
            title2 = "";
        }
        VerificationAction action2 = verificationFinishResult.getAction();
        if (action2 == null || (noMatchLink = action2.getUri()) == null) {
            noMatchLink = new NoMatchLink();
        }
        VerificationAction action3 = verificationFinishResult.getAction();
        VerificationAction.Style style = action3 != null ? action3.getStyle() : null;
        int i12 = style == null ? -1 : d.a.f325245a[style.ordinal()];
        p.a aVar = new p.a(i12 != 1 ? i12 != 2 ? R.attr.buttonPrimaryLarge : R.attr.buttonDefaultLarge : R.attr.buttonSecondaryLarge, noMatchLink, title2);
        VerificationAction secondAction = verificationFinishResult.getSecondAction();
        String title3 = secondAction != null ? secondAction.getTitle() : null;
        String str2 = title3 != null ? title3 : "";
        VerificationAction secondAction2 = verificationFinishResult.getSecondAction();
        if (secondAction2 == null || (noMatchLink2 = secondAction2.getUri()) == null) {
            noMatchLink2 = new NoMatchLink();
        }
        VerificationAction secondAction3 = verificationFinishResult.getSecondAction();
        VerificationAction.Style style2 = secondAction3 != null ? secondAction3.getStyle() : null;
        int i13 = style2 == null ? -1 : d.a.f325245a[style2.ordinal()];
        p.a aVar2 = new p.a(i13 != 1 ? i13 != 2 ? R.attr.buttonPrimaryLarge : R.attr.buttonDefaultLarge : R.attr.buttonSecondaryLarge, noMatchLink2, str2);
        Boolean isClosable = verificationFinishResult.getIsClosable();
        return new c.b(new p(str, subtitle, list2, aVar, aVar2, isClosable != null ? isClosable.booleanValue() : false));
    }
}
