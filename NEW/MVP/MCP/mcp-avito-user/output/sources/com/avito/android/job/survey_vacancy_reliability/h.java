package com.avito.android.job.survey_vacancy_reliability;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.job.survey_vacancy_reliability.h;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobSurveyVacancyReliabilityDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/survey_vacancy_reliability/h;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_survey-vacancy-reliability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f174690R = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f174691E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final String f174692F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final String f174693G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final String f174694H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final String f174695I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ArrayList f174696J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final View f174697K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final Chips f174698L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final View f174699M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Chips f174700N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final View f174701O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final Input f174702P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final View f174703Q;

    /* compiled from: JobSurveyVacancyReliabilityDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "it", "", "invoke", "(Lcom/avito/android/lib/design/chips/h;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.lib.design.chips.h, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f174704l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(com.avito.android.lib.design.chips.h hVar) {
            return hVar.getF262141c();
        }
    }

    /* compiled from: JobSurveyVacancyReliabilityDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "it", "", "invoke", "(Lcom/avito/android/lib/design/chips/h;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.lib.design.chips.h, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f174705l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(com.avito.android.lib.design.chips.h hVar) {
            return hVar.getF262141c();
        }
    }

    public h(@Y61.k Context context, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        super(context, 0, 2, null);
        this.f174691E = interfaceC28373a;
        this.f174692F = str;
        this.f174693G = str2;
        this.f174694H = str3;
        this.f174695I = str4;
        ArrayList arrayListV = V(C42745f0.U(context.getString(R.string.survey_yes), context.getString(R.string.survey_no), context.getString(R.string.survey_cannot)));
        ArrayList arrayListV2 = V(C42745f0.U(context.getString(R.string.survey_salary), context.getString(R.string.survey_condition), context.getString(R.string.survey_schedule), context.getString(R.string.survey_employee), context.getString(R.string.survey_location), context.getString(R.string.survey_other)));
        this.f174696J = arrayListV2;
        setContentView(R.layout.survey_vacancy_reliability_layout);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.j.c(this, null, false, 0, 0, 0, 121);
        com.avito.android.lib.util.g.a(this);
        this.f174697K = findViewById(R.id.first_q);
        Chips chips = (Chips) findViewById(R.id.first_chips);
        this.f174698L = chips;
        this.f174699M = findViewById(R.id.second_q);
        Chips chips2 = (Chips) findViewById(R.id.second_chips);
        this.f174700N = chips2;
        this.f174701O = findViewById(R.id.third_q);
        this.f174702P = (Input) findViewById(R.id.third_input);
        View viewFindViewById = findViewById(R.id.send_button);
        this.f174703Q = viewFindViewById;
        chips.setData(arrayListV);
        chips2.setData(arrayListV2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.job.survey_vacancy_reliability.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h hVar = this.f174689b;
                String strO = C42745f0.O(hVar.f174698L.s(), "", null, null, h.a.f174704l, 30);
                String strO2 = C42745f0.O(hVar.f174700N.s(), null, "[", "]", h.b.f174705l, 25);
                Editable editableM53getText = hVar.f174702P.m53getText();
                String string = editableM53getText != null ? editableM53getText.toString() : null;
                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, hVar, com.avito.android.printable_text.b.f(hVar.getContext().getString(R.string.survey_toast)), null, null, 0, null, 1022);
                hVar.f174691E.c(new k(hVar.f174692F, hVar.f174693G, hVar.f174694H, hVar.f174695I, strO, strO2, string));
                hVar.r();
            }
        });
        chips.setChipsSelectedListener(new c());
        chips2.setChipsSelectedListener(new d());
        View viewFindViewById2 = findViewById(R.id.loading);
        viewFindViewById2.postDelayed(new RunnableC28882d(12, viewFindViewById2, this), 50L);
        interfaceC28373a.c(new j(str, str4));
    }

    public static ArrayList V(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new i((String) it.next()));
        }
        return arrayList;
    }

    /* compiled from: JobSurveyVacancyReliabilityDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/job/survey_vacancy_reliability/h$c", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_job_survey-vacancy-reliability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Chips.c {
        public c() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            h hVar2 = h.this;
            D6.H(hVar2.f174703Q);
            boolean zV1 = hVar.V1(new i(hVar2.getContext().getString(R.string.survey_no)));
            View view = hVar2.f174699M;
            Input input = hVar2.f174702P;
            View view2 = hVar2.f174701O;
            Chips chips = hVar2.f174700N;
            if (!zV1) {
                D6.w(view);
                D6.w(chips);
                D6.w(view2);
                D6.w(input);
                return;
            }
            D6.H(view);
            D6.H(chips);
            com.avito.android.lib.design.chips.h hVar3 = !((ArrayList) chips.s()).isEmpty() ? (com.avito.android.lib.design.chips.h) C42745f0.E(chips.s()) : null;
            if (hVar3 != null ? hVar3.V1(new i(hVar2.getContext().getString(R.string.survey_other))) : false) {
                D6.H(view2);
                D6.H(input);
            } else {
                D6.w(view2);
                D6.w(input);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: JobSurveyVacancyReliabilityDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/job/survey_vacancy_reliability/h$d", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_job_survey-vacancy-reliability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Chips.c {
        public d() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            int i12 = h.f174690R;
            h hVar2 = h.this;
            boolean zV1 = hVar.V1(new i(hVar2.getContext().getString(R.string.survey_other)));
            Input input = hVar2.f174702P;
            View view = hVar2.f174701O;
            Chips chips = hVar2.f174700N;
            if (!zV1) {
                chips.setSelectStrategy(SelectStrategy.f178717c);
                D6.w(view);
                D6.w(input);
            } else {
                chips.setSelectStrategy(SelectStrategy.f178716b);
                if (((ArrayList) chips.s()).size() > 1) {
                    chips.j();
                    chips.p(C42745f0.J(hVar2.f174696J), false);
                }
                D6.H(view);
                D6.H(input);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
