package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* loaded from: classes8.dex */
public final class xs0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f391807a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final of1 f391808b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ai1 f391809c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final jo0 f391810d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final a f391811e = new a(this, 0);

    public class a implements uf1 {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private uf1 f391812a;

        private a() {
        }

        public final void a(@j.P uf1 uf1Var) {
            this.f391812a = uf1Var;
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void b() {
            ho0 ho0VarB = xs0.this.f391807a.b();
            if (ho0VarB != null) {
                gn0 gn0VarA = ho0VarB.a();
                jo0 jo0Var = xs0.this.f391810d;
                PlaybackControlsContainer playbackControlsContainerA = gn0VarA.a();
                jo0Var.getClass();
                if (playbackControlsContainerA != null) {
                    CheckBox checkBox = (CheckBox) playbackControlsContainerA.findViewById(R.id.video_mute_control);
                    if (checkBox != null) {
                        checkBox.setOnClickListener(null);
                        checkBox.setVisibility(8);
                    }
                    ProgressBar progressBar = (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control);
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                        progressBar.setVisibility(8);
                    }
                    TextView textView = (TextView) playbackControlsContainerA.findViewById(R.id.video_count_down_control);
                    if (textView != null) {
                        textView.setText("");
                        textView.setVisibility(8);
                    }
                    playbackControlsContainerA.setVisibility(8);
                }
            }
            uf1 uf1Var = this.f391812a;
            if (uf1Var != null) {
                uf1Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void c() {
            ho0 ho0VarB = xs0.this.f391807a.b();
            if (ho0VarB != null) {
                xs0.this.f391809c.a(ho0VarB);
            }
            uf1 uf1Var = this.f391812a;
            if (uf1Var != null) {
                uf1Var.c();
            }
        }

        public /* synthetic */ a(xs0 xs0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void a() {
            uf1 uf1Var = this.f391812a;
            if (uf1Var != null) {
                uf1Var.a();
            }
        }
    }

    public xs0(@j.N xi1 xi1Var, @j.N of1 of1Var, @j.N jo0 jo0Var, @j.N xu0 xu0Var) {
        this.f391807a = xi1Var;
        this.f391808b = of1Var;
        this.f391810d = jo0Var;
        this.f391809c = new ai1(jo0Var, xu0Var);
    }

    public final void a() {
        this.f391808b.a(this.f391811e);
        this.f391808b.play();
    }

    public final void a(@j.N ho0 ho0Var) {
        this.f391808b.stop();
        gn0 gn0VarA = ho0Var.a();
        jo0 jo0Var = this.f391810d;
        PlaybackControlsContainer playbackControlsContainerA = gn0VarA.a();
        jo0Var.getClass();
        if (playbackControlsContainerA != null) {
            CheckBox checkBox = (CheckBox) playbackControlsContainerA.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(null);
                checkBox.setVisibility(8);
            }
            ProgressBar progressBar = (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setProgress(0);
                progressBar.setVisibility(8);
            }
            TextView textView = (TextView) playbackControlsContainerA.findViewById(R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(8);
            }
            playbackControlsContainerA.setVisibility(8);
        }
    }

    public final void a(@j.P uf1 uf1Var) {
        this.f391811e.a(uf1Var);
    }
}
