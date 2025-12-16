package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class mid {
    public static final List D0 = Collections.EMPTY_LIST;
    public RecyclerView B0;
    public phd C0;
    public final View a;
    public WeakReference b;
    public int t0;
    public int c = -1;
    public int d = -1;
    public long o = -1;
    public int X = -1;
    public int Y = -1;
    public mid Z = null;
    public mid s0 = null;
    public ArrayList u0 = null;
    public List v0 = null;
    public int w0 = 0;
    public did x0 = null;
    public boolean y0 = false;
    public int z0 = 0;
    public int A0 = -1;

    public mid(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void e(int i) {
        this.t0 = i | this.t0;
    }

    public final int f() {
        RecyclerView recyclerView = this.B0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.P(this);
    }

    public final int g() {
        RecyclerView recyclerView;
        phd adapter;
        int iP;
        if (this.C0 == null || (recyclerView = this.B0) == null || (adapter = recyclerView.getAdapter()) == null || (iP = this.B0.P(this)) == -1) {
            return -1;
        }
        return adapter.i(this.C0, this, iP);
    }

    public final int h() {
        int i = this.Y;
        return i == -1 ? this.c : i;
    }

    public final List i() {
        ArrayList arrayList;
        return ((this.t0 & 1024) != 0 || (arrayList = this.u0) == null || arrayList.size() == 0) ? D0 : this.v0;
    }

    public final boolean l() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.B0) ? false : true;
    }

    public final boolean m() {
        return (this.t0 & 1) != 0;
    }

    public final boolean o() {
        return (this.t0 & 4) != 0;
    }

    public final boolean p() {
        if ((this.t0 & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = hfh.a;
        return !this.a.hasTransientState();
    }

    public final boolean q() {
        return (this.t0 & 8) != 0;
    }

    public final boolean r() {
        return this.x0 != null;
    }

    public final boolean s() {
        return (this.t0 & 256) != 0;
    }

    public final boolean t() {
        return (this.t0 & 2) != 0;
    }

    public final String toString() {
        StringBuilder sbO = ho7.o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbO.append(Integer.toHexString(hashCode()));
        sbO.append(" position=");
        sbO.append(this.c);
        sbO.append(" id=");
        sbO.append(this.o);
        sbO.append(", oldPos=");
        sbO.append(this.d);
        sbO.append(", pLpos:");
        sbO.append(this.Y);
        StringBuilder sb = new StringBuilder(sbO.toString());
        if (r()) {
            sb.append(" scrap ");
            sb.append(this.y0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (o()) {
            sb.append(" invalid");
        }
        if (!m()) {
            sb.append(" unbound");
        }
        if ((this.t0 & 2) != 0) {
            sb.append(" update");
        }
        if (q()) {
            sb.append(" removed");
        }
        if (x()) {
            sb.append(" ignored");
        }
        if (s()) {
            sb.append(" tmpDetached");
        }
        if (!p()) {
            sb.append(" not recyclable(" + this.w0 + ")");
        }
        if ((this.t0 & 512) != 0 || o()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void u(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.Y == -1) {
            this.Y = this.c;
        }
        if (z) {
            this.Y += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((xhd) view.getLayoutParams()).c = true;
        }
    }

    public final void v() {
        if (RecyclerView.K1 && s()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.t0 = 0;
        this.c = -1;
        this.d = -1;
        this.o = -1L;
        this.Y = -1;
        this.w0 = 0;
        this.Z = null;
        this.s0 = null;
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.t0 &= -1025;
        this.z0 = 0;
        this.A0 = -1;
        RecyclerView.o(this);
    }

    public final void w(boolean z) {
        int i = this.w0;
        int i2 = z ? i - 1 : i + 1;
        this.w0 = i2;
        if (i2 < 0) {
            this.w0 = 0;
            if (RecyclerView.K1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.t0 |= 16;
        } else if (z && i2 == 0) {
            this.t0 &= -17;
        }
        if (RecyclerView.L1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean x() {
        return (this.t0 & 128) != 0;
    }

    public final boolean y() {
        return (this.t0 & 32) != 0;
    }
}
