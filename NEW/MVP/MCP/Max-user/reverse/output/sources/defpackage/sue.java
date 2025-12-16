package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.IconCompat;
import kotlinx.coroutines.internal.ContextScope;
import one.me.android.MainActivity;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class sue implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sue(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                wue wueVar = (wue) this.b;
                kte kteVar = (kte) this.c;
                wueVar.o.invoke(new wp9(kteVar.h, kteVar));
                return qqg.a;
            case 1:
                fxe fxeVar = (fxe) this.b;
                k18 k18Var = (k18) this.c;
                Context context = fxeVar.a;
                ActivityManager activityManager = (ActivityManager) s34.b(context, ActivityManager.class);
                Integer numValueOf = activityManager != null ? Integer.valueOf(activityManager.getLauncherLargeIconSize()) : null;
                Drawable drawableH = cei.h(y9b.k, ctd.f(a93.s0, context).k, context);
                Bitmap bitmapB = q9j.b(drawableH, numValueOf != null ? numValueOf.intValue() : drawableH.getIntrinsicWidth(), numValueOf != null ? numValueOf.intValue() : drawableH.getIntrinsicHeight());
                zwe zweVar = new zwe();
                zweVar.a = context;
                zweVar.b = "create_chat";
                zweVar.d = context.getString(mvd.W1);
                zweVar.f = IconCompat.b(bitmapB);
                ul8.c.getClass();
                ((j98) k18Var.getValue()).getClass();
                ((j98) k18Var.getValue()).getClass();
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.setAction("CUSTOM_DEEP_LINK");
                intent.setData(Uri.parse("max://max.ru/:start-conversation"));
                zweVar.c = new Intent[]{intent};
                if (TextUtils.isEmpty(zweVar.d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = zweVar.c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                return zweVar;
            case 2:
                z2f z2fVar = (z2f) this.b;
                k18 k18Var2 = z2fVar.h;
                qpc qpcVar = (qpc) this.c;
                if (((gu5) ((rt5) z2fVar.f.getValue())).r()) {
                    return new hhb(z2fVar.a, z2fVar.b, z2fVar.e, (tih) k18Var2.getValue(), (q0h) qpcVar.get());
                }
                return new dbh(z2fVar.a, z2fVar.b, z2fVar.c, z2fVar.d, z2fVar.e, (tih) k18Var2.getValue(), (q0h) qpcVar.get());
            case 3:
                d44 d44Var = (d44) this.b;
                zhf zhfVar = (zhf) this.c;
                dgf dgfVar = (dgf) d44Var.H0;
                if (dgfVar != null) {
                    zhfVar.i(dgfVar);
                }
                return qqg.a;
            case 4:
                l3b l3bVar = (l3b) this.b;
                fvf fvfVar = (fvf) this.c;
                l3bVar.invoke();
                fvfVar.onDismiss();
                return qqg.a;
            case 5:
                return ivi.b((np0) ((k18) this.b).getValue(), ((hvf) this.c).Y, yud.K1);
            case 6:
                SwipeWidget swipeWidget = (SwipeWidget) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = SwipeWidget.c;
                lg8 lg8Var = lg8.d;
                c54 c54VarY0 = swipeWidget.y0();
                View view = c54VarY0.getView();
                if (view == null) {
                    String str = swipeWidget.a;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null && l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "getUnderlyingViewProvider: underlying view is null, inflating new one", null);
                    }
                    yy7[] yy7VarArr = l54.a;
                    view = c54VarY0.inflate(viewGroup);
                }
                if (view.getParent() == null) {
                    String str2 = swipeWidget.a;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str2, "getUnderlyingViewProvider: underlying view is not attached, adding it to container", null);
                    }
                    viewGroup.addView(view, viewGroup.indexOfChild(viewGroup.findViewById(mzc.swipe_fade)));
                }
                return view;
            case 7:
                return ((su0) ((k18) this.b).getValue()).a(((ebg) this.c).a);
            case 8:
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.b;
                Bundle bundle = (Bundle) this.c;
                yy7[] yy7VarArr2 = TwoFACheckPassScreen.t0;
                return new xkg((rp7) twoFACheckPassScreen.b.getValue(), (up7) ((Parcelable) yvi.a(bundle, "twofa_check_password_nav_data_key", up7.class)), bundle.getString("twofa_check_password_track_id_key", ""));
            case 9:
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.b;
                Bundle bundle2 = (Bundle) this.c;
                yy7[] yy7VarArr3 = TwoFACreationScreen.w0;
                return new emg(twoFACreationScreen.B0(), twoFACreationScreen.z0(), (rp7) twoFACreationScreen.d.getValue(), bundle2.getString("creation_2fa_track_id_key", ""), (up7) ((Parcelable) yvi.a(bundle2, "creation_2fa_nav_data_key", up7.class)));
            case 10:
                Bundle bundle3 = (Bundle) this.b;
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.c;
                yy7[] yy7VarArr4 = TwoFAStartRestoreScreen.s0;
                return new eog((rp7) twoFAStartRestoreScreen.b.getValue(), (up7) ((Parcelable) yvi.a(bundle3, "twofa_check_password_nav_data_key", up7.class)), bundle3.getString("twofa_check_password_track_id_key", ""));
            case 11:
                return b6h.a((b6h) this.b, (Context) this.c);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Context context2 = (Context) this.b;
                v6h v6hVar = (v6h) this.c;
                b6h b6hVar = new b6h(context2);
                b6hVar.setListener(v6hVar);
                b6hVar.setOnLongClickListener(new bn0(10, b6hVar));
                return b6hVar;
            case 13:
                a8h a8hVar = (a8h) this.b;
                dse dseVar = (dse) this.c;
                r8h r8hVar = a8hVar.t0;
                if (r8hVar != null) {
                    r8hVar.w = dseVar;
                }
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                fsf fsfVar = (fsf) this.b;
                a8h a8hVar2 = (a8h) this.c;
                Surface surfaceD = fsfVar.d(a8hVar2.o, new y7h(a8hVar2, fsfVar));
                r8h r8hVar2 = a8hVar2.t0;
                if (r8hVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                r8hVar2.p(surfaceD);
                a8hVar2.Y.put(fsfVar, surfaceD);
                return qqg.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                a8h a8hVar3 = (a8h) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                r8h r8hVar3 = a8hVar3.t0;
                if (r8hVar3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lg8 lg8Var2 = lg8.d;
                String str3 = r8hVar3.p;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var2)) {
                    l6bVar3.c(lg8Var2, str3, ho7.i("setStencilBitmap, ", g4f.c(bitmap), ", recycle_after_consume=true"), null);
                }
                hef hefVar = r8hVar3.q;
                if (hefVar == null) {
                    hefVar = new hef(r8hVar3.o);
                    r8hVar3.q = hefVar;
                }
                String str4 = hefVar.d;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var2)) {
                    l6bVar4.c(lg8Var2, str4, ho7.i("setBitmap, ", g4f.c(bitmap), ", recycle_after_consume=true"), null);
                }
                hefVar.e.setStencilBitmap(bitmap, true);
                return qqg.a;
            case 16:
                bvf bvfVar = (bvf) this.b;
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.c;
                yy7[] yy7VarArr5 = VideoWebViewScreen.H0;
                if (j9j.d(bvfVar)) {
                    FrameLayout frameLayoutQ0 = videoWebViewScreen.Q0();
                    ViewGroup.LayoutParams layoutParams = frameLayoutQ0.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    frameLayoutQ0.setLayoutParams(marginLayoutParams);
                } else {
                    FrameLayout frameLayoutQ02 = videoWebViewScreen.Q0();
                    ViewGroup.LayoutParams layoutParams2 = frameLayoutQ02.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = videoWebViewScreen.N0().getHeight();
                    marginLayoutParams2.bottomMargin = videoWebViewScreen.M0().getHeight();
                    frameLayoutQ02.setLayoutParams(marginLayoutParams2);
                }
                return Boolean.TRUE;
            default:
                uvh uvhVar = (uvh) this.b;
                k18 k18Var3 = (k18) this.c;
                long jS = ((w4e) uvhVar.Z).s();
                long j = uvhVar.b;
                ContextScope contextScope = uvhVar.a;
                kph kphVar = kph.a;
                return new tmh(jS, j, contextScope, (Context) kphVar.getAccessor().c(12), new hbd(uvhVar.P0), kphVar.getAccessor().d(196), k18Var3, kphVar.getAccessor().d(164));
        }
    }
}
