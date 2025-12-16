package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ctd {
    public static int a = 1;

    public static final void a(int i, View view, ViewGroup viewGroup) {
        int iV = az1.v(i);
        if (iV == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iV == 1) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iV == 2) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iV != 3) {
            return;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "cv";
        }
        if (i == 2) {
            return "cn";
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i == 3) {
            return "USER";
        }
        throw null;
    }

    public static int e(float f) {
        return kti.d(vw4.c() * f);
    }

    public static nb7 f(v1a v1aVar, Context context) {
        return v1aVar.x(context).k().getIcon();
    }

    public static vrf g(ArrayList arrayList, vrf vrfVar) {
        arrayList.add(vrfVar);
        return new vrf();
    }

    public static ClassCastException h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String i(Uri uri, String str) {
        return str + uri;
    }

    public static String j(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static void k(int i, wrf wrfVar, long j, vrf vrfVar) {
        vrfVar.a(new qb0(i, wrfVar, j));
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "END";
            case 2:
                return "INCOMING";
            case 3:
                return "BEEP";
            case 4:
                return "BUSY";
            case 5:
                return "CONNECTING";
            case 6:
                return "CONNECTED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NONE" : "MUTED" : "TALKING";
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER" : "SYSTEM" : "UNKNOWN";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SET_SHOWCASE" : "SET" : "POPULAR" : "FAVORITE" : "RECENT";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOTTIE" : "LIVE" : "STATIC" : "UNKNOWN";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BOT_COMMAND_DESCRIPTION" : "BOT_COMMAND" : "BOT_TAG" : "CONTACT";
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MESSAGE" : "GLOBAL_CONTACT" : "CONTACT" : "GLOBAL_CHAT" : "CHAT";
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GLOBAL" : "CONTACT" : "MESSAGE" : "CHANNEL" : "CHAT";
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SOLO" : "LAST" : "MIDDLE" : "FIRST";
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? "null" : "CENTER" : "LEFT";
    }
}
