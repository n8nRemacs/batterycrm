package com.avito.android.iac_dialer_ui.pub.util;

import Y41.r;
import android.text.format.DateUtils;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LiveCallTimer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "currentTime", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(JLandroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements r<Long, v, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f167761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f167762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Long l12, C22096n c22096n) {
        super(4);
        this.f167761l = l12;
        this.f167762m = c22096n;
    }

    @Override // Y41.r
    public final G0 invoke(Long l12, v vVar, A a12, Integer num) {
        int i12;
        long jLongValue = l12.longValue();
        v vVar2 = vVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i12 = (a13.n(jLongValue) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i12 |= a13.B(vVar2) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            this.f167762m.invoke(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(jLongValue - this.f167761l.longValue())), vVar2, a13, Integer.valueOf(i12 & 112));
        }
        return G0.f406611a;
    }
}
