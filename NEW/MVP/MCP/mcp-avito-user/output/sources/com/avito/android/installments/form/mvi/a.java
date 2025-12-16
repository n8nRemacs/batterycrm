package com.avito.android.installments.form.mvi;

import WN.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.credits.di.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.avito.android.deep_linking.x;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormState;
import com.google.gson.Gson;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InstallmentsFormActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installments/form/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LWN/a;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<WN.a, InstallmentsFormInternalAction, InstallmentsFormState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Boolean f172719a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.installments.form.j f172720b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UxFeedbackActions f172721c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f172722d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Gson f172723e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UN.a f172724f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f172725g = C42727D.c(b.f172728l);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f172726h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedList f172727i = new LinkedList();

    /* compiled from: InstallmentsFormActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.installments.form.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5092a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: InstallmentsFormActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f172728l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            com.google.gson.d dVar = new com.google.gson.d();
            dVar.f361995j = true;
            return dVar.a();
        }
    }

    @Inject
    public a(@Y61.l @p Boolean bool, @Y61.k com.avito.android.installments.form.j jVar, @Y61.l UxFeedbackActions uxFeedbackActions, @Y61.k x xVar, @Y61.k Gson gson, @Y61.k UN.a aVar) {
        this.f172719a = bool;
        this.f172720b = jVar;
        this.f172721c = uxFeedbackActions;
        this.f172722d = xVar;
        this.f172723e = gson;
        this.f172724f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.installments.form.mvi.a r4, kotlinx.coroutines.flow.InterfaceC43172j r5, java.lang.String r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof com.avito.android.installments.form.mvi.d
            if (r0 == 0) goto L16
            r0 = r8
            com.avito.android.installments.form.mvi.d r0 = (com.avito.android.installments.form.mvi.d) r0
            int r1 = r0.f172745u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f172745u = r1
            goto L1b
        L16:
            com.avito.android.installments.form.mvi.d r0 = new com.avito.android.installments.form.mvi.d
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.f172743s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f172745u
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowPostMessageDialog r4 = r0.f172742r
            com.avito.android.installments.form.mvi.a r5 = r0.f172741q
            kotlin.C42729a0.b(r8)
            r7 = r4
            r4 = r5
            goto L82
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C42729a0.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "{type:'"
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r6 = "',result:"
            r8.append(r6)
            r8.append(r7)
            r6 = 125(0x7d, float:1.75E-43)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.google.gson.i r6 = com.google.gson.l.b(r6)
            com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowPostMessageDialog r7 = new com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowPostMessageDialog
            kotlin.C r8 = r4.f172725g
            java.lang.Object r8 = r8.getValue()
            com.google.gson.Gson r8 = (com.google.gson.Gson) r8
            java.lang.String r6 = r8.j(r6)
            r7.<init>(r6)
            java.util.LinkedList r6 = r4.f172727i
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L82
            r0.f172741q = r4
            r0.f172742r = r7
            r0.f172745u = r3
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r1) goto L82
            goto L89
        L82:
            java.util.LinkedList r4 = r4.f172727i
            r4.add(r7)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installments.form.mvi.a.c(com.avito.android.installments.form.mvi.a, kotlinx.coroutines.flow.j, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InstallmentsFormInternalAction> b(WN.a aVar, InstallmentsFormState installmentsFormState) {
        InterfaceC43160i<InstallmentsFormInternalAction> interfaceC43160iW;
        WN.a aVar2 = aVar;
        InstallmentsFormState installmentsFormState2 = installmentsFormState;
        boolean zEquals = aVar2 instanceof a.i ? true : aVar2.equals(a.C1268a.f17891a);
        ArrayList arrayList = this.f172726h;
        if (zEquals) {
            return new C43210w(!L.f(this.f172719a, Boolean.FALSE) ? InstallmentsFormInternalAction.ShowCancellationDialog.f172757b : new InstallmentsFormInternalAction.CloseScreenWithCancelResult(arrayList));
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new InstallmentsFormInternalAction.CloseScreenWithCancelResult(arrayList));
        }
        if (aVar2 instanceof a.j) {
            interfaceC43160iW = new C43210w(new InstallmentsFormInternalAction.TryToOpenCamera(((a.j) aVar2).f17901a));
        } else if (aVar2 instanceof a.b) {
            interfaceC43160iW = new C43210w(new InstallmentsFormInternalAction.TryToOpenCamera(((a.b) aVar2).f17892a));
        } else {
            if (aVar2 instanceof a.c) {
                return new C43210w(InstallmentsFormInternalAction.ShowPermissionToast.f172760b);
            }
            if (aVar2 instanceof a.d) {
                DeepLink deepLink = ((a.d) aVar2).f17894a;
                return new C43207v(new InstallmentsFormInternalAction[]{new InstallmentsFormInternalAction.HandleDeeplink(deepLink), deepLink instanceof EmptyDeepLink ? new InstallmentsFormInternalAction.CloseScreenWithCancelResult(arrayList) : InstallmentsFormInternalAction.CloseScreenWithSuccessResult.f172753b});
            }
            if (aVar2 instanceof a.f) {
                return C43175k.G(new c(installmentsFormState2, this, null));
            }
            if (aVar2 instanceof a.k) {
                int iOrdinal = ((a.k) aVar2).f17902a.f392937a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return new C43210w(InstallmentsFormInternalAction.ShowContent.f172758b);
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            return new C43210w(new InstallmentsFormInternalAction.ShowUrlWebLoadingError(installmentsFormState2.f172769b));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new C43210w(InstallmentsFormInternalAction.ShowLoading.f172759b);
            }
            if (aVar2 instanceof a.h) {
                a.h hVar = (a.h) aVar2;
                return C43175k.I(C43262l0.f411945a, C43175k.G(new com.avito.android.installments.form.mvi.b(this, hVar.f17898a, hVar.f17899b, null)));
            }
            if (!(aVar2 instanceof a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedList linkedList = this.f172727i;
            linkedList.poll();
            InstallmentsFormInternalAction.ShowPostMessageDialog showPostMessageDialog = (InstallmentsFormInternalAction.ShowPostMessageDialog) linkedList.peek();
            if (showPostMessageDialog != null) {
                return new C43210w(showPostMessageDialog);
            }
            interfaceC43160iW = C43175k.w();
        }
        return interfaceC43160iW;
    }
}
