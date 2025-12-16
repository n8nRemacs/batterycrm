package com.avito.android.verification.verification_confirm_requisites.mvi;

import LM0.a;
import LM0.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.error.z;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.n;
import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConfirmRequisitesActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLM0/a;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "LLM0/c;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<LM0.a, ConfirmRequisitesInternalAction, LM0.c> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f324956e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationConfirmRequisitesArgs f324957a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324958b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_confirm_requisites.b f324959c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.n f324960d;

    /* compiled from: ConfirmRequisitesActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/a$a;", "", "<init>", "()V", "", "ACTION_BUTTON_ID", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.verification_confirm_requisites.mvi.a$a, reason: collision with other inner class name */
    public static final class C10052a {
        public /* synthetic */ C10052a(C42822w c42822w) {
            this();
        }

        public C10052a() {
        }
    }

    static {
        new C10052a(null);
    }

    @Inject
    public a(@Y61.k VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_confirm_requisites.b bVar, @Y61.k com.avito.android.verification.inn.n nVar) {
        this.f324957a = verificationConfirmRequisitesArgs;
        this.f324958b = aVar;
        this.f324959c = bVar;
        this.f324960d = nVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ConfirmRequisitesInternalAction> b(LM0.a aVar, LM0.c cVar) {
        C43210w c43210w;
        a.C10030a c10030a;
        LM0.a aVar2 = aVar;
        LM0.c cVar2 = cVar;
        if (aVar2.equals(a.g.f9929a)) {
            return this.f324959c.a(this.f324957a.f324890b);
        }
        if (aVar2.equals(a.C0611a.f9924a)) {
            c43210w = ((cVar2 instanceof c.b) && ((c.b) cVar2).f9936b) ? new C43210w(new ConfirmRequisitesInternalAction.FinishActivity()) : new C43210w(new ConfirmRequisitesInternalAction.NavigateBack());
        } else {
            if (aVar2 instanceof a.e) {
                return C43175k.G(new b(this, aVar2, null));
            }
            if (aVar2 instanceof a.c) {
                ButtonItem buttonItem = ((a.c) aVar2).f9927a;
                if (buttonItem.f323905f) {
                    c43210w = new C43210w(new ConfirmRequisitesInternalAction.DoNothing());
                } else {
                    if (!L.f(buttonItem.f323901b, "ACTION_BUTTON_ID")) {
                        return C43175k.G(new c(this, aVar2, null));
                    }
                    c.b bVar = cVar2 instanceof c.b ? (c.b) cVar2 : null;
                    ArrayList arrayList = (bVar == null || (c10030a = bVar.f9937c) == null) ? null : c10030a.f323872a;
                    if (arrayList != null) {
                        ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading = new ConfirmRequisitesInternalAction.SetButtonLoading(buttonItem, true);
                        ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading2 = new ConfirmRequisitesInternalAction.SetButtonLoading(buttonItem, false);
                        this.f324960d.getClass();
                        n.a aVarA = com.avito.android.verification.inn.n.a(arrayList);
                        if (aVarA instanceof n.a.C10034a) {
                            return C43175k.G(new e(aVarA, null));
                        }
                        if (aVarA instanceof n.a.b) {
                            return C43175k.G(new f(this, aVarA, setButtonLoading, setButtonLoading2, null));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    c43210w = new C43210w(new ConfirmRequisitesInternalAction.ShowErrorToast(z.l(new UnknownError())));
                }
            } else {
                if (!(aVar2 instanceof a.d ? true : aVar2 instanceof a.f)) {
                    if (aVar2 instanceof a.h) {
                        return C43175k.G(new d(aVar2, null));
                    }
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.b bVar2 = (a.b) aVar2;
                    return new C43210w(new ConfirmRequisitesInternalAction.BottomSheetItemSelect(bVar2.f9925a, bVar2.f9926b));
                }
                c43210w = new C43210w(new ConfirmRequisitesInternalAction.UpdateListState());
            }
        }
        return c43210w;
    }
}
