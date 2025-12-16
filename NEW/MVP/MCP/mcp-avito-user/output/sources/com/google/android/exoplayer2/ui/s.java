package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.K;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.trackselection.r;
import com.google.android.exoplayer2.ui.C;
import com.google.android.exoplayer2.ui.p;
import com.google.android.exoplayer2.ui.s;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StyledPlayerControlView.java */
/* loaded from: classes6.dex */
public class s extends FrameLayout {

    /* renamed from: z0, reason: collision with root package name */
    public static final float[] f347553z0;

    /* renamed from: A, reason: collision with root package name */
    public final String f347554A;

    /* renamed from: B, reason: collision with root package name */
    public final Drawable f347555B;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f347556C;

    /* renamed from: D, reason: collision with root package name */
    public final float f347557D;

    /* renamed from: E, reason: collision with root package name */
    public final float f347558E;

    /* renamed from: F, reason: collision with root package name */
    public final String f347559F;

    /* renamed from: G, reason: collision with root package name */
    public final String f347560G;

    /* renamed from: H, reason: collision with root package name */
    public final Drawable f347561H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f347562I;

    /* renamed from: J, reason: collision with root package name */
    public final String f347563J;

    /* renamed from: K, reason: collision with root package name */
    public final String f347564K;

    /* renamed from: L, reason: collision with root package name */
    public final Drawable f347565L;

    /* renamed from: M, reason: collision with root package name */
    public final Drawable f347566M;

    /* renamed from: N, reason: collision with root package name */
    public final String f347567N;

    /* renamed from: O, reason: collision with root package name */
    public final String f347568O;

    /* renamed from: P, reason: collision with root package name */
    @P
    public d0 f347569P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public f f347570Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    public d f347571R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f347572S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f347573T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f347574U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f347575V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f347576W;

    /* renamed from: a0, reason: collision with root package name */
    public int f347577a0;

    /* renamed from: b, reason: collision with root package name */
    public final c f347578b;

    /* renamed from: b0, reason: collision with root package name */
    public int f347579b0;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f347580c;

    /* renamed from: c0, reason: collision with root package name */
    public int f347581c0;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final View f347582d;

    /* renamed from: d0, reason: collision with root package name */
    public long[] f347583d0;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final View f347584e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean[] f347585e0;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final View f347586f;

    /* renamed from: f0, reason: collision with root package name */
    public final long[] f347587f0;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final View f347588g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean[] f347589g0;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final View f347590h;

    /* renamed from: h0, reason: collision with root package name */
    public long f347591h0;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final TextView f347592i;

    /* renamed from: i0, reason: collision with root package name */
    public final z f347593i0;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final TextView f347594j;

    /* renamed from: j0, reason: collision with root package name */
    public final Resources f347595j0;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final ImageView f347596k;

    /* renamed from: k0, reason: collision with root package name */
    public final RecyclerView f347597k0;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final ImageView f347598l;

    /* renamed from: l0, reason: collision with root package name */
    public final h f347599l0;

    /* renamed from: m, reason: collision with root package name */
    @P
    public final View f347600m;

    /* renamed from: m0, reason: collision with root package name */
    public final e f347601m0;

    /* renamed from: n, reason: collision with root package name */
    @P
    public final TextView f347602n;

    /* renamed from: n0, reason: collision with root package name */
    public final PopupWindow f347603n0;

    /* renamed from: o, reason: collision with root package name */
    @P
    public final TextView f347604o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f347605o0;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final C f347606p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f347607p0;

    /* renamed from: q, reason: collision with root package name */
    public final StringBuilder f347608q;

    /* renamed from: q0, reason: collision with root package name */
    public final j f347609q0;

    /* renamed from: r, reason: collision with root package name */
    public final Formatter f347610r;

    /* renamed from: r0, reason: collision with root package name */
    public final b f347611r0;

    /* renamed from: s, reason: collision with root package name */
    public final s0.b f347612s;

    /* renamed from: s0, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.j f347613s0;

    /* renamed from: t, reason: collision with root package name */
    public final s0.d f347614t;

    /* renamed from: t0, reason: collision with root package name */
    @P
    public final ImageView f347615t0;

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC36570h f347616u;

    /* renamed from: u0, reason: collision with root package name */
    @P
    public final ImageView f347617u0;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f347618v;

    /* renamed from: v0, reason: collision with root package name */
    @P
    public final ImageView f347619v0;

    /* renamed from: w, reason: collision with root package name */
    public final Drawable f347620w;

