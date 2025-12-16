package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PopulateViewStructure.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* compiled from: PopulateViewStructure.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.r<Integer, Integer, Integer, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f38940l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ViewStructure f38941m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, ViewStructure viewStructure) {
            super(4);
            this.f38940l = lVar;
            this.f38941m = viewStructure;
        }

        @Override // Y41.r
        public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue() - iIntValue;
            int iIntValue4 = num4.intValue() - iIntValue2;
            this.f38940l.getClass();
            this.f38941m.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3, iIntValue4);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d A[PHI: r6 r18 r19 r20 r21 r22 r23 r24 r25
  0x014d: PHI (r6v7 androidx.compose.ui.autofill.t) = (r6v6 androidx.compose.ui.autofill.t), (r6v8 androidx.compose.ui.autofill.t) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r18v7 androidx.compose.ui.state.ToggleableState) = (r18v6 androidx.compose.ui.state.ToggleableState), (r18v8 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r19v6 java.lang.Object) = (r19v5 java.lang.Object), (r19v7 java.lang.Object) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r20v6 java.lang.Boolean) = (r20v5 java.lang.Boolean), (r20v7 java.lang.Boolean) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r21v5 androidx.compose.ui.semantics.i) = (r21v4 androidx.compose.ui.semantics.i), (r21v6 androidx.compose.ui.semantics.i) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r22v6 java.lang.Integer) = (r22v5 java.lang.Integer), (r22v7 java.lang.Integer) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r23v8 androidx.compose.ui.text.e) = (r23v7 androidx.compose.ui.text.e), (r23v9 androidx.compose.ui.text.e) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r24v6 boolean) = (r24v5 boolean), (r24v7 boolean) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r25v6 boolean) = (r25v5 boolean), (r25v7 boolean) binds: [B:10:0x003f, B:61:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    @j.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k android.view.ViewStructure r32, @Y61.k androidx.compose.ui.semantics.n r33, @Y61.k android.view.autofill.AutofillId r34, @Y61.l java.lang.String r35, @Y61.k androidx.compose.ui.spatial.i r36) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.z.a(android.view.ViewStructure, androidx.compose.ui.semantics.n, android.view.autofill.AutofillId, java.lang.String, androidx.compose.ui.spatial.i):void");
    }
}
