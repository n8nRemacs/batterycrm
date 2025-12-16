package com.avito.android.lib.design.time_line;

import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.lib.design.time_line.e;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m.C43852a;

/* compiled from: TimeLineAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.b f181010l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, e.b bVar) {
        super(1);
        this.f181010l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Drawable drawableA;
        Integer num2 = num;
        e.b bVar = this.f181010l;
        if (num2 == null || (drawableA = C35835l0.h(num2.intValue(), bVar.f181008i)) == null) {
            drawableA = C43852a.a(bVar.f181008i, R.drawable.expected_ic_time_line_dot);
        }
        bVar.f181005f.setImageDrawable(drawableA);
        return G0.f406611a;
    }
}
