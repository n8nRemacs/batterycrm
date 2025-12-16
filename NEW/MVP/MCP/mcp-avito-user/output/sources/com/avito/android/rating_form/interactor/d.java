package com.avito.android.rating_form.interactor;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction;
import com.avito.android.rating_form.mvi.p;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.r;
import com.avito.android.rating_form.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: RatingFormInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/interactor/d;", "Lcom/avito/android/rating_form/interactor/i;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class d implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f248211i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f248212a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f248213b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.step.validations.a f248214c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r f248215d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f248216e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f248217f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f248218g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final e2 f248219h;

    /* compiled from: RatingFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/interactor/d$a;", "", "<init>", "()V", "", "REDESIGN_THEME", "Ljava/lang/String;", "SCORE_FIELD_SLUG", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@Y61.k y yVar, @Y61.k o oVar, @Y61.k com.avito.android.rating_form.step.validations.a aVar, @Y61.k r rVar, @Y61.k p pVar, boolean z12) {
        this.f248212a = yVar;
        this.f248213b = oVar;
        this.f248214c = aVar;
        this.f248215d = rVar;
        this.f248216e = pVar;
        this.f248217f = z12;
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f248218g = e2VarB;
        this.f248219h = e2VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(com.avito.android.rating_form.interactor.d r17, java.util.List r18, java.lang.Integer r19, com.avito.android.rating_form.StepIdentifier r20, java.util.Map r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.interactor.d.g(com.avito.android.rating_form.interactor.d, java.util.List, java.lang.Integer, com.avito.android.rating_form.StepIdentifier, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public static a.e.AbstractC7454a k(RatingFormField.ValueType valueType, int i12, String str, RatingFormField.DataType dataType) {
        if (valueType instanceof RatingFormField.ValueType.IntArrayValue) {
            return new a.e.AbstractC7454a.C7455a(i12, str, dataType, ((RatingFormField.ValueType.IntArrayValue) valueType).f247999b);
        }
        if (valueType instanceof RatingFormField.ValueType.LongValue) {
            return new a.e.AbstractC7454a.c(i12, str, dataType, ((RatingFormField.ValueType.LongValue) valueType).f248001b);
        }
        if (valueType instanceof RatingFormField.ValueType.StringValue) {
            return new a.e.AbstractC7454a.C7456e(i12, str, dataType, ((RatingFormField.ValueType.StringValue) valueType).f248003b);
        }
        if (valueType instanceof RatingFormField.ValueType.LongArrayValue) {
            return new a.e.AbstractC7454a.b(i12, str, dataType, ((RatingFormField.ValueType.LongArrayValue) valueType).f248000b);
        }
        if (valueType instanceof RatingFormField.ValueType.StringArrayValue) {
            return new a.e.AbstractC7454a.d(i12, str, dataType, ((RatingFormField.ValueType.StringArrayValue) valueType).f248002b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m(com.avito.android.rating_form.interactor.d r16, int r17, com.avito.android.rating_form.StepIdentifier r18, com.avito.android.rating_form.FieldIdentifier r19, com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType r20, boolean r21, java.util.LinkedHashMap r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.interactor.d.m(com.avito.android.rating_form.interactor.d, int, com.avito.android.rating_form.StepIdentifier, com.avito.android.rating_form.FieldIdentifier, com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType, boolean, java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.rating_form.interactor.i
    /* renamed from: F, reason: from getter */
    public final e2 getF248219h() {
        return this.f248219h;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r16, @Y61.k com.avito.android.rating_form.StepIdentifier r17, @Y61.k java.util.Map r18, @Y61.k java.util.List r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.interactor.d.a(int, com.avito.android.rating_form.StepIdentifier, java.util.Map, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    public final Object b(@Y61.k List list, @Y61.l Integer num, @Y61.l StepIdentifier stepIdentifier, @Y61.k LinkedHashMap linkedHashMap, @Y61.k SuspendLambda suspendLambda) {
        return g(this, list, num, stepIdentifier, linkedHashMap, suspendLambda);
    }

    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    public final Object c(int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k FieldIdentifier fieldIdentifier, @Y61.l RatingFormField.ValueType valueType, boolean z12, @Y61.k LinkedHashMap linkedHashMap, @Y61.k SuspendLambda suspendLambda) {
        return m(this, i12, stepIdentifier, fieldIdentifier, valueType, z12, linkedHashMap, suspendLambda);
    }

    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    public final Object d(@Y61.k Continuation<? super G0> continuation) {
        Object objEmit = this.f248218g.emit(RatingFormInteractorInternalAction.StartClosing.f248201b, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    public final Object e(boolean z12, @Y61.k SuspendLambda suspendLambda) {
        Object objEmit = this.f248218g.emit(new RatingFormInteractorInternalAction.CloseForm(z12), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.rating_form.interactor.i
    @Y61.l
    public final Object f(int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        Object next;
        ArrayList arrayListY = this.f248212a.b(i12).y(stepIdentifier);
        if (arrayListY != null) {
            Iterator it = arrayListY.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((RatingFormField) next).getSlug(), str)) {
                    break;
                }
            }
            if (((RatingFormField) next) != null) {
                Object objEmit = this.f248218g.emit(new RatingFormInteractorInternalAction.RequestFieldFocus(String.valueOf(r3.getId()).hashCode()), continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
            }
        }
        return G0.f406611a;
    }

    @Y61.l
    public abstract Object h(@Y61.k List list, @Y61.l Integer num, @Y61.l String str, @Y61.k Continuation continuation);

    public final Object i(int i12, StepIdentifier stepIdentifier, boolean z12, ContinuationImpl continuationImpl) {
        com.avito.android.rating_form.m mVarB = this.f248212a.b(i12);
        Object objEmit = this.f248218g.emit(new RatingFormInteractorInternalAction.SetFinishButtonState(mVarB.q(stepIdentifier), com.avito.android.rating_form.step.d.a(mVarB.t(stepIdentifier), z12, true), mVarB.s(stepIdentifier), z12), continuationImpl);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r19, com.avito.android.rating_form.StepIdentifier r20, java.util.Map r21, java.util.Map r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.interactor.d.j(int, com.avito.android.rating_form.StepIdentifier, java.util.Map, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9 A[LOOP:0: B:44:0x01a3->B:46:0x01a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r23, com.avito.android.rating_form.StepIdentifier r24, java.util.List r25, boolean r26, boolean r27, java.util.Map r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.interactor.d.l(int, com.avito.android.rating_form.StepIdentifier, java.util.List, boolean, boolean, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
