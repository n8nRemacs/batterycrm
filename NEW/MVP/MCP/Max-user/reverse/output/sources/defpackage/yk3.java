package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yk3 implements Continuation {
    public static final yk3 b = new yk3(0);
    public static final yk3 c = new yk3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ yk3(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return bd5.a;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
