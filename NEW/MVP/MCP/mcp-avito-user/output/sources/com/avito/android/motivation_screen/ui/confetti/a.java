package com.avito.android.motivation_screen.ui.confetti;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.random.f;

/* compiled from: ConfettiDotView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f206412l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(0);
        this.f206412l = context;
    }

    @Override // Y41.a
    public final Integer invoke() {
        Context context = this.f206412l;
        Integer[] numArr = {Integer.valueOf(C35835l0.d(R.attr.blue, context)), Integer.valueOf(C35835l0.d(R.attr.green, context)), Integer.valueOf(C35835l0.d(R.attr.red600, context)), Integer.valueOf(C35835l0.d(R.attr.violet600, context))};
        f.f406882b.getClass();
        return numArr[f.f406883c.k(4)];
    }
}
