package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import defpackage.cm6;
import defpackage.em6;
import defpackage.n1f;
import defpackage.oeg;
import defpackage.qeg;
import defpackage.qqg;
import defpackage.u08;
import defpackage.xpb;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.BuildConfig;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqeg;", "invoke", "()Lqeg;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TracerLiteFacade$tracerLite$2 extends u08 implements cm6 {
    final /* synthetic */ Context $context;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loeg;", "Lqqg;", "invoke", "(Loeg;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$tracerLite$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((oeg) obj);
            return qqg.a;
        }

        public final void invoke(oeg oegVar) {
            oegVar.getClass();
            oegVar.b = new n1f("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.cm6
    public final qeg invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        oeg oegVar = new oeg();
        anonymousClass1.invoke((Object) oegVar);
        qeg qegVar = new qeg(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new xpb(oegVar));
        qegVar.b(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, BuildConfig.SDK_VERSION);
        return qegVar;
    }
}
