package ru.ok.tamtam.android.db.room;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import defpackage.an9;
import defpackage.cm4;
import defpackage.coa;
import defpackage.d3g;
import defpackage.drd;
import defpackage.ei;
import defpackage.ek;
import defpackage.ewg;
import defpackage.fuf;
import defpackage.gk7;
import defpackage.ho7;
import defpackage.hs5;
import defpackage.iqa;
import defpackage.jdc;
import defpackage.jgf;
import defpackage.kad;
import defpackage.kce;
import defpackage.lq9;
import defpackage.lrd;
import defpackage.m03;
import defpackage.m14;
import defpackage.m35;
import defpackage.mj3;
import defpackage.mt5;
import defpackage.o2h;
import defpackage.ocd;
import defpackage.qlh;
import defpackage.qs5;
import defpackage.rwa;
import defpackage.sub;
import defpackage.t1b;
import defpackage.tgf;
import defpackage.vs5;
import defpackage.wna;
import defpackage.wpa;
import defpackage.xdf;
import defpackage.zxd;
import kotlin.Metadata;
import one.me.android.OneMeApplication;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/db/room/OneMeRoomDatabase;", "Llrd;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OneMeRoomDatabase extends lrd {
    public static volatile iqa m;

    public abstract qs5 A();

    public abstract vs5 B();

    public abstract mt5 C();

    public abstract gk7 D();

    public abstract an9 E();

    public abstract lq9 F();

    public abstract wna G();

    public abstract coa H();

    public abstract wpa I();

    public abstract sub J();

    public abstract jdc K();

    public abstract kad L();

    public abstract ocd M();

    public abstract drd N();

    public abstract zxd O();

    public abstract kce P();

    public abstract xdf Q();

    public abstract jgf R();

    public abstract tgf S();

    public abstract fuf T();

    public abstract d3g U();

    public abstract ewg V();

    public abstract o2h W();

    public abstract qlh X();

    public abstract WorkersQueueDao Y();

    @Override // defpackage.lrd
    public final void a() {
        if (m != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            boolean zJ = j();
            boolean zM = m();
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            NotMainThreadException notMainThreadException = new NotMainThreadException(ho7.l(ho7.p("NotMainThreadException(isOpenInternal=", zM, ", isInTransaction=", zJ, ", curThread="), (name == null || name.length() == 0) ? String.valueOf(threadCurrentThread.getId()) : threadCurrentThread.getName(), ")"));
            rwa rwaVar = OneMeApplication.s0;
            t1b.a.d().a("ONEME-8045", notMainThreadException);
        }
    }

    public abstract ei s();

    public abstract ek t();

    public abstract m03 u();

    public abstract mj3 v();

    public abstract m14 w();

    public abstract cm4 x();

    public abstract m35 y();

    public abstract hs5 z();
}
