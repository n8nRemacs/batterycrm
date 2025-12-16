package qW;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import n11.RunnableC44167a;

/* compiled from: DetectLocationHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqW/b;", "Ljava/util/TimerTask;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47353b extends TimerTask {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f429296c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47352a f429297b;

    public C47353b(C47352a c47352a) {
        this.f429297b = c47352a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C47352a c47352a = this.f429297b;
        if (c47352a.f429295i) {
            c47352a.f429290d.removeUpdates(c47352a);
            c47352a.f429295i = false;
            Timer timer = c47352a.f429292f;
            if (timer != null) {
                timer.cancel();
                c47352a.f429292f = null;
            }
        }
        if (c47352a.f429291e != null) {
            c47352a.f429287a.post(new RunnableC44167a(c47352a, 3));
        }
    }
}
