package com.avito.android.player.mvi;

import D80.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.avito.android.player.mvi.entity.PlayerMviState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PlayerActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/player/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LD80/a;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<D80.a, PlayerInternalAction, PlayerMviState> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PlayerInternalAction> b(D80.a aVar, PlayerMviState playerMviState) {
        C43210w c43210w;
        D80.a aVar2 = aVar;
        if (aVar2 instanceof a.g) {
            return new C43210w(PlayerInternalAction.RetryPressed.f220180b);
        }
        if (aVar2 instanceof a.f) {
            a.f fVar = (a.f) aVar2;
            c43210w = new C43210w(new PlayerInternalAction.PlayPressed(fVar.f2965a, fVar.f2966b));
        } else {
            if (aVar2 instanceof a.b) {
                return new C43210w(PlayerInternalAction.FastForwardPressed.f220153b);
            }
            if (aVar2 instanceof a.h) {
                return new C43210w(PlayerInternalAction.RewindPressed.f220181b);
            }
            if (aVar2 instanceof a.e) {
                a.e eVar = (a.e) aVar2;
                c43210w = new C43210w(new PlayerInternalAction.PausedPressed(eVar.f2960a, eVar.f2961b, eVar.f2962c, eVar.f2963d, eVar.f2964e));
            } else if (aVar2 instanceof a.c) {
                c43210w = new C43210w(new PlayerInternalAction.MutePressed(((a.c) aVar2).f2958a));
            } else if (aVar2 instanceof a.C0150a) {
                a.C0150a c0150a = (a.C0150a) aVar2;
                c43210w = new C43210w(new PlayerInternalAction.ClosePressed(c0150a.f2955a, c0150a.f2956b));
            } else {
                if (aVar2 instanceof a.i) {
                    return new C43210w(PlayerInternalAction.ViewPaused.f220182b);
                }
                if (!(aVar2 instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new PlayerInternalAction.OnFramesDropped(((a.d) aVar2).f2959a));
            }
        }
        return c43210w;
    }
}
