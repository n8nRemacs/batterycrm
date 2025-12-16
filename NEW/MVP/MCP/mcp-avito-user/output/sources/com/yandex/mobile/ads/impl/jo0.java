package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* loaded from: classes8.dex */
public final class jo0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final in0 f386938a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final oh1 f386939b;

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final mn0 f386940a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final CheckBox f386941b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f386942c;

        public a(@j.N in0 in0Var, @j.N CheckBox checkBox, @j.N oh1 oh1Var) {
            this.f386941b = checkBox;
            this.f386942c = oh1Var.a();
            this.f386940a = new mn0(in0Var);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.N View view) {
            boolean z12 = !this.f386942c;
            this.f386942c = z12;
            this.f386941b.setChecked(z12);
            this.f386940a.a(this.f386942c);
        }
    }

    public jo0(@j.N du duVar, @j.N oh1 oh1Var) {
        this.f386938a = duVar;
        this.f386939b = oh1Var;
    }

    public final void a(@j.P PlaybackControlsContainer playbackControlsContainer) {
        if (playbackControlsContainer != null) {
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(new a(this.f386938a, checkBox, this.f386939b));
                checkBox.setVisibility(0);
            }
            ProgressBar progressBar = (ProgressBar) playbackControlsContainer.findViewById(R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            TextView textView = (TextView) playbackControlsContainer.findViewById(R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(0);
            }
            playbackControlsContainer.setVisibility(0);
        }
    }
}
