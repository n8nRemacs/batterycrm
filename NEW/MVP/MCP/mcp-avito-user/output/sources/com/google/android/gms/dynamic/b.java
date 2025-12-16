package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.c;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public final class b extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f349642a;

    public b(Fragment fragment) {
        this.f349642a = fragment;
    }

    @Override // com.google.android.gms.dynamic.c
    public final void I0(boolean z12) {
        this.f349642a.setUserVisibleHint(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean P1() {
        return this.f349642a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void U3(@N d dVar) {
        View view = (View) f.g4(dVar);
        C36729v.j(view);
        this.f349642a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void e0(boolean z12) {
        this.f349642a.setHasOptionsMenu(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void g0(boolean z12) {
        this.f349642a.setMenuVisibility(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void j1(int i12, @N Intent intent) {
        this.f349642a.startActivityForResult(intent, i12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void l0(boolean z12) {
        this.f349642a.setRetainInstance(z12);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void m3(@N d dVar) {
        View view = (View) f.g4(dVar);
        C36729v.j(view);
        this.f349642a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void u2(@N Intent intent) {
        this.f349642a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzb() {
        return this.f349642a.getId();
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzc() {
        return this.f349642a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final Bundle zzd() {
        return this.f349642a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zze() {
        Fragment parentFragment = this.f349642a.getParentFragment();
        if (parentFragment != null) {
            return new b(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zzf() {
        Fragment targetFragment = this.f349642a.getTargetFragment();
        if (targetFragment != null) {
            return new b(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzg() {
        return new f(this.f349642a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzh() {
        return new f(this.f349642a.getResources());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final f zzi() {
        return new f(this.f349642a.getView());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final String zzj() {
        return this.f349642a.getTag();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzs() {
        return this.f349642a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzt() {
        return this.f349642a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzu() {
        return this.f349642a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzv() {
        return this.f349642a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzw() {
        return this.f349642a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzx() {
        return this.f349642a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzy() {
        return this.f349642a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzz() {
        return this.f349642a.isResumed();
    }
}
