package ru.ok.tamtam.chats;

import androidx.annotation.Keep;
import defpackage.ej0;
import defpackage.itg;
import defpackage.n73;
import defpackage.p03;
import defpackage.rd5;
import defpackage.vnf;
import defpackage.xs;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/chats/ChatsEventsByBus;", "Lej0;", "Litg;", "updateMessageEvent", "Lqqg;", "onEvent", "(Litg;)V", "Ln73;", "chatsUpdateEvent", "(Ln73;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChatsEventsByBus extends ej0 {
    @Keep
    @vnf
    public final void onEvent(itg updateMessageEvent) {
        if (updateMessageEvent.d) {
            a(new p03(Collections.singleton(Long.valueOf(updateMessageEvent.b)), false, rd5.a));
        }
    }

    @Keep
    @vnf
    public final void onEvent(n73 chatsUpdateEvent) {
        a(new p03(new xs(chatsUpdateEvent.b), chatsUpdateEvent.c, chatsUpdateEvent.Z));
    }
}
