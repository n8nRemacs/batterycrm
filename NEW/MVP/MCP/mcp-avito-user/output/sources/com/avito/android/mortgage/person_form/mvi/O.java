package com.avito.android.mortgage.person_form.mvi;

import G00.b;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PersonFormReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LG00/c;", "invoke", "(LG00/c;)LG00/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<G00.c, G00.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PersonFormInternalAction f200888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f200889m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G00.c f200890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(PersonFormInternalAction personFormInternalAction, P p12, G00.c cVar) {
        super(1);
        this.f200888l = personFormInternalAction;
        this.f200889m = p12;
        this.f200890n = cVar;
    }

    @Override // Y41.l
    public final G00.c invoke(G00.c cVar) {
        JZ.t action;
        List<String> list;
        List<String> list2;
        PersonFormInternalAction personFormInternalAction = this.f200888l;
        boolean z12 = personFormInternalAction instanceof PersonFormInternalAction.Init;
        P p12 = this.f200889m;
        if (z12) {
            PersonFormArguments personFormArguments = ((PersonFormInternalAction.Init) personFormInternalAction).f201188b;
            p12.getClass();
            return G00.c.a(this.f200890n, personFormArguments.f200856f, personFormArguments.f200855e, personFormArguments.f200858h, personFormArguments.f200857g, personFormArguments.f200852b, personFormArguments.f200853c, personFormArguments.f200854d, false, null, null, null, null, false, null, null, null, 65408);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UploadingStarted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.e.f6141a, null, 49151);
        }
        boolean z13 = personFormInternalAction instanceof PersonFormInternalAction.UploadingFailed;
        G00.c cVar2 = this.f200890n;
        if (z13) {
            p12.getClass();
            return G00.c.a(cVar2, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UploadingCompleted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.FieldUploadingStarted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.FieldUploadingFailed) {
            p12.getClass();
            return G00.c.a(cVar2, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.FieldUploadingCompleted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.LoadingStarted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.c.f6139a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.LoadingFailed) {
            ApiError apiError = ((PersonFormInternalAction.LoadingFailed) personFormInternalAction).f201192b;
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, new b.C0323b(apiError), null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.LoadingCompleted) {
            return P.b(p12, cVar2, ((PersonFormInternalAction.LoadingCompleted) personFormInternalAction).f201191b);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.ReloadingStarted) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.d.f6140a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.ReloadingFailed) {
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, b.a.f6137a, null, 49151);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.ReloadingCompleted) {
            return P.b(p12, cVar2, ((PersonFormInternalAction.ReloadingCompleted) personFormInternalAction).f201203b);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UpdateContent) {
            JZ.m mVar = ((PersonFormInternalAction.UpdateContent) personFormInternalAction).f201211b;
            p12.getClass();
            return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, mVar.getNeedCheckAccess(), mVar.getTitle(), null, mVar.getVerificationBanner(), mVar.getActionBanner(), false, null, b.a.f6137a, null, 45695);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UpdateStepsByBooleanField) {
            PersonFormInternalAction.UpdateStepsByBooleanField updateStepsByBooleanField = (PersonFormInternalAction.UpdateStepsByBooleanField) personFormInternalAction;
            String str = updateStepsByBooleanField.f201213b;
            p12.getClass();
            boolean zF2 = kotlin.jvm.internal.L.f(str, "isIncomeIncluded");
            G00.c cVar3 = this.f200890n;
            if (zF2) {
                ArrayList arrayList = new ArrayList(cVar3.f6149g);
                if (updateStepsByBooleanField.f201214c) {
                    arrayList.add("workAndIncome");
                } else {
                    arrayList.remove("workAndIncome");
                }
                list2 = arrayList;
            } else {
                list2 = cVar3.f6149g;
            }
            return G00.c.a(cVar3, null, null, null, null, null, list2, 0, false, null, null, null, null, false, null, null, null, 65503);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UpdateStepsByStringField) {
            PersonFormInternalAction.UpdateStepsByStringField updateStepsByStringField = (PersonFormInternalAction.UpdateStepsByStringField) personFormInternalAction;
            String str2 = updateStepsByStringField.f201215b;
            p12.getClass();
            boolean zF3 = kotlin.jvm.internal.L.f(str2, "isIncomeIncluded");
            G00.c cVar4 = this.f200890n;
            if (zF3) {
                ArrayList arrayList2 = new ArrayList(cVar4.f6149g);
                if (kotlin.jvm.internal.L.f(updateStepsByStringField.f201216c, "true")) {
                    arrayList2.add("workAndIncome");
                } else {
                    arrayList2.remove("workAndIncome");
                }
                list = arrayList2;
            } else {
                list = cVar4.f6149g;
            }
            return G00.c.a(cVar4, null, null, null, null, null, list, 0, false, null, null, null, null, false, null, null, null, 65503);
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.SetVerificationBannerActionEnabled) {
            boolean z14 = ((PersonFormInternalAction.SetVerificationBannerActionEnabled) personFormInternalAction).f201209b;
            p12.getClass();
            JZ.u uVar = cVar2.f6154l;
            if (uVar != null && (action = uVar.getAction()) != null) {
                return G00.c.a(cVar2, null, null, null, null, null, null, 0, false, null, null, JZ.u.a(uVar, JZ.t.a(action, !z14)), null, false, null, null, null, 64511);
            }
        } else {
            if (personFormInternalAction instanceof PersonFormInternalAction.UpdateVerificationBanner) {
                JZ.u uVar2 = ((PersonFormInternalAction.UpdateVerificationBanner) personFormInternalAction).f201217b;
                p12.getClass();
                return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, null, uVar2, null, false, null, null, null, 64511);
            }
            if (personFormInternalAction instanceof PersonFormInternalAction.UpdateContentState) {
                F00.a aVar = ((PersonFormInternalAction.UpdateContentState) personFormInternalAction).f201212b;
                p12.getClass();
                return G00.c.a(this.f200890n, null, null, null, null, null, null, 0, false, null, aVar.f4470a, null, null, aVar.f4472c, aVar.f4471b, null, null, 52735);
            }
        }
        return cVar2;
    }
}
