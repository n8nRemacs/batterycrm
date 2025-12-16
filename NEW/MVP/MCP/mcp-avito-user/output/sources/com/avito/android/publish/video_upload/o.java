package com.avito.android.publish.video_upload;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoUploadProgressBar f245568c;

    public /* synthetic */ o(VideoUploadProgressBar videoUploadProgressBar, int i12) {
        this.f245567b = i12;
        this.f245568c = videoUploadProgressBar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f245567b) {
            case 0:
                this.f245568c.f245537g.invoke();
                break;
            default:
                this.f245568c.f245536f.invoke();
                break;
        }
    }
}
