package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class mp3 extends q44 {
    public final /* synthetic */ ConfirmPhoneScreen X;
    public int Y;
    public ConfirmPhoneScreen d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp3(Continuation continuation, ConfirmPhoneScreen confirmPhoneScreen) {
        super(continuation);
        this.X = confirmPhoneScreen;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return ConfirmPhoneScreen.y0(this.X, null, this);
    }
}
