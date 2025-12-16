package ru.ok.android.externcalls.sdk.factory;

import defpackage.em6;
import defpackage.hn6;
import defpackage.hu3;
import defpackage.qqg;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BaseCallParams$Builder$setOnPrepared$1 extends hn6 implements em6 {
    public BaseCallParams$Builder$setOnPrepared$1(Object obj) {
        super(1, 0, hu3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
    }

    @Override // defpackage.em6
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Conversation) obj);
        return qqg.a;
    }

    public final void invoke(Conversation conversation) {
        ((hu3) this.receiver).accept(conversation);
    }
}
