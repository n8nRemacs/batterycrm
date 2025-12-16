package cO0;

import Y61.k;
import Y61.l;
import cO0.InterfaceC27080d;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: TimerInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LcO0/b;", "InternalAction", "LcO0/c;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27078b<InternalAction> implements InterfaceC27079c<InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27080d.b f57848a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public CountDownTimerC27077a f57849b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f57850c = f2.b(0, 1, null, 5);

    public AbstractC27078b(@k InterfaceC27080d.b bVar) {
        this.f57848a = bVar;
    }

    public abstract InviteInternalAction.CountDownValidationTimer a(@k InterfaceC27080d.a aVar);
}
