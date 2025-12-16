package com.my.target;

import android.view.View;
import android.widget.FrameLayout;
import com.my.target.P0;
import j11.InterfaceC42177b;

/* renamed from: com.my.target.e0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37783e0 extends FrameLayout implements InterfaceC42177b, P0.a {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public InterfaceC42177b.a f364808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364810d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public P0 f364811e;

    @Override // com.my.target.P0.a
    public final void a(float f12) {
        InterfaceC42177b.a aVar = this.f364808b;
        if (aVar != null) {
            aVar.onVolumeChanged(f12);
        }
    }

    @Override // com.my.target.P0.a
    public final void f() {
        this.f364810d = true;
        InterfaceC42177b.a aVar = this.f364808b;
        if (aVar != null) {
            aVar.b();
        }
    }

    @j.P
    public InterfaceC42177b.a getAdPlayerListener() {
        return this.f364808b;
    }

    public float getAdVideoDuration() {
        P0 p02 = this.f364811e;
        if (p02 != null) {
            return p02.p();
        }
        return 0.0f;
    }

    public float getAdVideoPosition() {
        if (this.f364811e != null) {
            return r0.q() / 1000.0f;
        }
        return 0.0f;
    }

    @j.k0
    public int getPlaceholderHeight() {
        throw null;
    }

    @j.k0
    public int getPlaceholderWidth() {
        throw null;
    }

    @Override // com.my.target.P0.a
    public final void i() {
        if (this.f364810d) {
            InterfaceC42177b.a aVar = this.f364808b;
            if (aVar != null) {
                aVar.f();
            }
            this.f364810d = false;
        }
    }

    @Override // com.my.target.P0.a
    public final void j() {
        InterfaceC42177b.a aVar = this.f364808b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.my.target.P0.a
    public final void o() {
        InterfaceC42177b.a aVar;
        if (this.f364809c || (aVar = this.f364808b) == null) {
            return;
        }
        aVar.d();
        this.f364809c = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        View.MeasureSpec.getMode(i12);
        View.MeasureSpec.getSize(i12);
        View.MeasureSpec.getMode(i13);
        View.MeasureSpec.getSize(i13);
        throw null;
    }

    @Override // com.my.target.P0.a
    public final void onVideoCompleted() {
        InterfaceC42177b.a aVar = this.f364808b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void setAdPlayerListener(@j.P InterfaceC42177b.a aVar) {
        this.f364808b = aVar;
    }

    @j.k0
    public void setVideoPlayer(@j.P I i12) {
        this.f364811e = i12;
    }

    public void setVolume(float f12) {
        P0 p02 = this.f364811e;
        if (p02 != null) {
            p02.setVolume(f12);
        }
    }

    @Override // com.my.target.P0.a
    public final void a(float f12, float f13) {
    }

    @Override // com.my.target.P0.a
    public final void a(@j.N String str) {
        InterfaceC42177b.a aVar = this.f364808b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.my.target.P0.a
    public final void g() {
    }

    @j.N
    public View getView() {
        return this;
    }

    @Override // com.my.target.P0.a
    public final void k() {
    }

    public void setUseExoPlayer(boolean z12) {
    }
}
