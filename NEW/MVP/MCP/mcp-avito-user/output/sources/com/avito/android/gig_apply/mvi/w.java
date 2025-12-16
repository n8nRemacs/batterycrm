package com.avito.android.gig_apply.mvi;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import pH.k;
import pH.q;

/* compiled from: GigSlotOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/mvi/w;", "Lcom/avito/android/arch/mvi/t;", "LpH/k;", "LpH/q;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements com.avito.android.arch.mvi.t<pH.k, pH.q> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f159793b;

    @Inject
    public w(@Y61.k Resources resources) {
        this.f159793b = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final pH.q b(pH.k kVar) {
        q.b bVar;
        pH.k kVar2 = kVar;
        int i12 = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (kVar2 instanceof k.e) {
            bVar = new q.b(str, i12, objArr5 == true ? 1 : 0);
        } else if (kVar2 instanceof k.i) {
            bVar = new q.b(objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
        } else {
            if (!(kVar2 instanceof k.a)) {
                if (kVar2 instanceof k.c) {
                    return new q.c(this.f159793b.getString(R.string.gig_slot_confirm_success_text));
                }
                if (kVar2 instanceof k.h) {
                    k.h hVar = (k.h) kVar2;
                    return new q.a(hVar.f428404a, hVar.f428405b);
                }
                if (kVar2 instanceof k.f) {
                    return new q.b(((k.f) kVar2).f428402a);
                }
                return null;
            }
            bVar = new q.b(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        }
        return bVar;
    }
}
