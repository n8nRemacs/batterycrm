package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final class rb8 extends q44 {
    public ozf X;
    public LoadEmojiFontWorker Y;
    public /* synthetic */ Object Z;
    public LoadEmojiFontWorker d;
    public vb5 o;
    public final /* synthetic */ LoadEmojiFontWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb8(LoadEmojiFontWorker loadEmojiFontWorker, Continuation continuation) {
        super(continuation);
        this.s0 = loadEmojiFontWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.doForegroundWork(this);
    }
}
