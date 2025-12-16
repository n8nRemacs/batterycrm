package com.avito.android.comfortable_deal.client_room.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import fp.e;
import fp.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClientRoomOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lfp/e;", "Lfp/f;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements t<fp.e, fp.f> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final fp.f b(fp.e eVar) {
        fp.e eVar2 = eVar;
        if (eVar2 instanceof e.b) {
            return f.a.f396111a;
        }
        if (eVar2 instanceof e.g) {
            return f.C11175f.f396116a;
        }
        if (eVar2 instanceof e.c) {
            return f.b.f396112a;
        }
        if (eVar2 instanceof e.f) {
            return f.e.f396115a;
        }
        if (eVar2 instanceof e.d) {
            return f.c.f396113a;
        }
        if (eVar2 instanceof e.C11174e) {
            return f.d.f396114a;
        }
        return null;
    }
}
