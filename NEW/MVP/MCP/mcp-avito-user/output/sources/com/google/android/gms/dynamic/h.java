package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.c;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public final class h extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f349644a;

    public h(Fragment fragment) {
        this.f349644a = fragment;
    }

    @Override // com.google.android.gms.dynamic.c
    public final void I0(boolean z12) {
        this.f349644a.setUserVisibleHint(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean P1() {
        return this.f349644a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void U3(@N d dVar) {
        View view = (View) f.g4(dVar);
        C36729v.j(view);
        this.f349644a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void e0(boolean z12) {
        this.f349644a.setHasOptionsMenu(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void g0(boolean z12) {
        this.f349644a.setMenuVisibility(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void j1(int i12, @N Intent intent) {
        this.f349644a.startActivityForResult(intent, i12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void l0(boolean z12) {
        this.f349644a.setRetainInstance(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void m3(@N d dVar) {
        View view = (View) f.g4(dVar);
        C36729v.j(view);
        this.f349644a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void u2(@N Intent intent) {
        this.f349644a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzb() {
        return this.f349644a.getId();
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzc() {
        return this.f349644a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final Bundle zzd() {
        return this.f349644a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zze() {
        Fragment parentFragment = this.f349644a.getParentFragment();
        if (parentFragment != null) {
            return new h(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zzf() {
        Fragment targetFragment = this.f349644a.getTargetFragment();
        if (targetFragment != null) {
            return new h(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzg() {
        return new f(this.f349644a.l1());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzh() {
        return new f(this.f349644a.getResources());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzi() {
        return new f(this.f349644a.getView());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final String zzj() {
        return this.f349644a.getTag();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzs() {
        return this.f349644a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzt() {
        return this.f349644a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzu() {
        return this.f349644a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzv() {
        return this.f349644a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzw() {
        return this.f349644a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzx() {
        return this.f349644a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzy() {
        return this.f349644a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzz() {
        return this.f349644a.isResumed();
    }
}
