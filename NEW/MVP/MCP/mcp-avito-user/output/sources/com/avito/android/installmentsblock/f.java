package com.avito.android.installmentsblock;

import com.avito.android.installmentsblock.mvi.o;
import com.avito.android.installmentsblock.mvi.p;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlockViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/installmentsblock/mvi/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/installmentsblock/mvi/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f172976l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(0);
        this.f172976l = eVar;
    }

    @Override // Y41.a
    public final o invoke() {
        p pVar = this.f172976l.f172967b;
        if (pVar == null) {
            pVar = null;
        }
        return (o) pVar.get();
    }
}
