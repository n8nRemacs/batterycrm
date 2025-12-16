package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.MappedByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.media.service.OneMeMediaSessionService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class gq5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gq5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        ld7 ld7Var = (ld7) this.b;
        synchronized (ld7Var.E0) {
            try {
                ld7Var.G0 = null;
                jf7 jf7Var = ld7Var.F0;
                if (jf7Var != null) {
                    ld7Var.F0 = null;
                    ld7Var.f(jf7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((OneMeMediaSessionService) this.b).a) {
        }
    }

    private final void c() {
        nea neaVar = (nea) this.b;
        ck4 ck4Var = (ck4) neaVar.a.get();
        if (ck4Var != null) {
            int iB = neaVar.c.b();
            int i = ck4Var.a;
            Object obj = ck4Var.b;
            switch (i) {
                case 0:
                    ek4 ek4Var = (ek4) obj;
                    synchronized (ek4Var) {
                        int i2 = ek4Var.n;
                        if (i2 == 0 || ek4Var.e) {
                            if (i2 != iB || ek4Var.o == null) {
                                ek4Var.n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (ek4Var.o == null) {
                                        ek4Var.o = zxg.x(ek4Var.a);
                                    }
                                    ek4Var.l = ek4Var.j(iB);
                                    ek4Var.d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    int i3 = ek4Var.g > 0 ? (int) (jElapsedRealtime - ek4Var.h) : 0;
                                    long j = ek4Var.i;
                                    long j2 = ek4Var.l;
                                    if (i3 != 0 || j != 0 || j2 != ek4Var.m) {
                                        ek4Var.m = j2;
                                        ek4Var.c.i(i3, j, j2);
                                    }
                                    ek4Var.h = jElapsedRealtime;
                                    ek4Var.i = 0L;
                                    ek4Var.k = 0L;
                                    ek4Var.j = 0L;
                                    s4f s4fVar = ek4Var.f;
                                    s4fVar.c.clear();
                                    s4fVar.d = -1;
                                    s4fVar.e = 0;
                                    s4fVar.f = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                default:
                    hn5 hn5Var = (hn5) obj;
                    synchronized (hn5Var) {
                        int i4 = hn5Var.f;
                        if (i4 == 0 || hn5Var.c) {
                            if (i4 != iB || hn5Var.h == null) {
                                hn5Var.f = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (hn5Var.h == null) {
                                        hn5Var.h = zxg.x(hn5Var.a);
                                    }
                                    long j3 = hn5Var.j(iB);
                                    hn5Var.g = j3;
                                    k8f k8fVar = hn5Var.e;
                                    k8fVar.d.getClass();
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    k8fVar.a(k8fVar.f > 0 ? (int) (jElapsedRealtime2 - k8fVar.g) : 0, k8fVar.h, j3);
                                    k8fVar.a.reset();
                                    k8fVar.i = Long.MIN_VALUE;
                                    k8fVar.g = jElapsedRealtime2;
                                    k8fVar.h = 0L;
                                    k8fVar.k = 0;
                                    k8fVar.l = 0L;
                                    fqb fqbVar = hn5Var.d;
                                    s4f s4fVar2 = fqbVar.b;
                                    s4fVar2.c.clear();
                                    s4fVar2.d = -1;
                                    s4fVar2.e = 0;
                                    s4fVar2.f = 0;
                                    fqbVar.e = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 8;
        switch (this.a) {
            case 0:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) this.b;
                yy7[] yy7VarArr = FakeInAppReviewBottomSheet.L0;
                fakeInAppReviewBottomSheet.E0(true);
                return;
            case 1:
                t26 t26Var = (t26) this.b;
                EndlessRecyclerView2 endlessRecyclerView2 = t26Var.s0;
                if (endlessRecyclerView2 != null) {
                    endlessRecyclerView2.Y();
                }
                EndlessRecyclerView2 endlessRecyclerView22 = t26Var.s0;
                if (endlessRecyclerView22 != null) {
                    endlessRecyclerView22.postInvalidate();
                    return;
                }
                return;
            case 2:
                FoldersPickerScreen foldersPickerScreen = (FoldersPickerScreen) this.b;
                yy7[] yy7VarArr2 = FoldersPickerScreen.Z;
                if (foldersPickerScreen.getView() != null) {
                    ((RecyclerView) foldersPickerScreen.o.D(foldersPickerScreen, FoldersPickerScreen.Z[1])).Y();
                    return;
                }
                return;
            case 3:
                ce6 ce6Var = (ce6) this.b;
                synchronized (ce6Var.d) {
                    try {
                        if (ce6Var.Z == null) {
                            return;
                        }
                        try {
                            me6 me6VarC = ce6Var.c();
                            int i2 = me6VarC.e;
                            if (i2 == 2) {
                                synchronized (ce6Var.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = beg.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                tha thaVar = ce6Var.c;
                                Context context = ce6Var.a;
                                thaVar.getClass();
                                Typeface typefaceF0 = vog.a.f0(context, new me6[]{me6VarC}, 0);
                                MappedByteBuffer mappedByteBufferG = hni.g(ce6Var.a, me6VarC.a);
                                if (mappedByteBufferG == null || typefaceF0 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                hz9 hz9VarA = hz9.a(typefaceF0, mappedByteBufferG);
                                Trace.endSection();
                                synchronized (ce6Var.d) {
                                    try {
                                        eaj eajVar = ce6Var.Z;
                                        if (eajVar != null) {
                                            eajVar.b(hz9VarA);
                                        }
                                    } finally {
                                    }
                                }
                                ce6Var.a();
                                return;
                            } catch (Throwable th) {
                                int i4 = beg.a;
                                Trace.endSection();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (ce6Var.d) {
                                try {
                                    eaj eajVar2 = ce6Var.Z;
                                    if (eajVar2 != null) {
                                        eajVar2.a(th2);
                                    }
                                    ce6Var.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 4:
                a aVar = (a) this.b;
                aVar.b1.X.r(aVar.d);
                aVar.d = null;
                return;
            case 5:
                Iterator it = ((c) this.b).n.iterator();
                if (it.hasNext()) {
                    throw ctd.h(it);
                }
                return;
            case 6:
                ((t47) this.b).m();
                return;
            case 7:
                ((h08) this.b).N();
                return;
            case 8:
                ea7 ea7Var = (ea7) this.b;
                if (ea7Var.Z.get()) {
                    return;
                }
                wqi.e("fa7", "onUrlExpired", null);
                ea7Var.Y.onError(new HttpUrlExpiredException(null, null, null, 6));
                ea7Var.a(false);
                return;
            case 9:
                vc7 vc7Var = (vc7) this.b;
                if (vc7Var.h) {
                    Instant instant = vc7Var.a.instant();
                    if (vc7Var.g.plusMillis(vc7Var.d).isBefore(instant)) {
                        if (vc7Var.g.plusMillis(vc7Var.f.getAsInt() * 3).isBefore(instant)) {
                            vc7Var.b.shutdown();
                            ysc yscVar = vc7Var.e;
                            if (yscVar.A0 == 4 || yscVar.A0 == 5) {
                                return;
                            }
                            yscVar.d(new rs0(yscVar.t0.i == 2 ? 4 : 1));
                            yscVar.O0.a();
                            yscVar.L0.j();
                            vqc qLog = yscVar.c.getQLog();
                            Instant.now();
                            qLog.getClass();
                            yscVar.p();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                a();
                return;
            case 11:
                il0 il0Var = il0.c;
                he7 he7Var = (he7) this.b;
                wqi.c("he7", "Clear fresco. BitmapMemoryCache size: %d bytes", Integer.valueOf(zk6.e().f.getSizeInBytes()));
                ArrayList arrayList = new ArrayList();
                List listJ = ((qv3) he7Var.c.getValue()).j(qv3.o, qv3.q);
                for (int i5 = 0; i5 < listJ.size(); i5++) {
                    String strS = ((ku3) listJ.get(i5)).s(he7Var.a.a.n(), il0Var);
                    if (!TextUtils.isEmpty(strS)) {
                        arrayList.add(he7.a(Uri.parse(strS)));
                    }
                }
                List listUnmodifiableList = Collections.unmodifiableList(((ve2) he7Var.b.getValue()).N(ve2.K, false, null));
                for (int i6 = 0; i6 < listUnmodifiableList.size(); i6++) {
                    String strB = ((pb2) listUnmodifiableList.get(i6)).b.b(il0Var, hl0.a);
                    if (!TextUtils.isEmpty(strB)) {
                        arrayList.add(he7.a(Uri.parse(strB)));
                    }
                }
                zk6.e().f.d(new sl6(he7Var, arrayList));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 13:
                a38 a38Var = (a38) this.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(a38Var, "translationY", -8.0f, 8.0f);
                objectAnimatorOfFloat.setDuration(2500L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setRepeatMode(2);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.addUpdateListener(new q00(14, a38Var));
                objectAnimatorOfFloat.start();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((peh) this.b).b.setOnClickListener(null);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((px8) this.b).w();
                return;
            case 16:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                yy7[] yy7VarArr3 = MediaKeyboardWidget.B0;
                mediaKeyboardWidget.y0();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((n49) this.b).n = -1;
                return;
            case 18:
                ((i69) this.b).a();
                return;
            case 19:
                b();
                return;
            case 20:
                vm9 vm9Var = (vm9) this.b;
                if (!((fxa) vm9Var.b.getValue()).b()) {
                    wqi.e("vm9", "restoreUploads: not authorized", null);
                    return;
                } else {
                    wqi.c("vm9", "restoreUploadsFromStorage", new Object[0]);
                    ((bn9) vm9Var.a.getValue()).a().e(new pr8(new mc5(22, vm9Var), new b6a(vm9Var), new gk0(i, vm9Var)));
                    return;
                }
            case 21:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.b;
                RecyclerView recyclerView = messagesLayoutManager.H;
                if (recyclerView != null && recyclerView.F0 && recyclerView.isInLayout()) {
                    messagesLayoutManager.v1();
                    return;
                }
                d9a d9aVar = messagesLayoutManager.K;
                Object[] objArr = d9aVar.b;
                long[] jArr = d9aVar.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128) {
                                ((xq9) objArr[(i7 << 3) + i9]).a();
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return;
                        }
                    }
                    if (i7 == length) {
                        return;
                    } else {
                        i7++;
                    }
                }
                break;
            case 22:
                ((MultiFileUploader) this.b).scheduleNextUpload(true);
                return;
            case 23:
                try {
                    ((f7a) this.b).c.K(guf.o());
                    return;
                } catch (Exception e) {
                    a8i.h("MultiInputVG", "Error releasing GlObjectsProvider", e);
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                f7a f7aVar = (f7a) ((h08) this.b).b;
                f7aVar.e.a(f7aVar.t);
                return;
            case 25:
                b8a b8aVar = (b8a) this.b;
                gq5 gq5Var = b8aVar.B0;
                Handler handler = b8aVar.A0;
                if (handler != null) {
                    handler.removeCallbacks(gq5Var);
                }
                px8 px8Var = b8aVar.w0;
                long jE = px8Var != null ? px8Var.e() : 0L;
                px8 px8Var2 = b8aVar.w0;
                long jC = px8Var2 != null ? px8Var2.c() : 0L;
                b8aVar.C0.m(null, Long.valueOf(jE));
                b8aVar.E0.m(null, Long.valueOf(jC));
                b8aVar.Q0.m(null, Float.valueOf(n7j.b((float) (jE / b8aVar.O0), 0.0f, 1.0f)));
                Handler handler2 = b8aVar.A0;
                if (handler2 != null) {
                    handler2.postDelayed(gq5Var, 17L);
                    return;
                }
                return;
            case 26:
                ((w9a) this.b).M0();
                return;
            case 27:
                c();
                return;
            case 28:
                ((fxa) ((qja) this.b).i.getValue()).d(true);
                return;
            default:
                rva rvaVar = (rva) this.b;
                View view = rvaVar.a;
                if (rvaVar.c.isAlive()) {
                    rvaVar.c.removeOnPreDrawListener(rvaVar);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(rvaVar);
                }
                view.removeOnAttachStateChangeListener(rvaVar);
                return;
        }
    }
}
