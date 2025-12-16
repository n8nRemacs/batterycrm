package ru.ok.tamtam.chats;

import defpackage.ej0;
import defpackage.lzf;
import defpackage.tw0;

/* loaded from: classes2.dex */
public abstract class a {
    public static final ej0 a(tw0 tw0Var, lzf lzfVar) {
        ChatsEventsByBus chatsEventsByBus = new ChatsEventsByBus(lzfVar);
        tw0Var.d(chatsEventsByBus);
        return chatsEventsByBus;
    }
}