    /* renamed from: w0, reason: collision with root package name */
    @P
    public final View f347621w0;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f347622x;

    /* renamed from: x0, reason: collision with root package name */
    @P
    public final View f347623x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f347624y;

    /* renamed from: y0, reason: collision with root package name */
    @P
    public final View f347625y0;

    /* renamed from: z, reason: collision with root package name */
    public final String f347626z;

    /* compiled from: StyledPlayerControlView.java */
    public final class b extends l {
        public b(a aVar) {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.s.l
        public final void k(i iVar) {
            iVar.f347642b.setText(R.string.exo_track_selection_auto);
            d0 d0Var = s.this.f347569P;
            d0Var.getClass();
            iVar.f347643c.setVisibility(m(d0Var.g()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new t(this, 0));
        }

        @Override // com.google.android.exoplayer2.ui.s.l
        public final void l(String str) {
            s.this.f347599l0.f347639d[1] = str;
        }

        public final boolean m(com.google.android.exoplayer2.trackselection.r rVar) {
            for (int i12 = 0; i12 < this.f347648c.size(); i12++) {
                if (rVar.f347307z.containsKey(this.f347648c.get(i12).f347645a.f346711c)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public final class c implements d0.g, C.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c(a aVar) {
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void a(long j12) {
            s sVar = s.this;
            TextView textView = sVar.f347604o;
            if (textView != null) {
                textView.setText(U.z(sVar.f347608q, sVar.f347610r, j12));
            }
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void b(long j12, boolean z12) {
            d0 d0Var;
            s sVar = s.this;
            int currentMediaItemIndex = 0;
            sVar.f347576W = false;
            if (!z12 && (d0Var = sVar.f347569P) != null) {
                s0 currentTimeline = d0Var.getCurrentTimeline();
                if (sVar.f347575V && !currentTimeline.p()) {
                    int iO2 = currentTimeline.o();
                    while (true) {
                        long jR2 = U.R(currentTimeline.m(currentMediaItemIndex, sVar.f347614t, 0L).f345893o);
                        if (j12 < jR2) {
                            break;
                        }
                        if (currentMediaItemIndex == iO2 - 1) {
                            j12 = jR2;
                            break;
                        } else {
                            j12 -= jR2;
                            currentMediaItemIndex++;
                        }
                    }
                } else {
                    currentMediaItemIndex = d0Var.getCurrentMediaItemIndex();
                }
                d0Var.f(currentMediaItemIndex, j12);
                sVar.n();
            }
            sVar.f347593i0.g();
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void c(long j12) {
            s sVar = s.this;
            sVar.f347576W = true;
            TextView textView = sVar.f347604o;
            if (textView != null) {
                textView.setText(U.z(sVar.f347608q, sVar.f347610r, j12));
            }
            sVar.f347593i0.f();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            s sVar = s.this;
            d0 d0Var = sVar.f347569P;
            if (d0Var == null) {
                return;
            }
            sVar.f347593i0.g();
            if (sVar.f347584e == view) {
                d0Var.K();
                return;
            }
            if (sVar.f347582d == view) {
                d0Var.C();
                return;
            }
            if (sVar.f347588g == view) {
                if (d0Var.getPlaybackState() != 4) {
                    d0Var.z();
                    return;
                }
                return;
            }
            if (sVar.f347590h == view) {
                d0Var.E();
                return;
            }
            if (sVar.f347586f == view) {
                int playbackState = d0Var.getPlaybackState();
                if (playbackState != 1 && playbackState != 4 && d0Var.getPlayWhenReady()) {
                    d0Var.pause();
                    return;
                }
                int playbackState2 = d0Var.getPlaybackState();
                if (playbackState2 == 1) {
                    d0Var.prepare();
                } else if (playbackState2 == 4) {
                    d0Var.f(d0Var.getCurrentMediaItemIndex(), -9223372036854775807L);
                }
                d0Var.play();
                return;
            }
            if (sVar.f347596k == view) {
                int repeatMode = d0Var.getRepeatMode();
                int i12 = sVar.f347581c0;
                for (int i13 = 1; i13 <= 2; i13++) {
                    int i14 = (repeatMode + i13) % 3;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2 || (i12 & 2) == 0) {
                            }
                        } else if ((i12 & 1) == 0) {
                        }
                    }
                    repeatMode = i14;
                }
                d0Var.setRepeatMode(repeatMode);
                return;
            }
            if (sVar.f347598l == view) {
                d0Var.h(!d0Var.o());
                return;
            }
            if (sVar.f347621w0 == view) {
                sVar.f347593i0.f();
                sVar.d(sVar.f347599l0);
                return;
            }
            if (sVar.f347623x0 == view) {
                sVar.f347593i0.f();
                sVar.d(sVar.f347601m0);
            } else if (sVar.f347625y0 == view) {
                sVar.f347593i0.f();
                sVar.d(sVar.f347611r0);
            } else if (sVar.f347615t0 == view) {
                sVar.f347593i0.f();
                sVar.d(sVar.f347609q0);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            s sVar = s.this;
            if (sVar.f347605o0) {
                sVar.f347593i0.g();
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onEvents(d0 d0Var, d0.f fVar) {
            boolean zB2 = fVar.b(4, 5);
            s sVar = s.this;
            if (zB2) {
                float[] fArr = s.f347553z0;
                sVar.l();
            }
            if (fVar.b(4, 5, 7)) {
                float[] fArr2 = s.f347553z0;
                sVar.n();
            }
            if (fVar.a(8)) {
                float[] fArr3 = s.f347553z0;
                sVar.o();
            }
            if (fVar.a(9)) {
                float[] fArr4 = s.f347553z0;
                sVar.q();
            }
            if (fVar.b(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = s.f347553z0;
                sVar.k();
            }
            if (fVar.b(11, 0)) {
                float[] fArr6 = s.f347553z0;
                sVar.r();
            }
            if (fVar.a(12)) {
                float[] fArr7 = s.f347553z0;
                sVar.m();
            }
            if (fVar.a(2)) {
                float[] fArr8 = s.f347553z0;
                sVar.s();
            }
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    @Deprecated
    public interface d {
        void a(boolean z12);
    }

    /* compiled from: StyledPlayerControlView.java */
    public final class e extends RecyclerView.Adapter<i> {

        /* renamed from: c, reason: collision with root package name */
        public final String[] f347629c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f347630d;

        /* renamed from: e, reason: collision with root package name */
        public int f347631e;

        public e(String[] strArr, float[] fArr) {
            this.f347629c = strArr;
            this.f347630d = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f347629c.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.C c12, final int i12) {
            i iVar = (i) c12;
            String[] strArr = this.f347629c;
            if (i12 < strArr.length) {
                iVar.f347642b.setText(strArr[i12]);
            }
            iVar.f347643c.setVisibility(i12 == this.f347631e ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s.e eVar = this.f347652b;
                    int i13 = eVar.f347631e;
                    int i14 = i12;
                    s sVar = s.this;
                    if (i14 != i13) {
                        sVar.setPlaybackSpeed(eVar.f347630d[i14]);
                    }
                    sVar.f347603n0.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            return new i(LayoutInflater.from(s.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public interface f {
        void a();
    }

    /* compiled from: StyledPlayerControlView.java */
    public final class g extends RecyclerView.C {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f347633f = 0;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f347634b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f347635c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f347636d;

        public g(View view) {
            super(view);
            if (U.f348106a < 26) {
                view.setFocusable(true);
            }
            this.f347634b = (TextView) view.findViewById(R.id.exo_main_text);
            this.f347635c = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f347636d = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new t(this, 1));
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public class h extends RecyclerView.Adapter<g> {

        /* renamed from: c, reason: collision with root package name */
        public final String[] f347638c;

        /* renamed from: d, reason: collision with root package name */
        public final String[] f347639d;

        /* renamed from: e, reason: collision with root package name */
        public final Drawable[] f347640e;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f347638c = strArr;
            this.f347639d = new String[strArr.length];
            this.f347640e = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f347638c.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i12) {
            return i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.C c12, int i12) {
            g gVar = (g) c12;
            gVar.f347634b.setText(this.f347638c[i12]);
            String str = this.f347639d[i12];
            TextView textView = gVar.f347635c;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f347640e[i12];
            ImageView imageView = gVar.f347636d;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            s sVar = s.this;
            return sVar.new g(LayoutInflater.from(sVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public static class i extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f347642b;

        /* renamed from: c, reason: collision with root package name */
        public final View f347643c;

        public i(View view) {
            super(view);
            if (U.f348106a < 26) {
                view.setFocusable(true);
            }
            this.f347642b = (TextView) view.findViewById(R.id.exo_text);
            this.f347643c = view.findViewById(R.id.exo_check);
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final t0.a f347645a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347646b;

        /* renamed from: c, reason: collision with root package name */
        public final String f347647c;

        public k(t0 t0Var, int i12, int i13, String str) {
            this.f347645a = t0Var.a().get(i12);
            this.f347646b = i13;
            this.f347647c = str;
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public abstract class l extends RecyclerView.Adapter<i> {

        /* renamed from: c, reason: collision with root package name */
        public List<k> f347648c = new ArrayList();

        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f347648c.isEmpty()) {
                return 0;
            }
            return this.f347648c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: j */
        public void onBindViewHolder(i iVar, int i12) {
            final d0 d0Var = s.this.f347569P;
            if (d0Var == null) {
                return;
            }
            if (i12 == 0) {
                k(iVar);
                return;
            }
            final k kVar = this.f347648c.get(i12 - 1);
            final V v12 = kVar.f347645a.f346711c;
            boolean z12 = d0Var.g().f347307z.get(v12) != null && kVar.f347645a.f346714f[kVar.f347646b];
            iVar.f347642b.setText(kVar.f347647c);
            iVar.f347643c.setVisibility(z12 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s.l lVar = this.f347654b;
                    lVar.getClass();
                    d0 d0Var2 = d0Var;
                    r.a aVarA = d0Var2.g().a();
                    s.k kVar2 = kVar;
                    d0Var2.w(aVarA.f(new com.google.android.exoplayer2.trackselection.q(v12, AbstractC37401r1.E(Integer.valueOf(kVar2.f347646b)))).g(kVar2.f347645a.f346711c.f346150d).a());
                    lVar.l(kVar2.f347647c);
                    s.this.f347603n0.dismiss();
                }
            });
        }

        public abstract void k(i iVar);

        public abstract void l(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            return new i(LayoutInflater.from(s.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    @Deprecated
    public interface m {
        void b(int i12);
    }

    static {
        com.google.android.exoplayer2.H.a("goog.exo.ui");
        f347553z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public s(Context context, @P AttributeSet attributeSet) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z22;
        super(context, null, 0);
        this.f347577a0 = 5000;
        this.f347581c0 = 0;
        this.f347579b0 = 200;
        int resourceId = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.m.f347539c, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f347577a0 = typedArrayObtainStyledAttributes.getInt(21, this.f347577a0);
                this.f347581c0 = typedArrayObtainStyledAttributes.getInt(9, this.f347581c0);
                z13 = typedArrayObtainStyledAttributes.getBoolean(18, true);
                z14 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                z15 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                z16 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                z17 = typedArrayObtainStyledAttributes.getBoolean(19, false);
                z18 = typedArrayObtainStyledAttributes.getBoolean(20, false);
                z19 = typedArrayObtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(23, this.f347579b0));
                z12 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = false;
            z18 = false;
            z19 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar = new c(null);
        this.f347578b = cVar;
        this.f347580c = new CopyOnWriteArrayList<>();
        this.f347612s = new s0.b();
        this.f347614t = new s0.d();
        StringBuilder sb2 = new StringBuilder();
        this.f347608q = sb2;
        this.f347610r = new Formatter(sb2, Locale.getDefault());
        this.f347583d0 = new long[0];
        this.f347585e0 = new boolean[0];
        this.f347587f0 = new long[0];
        this.f347589g0 = new boolean[0];
        this.f347616u = new RunnableC36570h(this, 1);
        this.f347602n = (TextView) findViewById(R.id.exo_duration);
        this.f347604o = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f347615t0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f347617u0 = imageView2;
        t tVar = new t(this, 4);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(tVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f347619v0 = imageView3;
        t tVar2 = new t(this, 4);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(tVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f347621w0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f347623x0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f347625y0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        C c12 = (C) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (c12 != null) {
            this.f347606p = c12;
        } else if (viewFindViewById4 != null) {
            com.google.android.exoplayer2.ui.i iVar = new com.google.android.exoplayer2.ui.i(context, attributeSet);
            iVar.setId(R.id.exo_progress);
            iVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(iVar, iIndexOfChild);
            this.f347606p = iVar;
        } else {
            this.f347606p = null;
        }
        C c13 = this.f347606p;
        if (c13 != null) {
            c13.c(cVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.f347586f = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.f347582d = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f347584e = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface typefaceC = androidx.core.content.res.i.c(R.font.roboto_medium_numbers, context);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.f347594j = textView;
        if (textView != null) {
            textView.setTypeface(typefaceC);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f347590h = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(cVar);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        boolean z23 = z19;
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.f347592i = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceC);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f347588g = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f347596k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f347598l = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context.getResources();
        this.f347595j0 = resources;
        this.f347557D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f347558E = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.f347600m = viewFindViewById10;
        boolean z24 = z18;
        if (viewFindViewById10 != null) {
            j(viewFindViewById10, false);
        }
        z zVar = new z(this);
        this.f347593i0 = zVar;
        zVar.f347666C = z12;
        boolean z25 = z17;
        h hVar = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f347599l0 = hVar;
        this.f347607p0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f347597k0 = recyclerView;
        recyclerView.setAdapter(hVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f347603n0 = popupWindow;
        if (U.f348106a < 23) {
            z22 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z22 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        this.f347605o0 = true;
        this.f347613s0 = new com.google.android.exoplayer2.ui.j(getResources());
        this.f347561H = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.f347562I = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.f347563J = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f347564K = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f347609q0 = new j(null);
        this.f347611r0 = new b(null);
        this.f347601m0 = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), f347553z0);
        this.f347565L = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.f347566M = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.f347618v = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.f347620w = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.f347622x = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.f347555B = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.f347556C = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f347567N = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f347568O = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f347624y = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f347626z = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f347554A = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f347559F = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f347560G = resources.getString(R.string.exo_controls_shuffle_off_description);
        zVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        zVar.h(viewFindViewById9, z14);
        zVar.h(viewFindViewById8, z13);
        zVar.h(viewFindViewById6, z15);
        zVar.h(viewFindViewById7, z16);
        zVar.h(imageView5, z25);
        zVar.h(imageView, z24);
        zVar.h(viewFindViewById10, z23);
        zVar.h(imageView4, this.f347581c0 != 0 ? true : z22);
        addOnLayoutChangeListener(new y(this, 1));
    }

    public static void a(s sVar) {
        if (sVar.f347571R == null) {
            return;
        }
        boolean z12 = sVar.f347572S;
        sVar.f347572S = !z12;
        ImageView imageView = sVar.f347617u0;
        String str = sVar.f347568O;
        Drawable drawable = sVar.f347566M;
        String str2 = sVar.f347567N;
        Drawable drawable2 = sVar.f347565L;
        if (imageView != null) {
            if (z12) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        ImageView imageView2 = sVar.f347619v0;
        boolean z13 = sVar.f347572S;
        if (imageView2 != null) {
            if (z13) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        d dVar = sVar.f347571R;
        if (dVar != null) {
            dVar.a(sVar.f347572S);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f12) {
        d0 d0Var = this.f347569P;
        if (d0Var == null) {
            return;
        }
        d0Var.d(new c0(f12, d0Var.getPlaybackParameters().f344181c));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        d0 d0Var = this.f347569P;
        if (d0Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (d0Var.getPlaybackState() != 4) {
                    d0Var.z();
                }
            } else if (keyCode == 89) {
                d0Var.E();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    int playbackState = d0Var.getPlaybackState();
                    if (playbackState == 1 || playbackState == 4 || !d0Var.getPlayWhenReady()) {
                        int playbackState2 = d0Var.getPlaybackState();
                        if (playbackState2 == 1) {
                            d0Var.prepare();
                        } else if (playbackState2 == 4) {
                            d0Var.f(d0Var.getCurrentMediaItemIndex(), -9223372036854775807L);
                        }
                        d0Var.play();
                    } else {
                        d0Var.pause();
                    }
                } else if (keyCode == 87) {
                    d0Var.K();
                } else if (keyCode == 88) {
                    d0Var.C();
                } else if (keyCode == 126) {
                    int playbackState3 = d0Var.getPlaybackState();
                    if (playbackState3 == 1) {
                        d0Var.prepare();
                    } else if (playbackState3 == 4) {
                        d0Var.f(d0Var.getCurrentMediaItemIndex(), -9223372036854775807L);
                    }
                    d0Var.play();
                } else if (keyCode == 127) {
                    d0Var.pause();
                }
            }
        }
        return true;
    }

    public final void d(RecyclerView.Adapter<?> adapter) {
        this.f347597k0.setAdapter(adapter);
        p();
        this.f347605o0 = false;
        PopupWindow popupWindow = this.f347603n0;
        popupWindow.dismiss();
        this.f347605o0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i12 = this.f347607p0;
        popupWindow.showAsDropDown(this, width - i12, (-popupWindow.getHeight()) - i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final AbstractC37401r1<k> e(t0 t0Var, int i12) {
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        AbstractC37401r1<t0.a> abstractC37401r1 = t0Var.f346709b;
        for (int i13 = 0; i13 < abstractC37401r1.size(); i13++) {
            t0.a aVar2 = abstractC37401r1.get(i13);
            if (aVar2.f346711c.f346150d == i12) {
                for (int i14 = 0; i14 < aVar2.f346710b; i14++) {
                    if (aVar2.f346713e[i14] == 4) {
                        I iA2 = aVar2.a(i14);
                        if ((iA2.f343468e & 2) == 0) {
                            aVar.g(new k(t0Var, i13, i14, this.f347613s0.a(iA2)));
                        }
                    }
                }
            }
        }
        return aVar.i();
    }

    public final void f() {
        z zVar = this.f347593i0;
        int i12 = zVar.f347692z;
        if (i12 == 3 || i12 == 2) {
            return;
        }
        zVar.f();
        if (!zVar.f347666C) {
            zVar.i(2);
        } else if (zVar.f347692z == 1) {
            zVar.f347679m.start();
        } else {
            zVar.f347680n.start();
        }
    }

    public final boolean g() {
        z zVar = this.f347593i0;
        return zVar.f347692z == 0 && zVar.f347667a.h();
    }

    @P
    public d0 getPlayer() {
        return this.f347569P;
    }

    public int getRepeatToggleModes() {
        return this.f347581c0;
    }

    public boolean getShowShuffleButton() {
        return this.f347593i0.b(this.f347598l);
    }

    public boolean getShowSubtitleButton() {
        return this.f347593i0.b(this.f347615t0);
    }

    public int getShowTimeoutMs() {
        return this.f347577a0;
    }

    public boolean getShowVrButton() {
        return this.f347593i0.b(this.f347600m);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    public final void j(@P View view, boolean z12) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.f347557D : this.f347558E);
    }

    public final void k() {
        boolean zU2;
        boolean zU3;
        boolean zU4;
        boolean zU5;
        boolean zU6;
        if (h() && this.f347573T) {
            d0 d0Var = this.f347569P;
            if (d0Var != null) {
                zU2 = d0Var.u(5);
                zU4 = d0Var.u(7);
                zU5 = d0Var.u(11);
                zU6 = d0Var.u(12);
                zU3 = d0Var.u(9);
            } else {
                zU2 = false;
                zU3 = false;
                zU4 = false;
                zU5 = false;
                zU6 = false;
            }
            Resources resources = this.f347595j0;
            View view = this.f347590h;
            if (zU5) {
                d0 d0Var2 = this.f347569P;
                int iQ2 = (int) ((d0Var2 != null ? d0Var2.q() : 5000L) / 1000);
                TextView textView = this.f347594j;
                if (textView != null) {
                    textView.setText(String.valueOf(iQ2));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iQ2, Integer.valueOf(iQ2)));
                }
            }
            View view2 = this.f347588g;
            if (zU6) {
                d0 d0Var3 = this.f347569P;
                int iJ2 = (int) ((d0Var3 != null ? d0Var3.j() : 15000L) / 1000);
                TextView textView2 = this.f347592i;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iJ2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iJ2, Integer.valueOf(iJ2)));
                }
            }
            j(this.f347582d, zU4);
            j(view, zU5);
            j(view2, zU6);
            j(this.f347584e, zU3);
            C c12 = this.f347606p;
            if (c12 != null) {
                c12.setEnabled(zU2);
            }
        }
    }

    public final void l() {
        View view;
        if (h() && this.f347573T && (view = this.f347586f) != null) {
            d0 d0Var = this.f347569P;
            Resources resources = this.f347595j0;
            if (d0Var == null || d0Var.getPlaybackState() == 4 || this.f347569P.getPlaybackState() == 1 || !this.f347569P.getPlayWhenReady()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            }
        }
    }

    public final void m() {
        d0 d0Var = this.f347569P;
        if (d0Var == null) {
            return;
        }
        float f12 = d0Var.getPlaybackParameters().f344180b;
        float f13 = Float.MAX_VALUE;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            e eVar = this.f347601m0;
            float[] fArr = eVar.f347630d;
            if (i12 >= fArr.length) {
                eVar.f347631e = i13;
                this.f347599l0.f347639d[0] = eVar.f347629c[i13];
                return;
            } else {
                float fAbs = Math.abs(f12 - fArr[i12]);
                if (fAbs < f13) {
                    i13 = i12;
                    f13 = fAbs;
                }
                i12++;
            }
        }
    }

    public final void n() {
        long contentPosition;
        long jL2;
        if (h() && this.f347573T) {
            d0 d0Var = this.f347569P;
            if (d0Var != null) {
                contentPosition = d0Var.getContentPosition() + this.f347591h0;
                jL2 = d0Var.l() + this.f347591h0;
            } else {
                contentPosition = 0;
                jL2 = 0;
            }
            TextView textView = this.f347604o;
            if (textView != null && !this.f347576W) {
                textView.setText(U.z(this.f347608q, this.f347610r, contentPosition));
            }
            C c12 = this.f347606p;
            if (c12 != null) {
                c12.setPosition(contentPosition);
                c12.setBufferedPosition(jL2);
            }
            f fVar = this.f347570Q;
            if (fVar != null) {
                fVar.a();
            }
            RunnableC36570h runnableC36570h = this.f347616u;
            removeCallbacks(runnableC36570h);
            int playbackState = d0Var == null ? 1 : d0Var.getPlaybackState();
            if (d0Var != null && d0Var.k()) {
                long jMin = Math.min(c12 != null ? c12.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f12 = d0Var.getPlaybackParameters().f344180b;
                postDelayed(runnableC36570h, U.l(f12 > 0.0f ? (long) (jMin / f12) : 1000L, this.f347579b0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(runnableC36570h, 1000L);
            }
        }
    }

    public final void o() {
        ImageView imageView;
        if (h() && this.f347573T && (imageView = this.f347596k) != null) {
            if (this.f347581c0 == 0) {
                j(imageView, false);
                return;
            }
            d0 d0Var = this.f347569P;
            String str = this.f347624y;
            Drawable drawable = this.f347618v;
            if (d0Var == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int repeatMode = d0Var.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.f347620w);
                imageView.setContentDescription(this.f347626z);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f347622x);
                imageView.setContentDescription(this.f347554A);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z zVar = this.f347593i0;
        zVar.f347667a.addOnLayoutChangeListener(zVar.f347690x);
        this.f347573T = true;
        if (g()) {
            zVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z zVar = this.f347593i0;
        zVar.f347667a.removeOnLayoutChangeListener(zVar.f347690x);
        this.f347573T = false;
        removeCallbacks(this.f347616u);
        zVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        View view = this.f347593i0.f347668b;
        if (view != null) {
            view.layout(0, 0, i14 - i12, i15 - i13);
        }
    }

    public final void p() {
        RecyclerView recyclerView = this.f347597k0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i12 = this.f347607p0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i12 * 2));
        PopupWindow popupWindow = this.f347603n0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i12 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void q() {
        ImageView imageView;
        if (h() && this.f347573T && (imageView = this.f347598l) != null) {
            d0 d0Var = this.f347569P;
            if (!this.f347593i0.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f347560G;
            Drawable drawable = this.f347556C;
            if (d0Var == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (d0Var.o()) {
                drawable = this.f347555B;
            }
            imageView.setImageDrawable(drawable);
            if (d0Var.o()) {
                str = this.f347559F;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.s.r():void");
    }

    public final void s() {
        j jVar = this.f347609q0;
        jVar.getClass();
        jVar.f347648c = Collections.emptyList();
        b bVar = this.f347611r0;
        bVar.getClass();
        bVar.f347648c = Collections.emptyList();
        d0 d0Var = this.f347569P;
        ImageView imageView = this.f347615t0;
        if (d0Var != null && d0Var.u(30) && this.f347569P.u(29)) {
            t0 currentTracks = this.f347569P.getCurrentTracks();
            AbstractC37401r1<k> abstractC37401r1E = e(currentTracks, 1);
            bVar.f347648c = abstractC37401r1E;
            s sVar = s.this;
            d0 d0Var2 = sVar.f347569P;
            d0Var2.getClass();
            com.google.android.exoplayer2.trackselection.r rVarG = d0Var2.g();
            boolean zIsEmpty = abstractC37401r1E.isEmpty();
            h hVar = sVar.f347599l0;
            if (!zIsEmpty) {
                if (bVar.m(rVarG)) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= abstractC37401r1E.size()) {
                            break;
                        }
                        k kVar = abstractC37401r1E.get(i12);
                        if (kVar.f347645a.f346714f[kVar.f347646b]) {
                            hVar.f347639d[1] = kVar.f347647c;
                            break;
                        }
                        i12++;
                    }
                } else {
                    hVar.f347639d[1] = sVar.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                hVar.f347639d[1] = sVar.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.f347593i0.b(imageView)) {
                jVar.m(e(currentTracks, 3));
            } else {
                jVar.m(AbstractC37401r1.C());
            }
        }
        j(imageView, jVar.getItemCount() > 0);
    }

    public void setAnimationEnabled(boolean z12) {
        this.f347593i0.f347666C = z12;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@P d dVar) {
        this.f347571R = dVar;
        boolean z12 = dVar != null;
        ImageView imageView = this.f347617u0;
        if (imageView != null) {
            if (z12) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z13 = dVar != null;
        ImageView imageView2 = this.f347619v0;
        if (imageView2 == null) {
            return;
        }
        if (z13) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@P d0 d0Var) {
        C36585a.d(Looper.myLooper() == Looper.getMainLooper());
        C36585a.b(d0Var == null || d0Var.G() == Looper.getMainLooper());
        d0 d0Var2 = this.f347569P;
        if (d0Var2 == d0Var) {
            return;
        }
        c cVar = this.f347578b;
        if (d0Var2 != null) {
            d0Var2.s(cVar);
        }
        this.f347569P = d0Var;
        if (d0Var != null) {
            d0Var.N(cVar);
        }
        if (d0Var instanceof K) {
            ((K) d0Var).getClass();
        }
        i();
    }

    public void setProgressUpdateListener(@P f fVar) {
        this.f347570Q = fVar;
    }

    public void setRepeatToggleModes(int i12) {
        this.f347581c0 = i12;
        d0 d0Var = this.f347569P;
        if (d0Var != null) {
            int repeatMode = d0Var.getRepeatMode();
            if (i12 == 0 && repeatMode != 0) {
                this.f347569P.setRepeatMode(0);
            } else if (i12 == 1 && repeatMode == 2) {
                this.f347569P.setRepeatMode(1);
            } else if (i12 == 2 && repeatMode == 1) {
                this.f347569P.setRepeatMode(2);
            }
        }
        this.f347593i0.h(this.f347596k, i12 != 0);
        o();
    }

    public void setShowFastForwardButton(boolean z12) {
        this.f347593i0.h(this.f347588g, z12);
        k();
    }

    public void setShowMultiWindowTimeBar(boolean z12) {
        this.f347574U = z12;
        r();
    }

    public void setShowNextButton(boolean z12) {
        this.f347593i0.h(this.f347584e, z12);
        k();
    }

    public void setShowPreviousButton(boolean z12) {
        this.f347593i0.h(this.f347582d, z12);
        k();
    }

    public void setShowRewindButton(boolean z12) {
        this.f347593i0.h(this.f347590h, z12);
        k();
    }

    public void setShowShuffleButton(boolean z12) {
        this.f347593i0.h(this.f347598l, z12);
        q();
    }

    public void setShowSubtitleButton(boolean z12) {
        this.f347593i0.h(this.f347615t0, z12);
    }

    public void setShowTimeoutMs(int i12) {
        this.f347577a0 = i12;
        if (g()) {
            this.f347593i0.g();
        }
    }

    public void setShowVrButton(boolean z12) {
        this.f347593i0.h(this.f347600m, z12);
    }

    public void setTimeBarMinUpdateInterval(int i12) {
        this.f347579b0 = U.k(i12, 16, 1000);
    }

    public void setVrButtonListener(@P View.OnClickListener onClickListener) {
        View view = this.f347600m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            j(view, onClickListener != null);
        }
    }

    /* compiled from: StyledPlayerControlView.java */
    public final class j extends l {
        public j(a aVar) {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.s.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(i iVar, int i12) {
            super.onBindViewHolder(iVar, i12);
            if (i12 > 0) {
                k kVar = this.f347648c.get(i12 - 1);
                iVar.f347643c.setVisibility(kVar.f347645a.f346714f[kVar.f347646b] ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.s.l
        public final void k(i iVar) {
            iVar.f347642b.setText(R.string.exo_track_selection_none);
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= this.f347648c.size()) {
                    break;
                }
                k kVar = this.f347648c.get(i13);
                if (kVar.f347645a.f346714f[kVar.f347646b]) {
                    i12 = 4;
                    break;
                }
                i13++;
            }
            iVar.f347643c.setVisibility(i12);
            iVar.itemView.setOnClickListener(new t(this, 2));
        }

        public final void m(List<k> list) {
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    break;
                }
                k kVar = list.get(i12);
                if (kVar.f347645a.f346714f[kVar.f347646b]) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            s sVar = s.this;
            ImageView imageView = sVar.f347615t0;
            if (imageView != null) {
                imageView.setImageDrawable(z12 ? sVar.f347561H : sVar.f347562I);
                sVar.f347615t0.setContentDescription(z12 ? sVar.f347563J : sVar.f347564K);
            }
            this.f347648c = list;
        }

        @Override // com.google.android.exoplayer2.ui.s.l
        public final void l(String str) {
        }
    }
}
