package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import io.reactivex.rxjava3.core.I;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;
import pL.C46975b;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/j;", "logStreamerEntry", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/j;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f168134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f168135c;

    public x(q qVar, long j12) {
        this.f168134b = qVar;
        this.f168135c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String str;
        j jVar = (j) obj;
        q qVar = this.f168134b;
        if (qVar.f168107d.i()) {
            return I.q(G0.f406611a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.f168079g.format(new Date(jVar.f168081b)));
        String str2 = " ";
        sb2.append(" ");
        j.a(15, jVar.f168080a, sb2);
        sb2.append(" ");
        switch (jVar.f168082c) {
            case 2:
                str2 = "V";
                break;
            case 3:
                str2 = "D";
                break;
            case 4:
                str2 = "I";
                break;
            case 5:
                str2 = "W";
                break;
            case 6:
                str2 = "E";
                break;
            case 7:
                str2 = "A";
                break;
        }
        C43066x.k(sb2, str2, "/");
        j.a(68 - sb2.length(), jVar.f168083d, sb2);
        sb2.append(": ");
        Throwable th2 = jVar.f168085f;
        if (th2 == null) {
            str = "";
        } else {
            str = "\n" + C46975b.a(th2);
        }
        C43066x.k(sb2, jVar.f168084e, str);
        String string = sb2.toString();
        return qVar.f168107d.g(this.f168135c, jVar.f168081b, string).r(new z(qVar, string)).i(A.f168066b).v(G0.f406611a).n(new w(qVar, this.f168135c));
    }
}
