package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/t;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements com.avito.android.arch.mvi.t<BeduinInternalAction, BeduinOneTimeEvent> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<aU0.b> f176353b;

    /* compiled from: BeduinOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ShowToastBarInteraction.Type.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShowToastBarInteraction.Type type = ShowToastBarInteraction.Type.f337508b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShowToastBarInteraction.Type type2 = ShowToastBarInteraction.Type.f337508b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public t(@Y61.k Set<aU0.b> set) {
        this.f176353b = set;
    }

    @Override // com.avito.android.arch.mvi.t
    public final BeduinOneTimeEvent b(BeduinInternalAction beduinInternalAction) {
        BeduinOneTimeEvent.ShowToastBar.Type type;
        BeduinInternalAction beduinInternalAction2 = beduinInternalAction;
        BeduinInternalAction.ForOneTimeEventProducer forOneTimeEventProducer = beduinInternalAction2 instanceof BeduinInternalAction.ForOneTimeEventProducer ? (BeduinInternalAction.ForOneTimeEventProducer) beduinInternalAction2 : null;
        if (!(forOneTimeEventProducer instanceof BeduinInternalAction.SendPlatformInteraction)) {
            if (forOneTimeEventProducer instanceof BeduinInternalAction.SendComponentInteraction) {
                return new BeduinOneTimeEvent.a(((BeduinInternalAction.SendComponentInteraction) forOneTimeEventProducer).f176260b);
            }
            if (forOneTimeEventProducer instanceof BeduinInternalAction.OnBeduinException) {
                Iterator<T> it = this.f176353b.iterator();
                while (it.hasNext()) {
                    ((aU0.b) it.next()).a(((BeduinInternalAction.OnBeduinException) forOneTimeEventProducer).f176256b, UUID.randomUUID().toString());
                }
                return null;
            }
            if (forOneTimeEventProducer instanceof BeduinInternalAction.ShowToastError) {
                return new BeduinOneTimeEvent.d(((BeduinInternalAction.ShowToastError) forOneTimeEventProducer).f176264b);
            }
            if (forOneTimeEventProducer instanceof BeduinInternalAction.Reload) {
                return BeduinOneTimeEvent.c.f176282a;
            }
            if (forOneTimeEventProducer == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        dU0.b bVar = ((BeduinInternalAction.SendPlatformInteraction) forOneTimeEventProducer).f176261b;
        if (!(bVar instanceof ShowToastBarInteraction)) {
            return new BeduinOneTimeEvent.b(bVar);
        }
        ShowToastBarInteraction showToastBarInteraction = (ShowToastBarInteraction) bVar;
        String str = showToastBarInteraction.f337503a;
        int iOrdinal = showToastBarInteraction.f337504b.ordinal();
        if (iOrdinal == 0) {
            type = BeduinOneTimeEvent.ShowToastBar.Type.f176275d;
        } else if (iOrdinal == 1) {
            type = BeduinOneTimeEvent.ShowToastBar.Type.f176273b;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = BeduinOneTimeEvent.ShowToastBar.Type.f176274c;
        }
        ShowToastBarInteraction.a aVar = showToastBarInteraction.f337506d;
        return new BeduinOneTimeEvent.ShowToastBar(str, aVar != null ? new BeduinOneTimeEvent.ShowToastBar.a(aVar.f337511a, aVar.f337512b) : null, type, showToastBarInteraction.f337507e);
    }
}
