package com.avito.android.publish.slots.anonymous_number;

import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: AnonymousNumberSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f243025b;

    public f(l lVar) {
        this.f243025b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) ((Q) obj).f406620c;
        l lVar = this.f243025b;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            if (sb2.toString().length() == 11) {
                lVar.f243047o.b(lVar.l(null).s(lVar.f243043k.e()).x(new a(lVar), b.f243021b));
                return;
            }
        }
        if (lVar.f243051s != null) {
            lVar.f243051s = null;
            lVar.f243052t.accept(new f.b(SlotType.ANONYMOUS_NUMBER, null));
        }
    }
}
