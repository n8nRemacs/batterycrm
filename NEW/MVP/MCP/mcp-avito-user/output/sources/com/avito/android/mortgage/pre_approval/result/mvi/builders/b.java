package com.avito.android.mortgage.pre_approval.result.mvi.builders;

import JZ.o;
import JZ.p;
import X00.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.api.model.PreApprovalScoreStatus;
import com.avito.android.printable_text.PrintableText;
import g00.C40508e;
import g00.InterfaceC40507d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PreApprovalResultListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/builders/b;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/builders/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.pre_approval.result.mvi.builders.a {

    /* compiled from: PreApprovalResultListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202089a;

        static {
            int[] iArr = new int[PreApprovalScoreStatus.values().length];
            try {
                iArr[PreApprovalScoreStatus.HIGH_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreApprovalScoreStatus.CAN_IMPROVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreApprovalScoreStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f202089a = iArr;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage.pre_approval.result.mvi.builders.a
    @k
    public final List<T00.a> a(@k a.c cVar) {
        InterfaceC40507d.b bVar = cVar.f18109e;
        InterfaceC40507d interfaceC40507d = cVar.f18108d;
        com.avito.android.mortgage.pre_approval.result.list.items.timer.c cVar2 = new com.avito.android.mortgage.pre_approval.result.list.items.timer.c(bVar, interfaceC40507d);
        float fB2 = C40508e.b(interfaceC40507d);
        PrintableText printableTextC = (fB2 < 0.0f || ((double) fB2) >= 3.5d) ? com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_timer_calculations, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_timer_conclusion, new Serializable[0]);
        return C42745f0.U(cVar2, new com.avito.android.mortgage.pre_approval.list.items.title.c(printableTextC, printableTextC.toString(), true));
    }

    @Override // com.avito.android.mortgage.pre_approval.result.mvi.builders.a
    @k
    public final List<T00.a> b(@k a.b bVar) {
        int i12 = R.drawable.pre_approval_failed;
        o oVar = bVar.f18103d;
        if (oVar == null) {
            return C42745f0.U(new com.avito.android.mortgage.pre_approval.result.list.items.status.c(R.drawable.pre_approval_failed), new com.avito.android.mortgage.pre_approval.list.items.title.c("TITLE_ID", com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_error_title, new Serializable[0]), false, 4, null), new com.avito.android.mortgage.pre_approval.result.list.items.description.c(com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_error_description, new Serializable[0])));
        }
        int i13 = a.f202089a[oVar.getStatus().ordinal()];
        if (i13 == 1) {
            i12 = R.drawable.pre_approval_success;
        } else if (i13 == 2) {
            i12 = R.drawable.pre_approval_can_improve;
        } else if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.mortgage.pre_approval.result.list.items.status.c(i12), new com.avito.android.mortgage.pre_approval.list.items.title.c("TITLE_ID", com.avito.android.printable_text.b.f(oVar.getTitle()), false, 4, null));
        if (oVar.getSubtitle() != null) {
            arrayListE0.add(new com.avito.android.mortgage.pre_approval.result.list.items.description.c(com.avito.android.printable_text.b.f(oVar.getSubtitle())));
        }
        if (oVar.d() != null) {
            List<p> listD = oVar.d();
            ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
            for (p pVar : listD) {
                arrayList.add(new com.avito.android.mortgage.pre_approval.result.list.items.point.c(com.avito.android.printable_text.b.f(pVar.getText()), pVar.getText(), pVar.getIconName()));
            }
            arrayListE0.addAll(arrayList);
        }
        if (oVar.getExpandableBlock() != null) {
            arrayListE0.add(new com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.c(oVar.getExpandableBlock().getTitle(), oVar.getExpandableBlock().getDescription(), oVar.getExpandableBlock().f9037a));
        }
        return arrayListE0;
    }
}
