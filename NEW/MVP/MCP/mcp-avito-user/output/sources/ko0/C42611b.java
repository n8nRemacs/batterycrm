package kO0;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.virtual_deal_room_invite.InviteActivity;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InviteIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkO0/b;", "LkO0/a;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42611b implements InterfaceC42610a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f406253a;

    @Inject
    public C42611b(@k Context context) {
        this.f406253a = context;
    }

    @Override // kO0.InterfaceC42610a
    @k
    public final Intent a(@k InvitationArguments invitationArguments) {
        InviteActivity.f326910m.getClass();
        Intent intent = new Intent(this.f406253a, (Class<?>) InviteActivity.class);
        intent.putExtra("arguments", invitationArguments);
        return intent;
    }
}
