package Cb1;

import Fc1.C13611f5;
import Fc1.C13651k0;
import Fc1.C13757w;
import Fc1.K7;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.util.Log;
import com.avito.android.ux.feedback.impl.q;
import kotlin.Metadata;
import xyz.n.a.e5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCb1/j;", "", "a", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f2347a = a.f2348a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCb1/j$a;", "", "<init>", "()V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f2348a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public static volatile C13651k0 f2349b;

        public static void a(a aVar, Application application, String str, h hVar, q qVar) {
            aVar.getClass();
            if (f2349b == null) {
                try {
                    f2349b = new C13651k0(application, str, hVar, qVar);
                } catch (Exception e12) {
                    if (!(e12 instanceof e5)) {
                        Log.getStackTraceString(e12);
                        throw e12;
                    }
                    e5 e5Var = (e5) e12;
                    new C13611f5(new C13757w(hVar), new K7(), "UxFeedback").c(e5Var.f442728b, e5Var.f442729c);
                }
            }
        }
    }
}
