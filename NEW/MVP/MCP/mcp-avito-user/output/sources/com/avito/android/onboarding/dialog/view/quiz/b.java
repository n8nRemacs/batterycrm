package com.avito.android.onboarding.dialog.view.quiz;

import C40.a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.onboarding.dialog.di.i;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.onboarding.dialog.view.quiz.f;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.onboarding.AnswersType;
import com.avito.android.remote.model.onboarding.QuizQuestion;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingQuizPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/quiz/b;", "Lcom/avito/android/onboarding/dialog/view/quiz/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.onboarding.dialog.view.quiz.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A40.a f209041a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f209042b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.l<C40.a, G0> f209043c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f209044d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public OnboardingQuizItem f209045e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public f f209046f;

    /* compiled from: OnboardingQuizPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ OnboardingQuizItem f209047l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f209048m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OnboardingQuizItem onboardingQuizItem, b bVar) {
            super(2);
            this.f209047l = onboardingQuizItem;
            this.f209048m = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            boolean zBooleanValue = bool.booleanValue();
            OnboardingQuizItem onboardingQuizItem = this.f209047l;
            List<AnswerChipable> list = onboardingQuizItem.f209032c;
            AnswerChipable answerChipable = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    AnswerChipable answerChipable2 = (AnswerChipable) next;
                    AnswerChipable answerChipable3 = (AnswerChipable) hVar2;
                    if (L.f(answerChipable2.f209029d, answerChipable3.f209029d) && L.f(answerChipable2.f209028c, answerChipable3.f209028c)) {
                        answerChipable = next;
                        break;
                    }
                }
                answerChipable = answerChipable;
            }
            if (answerChipable != null) {
                answerChipable.f209030e = zBooleanValue;
                this.f209048m.f209043c.invoke(new a.c(answerChipable.f209027b, onboardingQuizItem.f209031b, zBooleanValue));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k A40.a aVar, @i @l String str, @k Y41.l<? super C40.a, G0> lVar) {
        this.f209041a = aVar;
        this.f209042b = str;
        this.f209043c = lVar;
        this.f209044d = new ArrayList();
    }

    @Override // D40.d
    public final void a() {
        this.f209046f = null;
    }

    @Override // com.avito.android.onboarding.dialog.view.quiz.a
    public final void b() {
        ArrayList arrayList = this.f209044d;
        int iIndexOf = arrayList.indexOf(this.f209045e) + 1;
        if (iIndexOf >= arrayList.size()) {
            this.f209043c.invoke(a.d.f1912a);
            return;
        }
        h((OnboardingQuizItem) arrayList.get(iIndexOf));
        f fVar = this.f209046f;
        if (fVar != null) {
            fVar.a(iIndexOf == 0);
        }
    }

    @Override // com.avito.android.onboarding.dialog.view.quiz.a
    public final void d(@k f fVar) {
        this.f209046f = fVar;
    }

    @Override // com.avito.android.onboarding.dialog.view.quiz.a
    public final void f(@k OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem) {
        ArrayList arrayList = this.f209044d;
        arrayList.clear();
        ArrayList arrayList2 = onboardingResultQuizItem.f208917b;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((OnboardingQuizItem) it.next());
            }
        }
    }

    @Override // D40.d
    public final void fa() {
        OnboardingQuizItem onboardingQuizItem = (OnboardingQuizItem) C42745f0.E(this.f209044d);
        this.f209041a.a(this.f209042b);
        h(onboardingQuizItem);
        f fVar = this.f209046f;
        if (fVar != null) {
            fVar.a(true);
        }
    }

    @Override // com.avito.android.onboarding.dialog.view.quiz.a
    public final void g() {
        ArrayList arrayList = this.f209044d;
        int iIndexOf = arrayList.indexOf(this.f209045e) - 1;
        if (iIndexOf >= 0) {
            h((OnboardingQuizItem) arrayList.get(iIndexOf));
            f fVar = this.f209046f;
            if (fVar != null) {
                fVar.a(iIndexOf == 0);
            }
        }
    }

    public final void h(OnboardingQuizItem onboardingQuizItem) {
        List<AnswerChipable> list;
        f fVar = this.f209046f;
        if (fVar != null) {
            this.f209045e = onboardingQuizItem;
            AttributedText attributedText = onboardingQuizItem.f209039j;
            View view = fVar.f209054a;
            Context context = view.getContext();
            com.avito.android.util.text.a aVar = fVar.f209055b;
            fVar.f209060g.setText(aVar.c(context, attributedText));
            boolean zF2 = L.f(onboardingQuizItem.f209035f, Boolean.TRUE);
            Button button = fVar.f209062i;
            button.setLoading(zF2);
            OnboardingQuizItem onboardingQuizItem2 = this.f209045e;
            Chips chips = fVar.f209061h;
            if (onboardingQuizItem2 != null && (list = onboardingQuizItem2.f209032c) != null) {
                QuizQuestion quizQuestion = onboardingQuizItem2.f209037h;
                AnswersType type = quizQuestion != null ? quizQuestion.getType() : null;
                a aVar2 = new a(onboardingQuizItem, this);
                int i12 = type == null ? -1 : f.a.f209064a[type.ordinal()];
                chips.setSelectStrategy(i12 != 1 ? i12 != 2 ? SelectStrategy.f178717c : SelectStrategy.f178717c : SelectStrategy.f178716b);
                chips.j();
                chips.setData(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((AnswerChipable) obj).f209030e) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    chips.q((AnswerChipable) it.next(), true);
                }
                chips.setChipsSelectedListener(new g(aVar2, fVar));
            }
            Context context2 = view.getContext();
            AttributedText attributedText2 = onboardingQuizItem.f209038i;
            fVar.f209059f.setText(aVar.c(context2, attributedText2));
            String str = onboardingQuizItem.f209033d;
            if (str != null) {
                button.setEnabled(!((ArrayList) chips.s()).isEmpty());
                button.setText(str);
                button.setOnClickListener(new j(1, fVar, onboardingQuizItem));
            }
            UniversalImage universalImage = onboardingQuizItem.f209040k;
            int i13 = universalImage != null ? 0 : 8;
            SimpleDraweeView simpleDraweeView = fVar.f209063j;
            simpleDraweeView.setVisibility(i13);
            simpleDraweeView.setAspectRatio(1.875f);
            C35949t5.c(fVar.f209063j, com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(view, universalImage) : null), null, null, null, 14);
            StringBuilder sb2 = new StringBuilder();
            AttributedText attributedText3 = onboardingQuizItem.f209039j;
            sb2.append(attributedText3 != null ? attributedText3.getText() : null);
            sb2.append(attributedText2 != null ? attributedText2.getText() : null);
            this.f209041a.c(Integer.valueOf(this.f209044d.indexOf(this.f209045e) + 1), sb2.toString());
        }
    }

    public /* synthetic */ b(A40.a aVar, String str, Y41.l lVar, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : str, lVar);
    }
}
