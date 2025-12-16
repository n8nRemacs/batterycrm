package defpackage;

import one.me.android.notifications.NotificationsImagesProvider;

/* loaded from: classes.dex */
public final class xna extends q44 {
    public ty0 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ NotificationsImagesProvider Z;
    public NotificationsImagesProvider d;
    public f84 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xna(NotificationsImagesProvider notificationsImagesProvider, q44 q44Var) {
        super(q44Var);
        this.Z = notificationsImagesProvider;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return NotificationsImagesProvider.a(this.Z, null, null, this);
    }
}
