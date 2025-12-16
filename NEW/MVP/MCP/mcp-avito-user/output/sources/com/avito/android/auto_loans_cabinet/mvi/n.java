package com.avito.android.auto_loans_cabinet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.auto_loans_cabinet.domain.Bank;
import com.avito.android.auto_loans_cabinet.domain.e;
import com.avito.android.auto_loans_cabinet.mvi.entity.AppBarData;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import com.avito.android.auto_loans_cabinet.mvi.entity.Item;
import com.avito.android.auto_loans_cabinet.mvi.entity.ListData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: AutoLoansCabinetReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements u<AutoLoansCabinetInternalAction, AutoLoansCabinetState> {

    /* compiled from: AutoLoansCabinetReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Bank.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Bank bank = Bank.f95367b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Bank bank2 = Bank.f95367b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public n() {
    }

    public static AutoLoansCabinetState b(AutoLoansCabinetState autoLoansCabinetState, boolean z12) {
        AutoLoansCabinetState.BlanksState loanReject;
        AutoLoansCabinetState.BlanksState noLoans = autoLoansCabinetState.f95450b;
        if (noLoans instanceof AutoLoansCabinetState.BlanksState.Success.NoLoans) {
            AutoLoansCabinetState.BlanksState.Success.NoLoans noLoans2 = (AutoLoansCabinetState.BlanksState.Success.NoLoans) noLoans;
            noLoans = new AutoLoansCabinetState.BlanksState.Success.NoLoans(noLoans2.f95471e, noLoans2.f95472f, z12);
        } else {
            if (noLoans instanceof AutoLoansCabinetState.BlanksState.Success.Draft) {
                AutoLoansCabinetState.BlanksState.Success.Draft draft = (AutoLoansCabinetState.BlanksState.Success.Draft) noLoans;
                loanReject = new AutoLoansCabinetState.BlanksState.Success.Draft(draft.f95456e, draft.f95457f, draft.f95458g, draft.f95459h, z12);
            } else if (noLoans instanceof AutoLoansCabinetState.BlanksState.Success.LoanApproved) {
                AutoLoansCabinetState.BlanksState.Success.LoanApproved loanApproved = (AutoLoansCabinetState.BlanksState.Success.LoanApproved) noLoans;
                loanReject = new AutoLoansCabinetState.BlanksState.Success.LoanApproved(loanApproved.f95461e, loanApproved.f95462f, loanApproved.f95463g, loanApproved.f95464h, z12);
            } else if (noLoans instanceof AutoLoansCabinetState.BlanksState.Success.LoanReject) {
                AutoLoansCabinetState.BlanksState.Success.LoanReject loanReject2 = (AutoLoansCabinetState.BlanksState.Success.LoanReject) noLoans;
                loanReject = new AutoLoansCabinetState.BlanksState.Success.LoanReject(loanReject2.f95466e, loanReject2.f95467f, loanReject2.f95468g, loanReject2.f95469h, z12);
            }
            noLoans = loanReject;
        }
        return new AutoLoansCabinetState(noLoans);
    }

    public static List c() {
        return C42745f0.U(new Item.Title(R.string.auto_loans_cabinet_how_it_works), new Item.Space(12), e(R.string.auto_loans_cabinet_how_it_works_serivce_fully_remote_title, R.string.auto_loans_cabinet_how_it_works_serivce_fully_remote_text, "https://avito.st/static/ims/94b993cc-1bba-4917-8cba-7f92f4447a5a_fully_remote_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_how_it_works_money_on_the_card_title, R.string.auto_loans_cabinet_how_it_works_money_on_the_card_text, "https://avito.st/static/ims/1a39a6c8-0a5f-4e8d-a486-7854383b88ca_money_on_card_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_how_it_works_reduced_rate_title, R.string.auto_loans_cabinet_how_it_works_reduced_rate_text, "https://avito.st/static/ims/431cb902-8058-4483-9800-905c7b2cd882_reduced_rate_common_144x144.png"));
    }

    public static ArrayList d(com.avito.android.auto_loans_cabinet.domain.e eVar) {
        String str;
        List<com.avito.android.auto_loans_cabinet.domain.f> listA = eVar.a();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : listA) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.android.auto_loans_cabinet.domain.f fVar = (com.avito.android.auto_loans_cabinet.domain.f) obj;
            ArrayList arrayList2 = new ArrayList();
            BannerType bannerType = BannerType.f95476d;
            int i14 = eVar instanceof e.b ? R.string.auto_loans_cabinet_view_open_loan_title : R.string.auto_loans_cabinet_view_loan_title;
            int iOrdinal = fVar.f95396c.ordinal();
            if (iOrdinal == 0) {
                str = "https://avito.st/static/ims/6e18a5a1-0e9a-4737-8ad4-1a5e21acac6c_otp_bank_common_144x144.png";
            } else if (iOrdinal == 1) {
                str = "https://avito.st/static/ims/518363df-ad9d-4e4f-9042-ee59d3addf09_lokobank_48_r12_common_144x144.png";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "https://avito.st/static/ims/25f671a9-540b-4ac5-b403-bc41a60db3bc_mts_bank_common_144x144.png";
            }
            arrayList2.add(new Item.Banner(bannerType, i14, R.string.auto_loans_cabinet_view_loan_text, 2, str, true));
            if (i12 != C42745f0.J(eVar.a())) {
                arrayList2.add(new Item.Space(8));
            }
            C42745f0.h(arrayList2, arrayList);
            i12 = i13;
        }
        return arrayList;
    }

    public static Item.Banner e(int i12, int i13, String str) {
        return new Item.Banner(BannerType.f95474b, i12, i13, 4, str, false);
    }

    @Override // com.avito.android.arch.mvi.u
    public final AutoLoansCabinetState a(AutoLoansCabinetInternalAction autoLoansCabinetInternalAction, AutoLoansCabinetState autoLoansCabinetState) {
        AutoLoansCabinetState.BlanksState loanReject;
        AutoLoansCabinetInternalAction autoLoansCabinetInternalAction2 = autoLoansCabinetInternalAction;
        AutoLoansCabinetState autoLoansCabinetState2 = autoLoansCabinetState;
        if (autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.Back ? true : autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.OpenDeeplink) {
            return autoLoansCabinetState2;
        }
        if (autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.CloseLoanDetailsBottomSheet) {
            return b(autoLoansCabinetState2, false);
        }
        if (autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.OpenLoanDetailsBottomSheet) {
            return b(autoLoansCabinetState2, true);
        }
        if (autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.Loading) {
            return new AutoLoansCabinetState(AutoLoansCabinetState.BlanksState.Loading.f95452b);
        }
        if (autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.Error) {
            return new AutoLoansCabinetState(AutoLoansCabinetState.BlanksState.Error.f95451b);
        }
        if (!(autoLoansCabinetInternalAction2 instanceof AutoLoansCabinetInternalAction.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.auto_loans_cabinet.domain.e eVar = ((AutoLoansCabinetInternalAction.Content) autoLoansCabinetInternalAction2).f95443b;
        if (eVar instanceof e.d) {
            loanReject = new AutoLoansCabinetState.BlanksState.Success.NoLoans(new AppBarData("https://avito.st/static/ims/5fd6d886-9b6f-4af4-80ed-1a5348055aae_auto_loan_request_common_719x306.png", R.string.auto_loans_cabinet_no_loans_nav_bar_content_title, R.string.auto_loans_cabinet_no_loans_nav_bar_content_text, R.string.auto_loans_cabinet_no_loans_nav_bar_content_button_text), new ListData(C42745f0.h0(c(), C42745f0.h0(Collections.singletonList(new Item.Space(32)), d(eVar)))), false, 4, null);
        } else if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            loanReject = new AutoLoansCabinetState.BlanksState.Success.Draft(aVar.f95383b, aVar.f95384c, new AppBarData("https://avito.st/static/ims/a37b975f-ddcf-4621-9527-61f0536184d8_auto_loan_draft_common_408x306.png", R.string.auto_loans_cabinet_draft_nav_bar_content_title, R.string.auto_loans_cabinet_draft_nav_bar_content_text, R.string.auto_loans_cabinet_draft_nav_bar_content_button_text), new ListData(C42745f0.h0(c(), C42745f0.h0(Collections.singletonList(new Item.Space(32)), C42745f0.h0(d(eVar), C42745f0.U(new Item.Banner(BannerType.f95475c, R.string.auto_loans_cabinet_search_car_title, R.string.auto_loans_cabinet_search_car_text, 2, "https://avito.st/static/ims/e10cd6c0-cf48-449b-91f6-83dfbc1ecd34_nayti_avto_common_144x144.png", true), new Item.Space(8)))))), false, 16, null);
        } else if (eVar instanceof e.b) {
            e.b bVar = (e.b) eVar;
            long j12 = bVar.f95386b;
            int i12 = bVar.f95388d;
            loanReject = new AutoLoansCabinetState.BlanksState.Success.LoanApproved(j12, bVar.f95387c, new AppBarData("https://avito.st/static/ims/af1002b0-1cb5-4dbb-b203-7d56db82be9d_auto_loan_approved_common_408x306.png", R.string.auto_loans_cabinet_approved_loan_nav_bar_content_title, i12 == 2 ? R.string.auto_loans_cabinet_approved_loan_two_banks_applications : i12 == 3 ? R.string.auto_loans_cabinet_approved_loan_three_banks_applications : i12 > 3 ? R.string.auto_loans_cabinet_approved_loan_more_than_three_banks_applications : R.string.auto_loans_cabinet_approved_loan_single_bank_application, R.string.auto_loans_cabinet_approved_loan_nav_bar_content_button_text), new ListData(C42745f0.h0(C42745f0.U(new Item.Space(8), new Item.Banner(BannerType.f95475c, R.string.auto_loans_cabinet_search_car_title, R.string.auto_loans_cabinet_search_car_text, 2, "https://avito.st/static/ims/e10cd6c0-cf48-449b-91f6-83dfbc1ecd34_nayti_avto_common_144x144.png", true)), C42745f0.h0(d(eVar), C42745f0.h0(Collections.singletonList(new Item.Space(32)), C42745f0.U(new Item.Title(R.string.auto_loans_cabinet_what_next), new Item.Space(12), e(R.string.auto_loans_cabinet_what_next_choose_bank_title, R.string.auto_loans_cabinet_what_next_choose_bank_text, "https://avito.st/static/ims/48ec86ec-f3d7-4046-8487-989b9ed0a034_shag_1_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_what_next_sing_documents_title, R.string.auto_loans_cabinet_what_next_sing_documents_text, "https://avito.st/static/ims/4fa273a2-f988-4836-936c-692cd5e026a3_shag_2_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_what_next_receive_money_title, R.string.auto_loans_cabinet_what_next_receive_money_text, "https://avito.st/static/ims/f4bb5ae0-590a-4f31-9782-95b917862ca2_shag_3_common_144x144.png")))))), false, 16, null);
        } else {
            if (!(eVar instanceof e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            e.c cVar = (e.c) eVar;
            loanReject = new AutoLoansCabinetState.BlanksState.Success.LoanReject(cVar.f95390b, cVar.f95391c, new AppBarData("https://avito.st/static/ims/1aa63ec3-4885-4304-8e3c-b70a87488042_auto_loan_rejected_common_408x306.png", R.string.auto_loans_cabinet_rejected_loan_nav_bar_content_title, R.string.auto_loans_cabinet_rejected_loan_nav_bar_content_text, R.string.auto_loans_cabinet_rejected_loan_nav_bar_content_button_text), new ListData(C42745f0.h0(d(eVar), C42745f0.h0(Collections.singletonList(new Item.Space(32)), C42745f0.U(new Item.Title(R.string.auto_loans_cabinet_probably_this_will_help), new Item.Space(12), e(R.string.auto_loans_cabinet_probably_this_will_help_improve_credit_history_title, R.string.auto_loans_cabinet_probably_this_will_help_improve_credit_history_text, "https://avito.st/static/ims/e5050612-2a58-4e76-8618-1b66a71f7310_improve_credit_history_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_probably_this_will_help_close_credit_card_title, R.string.auto_loans_cabinet_probably_this_will_help_close_credit_card_text, "https://avito.st/static/ims/f78a0084-9f0a-47b5-98d2-b4f7e1314351_close_credit_card_common_144x144.png"), new Item.Space(8), e(R.string.auto_loans_cabinet_probably_this_will_help_request_another_amount_title, R.string.auto_loans_cabinet_probably_this_will_help_request_another_amount_text, "https://avito.st/static/ims/02b8cff3-613f-464f-80d2-e59b40b3a700_change_loan_amount_common_144x144.png"))))), false, 16, null);
        }
        return new AutoLoansCabinetState(loanReject);
    }
}
