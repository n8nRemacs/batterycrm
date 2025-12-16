package com.avito.android.comfortable_deal.stages_transition.mvi.builder;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: StagesTransitionStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/mvi/builder/b;", "Lcom/avito/android/comfortable_deal/stages_transition/mvi/builder/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal.stages_transition.mvi.builder.a {

    /* compiled from: StagesTransitionStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122969a;

        static {
            int[] iArr = new int[ActionTransition.values().length];
            try {
                iArr[ActionTransition.MeetingWasAgreed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionTransition.Unreachable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionTransition.DidNotAgreeOnMeeting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionTransition.InAdvertising.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionTransition.DepositMade.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActionTransition.Sold.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActionTransition.RefusedBySeller.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f122969a = iArr;
        }
    }

    /* compiled from: StagesTransitionStateBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.stages_transition.mvi.builder.b$b, reason: collision with other inner class name */
    public static final class C3657b extends N implements l<StageTransitionField, StageTransitionField> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f122970l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3657b(String str) {
            super(1);
            this.f122970l = str;
        }

        @Override // Y41.l
        public final StageTransitionField invoke(StageTransitionField stageTransitionField) {
            return new StageTransitionField.CommentField(this.f122970l);
        }
    }

    /* compiled from: StagesTransitionStateBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "field", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<StageTransitionField, StageTransitionField> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.threeten.bp.e f122971l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(org.threeten.bp.e eVar) {
            super(1);
            this.f122971l = eVar;
        }

        @Override // Y41.l
        public final StageTransitionField invoke(StageTransitionField stageTransitionField) {
            StageTransitionField stageTransitionField2 = stageTransitionField;
            StageTransitionField.DateTimeInputs dateTimeInputs = stageTransitionField2 instanceof StageTransitionField.DateTimeInputs ? (StageTransitionField.DateTimeInputs) stageTransitionField2 : null;
            return new StageTransitionField.DateTimeInputs(this.f122971l, dateTimeInputs != null ? dateTimeInputs.f122949c : null);
        }
    }

    /* compiled from: StagesTransitionStateBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements l<StageTransitionField, StageTransitionField> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f122972l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f122972l = str;
        }

        @Override // Y41.l
        public final StageTransitionField invoke(StageTransitionField stageTransitionField) {
            return new StageTransitionField.RadioGroup(this.f122972l);
        }
    }

    /* compiled from: StagesTransitionStateBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "field", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements l<StageTransitionField, StageTransitionField> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.threeten.bp.g f122973l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(org.threeten.bp.g gVar) {
            super(1);
            this.f122973l = gVar;
        }

        @Override // Y41.l
        public final StageTransitionField invoke(StageTransitionField stageTransitionField) {
            StageTransitionField stageTransitionField2 = stageTransitionField;
            StageTransitionField.DateTimeInputs dateTimeInputs = stageTransitionField2 instanceof StageTransitionField.DateTimeInputs ? (StageTransitionField.DateTimeInputs) stageTransitionField2 : null;
            return new StageTransitionField.DateTimeInputs(dateTimeInputs != null ? dateTimeInputs.f122948b : null, this.f122973l);
        }
    }

    @Inject
    public b() {
    }

    public static fq.d g(fq.d dVar, String str, l lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(dVar.f396156e);
        linkedHashMap.put(str, lVar.invoke(linkedHashMap.get(str)));
        return fq.d.a(dVar, false, linkedHashMap, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d a(@k String str, @k ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map) {
        if (map.isEmpty()) {
            int i12 = 3;
            int i13 = 1;
            String str2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            Object[] objArr17 = 0;
            Object[] objArr18 = 0;
            Object[] objArr19 = 0;
            Object[] objArr20 = 0;
            Object[] objArr21 = 0;
            Object[] objArr22 = 0;
            Object[] objArr23 = 0;
            Object[] objArr24 = 0;
            Object[] objArr25 = 0;
            Object[] objArr26 = 0;
            Object[] objArr27 = 0;
            Object[] objArr28 = 0;
            Object[] objArr29 = 0;
            Object[] objArr30 = 0;
            Object[] objArr31 = 0;
            Object[] objArr32 = 0;
            switch (a.f122969a[actionTransition.ordinal()]) {
                case 1:
                    map = P0.g(new Q("contactTime", new StageTransitionField.DateTimeInputs(objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0)), new Q("comment", new StageTransitionField.CommentField(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0)));
                    break;
                case 2:
                    map = P0.g(new Q("reason", new StageTransitionField.RadioGroup(objArr12 == true ? 1 : 0, i13, objArr11 == true ? 1 : 0)), new Q("contactTime", new StageTransitionField.DateTimeInputs(objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, i12, objArr8 == true ? 1 : 0)), new Q("comment", new StageTransitionField.CommentField(objArr7 == true ? 1 : 0, i13, objArr6 == true ? 1 : 0)));
                    break;
                case 3:
                    map = P0.g(new Q("reason", new StageTransitionField.RadioGroup(objArr19 == true ? 1 : 0, i13, objArr18 == true ? 1 : 0)), new Q("contactTime", new StageTransitionField.DateTimeInputs(objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, i12, objArr15 == true ? 1 : 0)), new Q("comment", new StageTransitionField.CommentField(objArr14 == true ? 1 : 0, i13, objArr13 == true ? 1 : 0)));
                    break;
                case 4:
                    map = P0.g(new Q("reason", new StageTransitionField.RadioGroup(objArr25 == true ? 1 : 0, i13, objArr24 == true ? 1 : 0)), new Q("itemLink", new StageTransitionField.Input(objArr23 == true ? 1 : 0, i13, objArr22 == true ? 1 : 0)), new Q("comment", new StageTransitionField.CommentField(objArr21 == true ? 1 : 0, i13, objArr20 == true ? 1 : 0)));
                    break;
                case 5:
                    map = Collections.singletonMap("comment", new StageTransitionField.CommentField(objArr27 == true ? 1 : 0, i13, objArr26 == true ? 1 : 0));
                    break;
                case 6:
                    map = Collections.singletonMap("comment", new StageTransitionField.CommentField(objArr29 == true ? 1 : 0, i13, objArr28 == true ? 1 : 0));
                    break;
                case 7:
                    map = P0.g(new Q("reason", new StageTransitionField.RadioGroup(str2, i13, objArr32 == true ? 1 : 0)), new Q("comment", new StageTransitionField.CommentField(objArr31 == true ? 1 : 0, i13, objArr30 == true ? 1 : 0)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new fq.d(str, actionTransition, false, map);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d b(@k fq.d dVar, @Y61.l org.threeten.bp.g gVar) {
        return g(dVar, "contactTime", new e(gVar));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d c(@k fq.d dVar, @k String str) {
        return g(dVar, "itemLink", new com.avito.android.comfortable_deal.stages_transition.mvi.builder.c(str));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d d(@k fq.d dVar, @k String str) {
        return g(dVar, "comment", new C3657b(str));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d e(@k fq.d dVar, @k String str) {
        return g(dVar, "reason", new d(str));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.mvi.builder.a
    @k
    public final fq.d f(@k fq.d dVar, @Y61.l org.threeten.bp.e eVar) {
        return g(dVar, "contactTime", new c(eVar));
    }
}
