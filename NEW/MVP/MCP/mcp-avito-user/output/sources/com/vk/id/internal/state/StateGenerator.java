package com.vk.id.internal.state;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.random.f;
import kotlin.ranges.C42837c;
import kotlin.ranges.l;

/* compiled from: StateGenerator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/state/StateGenerator;", "", "prefsStore", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "<init>", "(Lcom/vk/id/internal/store/InternalVKIDPrefsStore;)V", "regenerateState", "", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StateGenerator {

    @k
    private final InternalVKIDPrefsStore prefsStore;
    public static final int $stable = 8;

    public StateGenerator(@k InternalVKIDPrefsStore internalVKIDPrefsStore) {
        this.prefsStore = internalVKIDPrefsStore;
    }

    @k
    public final String regenerateState() {
        ArrayList arrayListH0 = C42745f0.h0(new C42837c('0', '9'), C42745f0.f0(new C42837c('A', 'Z'), new C42837c('a', 'z')));
        l lVar = new l(1, 32, 1);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
        kotlin.ranges.k it = lVar.iterator();
        while (it.f406910d) {
            it.a();
            Character ch2 = (Character) C42745f0.j0(arrayListH0, f.f406882b);
            ch2.getClass();
            arrayList.add(ch2);
        }
        String strO = C42745f0.O(arrayList, "", null, null, null, 62);
        this.prefsStore.setState(strO);
        return strO;
    }
}
